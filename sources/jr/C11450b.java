package jr;

import IC.C13026h;
import Qq.g;
import Rq.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kr.h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/b;", "", "<init>", "()V", "LQq/g;", "reward", "Lkr/h;", "a", "(LQq/g;)Lkr/h;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jr.b  reason: case insensitive filesystem */
public final class C11450b {
    public final h a(g gVar) {
        C17542s.j(gVar, "reward");
        if (gVar instanceof g.b.c) {
            return new h.e(((g.b.c) gVar).c());
        }
        if (gVar instanceof g.b.a) {
            g.b.a aVar = (g.b.a) gVar;
            return new h.b(C13026h.c(aVar.g()), C13026h.c(aVar.f()), aVar.d(), (String) null);
        } else if (!(gVar instanceof g.b.C1770b)) {
            return h.a.f99165a;
        } else {
            g.b.C1770b bVar = (g.b.C1770b) gVar;
            return new h.b(C13026h.c(bVar.f()), C13026h.a(e.f86982c), bVar.d(), bVar.c());
        }
    }
}
