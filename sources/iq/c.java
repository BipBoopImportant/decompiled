package Iq;

import IC.C13023e;
import IC.C13026h;
import Iq.a;
import Oo.b;
import Qq.g;
import XH.t;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIq/c;", "LIq/b;", "<init>", "()V", "LQq/g;", "reward", "LIq/a;", "a", "(LQq/g;)LIq/a;", "LQq/g$a;", "LIq/a$b;", "d", "(LQq/g$a;)LIq/a$b;", "LQq/g$c;", "LIq/a$d;", "b", "(LQq/g$c;)LIq/a$d;", "LQq/g$b;", "LIq/a$c;", "c", "(LQq/g$b;)LIq/a$c;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {
    public a a(g gVar) {
        C17542s.j(gVar, "reward");
        if (gVar instanceof g.b) {
            return c((g.b) gVar);
        }
        if (gVar instanceof g.a) {
            return d((g.a) gVar);
        }
        if (gVar instanceof g.c) {
            return b((g.c) gVar);
        }
        throw new t();
    }

    public a.d b(g.c cVar) {
        C17542s.j(cVar, "reward");
        String f10 = cVar.f();
        return new a.d(cVar.getId(), C13026h.c(cVar.getTitle()), C13026h.c(f10), cVar.k(), cVar.m(), cVar.b());
    }

    public a.c c(g.b bVar) {
        C17542s.j(bVar, "reward");
        C13023e c10 = C13026h.c(bVar.getTitle());
        C13023e c11 = C13026h.c(bVar.e().a());
        if (bVar instanceof g.b.a) {
            return new a.c.C1607a(bVar.getId(), c10, c11, bVar.k(), bVar.m(), ((g.b.a) bVar).d());
        }
        if (bVar instanceof g.b.C1770b) {
            String id2 = bVar.getId();
            Image k10 = bVar.k();
            String m10 = bVar.m();
            g.b.C1770b bVar2 = (g.b.C1770b) bVar;
            return new a.c.b(id2, c10, c11, k10, m10, bVar2.d(), bVar2.c());
        } else if (bVar instanceof g.b.c) {
            return new a.c.C1608c(bVar.getId(), c10, c11, bVar.k(), bVar.m(), ((g.b.c) bVar).c());
        } else {
            throw new t();
        }
    }

    public a.b d(g.a aVar) {
        C17542s.j(aVar, "reward");
        return new a.b(aVar.getId(), C13026h.c(aVar.getTitle()), C13026h.a(b.f84625e3), aVar.k(), aVar.m(), aVar.b());
    }
}
