package androidx.transition;

import java.util.Arrays;

class B {

    /* renamed from: a  reason: collision with root package name */
    private long[] f44582a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f44583b = new float[20];

    /* renamed from: c  reason: collision with root package name */
    private int f44584c = 0;

    B() {
        long[] jArr = new long[20];
        this.f44582a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f10) {
        return (float) (((double) Math.signum(f10)) * Math.sqrt((double) (Math.abs(f10) * 2.0f)));
    }

    public void a(long j10, float f10) {
        int i10 = (this.f44584c + 1) % 20;
        this.f44584c = i10;
        this.f44582a[i10] = j10;
        this.f44583b[i10] = f10;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        float c10;
        int i10 = this.f44584c;
        if (i10 == 0 && this.f44582a[i10] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j10 = this.f44582a[i10];
        int i11 = 0;
        long j11 = j10;
        while (true) {
            long j12 = this.f44582a[i10];
            if (j12 != Long.MIN_VALUE) {
                float abs = (float) Math.abs(j12 - j11);
                if (((float) (j10 - j12)) > 100.0f || abs > 40.0f) {
                    break;
                }
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                j11 = j12;
            } else {
                break;
            }
        }
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = this.f44584c;
            int i13 = i12 == 0 ? 19 : i12 - 1;
            long[] jArr = this.f44582a;
            float f10 = (float) (jArr[i12] - jArr[i13]);
            if (f10 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f44583b;
            c10 = (fArr[i12] - fArr[i13]) / f10;
        } else {
            int i14 = this.f44584c;
            int i15 = ((i14 - i11) + 21) % 20;
            int i16 = (i14 + 21) % 20;
            long j13 = this.f44582a[i15];
            float f11 = this.f44583b[i15];
            int i17 = i15 + 1;
            float f12 = 0.0f;
            for (int i18 = i17 % 20; i18 != i16; i18 = (i18 + 1) % 20) {
                long j14 = this.f44582a[i18];
                float f13 = (float) (j14 - j13);
                if (f13 != 0.0f) {
                    float f14 = this.f44583b[i18];
                    float f15 = (f14 - f11) / f13;
                    f12 += (f15 - c(f12)) * Math.abs(f15);
                    if (i18 == i17) {
                        f12 *= 0.5f;
                    }
                    f11 = f14;
                    j13 = j14;
                }
            }
            c10 = c(f12);
        }
        return c10 * 1000.0f;
    }
}
