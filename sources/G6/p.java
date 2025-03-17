package G6;

import C6.b;
import C6.d;
import C6.f;
import D6.e;
import D6.g;
import H6.c;
import J6.a;
import android.graphics.Path;
import java.util.Collections;
import w6.C8927i;

class p {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36207a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36208b = c.a.a("p", "k");

    static e a(c cVar, C8927i iVar) {
        d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        g gVar = null;
        C6.c cVar2 = null;
        f fVar = null;
        f fVar2 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            switch (cVar.n(f36207a)) {
                case 0:
                    str = cVar.C1();
                    break;
                case 1:
                    cVar.e();
                    int i10 = -1;
                    while (cVar.hasNext()) {
                        int n10 = cVar.n(f36208b);
                        if (n10 == 0) {
                            i10 = cVar.G0();
                        } else if (n10 != 1) {
                            cVar.o();
                            cVar.a0();
                        } else {
                            cVar2 = C6509d.g(cVar, iVar, i10);
                        }
                    }
                    cVar.g();
                    break;
                case 2:
                    dVar = C6509d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.G0() == 1 ? g.LINEAR : g.RADIAL;
                    break;
                case 4:
                    fVar = C6509d.i(cVar, iVar);
                    break;
                case 5:
                    fVar2 = C6509d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.G0() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.w1();
                    break;
                default:
                    cVar.o();
                    cVar.a0();
                    break;
            }
        }
        return new e(str, gVar, fillType, cVar2, dVar == null ? new d(Collections.singletonList(new a(100))) : dVar, fVar, fVar2, (b) null, (b) null, z10);
    }
}
