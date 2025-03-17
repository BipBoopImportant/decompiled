package G6;

import C6.a;
import C6.b;
import C6.k;
import H6.c;
import w6.C8927i;

/* renamed from: G6.b  reason: case insensitive filesystem */
public class C6507b {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36179a = c.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36180b = c.a.a("fc", "sc", "sw", "t");

    public static k a(c cVar, C8927i iVar) {
        cVar.e();
        k kVar = null;
        while (cVar.hasNext()) {
            if (cVar.n(f36179a) != 0) {
                cVar.o();
                cVar.a0();
            } else {
                kVar = b(cVar, iVar);
            }
        }
        cVar.g();
        return kVar == null ? new k((a) null, (a) null, (b) null, (b) null) : kVar;
    }

    private static k b(c cVar, C8927i iVar) {
        cVar.e();
        a aVar = null;
        a aVar2 = null;
        b bVar = null;
        b bVar2 = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36180b);
            if (n10 == 0) {
                aVar = C6509d.c(cVar, iVar);
            } else if (n10 == 1) {
                aVar2 = C6509d.c(cVar, iVar);
            } else if (n10 == 2) {
                bVar = C6509d.e(cVar, iVar);
            } else if (n10 != 3) {
                cVar.o();
                cVar.a0();
            } else {
                bVar2 = C6509d.e(cVar, iVar);
            }
        }
        cVar.g();
        return new k(aVar, aVar2, bVar, bVar2);
    }
}
