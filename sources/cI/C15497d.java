package CI;

import AI.C15429j;
import AI.C15435p;
import DI.C15558e;
import YH.C16877v;
import YH.g0;
import cJ.C17065b;
import cJ.C17066c;
import gJ.C17278i;
import java.util.Collection;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: CI.d  reason: case insensitive filesystem */
public final class C15497d {

    /* renamed from: a  reason: collision with root package name */
    public static final C15497d f133512a = new C15497d();

    private C15497d() {
    }

    public static /* synthetic */ C15558e f(C15497d dVar, C17066c cVar, C15429j jVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, jVar, num);
    }

    public final C15558e a(C15558e eVar) {
        C17542s.j(eVar, "mutable");
        C17066c o10 = C15496c.f133492a.o(C17278i.m(eVar));
        if (o10 != null) {
            C15558e p10 = C17506e.m(eVar).p(o10);
            C17542s.i(p10, "getBuiltInClassByFqName(...)");
            return p10;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "mutable" + " collection");
    }

    public final C15558e b(C15558e eVar) {
        C17542s.j(eVar, "readOnly");
        C17066c p10 = C15496c.f133492a.p(C17278i.m(eVar));
        if (p10 != null) {
            C15558e p11 = C17506e.m(eVar).p(p10);
            C17542s.i(p11, "getBuiltInClassByFqName(...)");
            return p11;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "read-only" + " collection");
    }

    public final boolean c(C15558e eVar) {
        C17542s.j(eVar, "mutable");
        return C15496c.f133492a.k(C17278i.m(eVar));
    }

    public final boolean d(C15558e eVar) {
        C17542s.j(eVar, "readOnly");
        return C15496c.f133492a.l(C17278i.m(eVar));
    }

    public final C15558e e(C17066c cVar, C15429j jVar, Integer num) {
        C17542s.j(cVar, "fqName");
        C17542s.j(jVar, "builtIns");
        C17065b m10 = (num == null || !C17542s.e(cVar, C15496c.f133492a.h())) ? C15496c.f133492a.m(cVar) : C15435p.a(num.intValue());
        if (m10 != null) {
            return jVar.p(m10.a());
        }
        return null;
    }

    public final Collection<C15558e> g(C17066c cVar, C15429j jVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(jVar, "builtIns");
        C15558e f10 = f(this, cVar, jVar, (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return g0.d();
        }
        C17066c p10 = C15496c.f133492a.p(C17506e.p(f10));
        if (p10 == null) {
            return g0.c(f10);
        }
        return C16877v.q(f10, jVar.p(p10));
    }
}
