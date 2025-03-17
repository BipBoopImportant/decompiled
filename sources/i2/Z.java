package I2;

import android.view.MotionEvent;

class Z {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f8614a = new float[20];

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8615b = new long[20];

    /* renamed from: c  reason: collision with root package name */
    private float f8616c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private int f8617d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f8618e = 0;

    Z() {
    }

    private void b() {
        this.f8617d = 0;
        this.f8616c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f8617d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f8618e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f8615b[i11];
        while (true) {
            jArr = this.f8615b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f8617d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f8617d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            if (j10 == j12) {
                return 0.0f;
            }
            return this.f8614a[i14] / ((float) (j12 - j10));
        }
        float f10 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f8617d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f8615b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float f11 = f(f10);
                float f12 = this.f8614a[i18] / ((float) (this.f8615b[i18] - j13));
                f10 += (f12 - f11) * Math.abs(f12);
                if (i15 == 1) {
                    f10 *= 0.5f;
                }
            }
        }
        return f(f10);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt((double) (Math.abs(f10) * 2.0f)));
    }

    /* access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f8617d != 0 && eventTime - this.f8615b[this.f8618e] > 40) {
            b();
        }
        int i10 = (this.f8618e + 1) % 20;
        this.f8618e = i10;
        int i11 = this.f8617d;
        if (i11 != 20) {
            this.f8617d = i11 + 1;
        }
        this.f8614a[i10] = motionEvent.getAxisValue(26);
        this.f8615b[this.f8618e] = eventTime;
    }

    /* access modifiers changed from: package-private */
    public void c(int i10, float f10) {
        float e10 = e() * ((float) i10);
        this.f8616c = e10;
        if (e10 < (-Math.abs(f10))) {
            this.f8616c = -Math.abs(f10);
        } else if (this.f8616c > Math.abs(f10)) {
            this.f8616c = Math.abs(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f8616c;
    }
}
