package G6;

import C6.b;
import C6.e;
import C6.g;
import C6.i;
import C6.l;
import C6.m;
import H6.c;
import J6.a;
import J6.d;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import w6.C8927i;

/* renamed from: G6.c  reason: case insensitive filesystem */
public class C6508c {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36181a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36182b = c.a.a("k");

    private static boolean a(e eVar) {
        return eVar == null || (eVar.g() && ((PointF) eVar.i().get(0).f37351b).equals(0.0f, 0.0f));
    }

    private static boolean b(m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof i) && mVar.g() && ((PointF) mVar.i().get(0).f37351b).equals(0.0f, 0.0f));
    }

    private static boolean c(b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f37351b).floatValue() == 0.0f);
    }

    private static boolean d(g gVar) {
        return gVar == null || (gVar.g() && ((d) ((a) gVar.i().get(0)).f37351b).a(1.0f, 1.0f));
    }

    private static boolean e(b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f37351b).floatValue() == 0.0f);
    }

    private static boolean f(b bVar) {
        return bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f37351b).floatValue() == 0.0f);
    }

    public static l g(c cVar, C8927i iVar) {
        boolean z10;
        c cVar2 = cVar;
        C8927i iVar2 = iVar;
        boolean z11 = false;
        boolean z12 = cVar.i() == c.b.BEGIN_OBJECT;
        if (z12) {
            cVar.e();
        }
        b bVar = null;
        e eVar = null;
        m<PointF, PointF> mVar = null;
        g gVar = null;
        b bVar2 = null;
        b bVar3 = null;
        C6.d dVar = null;
        b bVar4 = null;
        b bVar5 = null;
        while (cVar.hasNext()) {
            switch (cVar2.n(f36181a)) {
                case 0:
                    boolean z13 = z11;
                    cVar.e();
                    while (cVar.hasNext()) {
                        if (cVar2.n(f36182b) != 0) {
                            cVar.o();
                            cVar.a0();
                        } else {
                            eVar = C6506a.a(cVar, iVar);
                        }
                    }
                    cVar.g();
                    z11 = z13;
                    continue;
                case 1:
                    boolean z14 = z11;
                    mVar = C6506a.b(cVar, iVar);
                    continue;
                case 2:
                    boolean z15 = z11;
                    gVar = C6509d.j(cVar, iVar);
                    continue;
                case 3:
                    iVar2.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C6509d.h(cVar, iVar);
                    continue;
                case 6:
                    bVar4 = C6509d.f(cVar2, iVar2, z11);
                    continue;
                case 7:
                    bVar5 = C6509d.f(cVar2, iVar2, z11);
                    continue;
                case 8:
                    bVar2 = C6509d.f(cVar2, iVar2, z11);
                    continue;
                case 9:
                    bVar3 = C6509d.f(cVar2, iVar2, z11);
                    continue;
                default:
                    cVar.o();
                    cVar.a0();
                    continue;
            }
            b f10 = C6509d.f(cVar2, iVar2, z11);
            if (f10.i().isEmpty()) {
                a aVar = r1;
                a aVar2 = new a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f()));
                f10.i().add(aVar);
            } else if (((a) f10.i().get(0)).f37351b == null) {
                z10 = false;
                f10.i().set(0, new a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f())));
                z11 = z10;
                bVar = f10;
            }
            z10 = false;
            z11 = z10;
            bVar = f10;
        }
        if (z12) {
            cVar.g();
        }
        e eVar2 = a(eVar) ? null : eVar;
        m<PointF, PointF> mVar2 = b(mVar) ? null : mVar;
        b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new l(eVar2, mVar2, gVar, bVar6, dVar, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
