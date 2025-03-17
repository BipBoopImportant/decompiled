package q2;

import p2.e;
import p2.h;

class j extends p {
    j(e eVar) {
        super(eVar);
        eVar.f27448e.f();
        eVar.f27450f.f();
        this.f27832f = ((h) eVar).w1();
    }

    private void q(f fVar) {
        this.f27834h.f27794k.add(fVar);
        fVar.f27795l.add(this.f27834h);
    }

    public void a(d dVar) {
        f fVar = this.f27834h;
        if (fVar.f27786c && !fVar.f27793j) {
            this.f27834h.d((int) ((((float) fVar.f27795l.get(0).f27790g) * ((h) this.f27828b).z1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        h hVar = (h) this.f27828b;
        int x12 = hVar.x1();
        int y12 = hVar.y1();
        hVar.z1();
        if (hVar.w1() == 1) {
            if (x12 != -1) {
                this.f27834h.f27795l.add(this.f27828b.f27441a0.f27448e.f27834h);
                this.f27828b.f27441a0.f27448e.f27834h.f27794k.add(this.f27834h);
                this.f27834h.f27789f = x12;
            } else if (y12 != -1) {
                this.f27834h.f27795l.add(this.f27828b.f27441a0.f27448e.f27835i);
                this.f27828b.f27441a0.f27448e.f27835i.f27794k.add(this.f27834h);
                this.f27834h.f27789f = -y12;
            } else {
                f fVar = this.f27834h;
                fVar.f27785b = true;
                fVar.f27795l.add(this.f27828b.f27441a0.f27448e.f27835i);
                this.f27828b.f27441a0.f27448e.f27835i.f27794k.add(this.f27834h);
            }
            q(this.f27828b.f27448e.f27834h);
            q(this.f27828b.f27448e.f27835i);
            return;
        }
        if (x12 != -1) {
            this.f27834h.f27795l.add(this.f27828b.f27441a0.f27450f.f27834h);
            this.f27828b.f27441a0.f27450f.f27834h.f27794k.add(this.f27834h);
            this.f27834h.f27789f = x12;
        } else if (y12 != -1) {
            this.f27834h.f27795l.add(this.f27828b.f27441a0.f27450f.f27835i);
            this.f27828b.f27441a0.f27450f.f27835i.f27794k.add(this.f27834h);
            this.f27834h.f27789f = -y12;
        } else {
            f fVar2 = this.f27834h;
            fVar2.f27785b = true;
            fVar2.f27795l.add(this.f27828b.f27441a0.f27450f.f27835i);
            this.f27828b.f27441a0.f27450f.f27835i.f27794k.add(this.f27834h);
        }
        q(this.f27828b.f27450f.f27834h);
        q(this.f27828b.f27450f.f27835i);
    }

    public void e() {
        if (((h) this.f27828b).w1() == 1) {
            this.f27828b.q1(this.f27834h.f27790g);
        } else {
            this.f27828b.r1(this.f27834h.f27790g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27834h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
