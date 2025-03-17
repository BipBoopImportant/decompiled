package androidx.media3.exoplayer.video.spherical;

import t3.C5950a;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f43054a;

    /* renamed from: b  reason: collision with root package name */
    public final a f43055b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43056c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f43057d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b[] f43058a;

        public a(b... bVarArr) {
            this.f43058a = bVarArr;
        }

        public b a(int i10) {
            return this.f43058a[i10];
        }

        public int b() {
            return this.f43058a.length;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f43059a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43060b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f43061c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f43062d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f43059a = i10;
            C5950a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f43061c = fArr;
            this.f43062d = fArr2;
            this.f43060b = i11;
        }

        public int a() {
            return this.f43061c.length / 3;
        }
    }

    public c(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static c a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        float[] fArr;
        int i14;
        int i15;
        int i16;
        int i17;
        float f14 = f10;
        int i18 = i10;
        int i19 = i11;
        float f15 = f11;
        float f16 = f12;
        C5950a.a(f14 > 0.0f);
        C5950a.a(i18 >= 1);
        C5950a.a(i19 >= 1);
        C5950a.a(f15 > 0.0f && f15 <= 180.0f);
        C5950a.a(f16 > 0.0f && f16 <= 360.0f);
        float radians = (float) Math.toRadians((double) f15);
        float radians2 = (float) Math.toRadians((double) f16);
        float f17 = radians / ((float) i18);
        float f18 = radians2 / ((float) i19);
        int i20 = i19 + 1;
        int i21 = ((i20 * 2) + 2) * i18;
        float[] fArr2 = new float[(i21 * 3)];
        float[] fArr3 = new float[(i21 * 2)];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i18) {
            float f19 = radians / 2.0f;
            float f20 = (((float) i22) * f17) - f19;
            int i25 = i22 + 1;
            float f21 = (((float) i25) * f17) - f19;
            int i26 = 0;
            while (i26 < i20) {
                float f22 = f20;
                int i27 = i25;
                int i28 = 2;
                int i29 = 0;
                while (i29 < i28) {
                    if (i29 == 0) {
                        f13 = f22;
                        i13 = i20;
                    } else {
                        i13 = i20;
                        f13 = f21;
                    }
                    float f23 = ((float) i26) * f18;
                    float f24 = f18;
                    int i30 = i26;
                    double d10 = (double) f14;
                    float f25 = f17;
                    double d11 = (double) ((f23 + 3.1415927f) - (radians2 / 2.0f));
                    int i31 = i29;
                    double d12 = (double) f13;
                    float[] fArr4 = fArr3;
                    float f26 = f21;
                    fArr2[i23] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    float f27 = radians;
                    float f28 = radians2;
                    fArr2[i23 + 1] = (float) (d10 * Math.sin(d12));
                    int i32 = i23 + 3;
                    fArr2[i23 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr4[i24] = f23 / f28;
                    int i33 = i24 + 2;
                    fArr4[i24 + 1] = (((float) (i22 + i31)) * f25) / f27;
                    if (i30 == 0 && i31 == 0) {
                        i17 = i11;
                        i16 = i30;
                        i14 = i31;
                    } else {
                        i17 = i11;
                        i16 = i30;
                        i14 = i31;
                        if (!(i16 == i17 && i14 == 1)) {
                            fArr = fArr4;
                            i15 = 2;
                            i24 = i33;
                            i23 = i32;
                            i29 = i14 + 1;
                            i19 = i17;
                            i26 = i16;
                            fArr3 = fArr;
                            radians = f27;
                            i20 = i13;
                            f18 = f24;
                            radians2 = f28;
                            f21 = f26;
                            i28 = i15;
                            f17 = f25;
                        }
                    }
                    System.arraycopy(fArr2, i23, fArr2, i32, 3);
                    i23 += 6;
                    fArr = fArr4;
                    i15 = 2;
                    System.arraycopy(fArr, i24, fArr, i33, 2);
                    i24 += 4;
                    i29 = i14 + 1;
                    i19 = i17;
                    i26 = i16;
                    fArr3 = fArr;
                    radians = f27;
                    i20 = i13;
                    f18 = f24;
                    radians2 = f28;
                    f21 = f26;
                    i28 = i15;
                    f17 = f25;
                }
                float f29 = radians2;
                float f30 = f17;
                float f31 = f18;
                int i34 = i28;
                int i35 = i20;
                float[] fArr5 = fArr3;
                float f32 = f21;
                int i36 = i26;
                int i37 = i19;
                float f33 = radians;
                int i38 = i36 + 1;
                i25 = i27;
                f17 = f30;
                radians2 = f29;
                f21 = f32;
                f20 = f22;
                int i39 = i38;
                i19 = i37;
                i26 = i39;
            }
            i18 = i10;
            i22 = i25;
        }
        return new c(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public static c b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public c(a aVar, a aVar2, int i10) {
        this.f43054a = aVar;
        this.f43055b = aVar2;
        this.f43056c = i10;
        this.f43057d = aVar == aVar2;
    }
}
