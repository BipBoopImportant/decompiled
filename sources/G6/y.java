package G6;

import D6.j;
import H6.c;

class y {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36228a = c.a.a("nm", "mm", "hd");

    static j a(c cVar) {
        String str = null;
        boolean z10 = false;
        j.a aVar = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36228a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                aVar = j.a.b(cVar.G0());
            } else if (n10 != 2) {
                cVar.o();
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        return new j(str, aVar, z10);
    }
}
