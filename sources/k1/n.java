package K1;

import D1.a;
import E1.C4488v;
import E1.C4489w;
import G1.C4498c0;
import L1.j;
import L1.k;
import L1.m;
import L1.p;
import L1.s;
import W0.b;
import XH.C16807N;
import XH.C16820k;
import androidx.compose.ui.platform.C5107h1;
import c2.q;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LL1/p;", "fromNode", "", "depth", "Lkotlin/Function1;", "LK1/m;", "LXH/N;", "onCandidate", "d", "(LL1/p;ILnI/l;)V", "", "b", "(LL1/p;)Ljava/util/List;", "Lkotlin/Function2;", "Lo1/g;", "LdI/e;", "", "c", "(LL1/p;)LnI/p;", "scrollCaptureScrollByAction", "", "a", "(LL1/p;)Z", "canScrollVertically", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {
    private static final boolean a(p pVar) {
        nI.p<C5667g, C17164e<? super C5667g>, Object> c10 = c(pVar);
        j jVar = (j) m.a(pVar.w(), s.f9010a.I());
        return (c10 == null || jVar == null || jVar.a().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<p> b(p pVar) {
        return pVar.l(false, false, false);
    }

    public static final nI.p<C5667g, C17164e<? super C5667g>, Object> c(p pVar) {
        return (nI.p) m.a(pVar.w(), k.f8953a.u());
    }

    private static final void d(p pVar, int i10, C17642l<? super m, C16807N> lVar) {
        b bVar = new b(new p[16], 0);
        List<p> b10 = b(pVar);
        while (true) {
            bVar.h(bVar.r(), b10);
            while (bVar.v()) {
                p pVar2 = (p) bVar.B(bVar.r() - 1);
                if (C5107h1.g(pVar2) && !pVar2.w().k(s.f9010a.f())) {
                    C4498c0 e10 = pVar2.e();
                    if (e10 != null) {
                        C4488v o12 = e10.o1();
                        c2.p b11 = q.b(C4489w.c(o12));
                        if (b11.q()) {
                            continue;
                        } else if (!a(pVar2)) {
                            b10 = b(pVar2);
                        } else {
                            int i11 = i10 + 1;
                            lVar.invoke(new m(pVar2, i11, b11, o12));
                            d(pVar2, i11, lVar);
                        }
                    } else {
                        a.c("Expected semantics node to have a coordinator.");
                        throw new C16820k();
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(p pVar, int i10, C17642l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(pVar, i10, lVar);
    }
}
