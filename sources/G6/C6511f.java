package G6;

import C6.f;
import C6.m;
import D6.b;
import H6.c;
import android.graphics.PointF;
import w6.C8927i;

/* renamed from: G6.f  reason: case insensitive filesystem */
class C6511f {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36185a = c.a.a("nm", "p", "s", "hd", "d");

    static b a(c cVar, C8927i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        m<PointF, PointF> mVar = null;
        f fVar = null;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36185a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                mVar = C6506a.b(cVar, iVar);
            } else if (n10 == 2) {
                fVar = C6509d.i(cVar, iVar);
            } else if (n10 == 3) {
                z11 = cVar.w1();
            } else if (n10 != 4) {
                cVar.o();
                cVar.a0();
            } else {
                z10 = cVar.G0() == 3;
            }
        }
        return new b(str, mVar, fVar, z10, z11);
    }
}
