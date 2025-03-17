package uJ;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import uJ.x0;
import yJ.C18735d;
import yJ.C18740i;
import yJ.C18741j;
import yJ.n;
import yJ.p;

/* renamed from: uJ.c  reason: case insensitive filesystem */
public final class C18106c {

    /* renamed from: a  reason: collision with root package name */
    public static final C18106c f147870a = new C18106c();

    private C18106c() {
    }

    private final boolean c(x0 x0Var, C18741j jVar, n nVar) {
        p j10 = x0Var.j();
        if (j10.n(jVar)) {
            return true;
        }
        if (j10.d0(jVar)) {
            return false;
        }
        if (!x0Var.n() || !j10.J0(jVar)) {
            return j10.y(j10.a(jVar), nVar);
        }
        return true;
    }

    private final boolean e(x0 x0Var, C18741j jVar, C18741j jVar2) {
        p j10 = x0Var.j();
        if (C18116h.f147890b) {
            if (!j10.c(jVar) && !j10.V(j10.a(jVar))) {
                boolean l10 = x0Var.l(jVar);
            }
            if (!j10.c(jVar2)) {
                boolean l11 = x0Var.l(jVar2);
            }
        }
        if (j10.d0(jVar2) || j10.Z(jVar) || j10.m(jVar)) {
            return true;
        }
        if ((jVar instanceof C18735d) && j10.i0((C18735d) jVar)) {
            return true;
        }
        C18106c cVar = f147870a;
        if (cVar.a(x0Var, jVar, x0.c.b.f147949a)) {
            return true;
        }
        if (!j10.Z(jVar2) && !cVar.a(x0Var, jVar2, x0.c.d.f147951a) && !j10.x0(jVar)) {
            return cVar.b(x0Var, jVar, j10.a(jVar2));
        }
        return false;
    }

    public final boolean a(x0 x0Var, C18741j jVar, x0.c cVar) {
        C17542s.j(x0Var, "<this>");
        C17542s.j(jVar, "type");
        C17542s.j(cVar, "supertypesPolicy");
        p j10 = x0Var.j();
        if ((j10.x0(jVar) && !j10.d0(jVar)) || j10.Z(jVar)) {
            return true;
        }
        x0Var.k();
        ArrayDeque<C18741j> h10 = x0Var.h();
        C17542s.g(h10);
        Set<C18741j> i10 = x0Var.i();
        C17542s.g(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            C18741j pop = h10.pop();
            C17542s.g(pop);
            if (i10.add(pop)) {
                x0.c cVar2 = j10.d0(pop) ? x0.c.C4285c.f147950a : cVar;
                if (C17542s.e(cVar2, x0.c.C4285c.f147950a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    p j11 = x0Var.j();
                    for (C18740i a10 : j11.c0(j11.a(pop))) {
                        C18741j a11 = cVar2.a(x0Var, a10);
                        if ((!j10.x0(a11) || j10.d0(a11)) && !j10.Z(a11)) {
                            h10.add(a11);
                        } else {
                            x0Var.e();
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        x0Var.e();
        return false;
    }

    public final boolean b(x0 x0Var, C18741j jVar, n nVar) {
        C17542s.j(x0Var, "state");
        C17542s.j(jVar, "start");
        C17542s.j(nVar, "end");
        p j10 = x0Var.j();
        if (f147870a.c(x0Var, jVar, nVar)) {
            return true;
        }
        x0Var.k();
        ArrayDeque<C18741j> h10 = x0Var.h();
        C17542s.g(h10);
        Set<C18741j> i10 = x0Var.i();
        C17542s.g(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            C18741j pop = h10.pop();
            C17542s.g(pop);
            if (i10.add(pop)) {
                x0.c cVar = j10.d0(pop) ? x0.c.C4285c.f147950a : x0.c.b.f147949a;
                if (C17542s.e(cVar, x0.c.C4285c.f147950a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    p j11 = x0Var.j();
                    for (C18740i a10 : j11.c0(j11.a(pop))) {
                        C18741j a11 = cVar.a(x0Var, a10);
                        if (f147870a.c(x0Var, a11, nVar)) {
                            x0Var.e();
                            return true;
                        }
                        h10.add(a11);
                    }
                    continue;
                }
            }
        }
        x0Var.e();
        return false;
    }

    public final boolean d(x0 x0Var, C18741j jVar, C18741j jVar2) {
        C17542s.j(x0Var, "state");
        C17542s.j(jVar, "subType");
        C17542s.j(jVar2, "superType");
        return e(x0Var, jVar, jVar2);
    }
}
