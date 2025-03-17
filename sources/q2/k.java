package q2;

import p2.C5756a;
import p2.e;
import q2.f;

class k extends p {
    k(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f27834h.f27794k.add(fVar);
        fVar.f27795l.add(this.f27834h);
    }

    public void a(d dVar) {
        C5756a aVar = (C5756a) this.f27828b;
        int z12 = aVar.z1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f27834h.f27795l) {
            int i12 = fVar.f27790g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (z12 == 0 || z12 == 2) {
            this.f27834h.d(i11 + aVar.A1());
        } else {
            this.f27834h.d(i10 + aVar.A1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e eVar = this.f27828b;
        if (eVar instanceof C5756a) {
            this.f27834h.f27785b = true;
            C5756a aVar = (C5756a) eVar;
            int z12 = aVar.z1();
            boolean y12 = aVar.y1();
            int i10 = 0;
            if (z12 == 0) {
                this.f27834h.f27788e = f.a.LEFT;
                while (i10 < aVar.f27576M0) {
                    e eVar2 = aVar.f27575L0[i10];
                    if (y12 || eVar2.X() != 8) {
                        f fVar = eVar2.f27448e.f27834h;
                        fVar.f27794k.add(this.f27834h);
                        this.f27834h.f27795l.add(fVar);
                    }
                    i10++;
                }
                q(this.f27828b.f27448e.f27834h);
                q(this.f27828b.f27448e.f27835i);
            } else if (z12 == 1) {
                this.f27834h.f27788e = f.a.RIGHT;
                while (i10 < aVar.f27576M0) {
                    e eVar3 = aVar.f27575L0[i10];
                    if (y12 || eVar3.X() != 8) {
                        f fVar2 = eVar3.f27448e.f27835i;
                        fVar2.f27794k.add(this.f27834h);
                        this.f27834h.f27795l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f27828b.f27448e.f27834h);
                q(this.f27828b.f27448e.f27835i);
            } else if (z12 == 2) {
                this.f27834h.f27788e = f.a.TOP;
                while (i10 < aVar.f27576M0) {
                    e eVar4 = aVar.f27575L0[i10];
                    if (y12 || eVar4.X() != 8) {
                        f fVar3 = eVar4.f27450f.f27834h;
                        fVar3.f27794k.add(this.f27834h);
                        this.f27834h.f27795l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f27828b.f27450f.f27834h);
                q(this.f27828b.f27450f.f27835i);
            } else if (z12 == 3) {
                this.f27834h.f27788e = f.a.BOTTOM;
                while (i10 < aVar.f27576M0) {
                    e eVar5 = aVar.f27575L0[i10];
                    if (y12 || eVar5.X() != 8) {
                        f fVar4 = eVar5.f27450f.f27835i;
                        fVar4.f27794k.add(this.f27834h);
                        this.f27834h.f27795l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f27828b.f27450f.f27834h);
                q(this.f27828b.f27450f.f27835i);
            }
        }
    }

    public void e() {
        e eVar = this.f27828b;
        if (eVar instanceof C5756a) {
            int z12 = ((C5756a) eVar).z1();
            if (z12 == 0 || z12 == 1) {
                this.f27828b.q1(this.f27834h.f27790g);
            } else {
                this.f27828b.r1(this.f27834h.f27790g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27829c = null;
        this.f27834h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
