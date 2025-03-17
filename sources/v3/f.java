package V3;

import V3.C6709c;
import java.io.StringReader;
import kb.C9967v;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q3.B;
import t3.O;
import t3.q;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f40420a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f40421b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f40422c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C6709c a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | XmlPullParserException | B unused) {
            q.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static C6709c b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (O.e(newPullParser, "x:xmpmeta")) {
            C9967v<C6709c.a> E10 = C9967v.E();
            long j10 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (O.e(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    E10 = c(newPullParser);
                } else if (O.e(newPullParser, "Container:Directory")) {
                    E10 = f(newPullParser, "Container", "Item");
                } else if (O.e(newPullParser, "GContainer:Directory")) {
                    E10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!O.c(newPullParser, "x:xmpmeta"));
            if (E10.isEmpty()) {
                return null;
            }
            return new C6709c(j10, E10);
        }
        throw B.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static C9967v<C6709c.a> c(XmlPullParser xmlPullParser) {
        for (String a10 : f40422c) {
            String a11 = O.a(xmlPullParser, a10);
            if (a11 != null) {
                return C9967v.G(new C6709c.a("image/jpeg", "Primary", 0, 0), new C6709c.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return C9967v.E();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String a10 : f40420a) {
            String a11 = O.a(xmlPullParser, a10);
            if (a11 != null) {
                return Integer.parseInt(a11) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String a10 : f40421b) {
            String a11 = O.a(xmlPullParser, a10);
            if (a11 != null) {
                long parseLong = Long.parseLong(a11);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static C9967v<C6709c.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        C9967v.a t10 = C9967v.t();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (O.e(xmlPullParser, str3)) {
                String a10 = O.a(xmlPullParser, str2 + ":Mime");
                String a11 = O.a(xmlPullParser, str2 + ":Semantic");
                String a12 = O.a(xmlPullParser, str2 + ":Length");
                String a13 = O.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return C9967v.E();
                }
                t10.a(new C6709c.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0, a13 != null ? Long.parseLong(a13) : 0));
            }
        } while (!O.c(xmlPullParser, str4));
        return t10.k();
    }
}
