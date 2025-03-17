package org.maplibre.geojson.utils;

import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.Point;

public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    public static List<Point> decode(String str, int i10) {
        int i11;
        int i12;
        int length = str.length();
        double pow = Math.pow(10.0d, (double) i10);
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = 1;
            int i17 = 0;
            int i18 = 1;
            while (true) {
                i11 = i13 + 1;
                int charAt = str.charAt(i13) - '@';
                i18 += charAt << i17;
                i17 += 5;
                if (charAt < 31) {
                    break;
                }
                i13 = i11;
            }
            int i19 = ((i18 & 1) != 0 ? ~(i18 >> 1) : i18 >> 1) + i14;
            int i20 = 0;
            while (true) {
                i12 = i11 + 1;
                int charAt2 = str.charAt(i11) - '@';
                i16 += charAt2 << i20;
                i20 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i11 = i12;
            }
            i15 += (i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1;
            arrayList.add(Point.fromLngLat(((double) i15) / pow, ((double) i19) / pow));
            i14 = i19;
            i13 = i12;
        }
        return arrayList;
    }

    public static String encode(List<Point> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        double pow = Math.pow(10.0d, (double) i10);
        long j10 = 0;
        long j11 = 0;
        for (Point next : list) {
            long round = Math.round(next.latitude() * pow);
            long round2 = Math.round(next.longitude() * pow);
            encode(round - j10, sb2);
            encode(round2 - j11, sb2);
            j10 = round;
            j11 = round2;
        }
        return sb2.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (longitude * longitude) + (latitude * latitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (!(longitude2 == 0.0d && latitude2 == 0.0d)) {
            double longitude3 = (((point.longitude() - longitude) * longitude2) + ((point.latitude() - latitude) * latitude2)) / ((longitude2 * longitude2) + (latitude2 * latitude2));
            if (longitude3 > 1.0d) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (longitude3 > 0.0d) {
                longitude += longitude2 * longitude3;
                latitude += latitude2 * longitude3;
            }
        }
        double longitude4 = point.longitude() - longitude;
        double latitude3 = point.latitude() - latitude;
        return (longitude4 * longitude4) + (latitude3 * latitude3);
    }

    public static List<Point> simplify(List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d10) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d10, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i10, int i11, double d10, List<Point> list2) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        double d11 = d10;
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            double sqSegDist = getSqSegDist(list.get(i13), list.get(i10), list.get(i11));
            if (sqSegDist > d11) {
                i12 = i13;
                d11 = sqSegDist;
            }
        }
        if (d11 > d10) {
            if (i12 - i10 > 1) {
                arrayList.addAll(simplifyDpStep(list, i10, i12, d10, list2));
            }
            arrayList.add(list.get(i12));
            if (i11 - i12 > 1) {
                arrayList.addAll(simplifyDpStep(list, i12, i11, d10, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d10) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i10 = 1; i10 < size; i10++) {
            point2 = list.get(i10);
            if (getSqDist(point2, point) > d10) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    public static List<Point> simplify(List<Point> list, double d10) {
        return simplify(list, d10, false);
    }

    public static List<Point> simplify(List<Point> list, boolean z10) {
        return simplify(list, 1.0d, z10);
    }

    public static List<Point> simplify(List<Point> list, double d10, boolean z10) {
        if (list.size() <= 2) {
            return list;
        }
        double d11 = d10 * d10;
        if (!z10) {
            list = simplifyRadialDist(list, d11);
        }
        return simplifyDouglasPeucker(list, d11);
    }

    private static void encode(long j10, StringBuilder sb2) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        long j11 = j10 << 1;
        if (i10 < 0) {
            j11 = ~j11;
        }
        while (j11 >= 32) {
            sb2.append(Character.toChars((int) ((32 | (31 & j11)) + 63)));
            j11 >>= 5;
        }
        sb2.append(Character.toChars((int) (j11 + 63)));
    }
}
