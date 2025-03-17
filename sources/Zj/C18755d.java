package zJ;

import AI.C15429j;
import DI.C15561h;
import DI.C15562i;
import DI.m0;
import DI.n0;
import EI.C15649h;
import XH.t;
import YH.C16877v;
import YH.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18087K;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18110e;
import uJ.C18113f0;
import uJ.C18127m0;
import uJ.C18131o0;
import uJ.C18145z;
import uJ.E0;
import uJ.G0;
import uJ.I0;
import uJ.M0;
import uJ.O0;
import uJ.P0;
import uJ.Q0;
import uJ.u0;
import uJ.v0;
import uJ.y0;
import vJ.e;
import wJ.C18227i;

/* renamed from: zJ.d  reason: case insensitive filesystem */
public final class C18755d {
    public static final C18096U A(C18096U u10) {
        C17542s.j(u10, "<this>");
        C18096U n10 = M0.n(u10);
        C17542s.i(n10, "makeNotNullable(...)");
        return n10;
    }

    public static final C18096U B(C18096U u10) {
        C17542s.j(u10, "<this>");
        C18096U o10 = M0.o(u10);
        C17542s.i(o10, "makeNullable(...)");
        return o10;
    }

    public static final C18096U C(C18096U u10, C15649h hVar) {
        C17542s.j(u10, "<this>");
        C17542s.j(hVar, "newAnnotations");
        return (!u10.getAnnotations().isEmpty() || !hVar.isEmpty()) ? u10.Q0().T0(v0.a(u10.M0(), hVar)) : u10;
    }

