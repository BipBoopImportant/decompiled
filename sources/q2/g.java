package q2;

import q2.f;

class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f27796m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f27788e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f27788e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void d(int i10) {
        if (!this.f27793j) {
            this.f27793j = true;
            this.f27790g = i10;
            for (d next : this.f27794k) {
                next.a(next);
            }
        }
    }
}
