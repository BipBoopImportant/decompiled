package t3;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.BuildConfig;
import com.sugarcube.app.base.network.models.UploadKt;
import d9.M;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kb.C9967v;
import q3.A;
import q3.C5798i;

@SuppressLint({"InlinedApi"})
/* renamed from: t3.e  reason: case insensitive filesystem */
public final class C5954e {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f29484a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f29485b = {"", "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f29486c = Pattern.compile("^\\D?(\\d+)$");

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return RecyclerView.n.FLAG_MOVED;
            case 12:
                return RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return ImageMetadata.LENS_APERTURE;
            case 20:
                return ImageMetadata.SHADING_MODE;
            case 21:
                return UploadKt.MAX_CHUNK_SIZE;
            case 22:
                return 4194304;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return RecyclerView.n.FLAG_MOVED;
                                    case 41:
                                        return RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static List<byte[]> e(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String f(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(N.G("hvc1.%s%d.%X.%c%d", f29485b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i14])}));
        }
        return sb2.toString();
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f29484a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static C9967v<byte[]> h(byte b10, byte b11, byte b12, byte b13) {
        return C9967v.F(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    private static Integer i(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return Integer.valueOf(RecyclerView.n.FLAG_MOVED);
            case 12:
                return Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            default:
                return null;
        }
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> k(String str, String[] strArr) {
        int t10;
        if (strArr.length != 3) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(A.h(Integer.parseInt(strArr[1], 16))) && (t10 = t(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(t10), 0);
            }
        } catch (NumberFormatException unused) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r8 = r10.f28144c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> l(java.lang.String r8, java.lang.String[] r9, q3.C5798i r10) {
        /*
            int r0 = r9.length
            r1 = 4
            java.lang.String r2 = "Ignoring malformed AV1 codec string: "
            r3 = 0
            java.lang.String r4 = "CodecSpecificDataUtil"
            if (r0 >= r1) goto L_0x001c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            t3.q.h(r4, r8)
            return r3
        L_0x001c:
            r0 = 1
            r1 = r9[r0]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5 = 2
            r6 = r9[r5]     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r5)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 3
            r9 = r9[r7]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r1 == 0) goto L_0x004d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 profile: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            t3.q.h(r4, r8)
            return r3
        L_0x004d:
            r9 = 8
            if (r8 == r9) goto L_0x006a
            r1 = 10
            if (r8 == r1) goto L_0x006a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown AV1 bit depth: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            t3.q.h(r4, r8)
            return r3
        L_0x006a:
            if (r8 != r9) goto L_0x006d
            goto L_0x007f
        L_0x006d:
            if (r10 == 0) goto L_0x007e
            byte[] r8 = r10.f28145d
            if (r8 != 0) goto L_0x007b
            int r8 = r10.f28144c
            r9 = 7
            if (r8 == r9) goto L_0x007b
            r9 = 6
            if (r8 != r9) goto L_0x007e
        L_0x007b:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x007f
        L_0x007e:
            r0 = r5
        L_0x007f:
            int r8 = a(r6)
            r9 = -1
            if (r8 != r9) goto L_0x009b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 level: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            t3.q.h(r4, r8)
            return r3
        L_0x009b:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
            return r9
        L_0x00a9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            t3.q.h(r4, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C5954e.l(java.lang.String, java.lang.String[], q3.i):android.util.Pair");
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = parseInt;
            } else {
                q.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int c10 = c(i11);
            if (c10 == -1) {
                q.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int b10 = b(i10);
            if (b10 != -1) {
                return new Pair<>(Integer.valueOf(c10), Integer.valueOf(b10));
            }
            q.h("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> n(q3.C5807s r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.f28240k
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r6.f28244o
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x001e
            java.lang.String r6 = r6.f28240k
            android.util.Pair r6 = o(r6, r1)
            return r6
        L_0x001e:
            r3 = r1[r0]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x007a;
                case 3006243: goto L_0x006f;
                case 3006244: goto L_0x0064;
                case 3199032: goto L_0x0059;
                case 3214780: goto L_0x004e;
                case 3356560: goto L_0x0043;
                case 3475740: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = r4
            goto L_0x0083
        L_0x002d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r0 = 7
            goto L_0x0083
        L_0x0038:
            java.lang.String r0 = "s263"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r0 = 6
            goto L_0x0083
        L_0x0043:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r0 = 5
            goto L_0x0083
        L_0x004e:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r0 = 4
            goto L_0x0083
        L_0x0059:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r0 = 3
            goto L_0x0083
        L_0x0064:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r0 = 2
            goto L_0x0083
        L_0x006f:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            r0 = 1
            goto L_0x0083
        L_0x007a:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0083
            goto L_0x002b
        L_0x0083:
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a5;
                case 3: goto L_0x009c;
                case 4: goto L_0x009c;
                case 5: goto L_0x0095;
                case 6: goto L_0x008e;
                case 7: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            return r2
        L_0x0087:
            java.lang.String r6 = r6.f28240k
            android.util.Pair r6 = r(r6, r1)
            return r6
        L_0x008e:
            java.lang.String r6 = r6.f28240k
            android.util.Pair r6 = p(r6, r1)
            return r6
        L_0x0095:
            java.lang.String r6 = r6.f28240k
            android.util.Pair r6 = k(r6, r1)
            return r6
        L_0x009c:
            java.lang.String r0 = r6.f28240k
            q3.i r6 = r6.f28218C
            android.util.Pair r6 = q(r0, r1, r6)
            return r6
        L_0x00a5:
            java.lang.String r6 = r6.f28240k
            android.util.Pair r6 = m(r6, r1)
            return r6
        L_0x00ac:
            java.lang.String r0 = r6.f28240k
            q3.i r6 = r6.f28218C
            android.util.Pair r6 = l(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C5954e.n(q3.s):android.util.Pair");
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        if (strArr.length < 3) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f29486c.matcher(strArr[1]);
        if (!matcher.matches()) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer j10 = j(group);
        if (j10 == null) {
            q.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer i10 = i(str2);
        if (i10 != null) {
            return new Pair<>(j10, i10);
        }
        q.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> q(String str, String[] strArr, C5798i iVar) {
        if (strArr.length < 4) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f29486c.matcher(strArr[1]);
        if (!matcher.matches()) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            i10 = 6;
            if ("2".equals(group)) {
                i10 = (iVar == null || iVar.f28144c != 6) ? 2 : RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (!"6".equals(group)) {
                q.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer s10 = s(str2);
        if (s10 != null) {
            return new Pair<>(Integer.valueOf(i10), s10);
        }
        q.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr) {
        if (strArr.length < 3) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int x10 = x(parseInt);
            if (x10 == -1) {
                q.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int w10 = w(parseInt2);
            if (w10 != -1) {
                return new Pair<>(Integer.valueOf(x10), Integer.valueOf(w10));
            }
            q.h("CodecSpecificDataUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            q.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer s(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return Integer.valueOf(RecyclerView.n.FLAG_MOVED);
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return Integer.valueOf(ImageMetadata.LENS_APERTURE);
            case 15:
                return Integer.valueOf(UploadKt.MAX_CHUNK_SIZE);
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            case 20:
                return 16384;
            case 21:
                return Integer.valueOf(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            case 22:
                return 262144;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                return Integer.valueOf(ImageMetadata.SHADING_MODE);
            case BuildConfig.MIN_SDK_VERSION /*24*/:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static int t(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair<Integer, Integer> u(byte[] bArr) {
        B b10 = new B(bArr);
        b10.W(9);
        int H10 = b10.H();
        b10.W(20);
        return Pair.create(Integer.valueOf(b10.L()), Integer.valueOf(H10));
    }

    public static boolean v(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int w(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return RecyclerView.n.FLAG_MOVED;
            case 61:
                return RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int x(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }
}
