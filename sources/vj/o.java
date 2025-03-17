package vJ;

import DI.n0;
import XH.v;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.E0;
import uJ.J0;
import uJ.P0;
import uJ.Q0;
import uJ.z0;
import vJ.f;
import yJ.C18733b;
import zJ.C18755d;

public final class o {
    private static final List<E0> a(P0 p02, C18733b bVar) {
        if (p02.L0().size() != p02.N0().getParameters().size()) {
            return null;
        }
        List<E0> L02 = p02.L0();
        Iterable<E0> iterable = L02;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (E0 c10 : iterable) {
                if (c10.c() != Q0.INVARIANT) {
                    List<n0> parameters = p02.N0().getParameters();
                    C17542s.i(parameters, "getParameters(...)");
                    Iterable<v> D12 = C16877v.D1(iterable, parameters);
                    ArrayList arrayList = new ArrayList(C16877v.y(D12, 10));
                    for (v vVar : D12) {
                        E0 e02 = (E0) vVar.a();
                        n0 n0Var = (n0) vVar.b();
                        if (e02.c() != Q0.INVARIANT) {
                            P0 Q02 = (e02.a() || e02.c() != Q0.IN_VARIANCE) ? null : e02.getType().Q0();
                            C17542s.g(n0Var);
                            e02 = C18755d.d(new i(bVar, Q02, e02, n0Var));
                        }
                        arrayList.add(e02);
                    }
                    J0 c11 = z0.f147956c.b(p02.N0(), arrayList).c();
                    int size = L02.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        E0 e03 = L02.get(i10);
                        E0 e04 = (E0) arrayList.get(i10);
                        if (e03.c() != Q0.INVARIANT) {
                            List<C18096U> upperBounds = p02.N0().getParameters().get(i10).getUpperBounds();
                            C17542s.i(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            for (C18096U n10 : upperBounds) {
                                arrayList2.add(f.a.f149049a.a(c11.n(n10, Q0.INVARIANT).Q0()));
                            }
                            if (!e03.a() && e03.c() == Q0.OUT_VARIANCE) {
                                arrayList2.add(f.a.f149049a.a(e03.getType().Q0()));
                            }
                            C18096U type = e04.getType();
                            C17542s.h(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).N0().o(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final C18113f0 b(C18113f0 f0Var, C18733b bVar) {
        C17542s.j(f0Var, "type");
        C17542s.j(bVar, "status");
        List<E0> a10 = a(f0Var, bVar);
        if (a10 != null) {
            return c(f0Var, a10);
        }
        return null;
    }

    private static final C18113f0 c(P0 p02, List<? extends E0> list) {
        return C18099X.k(p02.M0(), p02.N0(), list, p02.O0(), (g) null, 16, (Object) null);
    }
}
