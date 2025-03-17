package G;

import C.C4391e0;
import H2.i;
import android.os.Build;
import androidx.camera.core.impl.C5057y;
import androidx.camera.core.n;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class h {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f6069c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d  reason: collision with root package name */
    private static final j[] f6070d;

    /* renamed from: e  reason: collision with root package name */
    private static final j[] f6071e;

    /* renamed from: f  reason: collision with root package name */
    private static final j[] f6072f;

    /* renamed from: g  reason: collision with root package name */
    static final j[] f6073g = {new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: h  reason: collision with root package name */
    private static final j[] f6074h;

    /* renamed from: i  reason: collision with root package name */
    static final j[][] f6075i;

    /* renamed from: j  reason: collision with root package name */
    static final HashSet<String> f6076j = new HashSet<>(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));

    /* renamed from: a  reason: collision with root package name */
    private final List<Map<String, g>> f6077a;

    /* renamed from: b  reason: collision with root package name */
    private final ByteOrder f6078b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6079a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.y[] r0 = androidx.camera.core.impl.C5057y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6079a = r0
                androidx.camera.core.impl.y r1 = androidx.camera.core.impl.C5057y.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6079a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.y r1 = androidx.camera.core.impl.C5057y.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6079a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.y r1 = androidx.camera.core.impl.C5057y.FIRED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G.h.a.<clinit>():void");
        }
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f6080c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f6081d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f6082e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f  reason: collision with root package name */
        static final List<HashMap<String, j>> f6083f = Collections.list(new a());

        /* renamed from: a  reason: collision with root package name */
        final List<Map<String, g>> f6084a = Collections.list(new C0051b());

        /* renamed from: b  reason: collision with root package name */
        private final ByteOrder f6085b;

        class a implements Enumeration<HashMap<String, j>> {

            /* renamed from: a  reason: collision with root package name */
            int f6086a = 0;

            a() {
            }

            /* renamed from: a */
            public HashMap<String, j> nextElement() {
                HashMap<String, j> hashMap = new HashMap<>();
                for (j jVar : h.f6075i[this.f6086a]) {
                    hashMap.put(jVar.f6099b, jVar);
                }
                this.f6086a++;
                return hashMap;
            }

            public boolean hasMoreElements() {
                return this.f6086a < h.f6075i.length;
            }
        }

        /* renamed from: G.h$b$b  reason: collision with other inner class name */
        class C0051b implements Enumeration<Map<String, g>> {

            /* renamed from: a  reason: collision with root package name */
            int f6087a = 0;

            C0051b() {
            }

            /* renamed from: a */
            public Map<String, g> nextElement() {
                this.f6087a++;
                return new HashMap();
            }

            public boolean hasMoreElements() {
                return this.f6087a < h.f6075i.length;
            }
        }

        class c implements Enumeration<Map<String, g>> {

            /* renamed from: a  reason: collision with root package name */
            final Enumeration<Map<String, g>> f6089a;

            c() {
                this.f6089a = Collections.enumeration(b.this.f6084a);
            }

            /* renamed from: a */
            public Map<String, g> nextElement() {
                return new HashMap(this.f6089a.nextElement());
            }

            public boolean hasMoreElements() {
                return this.f6089a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f6085b = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.util.Pair<java.lang.Integer, java.lang.Integer> b(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = b(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = b(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = r6
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = r6
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r4 = 10
                if (r10 < 0) goto L_0x00f5
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r0 = 5
                if (r10 > 0) goto L_0x00eb
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r3 = 4
                if (r2 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r2 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: G.h.b.b(java.lang.String):android.util.Pair");
        }

        private void d(String str, String str2, List<Map<String, g>> list) {
            for (Map<String, g> containsKey : list) {
                if (containsKey.containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:57:0x018c, code lost:
            if (r7 != r0) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ff, code lost:
            r5 = r6;
            r15 = 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, G.g>> r20) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "DateTime"
                boolean r4 = r4.equals(r0)
                java.lang.String r5 = " : "
                java.lang.String r6 = "Invalid value for "
                java.lang.String r7 = "ExifData"
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeOriginal"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeDigitized"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x006d
            L_0x0026:
                if (r2 == 0) goto L_0x006d
                java.util.regex.Pattern r4 = f6081d
                java.util.regex.Matcher r4 = r4.matcher(r2)
                boolean r4 = r4.find()
                java.util.regex.Pattern r8 = f6082e
                java.util.regex.Matcher r8 = r8.matcher(r2)
                boolean r8 = r8.find()
                int r9 = r19.length()
                r10 = 19
                if (r9 != r10) goto L_0x0054
                if (r4 != 0) goto L_0x0049
                if (r8 != 0) goto L_0x0049
                goto L_0x0054
            L_0x0049:
                if (r8 == 0) goto L_0x006d
                java.lang.String r4 = "-"
                java.lang.String r8 = ":"
                java.lang.String r2 = r2.replaceAll(r4, r8)
                goto L_0x006d
            L_0x0054:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r0)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                C.C4391e0.l(r7, r0)
                return
            L_0x006d:
                java.lang.String r4 = "ISOSpeedRatings"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0077
                java.lang.String r0 = "PhotographicSensitivity"
            L_0x0077:
                r4 = r0
                r0 = 2
                r8 = 1
                if (r2 == 0) goto L_0x0124
                java.util.HashSet<java.lang.String> r9 = G.h.f6076j
                boolean r9 = r9.contains(r4)
                if (r9 == 0) goto L_0x0124
                java.lang.String r9 = "GPSTimeStamp"
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto L_0x00fc
                java.util.regex.Pattern r9 = f6080c
                java.util.regex.Matcher r9 = r9.matcher(r2)
                boolean r10 = r9.find()
                if (r10 != 0) goto L_0x00b1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r4)
                r0.append(r5)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                C.C4391e0.l(r7, r0)
                return
            L_0x00b1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r9.group(r8)
                java.lang.Object r5 = H2.i.g(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1,"
                r2.append(r5)
                java.lang.String r6 = r9.group(r0)
                java.lang.Object r6 = H2.i.g(r6)
                java.lang.String r6 = (java.lang.String) r6
                int r6 = java.lang.Integer.parseInt(r6)
                r2.append(r6)
                r2.append(r5)
                r5 = 3
                java.lang.String r5 = r9.group(r5)
                java.lang.Object r5 = H2.i.g(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                goto L_0x0124
            L_0x00fc:
                double r9 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x010a }
                G.k r11 = new G.k     // Catch:{ NumberFormatException -> 0x010a }
                r11.<init>(r9)     // Catch:{ NumberFormatException -> 0x010a }
                java.lang.String r2 = r11.toString()     // Catch:{ NumberFormatException -> 0x010a }
                goto L_0x0124
            L_0x010a:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                C.C4391e0.m(r7, r2, r0)
                return
            L_0x0124:
                r5 = 0
                r6 = r5
            L_0x0126:
                G.j[][] r7 = G.h.f6075i
                int r7 = r7.length
                if (r6 >= r7) goto L_0x02e4
                java.util.List<java.util.HashMap<java.lang.String, G.j>> r7 = f6083f
                java.lang.Object r7 = r7.get(r6)
                java.util.HashMap r7 = (java.util.HashMap) r7
                java.lang.Object r7 = r7.get(r4)
                G.j r7 = (G.j) r7
                if (r7 == 0) goto L_0x0146
                if (r2 != 0) goto L_0x014a
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                r7.remove(r4)
            L_0x0146:
                r5 = r6
                r15 = r8
                goto L_0x02dd
            L_0x014a:
                android.util.Pair r9 = b(r2)
                int r10 = r7.f6100c
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r12 = -1
                if (r10 == r11) goto L_0x018f
                int r10 = r7.f6100c
                java.lang.Object r11 = r9.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 != r11) goto L_0x0168
                goto L_0x018f
            L_0x0168:
                int r10 = r7.f6101d
                if (r10 == r12) goto L_0x0185
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 == r11) goto L_0x0182
                int r10 = r7.f6101d
                java.lang.Object r9 = r9.second
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r10 != r9) goto L_0x0185
            L_0x0182:
                int r7 = r7.f6101d
                goto L_0x0191
            L_0x0185:
                int r7 = r7.f6100c
                if (r7 == r8) goto L_0x0191
                r9 = 7
                if (r7 == r9) goto L_0x0191
                if (r7 != r0) goto L_0x0146
                goto L_0x0191
            L_0x018f:
                int r7 = r7.f6100c
            L_0x0191:
                java.lang.String r9 = "/"
                java.lang.String r10 = ","
                switch(r7) {
                    case 1: goto L_0x02ce;
                    case 2: goto L_0x02be;
                    case 3: goto L_0x0296;
                    case 4: goto L_0x026e;
                    case 5: goto L_0x0229;
                    case 6: goto L_0x0198;
                    case 7: goto L_0x02be;
                    case 8: goto L_0x0198;
                    case 9: goto L_0x0203;
                    case 10: goto L_0x01bf;
                    case 11: goto L_0x0198;
                    case 12: goto L_0x0199;
                    default: goto L_0x0198;
                }
            L_0x0198:
                goto L_0x0146
            L_0x0199:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r9 = r7.length
                double[] r9 = new double[r9]
                r10 = r5
            L_0x01a1:
                int r11 = r7.length
                if (r10 >= r11) goto L_0x01af
                r11 = r7[r10]
                double r11 = java.lang.Double.parseDouble(r11)
                r9[r10] = r11
                int r10 = r10 + 1
                goto L_0x01a1
            L_0x01af:
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r10 = r1.f6085b
                G.g r9 = G.g.b(r9, r10)
                r7.put(r4, r9)
                goto L_0x0146
            L_0x01bf:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r10 = r7.length
                G.k[] r10 = new G.k[r10]
                r11 = r5
            L_0x01c7:
                int r13 = r7.length
                if (r11 >= r13) goto L_0x01ee
                r13 = r7[r11]
                java.lang.String[] r13 = r13.split(r9, r12)
                G.k r14 = new G.k
                r15 = r13[r5]
                double r0 = java.lang.Double.parseDouble(r15)
                long r0 = (long) r0
                r13 = r13[r8]
                r15 = r9
                double r8 = java.lang.Double.parseDouble(r13)
                long r8 = (long) r8
                r14.<init>(r0, r8)
                r10[r11] = r14
                int r11 = r11 + 1
                r9 = r15
                r0 = 2
                r8 = 1
                r1 = r17
                goto L_0x01c7
            L_0x01ee:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                r1 = r17
                java.nio.ByteOrder r7 = r1.f6085b
                G.g r7 = G.g.d(r10, r7)
                r0.put(r4, r7)
            L_0x01ff:
                r5 = r6
                r15 = 1
                goto L_0x02dd
            L_0x0203:
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                int[] r7 = new int[r7]
                r8 = r5
            L_0x020b:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x0219
                r9 = r0[r8]
                int r9 = java.lang.Integer.parseInt(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L_0x020b
            L_0x0219:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r8 = r1.f6085b
                G.g r7 = G.g.c(r7, r8)
                r0.put(r4, r7)
                goto L_0x01ff
            L_0x0229:
                r15 = r9
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                G.k[] r7 = new G.k[r7]
                r8 = r5
            L_0x0232:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x025b
                r9 = r0[r8]
                r10 = r15
                java.lang.String[] r9 = r9.split(r10, r12)
                G.k r11 = new G.k
                r13 = r9[r5]
                double r13 = java.lang.Double.parseDouble(r13)
                long r13 = (long) r13
                r15 = 1
                r9 = r9[r15]
                r16 = r6
                double r5 = java.lang.Double.parseDouble(r9)
                long r5 = (long) r5
                r11.<init>(r13, r5)
                r7[r8] = r11
                int r8 = r8 + 1
                r15 = r10
                r6 = r16
                r5 = 0
                goto L_0x0232
            L_0x025b:
                r5 = r6
                r15 = 1
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r6 = r1.f6085b
                G.g r6 = G.g.h(r7, r6)
                r0.put(r4, r6)
                goto L_0x02dd
            L_0x026e:
                r5 = r6
                r15 = r8
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                long[] r6 = new long[r6]
                r7 = 0
            L_0x0278:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x0286
                r8 = r0[r7]
                long r8 = java.lang.Long.parseLong(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x0278
            L_0x0286:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f6085b
                G.g r6 = G.g.g(r6, r7)
                r0.put(r4, r6)
                goto L_0x02dd
            L_0x0296:
                r5 = r6
                r15 = r8
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                int[] r6 = new int[r6]
                r7 = 0
            L_0x02a0:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x02ae
                r8 = r0[r7]
                int r8 = java.lang.Integer.parseInt(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x02a0
            L_0x02ae:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f6085b
                G.g r6 = G.g.i(r6, r7)
                r0.put(r4, r6)
                goto L_0x02dd
            L_0x02be:
                r5 = r6
                r15 = r8
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                G.g r6 = G.g.e(r2)
                r0.put(r4, r6)
                goto L_0x02dd
            L_0x02ce:
                r5 = r6
                r15 = r8
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                G.g r6 = G.g.a(r2)
                r0.put(r4, r6)
            L_0x02dd:
                int r6 = r5 + 1
                r8 = r15
                r0 = 2
                r5 = 0
                goto L_0x0126
            L_0x02e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G.h.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public h a() {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f6085b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f6084a);
            return this;
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(((double) j10) / ((double) TimeUnit.SECONDS.toNanos(1))));
        }

        public b g(C5057y yVar) {
            int i10;
            if (yVar == C5057y.UNKNOWN) {
                return this;
            }
            int i11 = a.f6079a[yVar.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else if (i11 != 3) {
                C4391e0.l("ExifData", "Unknown flash state: " + yVar);
                return this;
            } else {
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new k((long) (f10 * 1000.0f), 1000).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                C4391e0.l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            int ordinal = cVar.ordinal();
            return c("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f6070d = jVarArr;
        j jVar = r1;
        j jVar2 = new j("ExposureTime", 33434, 5);
        j jVar3 = r1;
        j jVar4 = new j("FNumber", 33437, 5);
        j jVar5 = r1;
        j jVar6 = new j("ExposureProgram", 34850, 3);
        j jVar7 = r1;
        j jVar8 = new j("PhotographicSensitivity", 34855, 3);
        j jVar9 = r1;
        j jVar10 = new j("SensitivityType", 34864, 3);
        j jVar11 = r1;
        j jVar12 = new j("ExifVersion", 36864, 2);
        j jVar13 = r1;
        j jVar14 = new j("DateTimeOriginal", 36867, 2);
        j jVar15 = r1;
        j jVar16 = new j("DateTimeDigitized", 36868, 2);
        j jVar17 = r1;
        j jVar18 = new j("ComponentsConfiguration", 37121, 7);
        j jVar19 = r1;
        j jVar20 = new j("ShutterSpeedValue", 37377, 10);
        j jVar21 = r1;
        j jVar22 = new j("ApertureValue", 37378, 5);
        j jVar23 = r1;
        j jVar24 = new j("BrightnessValue", 37379, 10);
        j jVar25 = r1;
        j jVar26 = new j("ExposureBiasValue", 37380, 10);
        j jVar27 = r1;
        j jVar28 = new j("MaxApertureValue", 37381, 5);
        j jVar29 = r1;
        j jVar30 = new j("MeteringMode", 37383, 3);
        j jVar31 = r1;
        j jVar32 = new j("LightSource", 37384, 3);
        j jVar33 = r1;
        j jVar34 = new j("Flash", 37385, 3);
        j jVar35 = r1;
        j jVar36 = new j("FocalLength", 37386, 5);
        j jVar37 = r1;
        j jVar38 = new j("SubSecTime", 37520, 2);
        j jVar39 = r1;
        j jVar40 = new j("SubSecTimeOriginal", 37521, 2);
        j jVar41 = r1;
        j jVar42 = new j("SubSecTimeDigitized", 37522, 2);
        j jVar43 = r1;
        j jVar44 = new j("FlashpixVersion", 40960, 7);
        j jVar45 = r1;
        j jVar46 = new j("ColorSpace", 40961, 3);
        j jVar47 = r1;
        j jVar48 = new j("PixelXDimension", 40962, 3, 4);
        j jVar49 = r1;
        j jVar50 = new j("PixelYDimension", 40963, 3, 4);
        j jVar51 = r1;
        j jVar52 = new j("InteroperabilityIFDPointer", 40965, 4);
        j jVar53 = r1;
        j jVar54 = new j("FocalPlaneResolutionUnit", 41488, 3);
        j jVar55 = r1;
        j jVar56 = new j("SensingMethod", 41495, 3);
        j jVar57 = r1;
        j jVar58 = new j("FileSource", 41728, 7);
        j jVar59 = r1;
        j jVar60 = new j("SceneType", 41729, 7);
        j jVar61 = r1;
        j jVar62 = new j("CustomRendered", 41985, 3);
        j jVar63 = r1;
        j jVar64 = new j("ExposureMode", 41986, 3);
        j jVar65 = r1;
        j jVar66 = new j("WhiteBalance", 41987, 3);
        j jVar67 = r1;
        j jVar68 = new j("SceneCaptureType", 41990, 3);
        j jVar69 = r1;
        j jVar70 = new j("Contrast", 41992, 3);
        j jVar71 = r1;
        j jVar72 = new j("Saturation", 41993, 3);
        j jVar73 = r1;
        j jVar74 = new j("Sharpness", 41994, 3);
        j[] jVarArr2 = {jVar, jVar3, jVar5, jVar7, jVar9, jVar11, jVar13, jVar15, jVar17, jVar19, jVar21, jVar23, jVar25, jVar27, jVar29, jVar31, jVar33, jVar35, jVar37, jVar39, jVar41, jVar43, jVar45, jVar47, jVar49, jVar51, jVar53, jVar55, jVar57, jVar59, jVar61, jVar63, jVar65, jVar67, jVar69, jVar71, jVar73};
        f6071e = jVarArr2;
        j[] jVarArr3 = jVarArr;
        j[] jVarArr4 = jVarArr2;
        j[] jVarArr5 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f6072f = jVarArr5;
        j[] jVarArr6 = {new j("InteroperabilityIndex", 1, 2)};
        f6074h = jVarArr6;
        f6075i = new j[][]{jVarArr3, jVarArr4, jVarArr5, jVarArr6};
    }

    h(ByteOrder byteOrder, List<Map<String, g>> list) {
        i.j(list.size() == f6075i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f6078b = byteOrder;
        this.f6077a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static h b(n nVar, int i10) {
        b a10 = a();
        if (nVar.F2() != null) {
            nVar.F2().c(a10);
        }
        a10.m(i10);
        return a10.j(nVar.getWidth()).i(nVar.getHeight()).a();
    }

    /* access modifiers changed from: package-private */
    public Map<String, g> c(int i10) {
        int length = f6075i.length;
        i.c(i10, 0, length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f6077a.get(i10);
    }

    public ByteOrder d() {
        return this.f6078b;
    }
}
