package uJ;

import EI.C15649h;
import EI.C15657p;
import XH.t;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import vJ.g;
import wJ.C18227i;

public final class I0 {
    public static final C18113f0 a(C18096U u10) {
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        C18113f0 f0Var = Q02 instanceof C18113f0 ? (C18113f0) Q02 : null;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + u10).toString());
    }

    public static final C18096U b(C18096U u10, List<? extends E0> list, C15649h hVar) {
        C17542s.j(u10, "<this>");
        C17542s.j(list, "newArguments");
        C17542s.j(hVar, "newAnnotations");
        return e(u10, list, hVar, (List) null, 4, (Object) null);
    }

    public static final C18096U c(C18096U u10, List<? extends E0> list, C15649h hVar, List<? extends E0> list2) {
        C17542s.j(u10, "<this>");
        C17542s.j(list, "newArguments");
        C17542s.j(hVar, "newAnnotations");
        C17542s.j(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == u10.L0()) && hVar == u10.getAnnotations()) {
            return u10;
        }
        u0 M02 = u10.M0();
        if ((hVar instanceof C15657p) && ((C15657p) hVar).isEmpty()) {
            hVar = C15649h.f134231V.b();
        }
        u0 a10 = v0.a(M02, hVar);
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18087K) {
            C18087K k10 = (C18087K) Q02;
            return C18099X.e(d(k10.V0(), list, a10), d(k10.W0(), list2, a10));
        } else if (Q02 instanceof C18113f0) {
            return d((C18113f0) Q02, list, a10);
        } else {
            throw new t();
        }
    }

    public static final C18113f0 d(C18113f0 f0Var, List<? extends E0> list, u0 u0Var) {
        C17542s.j(f0Var, "<this>");
        C17542s.j(list, "newArguments");
        C17542s.j(u0Var, "newAttributes");
        if (list.isEmpty() && u0Var == f0Var.M0()) {
            return f0Var;
        }
        if (list.isEmpty()) {
            return f0Var.V0(u0Var);
        }
        if (f0Var instanceof C18227i) {
            return ((C18227i) f0Var).Z0(list);
        }
        return C18099X.k(u0Var, f0Var.N0(), list, f0Var.O0(), (g) null, 16, (Object) null);
    }

    public static /* synthetic */ C18096U e(C18096U u10, List<E0> list, C15649h hVar, List<E0> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = u10.L0();
        }
        if ((i10 & 2) != 0) {
            hVar = u10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(u10, list, hVar, list2);
    }

    public static /* synthetic */ C18113f0 f(C18113f0 f0Var, List<E0> list, u0 u0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = f0Var.L0();
        }
        if ((i10 & 2) != 0) {
            u0Var = f0Var.M0();
        }
        return d(f0Var, list, u0Var);
    }
}
