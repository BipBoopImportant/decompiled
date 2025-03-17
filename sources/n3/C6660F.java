package N3;

/* renamed from: N3.F  reason: case insensitive filesystem */
public final class C6660F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f38746a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f38747b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f38748c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f38749d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f38750e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f38751f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f38752g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: N3.F$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f38753a;

        /* renamed from: b  reason: collision with root package name */
        public String f38754b;

        /* renamed from: c  reason: collision with root package name */
        public int f38755c;

        /* renamed from: d  reason: collision with root package name */
        public int f38756d;

        /* renamed from: e  reason: collision with root package name */
        public int f38757e;

        /* renamed from: f  reason: collision with root package name */
        public int f38758f;

        /* renamed from: g  reason: collision with root package name */
        public int f38759g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!C6660F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f38753a = i11;
            this.f38754b = C6660F.f38746a[3 - i12];
            int i15 = C6660F.f38747b[i14];
            this.f38756d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f38756d = i15 / 2;
            } else if (i11 == 0) {
                this.f38756d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            this.f38759g = C6660F.k(i11, i12);
            if (i12 == 3) {
                int i18 = i11 == 3 ? C6660F.f38748c[i13 - 1] : C6660F.f38749d[i13 - 1];
                this.f38758f = i18;
                this.f38755c = (((i18 * 12) / this.f38756d) + i17) * 4;
            } else {
                int i19 = 144;
                if (i11 == 3) {
                    int i20 = i12 == 2 ? C6660F.f38750e[i13 - 1] : C6660F.f38751f[i13 - 1];
                    this.f38758f = i20;
                    this.f38755c = ((i20 * 144) / this.f38756d) + i17;
                } else {
                    int i21 = C6660F.f38752g[i13 - 1];
                    this.f38758f = i21;
                    if (i12 == 1) {
                        i19 = 72;
                    }
                    this.f38755c = ((i19 * i21) / this.f38756d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f38757e = i16;
            return true;
        }

        public a(a aVar) {
            this.f38753a = aVar.f38753a;
            this.f38754b = aVar.f38754b;
            this.f38755c = aVar.f38755c;
            this.f38756d = aVar.f38756d;
            this.f38757e = aVar.f38757e;
            this.f38758f = aVar.f38758f;
            this.f38759g = aVar.f38759g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f38747b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f38748c[i13 - 1] : f38749d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f38750e[i13 - 1] : f38751f[i13 - 1] : f38752g[i13 - 1];
        int i18 = 144;
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return ((i18 * i17) / i15) + i16;
    }

    /* access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & -2097152) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
