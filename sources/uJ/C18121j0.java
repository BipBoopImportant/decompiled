package uJ;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import uJ.C18145z;
import vJ.i;

/* renamed from: uJ.j0  reason: case insensitive filesystem */
public final class C18121j0 {
    public static final C18102a a(C18096U u10) {
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18102a) {
            return (C18102a) Q02;
        }
        return null;
    }

    public static final C18113f0 b(C18096U u10) {
        C17542s.j(u10, "<this>");
        C18102a a10 = a(u10);
        if (a10 != null) {
            return a10.Z0();
        }
        return null;
    }

    public static final boolean c(C18096U u10) {
        C17542s.j(u10, "<this>");
        return u10.Q0() instanceof C18145z;
    }

    private static final C18095T d(C18095T t10) {
        C18096U u10;
        Iterable a10 = t10.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        Iterator it = a10.iterator();
        boolean z10 = false;
        while (true) {
            u10 = null;
            if (!it.hasNext()) {
                break;
            }
            C18096U u11 = (C18096U) it.next();
            if (M0.l(u11)) {
                u11 = f(u11.Q0(), false, 1, (Object) null);
                z10 = true;
            }
            arrayList.add(u11);
        }
        if (!z10) {
            return null;
        }
        C18096U m10 = t10.m();
        if (m10 != null) {
            if (M0.l(m10)) {
                m10 = f(m10.Q0(), false, 1, (Object) null);
            }
            u10 = m10;
        }
        return new C18095T(arrayList).t(u10);
    }

    public static final P0 e(P0 p02, boolean z10) {
        C17542s.j(p02, "<this>");
        C18145z c10 = C18145z.a.c(C18145z.f147953d, p02, z10, false, 4, (Object) null);
        if (c10 != null) {
            return c10;
        }
        C18113f0 g10 = g(p02);
        return g10 != null ? g10 : p02.R0(false);
    }

    public static /* synthetic */ P0 f(P0 p02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(p02, z10);
    }

    private static final C18113f0 g(C18096U u10) {
        C18095T d10;
        y0 N02 = u10.N0();
        C18095T t10 = N02 instanceof C18095T ? (C18095T) N02 : null;
        if (t10 == null || (d10 = d(t10)) == null) {
            return null;
        }
        return d10.k();
    }

    public static final C18113f0 h(C18113f0 f0Var, boolean z10) {
        C17542s.j(f0Var, "<this>");
        C18145z c10 = C18145z.a.c(C18145z.f147953d, f0Var, z10, false, 4, (Object) null);
        if (c10 != null) {
            return c10;
        }
        C18113f0 g10 = g(f0Var);
        return g10 == null ? f0Var.U0(false) : g10;
    }

    public static /* synthetic */ C18113f0 i(C18113f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(f0Var, z10);
    }

    public static final C18113f0 j(C18113f0 f0Var, C18113f0 f0Var2) {
        C17542s.j(f0Var, "<this>");
        C17542s.j(f0Var2, "abbreviatedType");
        return C18100Y.a(f0Var) ? f0Var : new C18102a(f0Var, f0Var2);
    }

    public static final i k(i iVar) {
        C17542s.j(iVar, "<this>");
        return new i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
