package G6;

import D6.q;
import H6.c;
import java.util.ArrayList;
import w6.C8927i;

class J {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36173a = c.a.a("nm", "hd", "it");

    static q a(c cVar, C8927i iVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36173a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                z10 = cVar.w1();
            } else if (n10 != 2) {
                cVar.a0();
            } else {
                cVar.d();
                while (cVar.hasNext()) {
                    D6.c a10 = C6513h.a(cVar, iVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.f();
            }
        }
        return new q(str, arrayList, z10);
    }
}
