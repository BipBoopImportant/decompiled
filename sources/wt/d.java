package Wt;

import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import XH.t;
import java.time.LocalDateTime;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import st.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljt/b$f;", "Ljava/time/LocalDateTime;", "currentTime", "", "showSpotsLeft", "LIC/e;", "b", "(Ljt/b$f;Ljava/time/LocalDateTime;Z)LIC/e;", "Ljt/b$f$a$f$a;", "amount", "a", "(Ljt/b$f$a$f$a;)LIC/e;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    private static final C13023e a(b.f.a.C2236f.C2237a aVar) {
        if (aVar instanceof b.f.a.C2236f.C2237a.C2238a) {
            int a10 = ((b.f.a.C2236f.C2237a.C2238a) aVar).a();
            return a10 <= 5 ? C13026h.d(st.b.f102697c, C13020b.a(a10), Integer.valueOf(a10)) : C13026h.b(c.f102789m1, Integer.valueOf(a10));
        } else if (C17542s.e(aVar, b.f.a.C2236f.C2237a.C2239b.f98753a)) {
            return C13026h.a(c.f102744W0);
        } else {
            throw new t();
        }
    }

    public static final C13023e b(b.f fVar, LocalDateTime localDateTime, boolean z10) {
        C17542s.j(fVar, "<this>");
        C17542s.j(localDateTime, "currentTime");
        if (fVar.h(localDateTime) && !(fVar.g() instanceof b.f.a.c)) {
            return C13026h.a(c.f102759c1);
        }
        b.f.a g10 = fVar.g();
        if (C17542s.e(g10, b.f.a.c.f98748a)) {
            return null;
        }
        if (C17542s.e(g10, b.f.a.C2235b.f98747a)) {
            return C13026h.a(c.f102714H0);
        }
        if (C17542s.e(g10, b.f.a.d.f98749a)) {
            return C13026h.a(c.f102813u1);
        }
        if (C17542s.e(g10, b.f.a.e.f98750a)) {
            return C13026h.a(c.f102786l1);
        }
        if (g10 instanceof b.f.a.C2236f) {
            if (z10) {
                return a(((b.f.a.C2236f) g10).c());
            }
            if (!z10) {
                return C13026h.a(c.f102744W0);
            }
            throw new t();
        } else if (C17542s.e(g10, b.f.a.g.f98754a)) {
            return C13026h.a(c.f102819w1);
        } else {
            throw new t();
        }
    }
}
