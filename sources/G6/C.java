package G6;

import C6.b;
import C6.m;
import D6.k;
import H6.c;
import android.graphics.PointF;
import w6.C8927i;

class C {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36165a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static k a(c cVar, C8927i iVar, int i10) {
        c cVar2 = cVar;
        C8927i iVar2 = iVar;
        boolean z10 = false;
        boolean z11 = i10 == 3;
        String str = null;
        k.a aVar = null;
        b bVar = null;
        m<PointF, PointF> mVar = null;
        b bVar2 = null;
        b bVar3 = null;
        b bVar4 = null;
        b bVar5 = null;
        b bVar6 = null;
        while (cVar.hasNext()) {
            switch (cVar2.n(f36165a)) {
                case 0:
                    str = cVar.C1();
                    break;
                case 1:
                    aVar = k.a.b(cVar.G0());
                    break;
                case 2:
                    bVar = C6509d.f(cVar2, iVar2, false);
                    break;
                case 3:
                    mVar = C6506a.b(cVar, iVar);
                    break;
                case 4:
                    bVar2 = C6509d.f(cVar2, iVar2, false);
                    break;
                case 5:
                    bVar4 = C6509d.e(cVar, iVar);
                    break;
                case 6:
                    bVar6 = C6509d.f(cVar2, iVar2, false);
                    break;
                case 7:
                    bVar3 = C6509d.e(cVar, iVar);
                    break;
                case 8:
                    bVar5 = C6509d.f(cVar2, iVar2, false);
                    break;
                case 9:
                    z10 = cVar.w1();
                    break;
                case 10:
                    if (cVar.G0() != 3) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                default:
                    cVar.o();
                    cVar.a0();
                    break;
            }
        }
        return new k(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10, z11);
    }
}
