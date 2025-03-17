package s1;

import kotlin.Metadata;
import o1.C5661a;
import o1.C5668h;
import o1.C5671k;
import o1.C5674n;
import p1.Q0;
import r1.f;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr1/f;", "Ls1/c;", "graphicsLayer", "LXH/N;", "a", "(Lr1/f;Ls1/c;)V", "Lp1/Q0;", "outline", "b", "(Ls1/c;Lp1/Q0;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.d  reason: case insensitive filesystem */
public final class C5906d {
    public static final void a(f fVar, C5905c cVar) {
        cVar.h(fVar.I1().e(), fVar.I1().h());
    }

    public static final void b(C5905c cVar, Q0 q02) {
        if (q02 instanceof Q0.b) {
            Q0.b bVar = (Q0.b) q02;
            cVar.R(C5668h.a(bVar.b().o(), bVar.b().r()), C5674n.a(bVar.b().t(), bVar.b().n()));
        } else if (q02 instanceof Q0.a) {
            cVar.O(((Q0.a) q02).b());
        } else if (q02 instanceof Q0.c) {
            Q0.c cVar2 = (Q0.c) q02;
            if (cVar2.c() != null) {
                cVar.O(cVar2.c());
                return;
            }
            C5671k b10 = cVar2.b();
            cVar.W(C5668h.a(b10.e(), b10.g()), C5674n.a(b10.j(), b10.d()), C5661a.d(b10.b()));
        }
    }
}
