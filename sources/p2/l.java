package p2;

import java.util.HashSet;
import p2.e;
import q2.b;

public class l extends j {

    /* renamed from: N0  reason: collision with root package name */
    private int f27578N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    private int f27579O0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    private int f27580P0 = 0;

    /* renamed from: Q0  reason: collision with root package name */
    private int f27581Q0 = 0;

    /* renamed from: R0  reason: collision with root package name */
    private int f27582R0 = 0;

    /* renamed from: S0  reason: collision with root package name */
    private int f27583S0 = 0;

    /* renamed from: T0  reason: collision with root package name */
    private int f27584T0 = 0;

    /* renamed from: U0  reason: collision with root package name */
    private int f27585U0 = 0;

    /* renamed from: V0  reason: collision with root package name */
    private boolean f27586V0 = false;

    /* renamed from: W0  reason: collision with root package name */
    private int f27587W0 = 0;

    /* renamed from: X0  reason: collision with root package name */
    private int f27588X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    protected b.a f27589Y0 = new b.a();

    /* renamed from: Z0  reason: collision with root package name */
    b.C0446b f27590Z0 = null;

    public int A1() {
        return this.f27588X0;
    }

    public int B1() {
        return this.f27587W0;
    }

    public int C1() {
        return this.f27579O0;
    }

    public int D1() {
        return this.f27584T0;
    }

    public int E1() {
        return this.f27585U0;
    }

    public int F1() {
        return this.f27578N0;
    }

    public void G1(int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void H1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f27590Z0 == null && L() != null) {
            this.f27590Z0 = ((f) L()).O1();
        }
        b.a aVar = this.f27589Y0;
        aVar.f27763a = bVar;
        aVar.f27764b = bVar2;
        aVar.f27765c = i10;
        aVar.f27766d = i11;
        this.f27590Z0.a(eVar, aVar);
        eVar.o1(this.f27589Y0.f27767e);
        eVar.P0(this.f27589Y0.f27768f);
        eVar.O0(this.f27589Y0.f27770h);
        eVar.E0(this.f27589Y0.f27769g);
    }

    /* access modifiers changed from: protected */
    public boolean I1() {
        e eVar = this.f27441a0;
        b.C0446b O12 = eVar != null ? ((f) eVar).O1() : null;
        if (O12 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27576M0; i10++) {
            e eVar2 = this.f27575L0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u10 = eVar2.u(0);
                e.b u11 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar || eVar2.f27484w == 1 || u11 != bVar || eVar2.f27486x == 1) {
                    if (u10 == bVar) {
                        u10 = e.b.WRAP_CONTENT;
                    }
                    if (u11 == bVar) {
                        u11 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f27589Y0;
                    aVar.f27763a = u10;
                    aVar.f27764b = u11;
                    aVar.f27765c = eVar2.Y();
                    this.f27589Y0.f27766d = eVar2.x();
                    O12.a(eVar2, this.f27589Y0);
                    eVar2.o1(this.f27589Y0.f27767e);
                    eVar2.P0(this.f27589Y0.f27768f);
                    eVar2.E0(this.f27589Y0.f27769g);
                }
            }
        }
        return true;
    }

    public boolean J1() {
        return this.f27586V0;
    }

    /* access modifiers changed from: protected */
    public void K1(boolean z10) {
        this.f27586V0 = z10;
    }

    public void L1(int i10, int i11) {
        this.f27587W0 = i10;
        this.f27588X0 = i11;
    }

    public void M1(int i10) {
        this.f27580P0 = i10;
        this.f27578N0 = i10;
        this.f27581Q0 = i10;
        this.f27579O0 = i10;
        this.f27582R0 = i10;
        this.f27583S0 = i10;
    }

    public void N1(int i10) {
        this.f27579O0 = i10;
    }

    public void O1(int i10) {
        this.f27583S0 = i10;
    }

    public void P1(int i10) {
        this.f27580P0 = i10;
        this.f27584T0 = i10;
    }

    public void Q1(int i10) {
        this.f27581Q0 = i10;
        this.f27585U0 = i10;
    }

    public void R1(int i10) {
        this.f27582R0 = i10;
        this.f27584T0 = i10;
        this.f27585U0 = i10;
    }

    public void S1(int i10) {
        this.f27578N0 = i10;
    }

    public void b(f fVar) {
        y1();
    }

    public void x1(boolean z10) {
        int i10 = this.f27582R0;
        if (i10 <= 0 && this.f27583S0 <= 0) {
            return;
        }
        if (z10) {
            this.f27584T0 = this.f27583S0;
            this.f27585U0 = i10;
            return;
        }
        this.f27584T0 = i10;
        this.f27585U0 = this.f27583S0;
    }

    public void y1() {
        for (int i10 = 0; i10 < this.f27576M0; i10++) {
            e eVar = this.f27575L0[i10];
            if (eVar != null) {
                eVar.Y0(true);
            }
        }
    }

    public boolean z1(HashSet<e> hashSet) {
        for (int i10 = 0; i10 < this.f27576M0; i10++) {
            if (hashSet.contains(this.f27575L0[i10])) {
                return true;
            }
        }
        return false;
    }
}
