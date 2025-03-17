package G6;

import C6.b;
import C6.l;
import D6.m;
import H6.c;
import w6.C8927i;

class E {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36167a = c.a.a("nm", "c", "o", "tr", "hd");

    static m a(c cVar, C8927i iVar) {
        String str = null;
        b bVar = null;
        b bVar2 = null;
        l lVar = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36167a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                bVar = C6509d.f(cVar, iVar, false);
            } else if (n10 == 2) {
                bVar2 = C6509d.f(cVar, iVar, false);
            } else if (n10 == 3) {
                lVar = C6508c.g(cVar, iVar);
            } else if (n10 != 4) {
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        return new m(str, bVar, bVar2, lVar, z10);
    }
}
