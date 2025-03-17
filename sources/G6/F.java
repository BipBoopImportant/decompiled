package G6;

import C6.b;
import D6.n;
import H6.c;
import w6.C8927i;

public class F {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36168a = c.a.a("nm", "r", "hd");

    static n a(c cVar, C8927i iVar) {
        boolean z10 = false;
        String str = null;
        b bVar = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36168a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                bVar = C6509d.f(cVar, iVar, true);
            } else if (n10 != 2) {
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        if (z10) {
            return null;
        }
        return new n(str, bVar);
    }
}
