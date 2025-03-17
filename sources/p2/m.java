package p2;

import h2.C5413c;
import java.util.ArrayList;

public class m extends e {

    /* renamed from: L0  reason: collision with root package name */
    public ArrayList<e> f27591L0 = new ArrayList<>();

    public m() {
    }

    public void a(e eVar) {
        this.f27591L0.add(eVar);
        if (eVar.L() != null) {
            ((m) eVar.L()).y1(eVar);
        }
        eVar.g1(this);
    }

    public void v0() {
        this.f27591L0.clear();
        super.v0();
    }

    public void v1(e... eVarArr) {
        for (e a10 : eVarArr) {
            a(a10);
        }
    }

    public ArrayList<e> w1() {
        return this.f27591L0;
    }

    public void x1() {
        ArrayList<e> arrayList = this.f27591L0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f27591L0.get(i10);
                if (eVar instanceof m) {
                    ((m) eVar).x1();
                }
            }
        }
    }

    public void y0(C5413c cVar) {
        super.y0(cVar);
        int size = this.f27591L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27591L0.get(i10).y0(cVar);
        }
    }

    public void y1(e eVar) {
        this.f27591L0.remove(eVar);
        eVar.v0();
    }

    public void z1() {
        this.f27591L0.clear();
    }

    public m(int i10, int i11) {
        super(i10, i11);
    }
}
