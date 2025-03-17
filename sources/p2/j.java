package p2;

import java.util.ArrayList;
import java.util.Arrays;
import q2.i;
import q2.o;

public class j extends e implements i {

    /* renamed from: L0  reason: collision with root package name */
    public e[] f27575L0 = new e[4];

    /* renamed from: M0  reason: collision with root package name */
    public int f27576M0 = 0;

    public void a(e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.f27576M0 + 1;
            e[] eVarArr = this.f27575L0;
            if (i10 > eVarArr.length) {
                this.f27575L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f27575L0;
            int i11 = this.f27576M0;
            eVarArr2[i11] = eVar;
            this.f27576M0 = i11 + 1;
        }
    }

    public void b(f fVar) {
    }

    public void c() {
        this.f27576M0 = 0;
        Arrays.fill(this.f27575L0, (Object) null);
    }

    public void v1(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f27576M0; i11++) {
            oVar.a(this.f27575L0[i11]);
        }
        for (int i12 = 0; i12 < this.f27576M0; i12++) {
            i.a(this.f27575L0[i12], i10, arrayList, oVar);
        }
    }

    public int w1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f27576M0; i13++) {
            e eVar = this.f27575L0[i13];
            if (i10 == 0 && (i12 = eVar.f27421I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f27423J0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}
