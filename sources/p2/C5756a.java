package p2;

import h2.C5414d;
import h2.C5419i;
import p2.d;
import p2.e;

/* renamed from: p2.a  reason: case insensitive filesystem */
public class C5756a extends j {

    /* renamed from: N0  reason: collision with root package name */
    private int f27368N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    private boolean f27369O0 = true;

    /* renamed from: P0  reason: collision with root package name */
    private int f27370P0 = 0;

    /* renamed from: Q0  reason: collision with root package name */
    boolean f27371Q0 = false;

    public int A1() {
        return this.f27370P0;
    }

    public int B1() {
        int i10 = this.f27368N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void C1() {
        for (int i10 = 0; i10 < this.f27576M0; i10++) {
            e eVar = this.f27575L0[i10];
            if (this.f27369O0 || eVar.h()) {
                int i11 = this.f27368N0;
                if (i11 == 0 || i11 == 1) {
                    eVar.W0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.W0(1, true);
                }
            }
        }
    }

    public void D1(boolean z10) {
        this.f27369O0 = z10;
    }

    public void E1(int i10) {
        this.f27368N0 = i10;
    }

    public void F1(int i10) {
        this.f27370P0 = i10;
    }

    public void g(C5414d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f27436W;
        dVarArr2[0] = this.f27428O;
        dVarArr2[2] = this.f27429P;
        dVarArr2[1] = this.f27430Q;
        dVarArr2[3] = this.f27431R;
        int i13 = 0;
        while (true) {
            dVarArr = this.f27436W;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f27402i = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f27368N0;
        if (i14 >= 0 && i14 < 4) {
            d dVar3 = dVarArr[i14];
            if (!this.f27371Q0) {
                x1();
            }
            if (this.f27371Q0) {
                this.f27371Q0 = false;
                int i15 = this.f27368N0;
                if (i15 == 0 || i15 == 1) {
                    dVar.f(this.f27428O.f27402i, this.f27451f0);
                    dVar.f(this.f27430Q.f27402i, this.f27451f0);
                } else if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f27429P.f27402i, this.f27453g0);
                    dVar.f(this.f27431R.f27402i, this.f27453g0);
                }
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= this.f27576M0) {
                        z11 = false;
                        break;
                    }
                    e eVar = this.f27575L0[i16];
                    if ((this.f27369O0 || eVar.h()) && ((((i11 = this.f27368N0) == 0 || i11 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f27428O.f27399f != null && eVar.f27430Q.f27399f != null) || (((i12 = this.f27368N0) == 2 || i12 == 3) && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.f27429P.f27399f != null && eVar.f27431R.f27399f != null))) {
                        z11 = true;
                    } else {
                        i16++;
                    }
                }
                z11 = true;
                boolean z12 = this.f27428O.l() || this.f27430Q.l();
                boolean z13 = this.f27429P.l() || this.f27431R.l();
                int i17 = !(!z11 && (((i10 = this.f27368N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
                for (int i18 = 0; i18 < this.f27576M0; i18++) {
                    e eVar2 = this.f27575L0[i18];
                    if (this.f27369O0 || eVar2.h()) {
                        C5419i q10 = dVar.q(eVar2.f27436W[this.f27368N0]);
                        d[] dVarArr3 = eVar2.f27436W;
                        int i19 = this.f27368N0;
                        d dVar4 = dVarArr3[i19];
                        dVar4.f27402i = q10;
                        d dVar5 = dVar4.f27399f;
                        int i20 = (dVar5 == null || dVar5.f27397d != this) ? 0 : dVar4.f27400g;
                        if (i19 == 0 || i19 == 2) {
                            dVar.i(dVar3.f27402i, q10, this.f27370P0 - i20, z11);
                        } else {
                            dVar.g(dVar3.f27402i, q10, this.f27370P0 + i20, z11);
                        }
                        dVar.e(dVar3.f27402i, q10, this.f27370P0 + i20, i17);
                    }
                }
                int i21 = this.f27368N0;
                if (i21 == 0) {
                    dVar.e(this.f27430Q.f27402i, this.f27428O.f27402i, 0, 8);
                    dVar.e(this.f27428O.f27402i, this.f27441a0.f27430Q.f27402i, 0, 4);
                    dVar.e(this.f27428O.f27402i, this.f27441a0.f27428O.f27402i, 0, 0);
                } else if (i21 == 1) {
                    dVar.e(this.f27428O.f27402i, this.f27430Q.f27402i, 0, 8);
                    dVar.e(this.f27428O.f27402i, this.f27441a0.f27428O.f27402i, 0, 4);
                    dVar.e(this.f27428O.f27402i, this.f27441a0.f27430Q.f27402i, 0, 0);
                } else if (i21 == 2) {
                    dVar.e(this.f27431R.f27402i, this.f27429P.f27402i, 0, 8);
                    dVar.e(this.f27429P.f27402i, this.f27441a0.f27431R.f27402i, 0, 4);
                    dVar.e(this.f27429P.f27402i, this.f27441a0.f27429P.f27402i, 0, 0);
                } else if (i21 == 3) {
                    dVar.e(this.f27429P.f27402i, this.f27431R.f27402i, 0, 8);
                    dVar.e(this.f27429P.f27402i, this.f27441a0.f27429P.f27402i, 0, 4);
                    dVar.e(this.f27429P.f27402i, this.f27441a0.f27431R.f27402i, 0, 0);
                }
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean p0() {
        return this.f27371Q0;
    }

    public boolean q0() {
        return this.f27371Q0;
    }

    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.f27576M0; i10++) {
            e eVar = this.f27575L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean x1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f27576M0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f27575L0[i13];
            if ((this.f27369O0 || eVar.h()) && ((((i11 = this.f27368N0) == 0 || i11 == 1) && !eVar.p0()) || (((i12 = this.f27368N0) == 2 || i12 == 3) && !eVar.q0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f27576M0; i15++) {
            e eVar2 = this.f27575L0[i15];
            if (this.f27369O0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f27368N0;
                    if (i16 == 0) {
                        i14 = eVar2.o(d.a.LEFT).e();
                    } else if (i16 == 1) {
                        i14 = eVar2.o(d.a.RIGHT).e();
                    } else if (i16 == 2) {
                        i14 = eVar2.o(d.a.TOP).e();
                    } else if (i16 == 3) {
                        i14 = eVar2.o(d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i17 = this.f27368N0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.o(d.a.LEFT).e());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.o(d.a.RIGHT).e());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.o(d.a.TOP).e());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.o(d.a.BOTTOM).e());
                }
            }
        }
        int i18 = i14 + this.f27370P0;
        int i19 = this.f27368N0;
        if (i19 == 0 || i19 == 1) {
            J0(i18, i18);
        } else {
            M0(i18, i18);
        }
        this.f27371Q0 = true;
        return true;
    }

    public boolean y1() {
        return this.f27369O0;
    }

    public int z1() {
        return this.f27368N0;
    }
}
