package q3;

import java.util.Arrays;
import t3.N;

/* renamed from: q3.i  reason: case insensitive filesystem */
public final class C5798i {

    /* renamed from: h  reason: collision with root package name */
    public static final C5798i f28134h = new b().d(1).c(2).e(3).a();

    /* renamed from: i  reason: collision with root package name */
    public static final C5798i f28135i = new b().d(1).c(1).e(2).a();

    /* renamed from: j  reason: collision with root package name */
    private static final String f28136j = N.A0(0);

    /* renamed from: k  reason: collision with root package name */
    private static final String f28137k = N.A0(1);

    /* renamed from: l  reason: collision with root package name */
    private static final String f28138l = N.A0(2);

    /* renamed from: m  reason: collision with root package name */
    private static final String f28139m = N.A0(3);

    /* renamed from: n  reason: collision with root package name */
    private static final String f28140n = N.A0(4);

    /* renamed from: o  reason: collision with root package name */
    private static final String f28141o = N.A0(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f28142a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28143b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28144c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f28145d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28146e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28147f;

    /* renamed from: g  reason: collision with root package name */
    private int f28148g;

    /* renamed from: q3.i$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f28149a;

        /* renamed from: b  reason: collision with root package name */
        private int f28150b;

        /* renamed from: c  reason: collision with root package name */
        private int f28151c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f28152d;

        /* renamed from: e  reason: collision with root package name */
        private int f28153e;

        /* renamed from: f  reason: collision with root package name */
        private int f28154f;

        public C5798i a() {
            return new C5798i(this.f28149a, this.f28150b, this.f28151c, this.f28152d, this.f28153e, this.f28154f);
        }

        public b b(int i10) {
            this.f28154f = i10;
            return this;
        }

        public b c(int i10) {
            this.f28150b = i10;
            return this;
        }

        public b d(int i10) {
            this.f28149a = i10;
            return this;
        }

        public b e(int i10) {
            this.f28151c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f28152d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f28153e = i10;
            return this;
        }

        public b() {
            this.f28149a = -1;
            this.f28150b = -1;
            this.f28151c = -1;
            this.f28153e = -1;
            this.f28154f = -1;
        }

        private b(C5798i iVar) {
            this.f28149a = iVar.f28142a;
            this.f28150b = iVar.f28143b;
            this.f28151c = iVar.f28144c;
            this.f28152d = iVar.f28145d;
            this.f28153e = iVar.f28146e;
            this.f28154f = iVar.f28147f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r1 = r4.f28144c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r1 = r4.f28147f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r4 = r4.f28146e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r1 = r4.f28143b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(q3.C5798i r4) {
        /*
            r0 = 1
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.f28142a
            r2 = 2
            r3 = -1
            if (r1 == r3) goto L_0x000e
            if (r1 == r0) goto L_0x000e
            if (r1 != r2) goto L_0x002e
        L_0x000e:
            int r1 = r4.f28143b
            if (r1 == r3) goto L_0x0014
            if (r1 != r2) goto L_0x002e
        L_0x0014:
            int r1 = r4.f28144c
            if (r1 == r3) goto L_0x001b
            r2 = 3
            if (r1 != r2) goto L_0x002e
        L_0x001b:
            byte[] r1 = r4.f28145d
            if (r1 != 0) goto L_0x002e
            int r1 = r4.f28147f
            r2 = 8
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x002e
        L_0x0027:
            int r4 = r4.f28146e
            if (r4 == r3) goto L_0x002f
            if (r4 != r2) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C5798i.h(q3.i):boolean");
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5798i.class != obj.getClass()) {
            return false;
        }
        C5798i iVar = (C5798i) obj;
        return this.f28142a == iVar.f28142a && this.f28143b == iVar.f28143b && this.f28144c == iVar.f28144c && Arrays.equals(this.f28145d, iVar.f28145d) && this.f28146e == iVar.f28146e && this.f28147f == iVar.f28147f;
    }

    public boolean f() {
        return (this.f28146e == -1 || this.f28147f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f28142a == -1 || this.f28143b == -1 || this.f28144c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f28148g == 0) {
            this.f28148g = ((((((((((527 + this.f28142a) * 31) + this.f28143b) * 31) + this.f28144c) * 31) + Arrays.hashCode(this.f28145d)) * 31) + this.f28146e) * 31) + this.f28147f;
        }
        return this.f28148g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String G10 = g() ? N.G("%s/%s/%s", d(this.f28142a), c(this.f28143b), e(this.f28144c)) : "NA/NA/NA";
        if (f()) {
            str = this.f28146e + "/" + this.f28147f;
        } else {
            str = "NA/NA";
        }
        return G10 + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f28142a));
        sb2.append(", ");
        sb2.append(c(this.f28143b));
        sb2.append(", ");
        sb2.append(e(this.f28144c));
        sb2.append(", ");
        sb2.append(this.f28145d != null);
        sb2.append(", ");
        sb2.append(l(this.f28146e));
        sb2.append(", ");
        sb2.append(b(this.f28147f));
        sb2.append(")");
        return sb2.toString();
    }

    private C5798i(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f28142a = i10;
        this.f28143b = i11;
        this.f28144c = i12;
        this.f28145d = bArr;
        this.f28146e = i13;
        this.f28147f = i14;
    }
}
