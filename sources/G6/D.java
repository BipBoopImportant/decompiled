package G6;

import C6.b;
import C6.f;
import C6.m;
import D6.l;
import H6.c;
import android.graphics.PointF;
import w6.C8927i;

class D {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36166a = c.a.a("nm", "p", "s", "r", "hd");

    static l a(c cVar, C8927i iVar) {
        String str = null;
        m<PointF, PointF> mVar = null;
        f fVar = null;
        b bVar = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36166a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                mVar = C6506a.b(cVar, iVar);
            } else if (n10 == 2) {
                fVar = C6509d.i(cVar, iVar);
            } else if (n10 == 3) {
                bVar = C6509d.e(cVar, iVar);
            } else if (n10 != 4) {
                cVar.a0();
            } else {
                z10 = cVar.w1();
            }
        }
        return new l(str, mVar, fVar, bVar, z10);
    }
}
