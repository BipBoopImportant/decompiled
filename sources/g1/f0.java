package G1;

import A1.I;
import D1.a;
import E1.B;
import E1.C4472e;
import E1.T;
import E1.U;
import E1.V;
import E1.X;
import F1.j;
import L1.n;
import W0.b;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.recyclerview.widget.RecyclerView;
import i1.C5436b;
import j0.K;
import j0.S;
import kotlin.Metadata;
import m1.h;
import n1.C5622b;
import n1.C5623c;
import n1.C5624d;
import n1.C5628h;
import n1.C5630j;
import n1.C5631k;
import n1.C5639s;
import y1.C6257e;
import y1.C6259g;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/d$b;", "element", "", "f", "(Landroidx/compose/ui/d$b;)I", "Landroidx/compose/ui/d$c;", "node", "g", "(Landroidx/compose/ui/d$c;)I", "LXH/N;", "d", "(Landroidx/compose/ui/d$c;)V", "a", "e", "remainingSet", "phase", "b", "(Landroidx/compose/ui/d$c;II)V", "selfKindSet", "c", "Ln1/j;", "j", "(Ln1/j;)V", "", "k", "(Ln1/j;)Z", "h", "Lj0/K;", "", "Lj0/K;", "classToKindSetMap", "LG1/e0;", "i", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final K<Object> f6514a = S.b();

    public static final void a(d.c cVar) {
        if (!cVar.j2()) {
            a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(d.c cVar, int i10, int i11) {
        if (cVar instanceof C4510m) {
            C4510m mVar = (C4510m) cVar;
            c(cVar, mVar.E2() & i10, i11);
            int i12 = (~mVar.E2()) & i10;
            for (d.c D22 = mVar.D2(); D22 != null; D22 = D22.a2()) {
                b(D22, i12, i11);
            }
            return;
        }
        c(cVar, i10 & cVar.e2(), i11);
    }

    private static final void c(d.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.h2()) {
            if ((C4502e0.a(2) & i10) != 0 && (cVar instanceof B)) {
                E.b((B) cVar);
                if (i11 == 2) {
                    C4508k.h(cVar, C4502e0.a(2)).d3();
                }
            }
            if (!((C4502e0.a(128) & i10) == 0 || !(cVar instanceof A) || i11 == 2)) {
                C4508k.m(cVar).G0();
            }
            if (!((C4502e0.a(256) & i10) == 0 || !(cVar instanceof C4516t) || i11 == 2)) {
                C4508k.m(cVar).H0();
            }
            if ((C4502e0.a(4) & i10) != 0 && (cVar instanceof r)) {
                C4515s.a((r) cVar);
            }
            if ((C4502e0.a(8) & i10) != 0 && (cVar instanceof w0)) {
                x0.b((w0) cVar);
            }
            if ((C4502e0.a(64) & i10) != 0 && (cVar instanceof p0)) {
                q0.a((p0) cVar);
            }
            if (!((C4502e0.a(1024) & i10) == 0 || !(cVar instanceof FocusTargetNode) || i11 == 2)) {
                C5639s.c((FocusTargetNode) cVar);
            }
            if ((C4502e0.a(RecyclerView.n.FLAG_MOVED) & i10) != 0 && (cVar instanceof C5630j)) {
                C5630j jVar = (C5630j) cVar;
                if (k(jVar)) {
                    if (i11 == 2) {
                        j(jVar);
                    } else {
                        C5631k.a(jVar);
                    }
                }
            }
            if ((i10 & C4502e0.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT)) != 0 && (cVar instanceof C5623c)) {
                C5624d.b((C5623c) cVar);
            }
        }
    }

    public static final void d(d.c cVar) {
        if (!cVar.j2()) {
            a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(d.c cVar) {
        if (!cVar.j2()) {
            a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(d.b bVar) {
        int a10 = C4502e0.a(1);
        if (bVar instanceof B) {
            a10 |= C4502e0.a(2);
        }
        if (bVar instanceof h) {
            a10 |= C4502e0.a(4);
        }
        if (bVar instanceof n) {
            a10 |= C4502e0.a(8);
        }
        if (bVar instanceof I) {
            a10 |= C4502e0.a(16);
        }
        if ((bVar instanceof F1.d) || (bVar instanceof j)) {
            a10 |= C4502e0.a(32);
        }
        if (bVar instanceof C5622b) {
            a10 |= C4502e0.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (bVar instanceof C5628h) {
            a10 |= C4502e0.a(RecyclerView.n.FLAG_MOVED);
        }
        if (bVar instanceof T) {
            a10 |= C4502e0.a(256);
        }
        if (bVar instanceof X) {
            a10 |= C4502e0.a(64);
        }
        return ((bVar instanceof U) || (bVar instanceof V)) ? a10 | C4502e0.a(128) : a10;
    }

    public static final int g(d.c cVar) {
        if (cVar.e2() != 0) {
            return cVar.e2();
        }
        K<Object> k10 = f6514a;
        Object b10 = C5436b.b(cVar);
        int b11 = k10.b(b10);
        if (b11 >= 0) {
            return k10.f24553c[b11];
        }
        int a10 = C4502e0.a(1);
        if (cVar instanceof B) {
            a10 |= C4502e0.a(2);
        }
        if (cVar instanceof r) {
            a10 |= C4502e0.a(4);
        }
        if (cVar instanceof w0) {
            a10 |= C4502e0.a(8);
        }
        if (cVar instanceof s0) {
            a10 |= C4502e0.a(16);
        }
        if (cVar instanceof F1.h) {
            a10 |= C4502e0.a(32);
        }
        if (cVar instanceof p0) {
            a10 |= C4502e0.a(64);
        }
        if (cVar instanceof A) {
            a10 |= C4502e0.a(128);
        }
        if (cVar instanceof C4516t) {
            a10 |= C4502e0.a(256);
        }
        if (cVar instanceof C4472e) {
            a10 |= C4502e0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            a10 |= C4502e0.a(1024);
        }
        if (cVar instanceof C5630j) {
            a10 |= C4502e0.a(RecyclerView.n.FLAG_MOVED);
        }
        if (cVar instanceof C5623c) {
            a10 |= C4502e0.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (cVar instanceof C6257e) {
            a10 |= C4502e0.a(8192);
        }
        if (cVar instanceof C1.a) {
            a10 |= C4502e0.a(16384);
        }
        if (cVar instanceof C4505h) {
            a10 |= C4502e0.a(32768);
        }
        if (cVar instanceof C6259g) {
            a10 |= C4502e0.a(131072);
        }
        int a11 = cVar instanceof B0 ? C4502e0.a(262144) | a10 : a10;
        k10.s(b10, a11);
        return a11;
    }

    public static final int h(d.c cVar) {
        if (!(cVar instanceof C4510m)) {
            return g(cVar);
        }
        C4510m mVar = (C4510m) cVar;
        int E22 = mVar.E2();
        for (d.c D22 = mVar.D2(); D22 != null; D22 = D22.a2()) {
            E22 |= h(D22);
        }
        return E22;
    }

    public static final boolean i(int i10) {
        return (i10 & C4502e0.a(128)) != 0;
    }

    private static final void j(C5630j jVar) {
        int a10 = C4502e0.a(1024);
        if (jVar.E0().j2()) {
            b bVar = new b(new d.c[16], 0);
            d.c a22 = jVar.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar, jVar.E0());
            } else {
                bVar.b(a22);
            }
            while (bVar.v()) {
                d.c cVar = (d.c) bVar.B(bVar.r() - 1);
                if ((cVar.Z1() & a10) == 0) {
                    C4508k.c(bVar, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.e2() & a10) != 0) {
                            b bVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    C5639s.c((FocusTargetNode) cVar);
                                } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                    int i10 = 0;
                                    for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                        if ((D22.e2() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = D22;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new b(new d.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar2.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar2.b(D22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C4508k.g(bVar2);
                            }
                        } else {
                            cVar = cVar.a2();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean k(C5630j jVar) {
        C4501e eVar = C4501e.f6512a;
        eVar.c();
        jVar.m1(eVar);
        return eVar.a();
    }
}
