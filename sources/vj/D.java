package vJ;

import AJ.C15442c;
import DI.C15566m;
import fJ.n;
import hJ.C17334e;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.E0;
import uJ.M0;
import uJ.Q0;
import uJ.y0;
import uJ.z0;

public final class D {
    private static final C18096U a(C18096U u10) {
        return C15442c.b(u10).d();
    }

    private static final String b(y0 y0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + y0Var, sb2);
        c("hashCode: " + y0Var.hashCode(), sb2);
        c("javaClass: " + y0Var.getClass().getCanonicalName(), sb2);
        for (C15566m e10 = y0Var.e(); e10 != null; e10 = e10.b()) {
            c("fqName: " + n.f143180h.M(e10), sb2);
            c("javaClass: " + e10.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        C17542s.j(str, "<this>");
        sb2.append(str);
        sb2.append(10);
        return sb2;
    }

    public static final C18096U d(C18096U u10, C18096U u11, z zVar) {
        C17542s.j(u10, "subtype");
        C17542s.j(u11, "supertype");
        C17542s.j(zVar, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new w(u10, (w) null));
        y0 N02 = u11.N0();
        while (!arrayDeque.isEmpty()) {
            w wVar = (w) arrayDeque.poll();
            C18096U b10 = wVar.b();
            y0 N03 = b10.N0();
            if (zVar.a(N03, N02)) {
                boolean O02 = b10.O0();
                for (w a10 = wVar.a(); a10 != null; a10 = a10.a()) {
                    C18096U b11 = a10.b();
                    Iterable L02 = b11.L0();
                    if (!(L02 instanceof Collection) || !((Collection) L02).isEmpty()) {
                        Iterator it = L02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Q0 c10 = ((E0) it.next()).c();
                            Q0 q02 = Q0.INVARIANT;
                            if (c10 != q02) {
                                C18096U n10 = C17334e.h(z0.f147956c.a(b11), false, 1, (Object) null).c().n(b10, q02);
                                C17542s.i(n10, "safeSubstitute(...)");
                                b10 = a(n10);
                                break;
                            }
                        }
                    }
                    b10 = z0.f147956c.a(b11).c().n(b10, Q0.INVARIANT);
                    C17542s.g(b10);
                    O02 = O02 || b11.O0();
                }
                y0 N04 = b10.N0();
                if (zVar.a(N04, N02)) {
                    return M0.p(b10, O02);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(N04) + ", \n\nsupertype: " + b(N02) + " \n" + zVar.a(N04, N02));
            }
            for (C18096U next : N03.a()) {
                C17542s.g(next);
                arrayDeque.add(new w(next, wVar));
            }
        }
        return null;
    }
}