    public static final C18096U D(C18096U u10) {
        C18113f0 f0Var;
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18087K) {
            C18087K k10 = (C18087K) Q02;
            C18113f0 V02 = k10.V0();
            if (!V02.N0().getParameters().isEmpty() && V02.N0().e() != null) {
                List<n0> parameters = V02.N0().getParameters();
                C17542s.i(parameters, "getParameters(...)");
                Iterable<n0> iterable = parameters;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (n0 m0Var : iterable) {
                    arrayList.add(new C18127m0(m0Var));
                }
                V02 = I0.f(V02, arrayList, (u0) null, 2, (Object) null);
            }
            C18113f0 W02 = k10.W0();
            if (!W02.N0().getParameters().isEmpty() && W02.N0().e() != null) {
                List<n0> parameters2 = W02.N0().getParameters();
                C17542s.i(parameters2, "getParameters(...)");
                Iterable<n0> iterable2 = parameters2;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (n0 m0Var2 : iterable2) {
                    arrayList2.add(new C18127m0(m0Var2));
                }
                W02 = I0.f(W02, arrayList2, (u0) null, 2, (Object) null);
            }
            f0Var = C18099X.e(V02, W02);
        } else if (Q02 instanceof C18113f0) {
            C18113f0 f0Var2 = (C18113f0) Q02;
            boolean isEmpty = f0Var2.N0().getParameters().isEmpty();
            f0Var = f0Var2;
            if (!isEmpty) {
                C15561h e10 = f0Var2.N0().e();
                f0Var = f0Var2;
                if (e10 != null) {
                    List<n0> parameters3 = f0Var2.N0().getParameters();
                    C17542s.i(parameters3, "getParameters(...)");
                    Iterable<n0> iterable3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C16877v.y(iterable3, 10));
                    for (n0 m0Var3 : iterable3) {
                        arrayList3.add(new C18127m0(m0Var3));
                    }
                    f0Var = I0.f(f0Var2, arrayList3, (u0) null, 2, (Object) null);
                }
            }
        } else {
            throw new t();
        }
        return O0.b(f0Var, Q02);
    }

    public static final boolean E(C18096U u10) {
        C17542s.j(u10, "<this>");
        return e(u10, C18754c.f152806a);
    }

    /* access modifiers changed from: private */
    public static final boolean F(P0 p02) {
        C17542s.j(p02, "it");
        C15561h e10 = p02.N0().e();
        if (e10 != null) {
            return (e10 instanceof m0) || (e10 instanceof n0);
        }
        return false;
    }

    public static final E0 d(C18096U u10) {
        C17542s.j(u10, "<this>");
        return new G0(u10);
    }

    public static final boolean e(C18096U u10, C17642l<? super P0, Boolean> lVar) {
        C17542s.j(u10, "<this>");
        C17542s.j(lVar, "predicate");
        return M0.c(u10, lVar);
    }

    private static final boolean f(C18096U u10, y0 y0Var, Set<? extends n0> set) {
        boolean z10;
        if (C17542s.e(u10.N0(), y0Var)) {
            return true;
        }
        C15561h e10 = u10.N0().e();
        C15562i iVar = e10 instanceof C15562i ? (C15562i) e10 : null;
        List<n0> t10 = iVar != null ? iVar.t() : null;
        Iterable<Q> B12 = C16877v.B1(u10.L0());
        if (!(B12 instanceof Collection) || !((Collection) B12).isEmpty()) {
            for (Q q10 : B12) {
                int a10 = q10.a();
                E0 e02 = (E0) q10.b();
                n0 n0Var = t10 != null ? (n0) C16877v.z0(t10, a10) : null;
                if ((n0Var == null || set == null || !set.contains(n0Var)) && !e02.a()) {
                    C18096U type = e02.getType();
                    C17542s.i(type, "getType(...)");
                    z10 = f(type, y0Var, set);
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(C18096U u10) {
        C17542s.j(u10, "<this>");
        return e(u10, C18753b.f152805a);
    }

    /* access modifiers changed from: private */
    public static final boolean h(P0 p02) {
        C17542s.j(p02, "it");
        C15561h e10 = p02.N0().e();
        if (e10 != null) {
            return x(e10);
        }
        return false;
    }

    public static final boolean i(C18096U u10) {
        C17542s.j(u10, "<this>");
        return M0.c(u10, C18752a.f152804a);
    }

    /* access modifiers changed from: private */
    public static final Boolean j(P0 p02) {
        return Boolean.valueOf(M0.m(p02));
    }

    public static final E0 k(C18096U u10, Q0 q02, n0 n0Var) {
        C17542s.j(u10, "type");
        C17542s.j(q02, "projectionKind");
        if ((n0Var != null ? n0Var.o() : null) == q02) {
            q02 = Q0.INVARIANT;
        }
        return new G0(q02, u10);
    }

    public static final Set<n0> l(C18096U u10, Set<? extends n0> set) {
        C17542s.j(u10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(u10, u10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(C18096U u10, C18096U u11, Set<n0> set, Set<? extends n0> set2) {
        C15561h e10 = u10.N0().e();
        if (!(e10 instanceof n0)) {
            C15561h e11 = u10.N0().e();
            C15562i iVar = e11 instanceof C15562i ? (C15562i) e11 : null;
            List<n0> t10 = iVar != null ? iVar.t() : null;
            int i10 = 0;
            for (E0 e02 : u10.L0()) {
                int i11 = i10 + 1;
                n0 n0Var = t10 != null ? (n0) C16877v.z0(t10, i10) : null;
                if ((n0Var == null || set2 == null || !set2.contains(n0Var)) && !e02.a() && !C16877v.l0(set, e02.getType().N0().e()) && !C17542s.e(e02.getType().N0(), u11.N0())) {
                    C18096U type = e02.getType();
                    C17542s.i(type, "getType(...)");
                    m(type, u11, set, set2);
                }
                i10 = i11;
            }
        } else if (!C17542s.e(u10.N0(), u11.N0())) {
            set.add(e10);
        } else {
            for (C18096U next : ((n0) e10).getUpperBounds()) {
                C17542s.g(next);
                m(next, u11, set, set2);
            }
        }
    }

    public static final C15429j n(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15429j p10 = u10.N0().p();
        C17542s.i(p10, "getBuiltIns(...)");
        return p10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: DI.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: DI.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: uJ.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: DI.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: DI.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: DI.e} */
    /* JADX WARNING: type inference failed for: r4v3, types: [DI.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final uJ.C18096U o(DI.n0 r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.util.List r0 = r6.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.isEmpty()
            java.util.List r0 = r6.getUpperBounds()
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            r4 = r2
            uJ.U r4 = (uJ.C18096U) r4
            uJ.y0 r4 = r4.N0()
            DI.h r4 = r4.e()
            boolean r5 = r4 instanceof DI.C15558e
            if (r5 == 0) goto L_0x003d
            r3 = r4
            DI.e r3 = (DI.C15558e) r3
        L_0x003d:
            if (r3 != 0) goto L_0x0040
            goto L_0x0020
        L_0x0040:
            DI.f r4 = r3.h()
            DI.f r5 = DI.C15559f.INTERFACE
            if (r4 == r5) goto L_0x0020
            DI.f r3 = r3.h()
            DI.f r4 = DI.C15559f.ANNOTATION_CLASS
            if (r3 == r4) goto L_0x0020
            r3 = r2
        L_0x0051:
            uJ.U r3 = (uJ.C18096U) r3
            if (r3 != 0) goto L_0x0068
            java.util.List r6 = r6.getUpperBounds()
            kotlin.jvm.internal.C17542s.i(r6, r1)
            java.lang.Object r6 = YH.C16877v.w0(r6)
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.C17542s.i(r6, r0)
            r3 = r6
            uJ.U r3 = (uJ.C18096U) r3
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zJ.C18755d.o(DI.n0):uJ.U");
    }

    public static final boolean p(n0 n0Var) {
        C17542s.j(n0Var, "typeParameter");
        return r(n0Var, (y0) null, (Set) null, 6, (Object) null);
    }

    public static final boolean q(n0 n0Var, y0 y0Var, Set<? extends n0> set) {
        C17542s.j(n0Var, "typeParameter");
        List<C18096U> upperBounds = n0Var.getUpperBounds();
        C17542s.i(upperBounds, "getUpperBounds(...)");
        Iterable<C18096U> iterable = upperBounds;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C18096U u10 : iterable) {
            C17542s.g(u10);
            if (f(u10, n0Var.r().N0(), set) && (y0Var == null || C17542s.e(u10.N0(), y0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(n0 n0Var, y0 y0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(n0Var, y0Var, set);
    }

    public static final boolean s(C18096U u10) {
        C17542s.j(u10, "<this>");
        return C15429j.g0(u10);
    }

    public static final boolean t(C18096U u10) {
        C17542s.j(u10, "<this>");
        return C15429j.o0(u10);
    }

    public static final boolean u(C18096U u10) {
        C17542s.j(u10, "<this>");
        return (u10 instanceof C18110e) || ((u10 instanceof C18145z) && (((C18145z) u10).Z0() instanceof C18110e));
    }

    public static final boolean v(C18096U u10) {
        C17542s.j(u10, "<this>");
        return (u10 instanceof C18131o0) || ((u10 instanceof C18145z) && (((C18145z) u10).Z0() instanceof C18131o0));
    }

    public static final boolean w(C18096U u10, C18096U u11) {
        C17542s.j(u10, "<this>");
        C17542s.j(u11, "superType");
        return e.f149048a.d(u10, u11);
    }

    public static final boolean x(C15561h hVar) {
        C17542s.j(hVar, "<this>");
        return (hVar instanceof n0) && (((n0) hVar).b() instanceof m0);
    }

    public static final boolean y(C18096U u10) {
        C17542s.j(u10, "<this>");
        return M0.m(u10);
    }

    public static final boolean z(C18096U u10) {
        C17542s.j(u10, "type");
        return (u10 instanceof C18227i) && ((C18227i) u10).X0().j();
    }
}
