package G6;

import C6.b;
import C6.e;
import C6.i;
import C6.m;
import H6.c;
import I6.j;
import J6.a;
import android.graphics.PointF;
import java.util.ArrayList;
import w6.C8927i;

/* renamed from: G6.a  reason: case insensitive filesystem */
public class C6506a {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36178a = c.a.a("k", "x", "y");

    public static e a(c cVar, C8927i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.i() == c.b.BEGIN_ARRAY) {
            cVar.d();
            while (cVar.hasNext()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.f();
            u.b(arrayList);
        } else {
            arrayList.add(new a(s.e(cVar, j.e())));
        }
        return new e(arrayList);
    }

    static m<PointF, PointF> b(c cVar, C8927i iVar) {
        cVar.e();
        e eVar = null;
        b bVar = null;
        boolean z10 = false;
        b bVar2 = null;
        while (cVar.i() != c.b.END_OBJECT) {
            int n10 = cVar.n(f36178a);
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        cVar.o();
                        cVar.a0();
                    } else if (cVar.i() == c.b.STRING) {
                        cVar.a0();
                    } else {
                        bVar = C6509d.e(cVar, iVar);
                    }
                } else if (cVar.i() == c.b.STRING) {
                    cVar.a0();
                } else {
                    bVar2 = C6509d.e(cVar, iVar);
                }
                z10 = true;
            } else {
                eVar = a(cVar, iVar);
            }
        }
        cVar.g();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new i(bVar2, bVar);
    }
}
