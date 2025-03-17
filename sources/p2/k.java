package p2;

import h2.C5414d;
import p2.e;

public class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f27577a = new boolean[3];

    static void a(f fVar, C5414d dVar, e eVar) {
        eVar.f27478t = -1;
        eVar.f27480u = -1;
        e.b bVar = fVar.f27439Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f27439Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f27428O.f27400g;
            int Y10 = fVar.Y() - eVar.f27430Q.f27400g;
            d dVar2 = eVar.f27428O;
            dVar2.f27402i = dVar.q(dVar2);
            d dVar3 = eVar.f27430Q;
            dVar3.f27402i = dVar.q(dVar3);
            dVar.f(eVar.f27428O.f27402i, i10);
            dVar.f(eVar.f27430Q.f27402i, Y10);
            eVar.f27478t = 2;
            eVar.S0(i10, Y10);
        }
        if (fVar.f27439Z[1] != bVar2 && eVar.f27439Z[1] == e.b.MATCH_PARENT) {
            int i11 = eVar.f27429P.f27400g;
            int x10 = fVar.x() - eVar.f27431R.f27400g;
            d dVar4 = eVar.f27429P;
            dVar4.f27402i = dVar.q(dVar4);
            d dVar5 = eVar.f27431R;
            dVar5.f27402i = dVar.q(dVar5);
            dVar.f(eVar.f27429P.f27402i, i11);
            dVar.f(eVar.f27431R.f27402i, x10);
            if (eVar.f27463l0 > 0 || eVar.X() == 8) {
                d dVar6 = eVar.f27432S;
                dVar6.f27402i = dVar.q(dVar6);
                dVar.f(eVar.f27432S.f27402i, eVar.f27463l0 + i11);
            }
            eVar.f27480u = 2;
            eVar.j1(i11, x10);
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
