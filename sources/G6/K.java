package G6;

import C6.h;
import D6.r;
import H6.c;
import w6.C8927i;

class K {

    /* renamed from: a  reason: collision with root package name */
    static c.a f36174a = c.a.a("nm", "ind", "ks", "hd");

    static r a(c cVar, C8927i iVar) {
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        h hVar = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36174a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                i10 = cVar.G0();
            } else if (n10 == 2) {
                hVar = C6509d.k(cVar, iVar);
            } else if (n10 != 3) {
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        return new r(str, i10, hVar, z10);
    }
}
