package Y2;

import Y2.b;

public final class e extends b<e> {

    /* renamed from: A  reason: collision with root package name */
    private f f14875A = null;

    /* renamed from: B  reason: collision with root package name */
    private float f14876B = Float.MAX_VALUE;

    /* renamed from: C  reason: collision with root package name */
    private boolean f14877C = false;

    public e(d dVar) {
        super(dVar);
    }

    private void u() {
        f fVar = this.f14875A;
        if (fVar != null) {
            double a10 = (double) fVar.a();
            if (a10 > ((double) this.f14863g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a10 < ((double) this.f14864h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* access modifiers changed from: package-private */
    public void o(float f10) {
    }

    public void p() {
        u();
        this.f14875A.g((double) f());
        super.p();
    }

    /* access modifiers changed from: package-private */
    public boolean r(long j10) {
        if (this.f14877C) {
            float f10 = this.f14876B;
            if (f10 != Float.MAX_VALUE) {
                this.f14875A.e(f10);
                this.f14876B = Float.MAX_VALUE;
            }
            this.f14858b = this.f14875A.a();
            this.f14857a = 0.0f;
            this.f14877C = false;
            return true;
        }
        if (this.f14876B != Float.MAX_VALUE) {
            this.f14875A.a();
            long j11 = j10 / 2;
            b.p h10 = this.f14875A.h((double) this.f14858b, (double) this.f14857a, j11);
            this.f14875A.e(this.f14876B);
            this.f14876B = Float.MAX_VALUE;
            b.p h11 = this.f14875A.h((double) h10.f14871a, (double) h10.f14872b, j11);
            this.f14858b = h11.f14871a;
            this.f14857a = h11.f14872b;
        } else {
            b.p h12 = this.f14875A.h((double) this.f14858b, (double) this.f14857a, j10);
            this.f14858b = h12.f14871a;
            this.f14857a = h12.f14872b;
        }
        float max = Math.max(this.f14858b, this.f14864h);
        this.f14858b = max;
        float min = Math.min(max, this.f14863g);
        this.f14858b = min;
        if (!t(min, this.f14857a)) {
            return false;
        }
        this.f14858b = this.f14875A.a();
        this.f14857a = 0.0f;
        return true;
    }

    public void s(float f10) {
        if (g()) {
            this.f14876B = f10;
            return;
        }
        if (this.f14875A == null) {
            this.f14875A = new f(f10);
        }
        this.f14875A.e(f10);
        p();
    }

    /* access modifiers changed from: package-private */
    public boolean t(float f10, float f11) {
        return this.f14875A.c(f10, f11);
    }

    public e v(f fVar) {
        this.f14875A = fVar;
        return this;
    }
}
