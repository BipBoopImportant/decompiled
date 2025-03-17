package o4;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C10076f;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: o4.c  reason: case insensitive filesystem */
final class C8599c {

    /* renamed from: a  reason: collision with root package name */
    public final String f55188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55189b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f55190c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f55191d;

    /* renamed from: e  reason: collision with root package name */
    public final float f55192e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55193f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f55194g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55195h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f55196i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55197j;

    /* renamed from: o4.c$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f55198a;

        /* renamed from: b  reason: collision with root package name */
        public final int f55199b;

        /* renamed from: c  reason: collision with root package name */
        public final int f55200c;

        /* renamed from: d  reason: collision with root package name */
        public final int f55201d;

        /* renamed from: e  reason: collision with root package name */
        public final int f55202e;

        /* renamed from: f  reason: collision with root package name */
        public final int f55203f;

        /* renamed from: g  reason: collision with root package name */
        public final int f55204g;

        /* renamed from: h  reason: collision with root package name */
        public final int f55205h;

        /* renamed from: i  reason: collision with root package name */
        public final int f55206i;

        /* renamed from: j  reason: collision with root package name */
        public final int f55207j;

        /* renamed from: k  reason: collision with root package name */
        public final int f55208k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f55198a = i10;
            this.f55199b = i11;
            this.f55200c = i12;
            this.f55201d = i13;
            this.f55202e = i14;
            this.f55203f = i15;
            this.f55204g = i16;
            this.f55205h = i17;
            this.f55206i = i18;
            this.f55207j = i19;
            this.f55208k = i20;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static o4.C8599c.a a(java.lang.String r18) {
            /*
                r0 = 1
                r1 = 7
                r2 = r18
                java.lang.String r2 = r2.substring(r1)
                java.lang.String r3 = ","
                java.lang.String[] r2 = android.text.TextUtils.split(r2, r3)
                r3 = -1
                r4 = 0
                r7 = r3
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r16 = r15
                r5 = r4
            L_0x001c:
                int r6 = r2.length
                if (r5 >= r6) goto L_0x00c3
                r6 = r2[r5]
                java.lang.String r6 = r6.trim()
                java.lang.String r6 = jb.C9892c.e(r6)
                r6.hashCode()
                int r17 = r6.hashCode()
                switch(r17) {
                    case -1178781136: goto L_0x009d;
                    case -1026963764: goto L_0x0092;
                    case -192095652: goto L_0x0087;
                    case -70925746: goto L_0x007c;
                    case 3029637: goto L_0x0071;
                    case 3373707: goto L_0x0066;
                    case 366554320: goto L_0x005b;
                    case 767321349: goto L_0x0050;
                    case 1767875043: goto L_0x0043;
                    case 1988365454: goto L_0x0036;
                    default: goto L_0x0033;
                }
            L_0x0033:
                r1 = r3
                goto L_0x00a7
            L_0x0036:
                java.lang.String r1 = "outlinecolour"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x003f
                goto L_0x0033
            L_0x003f:
                r1 = 9
                goto L_0x00a7
            L_0x0043:
                java.lang.String r1 = "alignment"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x004c
                goto L_0x0033
            L_0x004c:
                r1 = 8
                goto L_0x00a7
            L_0x0050:
                java.lang.String r1 = "borderstyle"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0059
                goto L_0x0033
            L_0x0059:
                r1 = 7
                goto L_0x00a7
            L_0x005b:
                java.lang.String r1 = "fontsize"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0064
                goto L_0x0033
            L_0x0064:
                r1 = 6
                goto L_0x00a7
            L_0x0066:
                java.lang.String r1 = "name"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x006f
                goto L_0x0033
            L_0x006f:
                r1 = 5
                goto L_0x00a7
            L_0x0071:
                java.lang.String r1 = "bold"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x007a
                goto L_0x0033
            L_0x007a:
                r1 = 4
                goto L_0x00a7
            L_0x007c:
                java.lang.String r1 = "primarycolour"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0085
                goto L_0x0033
            L_0x0085:
                r1 = 3
                goto L_0x00a7
            L_0x0087:
                java.lang.String r1 = "strikeout"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0090
                goto L_0x0033
            L_0x0090:
                r1 = 2
                goto L_0x00a7
            L_0x0092:
                java.lang.String r1 = "underline"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x009b
                goto L_0x0033
            L_0x009b:
                r1 = r0
                goto L_0x00a7
            L_0x009d:
                java.lang.String r1 = "italic"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x00a6
                goto L_0x0033
            L_0x00a6:
                r1 = r4
            L_0x00a7:
                switch(r1) {
                    case 0: goto L_0x00be;
                    case 1: goto L_0x00bc;
                    case 2: goto L_0x00ba;
                    case 3: goto L_0x00b8;
                    case 4: goto L_0x00b6;
                    case 5: goto L_0x00b4;
                    case 6: goto L_0x00b2;
                    case 7: goto L_0x00af;
                    case 8: goto L_0x00ad;
                    case 9: goto L_0x00ab;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                goto L_0x00bf
            L_0x00ab:
                r10 = r5
                goto L_0x00bf
            L_0x00ad:
                r8 = r5
                goto L_0x00bf
            L_0x00af:
                r16 = r5
                goto L_0x00bf
            L_0x00b2:
                r11 = r5
                goto L_0x00bf
            L_0x00b4:
                r7 = r5
                goto L_0x00bf
            L_0x00b6:
                r12 = r5
                goto L_0x00bf
            L_0x00b8:
                r9 = r5
                goto L_0x00bf
            L_0x00ba:
                r15 = r5
                goto L_0x00bf
            L_0x00bc:
                r14 = r5
                goto L_0x00bf
            L_0x00be:
                r13 = r5
            L_0x00bf:
                int r5 = r5 + r0
                r1 = 7
                goto L_0x001c
            L_0x00c3:
                if (r7 == r3) goto L_0x00cf
                o4.c$a r0 = new o4.c$a
                int r1 = r2.length
                r6 = r0
                r17 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00d0
            L_0x00cf:
                r0 = 0
            L_0x00d0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.C8599c.a.a(java.lang.String):o4.c$a");
        }
    }

    /* renamed from: o4.c$b */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f55209c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f55210d = Pattern.compile(N.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f55211e = Pattern.compile(N.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f55212f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f55213a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f55214b;

        private b(int i10, PointF pointF) {
            this.f55213a = i10;
            this.f55214b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f55212f.matcher(str);
            if (matcher.find()) {
                return C8599c.e((String) C5950a.e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|(1:8)|9|10|(2:12|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static o4.C8599c.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f55209c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = r0
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x0029
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = t3.C5950a.e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = a(r3)     // Catch:{ RuntimeException -> 0x0009 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                o4.c$b r5 = new o4.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.C8599c.b.b(java.lang.String):o4.c$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f55210d.matcher(str);
            Matcher matcher2 = f55211e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    q.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C5950a.e(str2)).trim()), Float.parseFloat(((String) C5950a.e(str3)).trim()));
        }

        public static String d(String str) {
            return f55209c.matcher(str).replaceAll("");
        }
    }

    private C8599c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f55188a = str;
        this.f55189b = i10;
        this.f55190c = num;
        this.f55191d = num2;
        this.f55192e = f10;
        this.f55193f = z10;
        this.f55194g = z11;
        this.f55195h = z12;
        this.f55196i = z13;
        this.f55197j = i11;
    }

    public static C8599c b(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        C5950a.a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        int length = split.length;
        int i10 = aVar2.f55208k;
        if (length != i10) {
            q.h("SsaStyle", N.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            String trim = split[aVar2.f55198a].trim();
            int i11 = aVar2.f55199b;
            int e10 = i11 != -1 ? e(split[i11].trim()) : -1;
            int i12 = aVar2.f55200c;
            Integer h10 = i12 != -1 ? h(split[i12].trim()) : null;
            int i13 = aVar2.f55201d;
            Integer h11 = i13 != -1 ? h(split[i13].trim()) : null;
            int i14 = aVar2.f55202e;
            float i15 = i14 != -1 ? i(split[i14].trim()) : -3.4028235E38f;
            int i16 = aVar2.f55203f;
            boolean z10 = i16 != -1 && f(split[i16].trim());
            int i17 = aVar2.f55204g;
            boolean z11 = i17 != -1 && f(split[i17].trim());
            int i18 = aVar2.f55205h;
            boolean z12 = i18 != -1 && f(split[i18].trim());
            int i19 = aVar2.f55206i;
            boolean z13 = i19 != -1 && f(split[i19].trim());
            int i20 = aVar2.f55207j;
            return new C8599c(trim, e10, h10, h11, i15, z10, z11, z12, z13, i20 != -1 ? g(split[i20].trim()) : -1);
        } catch (RuntimeException e11) {
            q.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e11);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* access modifiers changed from: private */
    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        q.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            q.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        q.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C5950a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(C10076f.d(((parseLong >> 24) & 255) ^ 255), C10076f.d(parseLong & 255), C10076f.d((parseLong >> 8) & 255), C10076f.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            q.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            q.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
