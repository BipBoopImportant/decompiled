package uJ;

import DI.C15566m;
import EI.C15649h;
import kotlin.jvm.internal.C17542s;
import uJ.t0;

public final class v0 {
    public static final u0 a(u0 u0Var, C15649h hVar) {
        u0 B10;
        C17542s.j(u0Var, "<this>");
        C17542s.j(hVar, "newAnnotations");
        if (C18140u.a(u0Var) == hVar) {
            return u0Var;
        }
        C18139t b10 = C18140u.b(u0Var);
        if (!(b10 == null || (B10 = u0Var.B(b10)) == null)) {
            u0Var = B10;
        }
        return (hVar.iterator().hasNext() || !hVar.isEmpty()) ? u0Var.A(new C18139t(hVar)) : u0Var;
    }

    public static final u0 b(C15649h hVar) {
        C17542s.j(hVar, "<this>");
        return t0.a.a(C18144y.f147952a, hVar, (y0) null, (C15566m) null, 6, (Object) null);
    }
}
