package G6;

import D6.a;
import H6.c;
import w6.C8927i;

/* renamed from: G6.e  reason: case insensitive filesystem */
class C6510e {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36183a = c.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36184b = c.a.a("ty", "v");

    private static a a(c cVar, C8927i iVar) {
        cVar.e();
        a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (cVar.hasNext()) {
                    int n10 = cVar.n(f36184b);
                    if (n10 != 0) {
                        if (n10 != 1) {
                            cVar.o();
                            cVar.a0();
                        } else if (z10) {
                            aVar = new a(C6509d.e(cVar, iVar));
                        } else {
                            cVar.a0();
                        }
                    } else if (cVar.G0() == 0) {
                        z10 = true;
                    }
                } else {
                    cVar.g();
                    return aVar;
                }
            }
        }
    }

    static a b(c cVar, C8927i iVar) {
        a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.n(f36183a) != 0) {
                cVar.o();
                cVar.a0();
            } else {
                cVar.d();
                while (cVar.hasNext()) {
                    a a10 = a(cVar, iVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.f();
            }
        }
        return aVar;
    }
}
