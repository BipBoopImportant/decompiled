package com.google.android.material.carousel;

final class a {

    /* renamed from: a  reason: collision with root package name */
    final int f66305a;

    /* renamed from: b  reason: collision with root package name */
    float f66306b;

    /* renamed from: c  reason: collision with root package name */
    int f66307c;

    /* renamed from: d  reason: collision with root package name */
    int f66308d;

    /* renamed from: e  reason: collision with root package name */
    float f66309e;

    /* renamed from: f  reason: collision with root package name */
    float f66310f;

    /* renamed from: g  reason: collision with root package name */
    final int f66311g;

    /* renamed from: h  reason: collision with root package name */
    final float f66312h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f66305a = i10;
        this.f66306b = B2.a.b(f10, f11, f12);
        this.f66307c = i11;
        this.f66309e = f13;
        this.f66308d = i12;
        this.f66310f = f14;
        this.f66311g = i13;
        d(f15, f11, f12, f14);
        this.f66312h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = ((float) i11) / 2.0f;
        return (f10 - ((((float) i10) + f12) * f11)) / (((float) i12) + f12);
    }

    private float b(float f10) {
        if (!g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f10 - this.f66310f) * ((float) this.f66305a);
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr5.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr5[i12];
                int length2 = iArr4.length;
                int i14 = 0;
                while (i14 < length2) {
                    a aVar2 = r8;
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar3 = new a(i10, f11, f12, f13, iArr4[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f66312h < aVar.f66312h) {
                        if (aVar2.f66312h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                int i19 = length;
                i12++;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f66307c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f66306b;
            this.f66306b = f15 + Math.min(f14 / ((float) i10), f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f66306b;
            this.f66306b = f16 + Math.max(f14 / ((float) i10), f11 - f16);
        }
        int i11 = this.f66307c;
        float f17 = i11 > 0 ? this.f66306b : 0.0f;
        this.f66306b = f17;
        float a10 = a(f10, i11, f17, this.f66308d, this.f66311g);
        this.f66310f = a10;
        float f18 = (this.f66306b + a10) / 2.0f;
        this.f66309e = f18;
        int i12 = this.f66308d;
        if (i12 > 0 && a10 != f13) {
            float f19 = (f13 - a10) * ((float) this.f66311g);
            float min = Math.min(Math.abs(f19), f18 * 0.1f * ((float) i12));
            if (f19 > 0.0f) {
                this.f66309e -= min / ((float) this.f66308d);
                this.f66310f += min / ((float) this.f66311g);
                return;
            }
            this.f66309e += min / ((float) this.f66308d);
            this.f66310f -= min / ((float) this.f66311g);
        }
    }

    private float f() {
        return (this.f66310f * ((float) this.f66311g)) + (this.f66309e * ((float) this.f66308d)) + (this.f66306b * ((float) this.f66307c));
    }

    private boolean g() {
        int i10 = this.f66311g;
        if (i10 > 0 && this.f66307c > 0 && this.f66308d > 0) {
            float f10 = this.f66310f;
            float f11 = this.f66309e;
            return f10 > f11 && f11 > this.f66306b;
        } else if (i10 <= 0 || this.f66307c <= 0) {
            return true;
        } else {
            return this.f66310f > this.f66306b;
        }
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f66307c + this.f66308d + this.f66311g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f66305a + ", smallCount=" + this.f66307c + ", smallSize=" + this.f66306b + ", mediumCount=" + this.f66308d + ", mediumSize=" + this.f66309e + ", largeCount=" + this.f66311g + ", largeSize=" + this.f66310f + ", cost=" + this.f66312h + "]";
    }
}
