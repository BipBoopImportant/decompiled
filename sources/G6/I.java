package G6;

import C6.a;
import C6.d;
import D6.p;
import H6.c;
import android.graphics.Path;
import java.util.Collections;
import w6.C8927i;

class I {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36172a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static p a(c cVar, C8927i iVar) {
        d dVar = null;
        String str = null;
        a aVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36172a);
            if (n10 == 0) {
                str = cVar.C1();
            } else if (n10 == 1) {
                aVar = C6509d.c(cVar, iVar);
            } else if (n10 == 2) {
                dVar = C6509d.h(cVar, iVar);
            } else if (n10 == 3) {
                z10 = cVar.w1();
            } else if (n10 == 4) {
                i10 = cVar.G0();
            } else if (n10 != 5) {
                cVar.o();
                cVar.a0();
            } else {
                z11 = cVar.w1();
            }
        }
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new J6.a(100)));
        }
        return new p(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z11);
    }
}
