package G6;

import C6.b;
import D6.t;
import H6.c;
import com.sugarcube.core.logger.DslKt;
import w6.C8927i;

class M {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36177a = c.a.a("s", "e", "o", "nm", DslKt.INDICATOR_MAIN, "hd");

    static t a(c cVar, C8927i iVar) {
        String str = null;
        t.a aVar = null;
        b bVar = null;
        b bVar2 = null;
        b bVar3 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36177a);
            if (n10 == 0) {
                bVar = C6509d.f(cVar, iVar, false);
            } else if (n10 == 1) {
                bVar2 = C6509d.f(cVar, iVar, false);
            } else if (n10 == 2) {
                bVar3 = C6509d.f(cVar, iVar, false);
            } else if (n10 == 3) {
                str = cVar.C1();
            } else if (n10 == 4) {
                aVar = t.a.b(cVar.G0());
            } else if (n10 != 5) {
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        return new t(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
