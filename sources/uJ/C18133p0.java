package uJ;

import DI.C15561h;
import DI.m0;
import DI.n0;
import EI.C15644c;
import EI.C15649h;
import YH.C16877v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import uJ.C18137r0;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

/* renamed from: uJ.p0  reason: case insensitive filesystem */
public final class C18133p0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147912c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final C18133p0 f147913d = new C18133p0(C18137r0.a.f147928a, false);

    /* renamed from: a  reason: collision with root package name */
    private final C18137r0 f147914a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f147915b;

    /* renamed from: uJ.p0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(int i10, m0 m0Var) {
            if (i10 > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + m0Var.getName());
            }
        }

        private a() {
        }
    }

    public C18133p0(C18137r0 r0Var, boolean z10) {
        C17542s.j(r0Var, "reportStrategy");
        this.f147914a = r0Var;
        this.f147915b = z10;
    }

    private final void a(C15649h hVar, C15649h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C15644c) it.next()).f());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            C15644c cVar = (C15644c) it2.next();
            if (hashSet.contains(cVar.f())) {
                this.f147914a.c(cVar);
            }
        }
    }

    private final void b(C18096U u10, C18096U u11) {
        J0 f10 = J0.f(u11);
        C17542s.i(f10, "create(...)");
        int i10 = 0;
        for (Object next : u11.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            E0 e02 = (E0) next;
            if (!e02.a()) {
                C18096U type = e02.getType();
                C17542s.i(type, "getType(...)");
                if (!C18755d.g(type)) {
                    E0 e03 = u10.L0().get(i10);
                    n0 n0Var = u10.N0().getParameters().get(i10);
                    if (this.f147915b) {
                        C18137r0 r0Var = this.f147914a;
                        C18096U type2 = e03.getType();
                        C17542s.i(type2, "getType(...)");
                        C18096U type3 = e02.getType();
                        C17542s.i(type3, "getType(...)");
                        C17542s.g(n0Var);
                        r0Var.a(f10, type2, type3, n0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final C18082F c(C18082F f10, u0 u0Var) {
        return f10.T0(h(f10, u0Var));
    }

    private final C18113f0 d(C18113f0 f0Var, u0 u0Var) {
        return C18100Y.a(f0Var) ? f0Var : I0.f(f0Var, (List) null, h(f0Var, u0Var), 1, (Object) null);
    }

    private final C18113f0 e(C18113f0 f0Var, C18096U u10) {
        C18113f0 r10 = M0.r(f0Var, u10.O0());
        C17542s.i(r10, "makeNullableIfNeeded(...)");
        return r10;
    }

    private final C18113f0 f(C18113f0 f0Var, C18096U u10) {
        return d(e(f0Var, u10), u10.M0());
    }

    private final C18113f0 g(C18135q0 q0Var, u0 u0Var, boolean z10) {
        y0 k10 = q0Var.b().k();
        C17542s.i(k10, "getTypeConstructor(...)");
        return C18099X.m(u0Var, k10, q0Var.a(), z10, C17656k.b.f144864b);
    }

    private final u0 h(C18096U u10, u0 u0Var) {
        return C18100Y.a(u10) ? u10.M0() : u0Var.s(u10.M0());
    }

    private final E0 j(E0 e02, C18135q0 q0Var, int i10) {
        P0 Q02 = e02.getType().Q0();
        if (C18083G.a(Q02)) {
            return e02;
        }
        C18113f0 a10 = I0.a(Q02);
        if (C18100Y.a(a10) || !C18755d.E(a10)) {
            return e02;
        }
        y0 N02 = a10.N0();
        C15561h e10 = N02.e();
        N02.getParameters().size();
        a10.L0().size();
        if (e10 instanceof n0) {
            return e02;
        }
        if (e10 instanceof m0) {
            m0 m0Var = (m0) e10;
            if (q0Var.d(m0Var)) {
                this.f147914a.b(m0Var);
                return new G0(Q0.INVARIANT, C18230l.d(C18229k.RECURSIVE_TYPE_ALIAS, m0Var.getName().toString()));
            }
            Iterable L02 = a10.L0();
            ArrayList arrayList = new ArrayList(C16877v.y(L02, 10));
            int i11 = 0;
            for (Object next : L02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C16877v.x();
                }
                arrayList.add(l((E0) next, q0Var, N02.getParameters().get(i11), i10 + 1));
                i11 = i12;
            }
            C18113f0 k10 = k(C18135q0.f147923e.a(q0Var, m0Var, arrayList), a10.M0(), a10.O0(), i10 + 1, false);
            C18113f0 m10 = m(a10, q0Var, i10);
            if (!C18083G.a(k10)) {
                k10 = C18121j0.j(k10, m10);
            }
            return new G0(e02.c(), k10);
        }
        C18113f0 m11 = m(a10, q0Var, i10);
        b(a10, m11);
        return new G0(e02.c(), m11);
    }

    private final C18113f0 k(C18135q0 q0Var, u0 u0Var, boolean z10, int i10, boolean z11) {
        E0 l10 = l(new G0(Q0.INVARIANT, q0Var.b().u0()), q0Var, (n0) null, i10);
        C18096U type = l10.getType();
        C17542s.i(type, "getType(...)");
        C18113f0 a10 = I0.a(type);
        if (C18100Y.a(a10)) {
            return a10;
        }
        l10.c();
        a(a10.getAnnotations(), C18140u.a(u0Var));
        C18113f0 r10 = M0.r(d(a10, u0Var), z10);
        C17542s.i(r10, "let(...)");
        return z11 ? C18121j0.j(r10, g(q0Var, u0Var, z10)) : r10;
    }

    private final E0 l(E0 e02, C18135q0 q0Var, n0 n0Var, int i10) {
        Q0 q02;
        Q0 q03;
        Q0 q04;
        f147912c.b(i10, q0Var.b());
        if (e02.a()) {
            C17542s.g(n0Var);
            E0 s10 = M0.s(n0Var);
            C17542s.i(s10, "makeStarProjection(...)");
            return s10;
        }
        C18096U type = e02.getType();
        C17542s.i(type, "getType(...)");
        E0 c10 = q0Var.c(type.N0());
        if (c10 == null) {
            return j(e02, q0Var, i10);
        }
        if (c10.a()) {
            C17542s.g(n0Var);
            E0 s11 = M0.s(n0Var);
            C17542s.i(s11, "makeStarProjection(...)");
            return s11;
        }
        P0 Q02 = c10.getType().Q0();
        Q0 c11 = c10.c();
        C17542s.i(c11, "getProjectionKind(...)");
        Q0 c12 = e02.c();
        C17542s.i(c12, "getProjectionKind(...)");
        if (!(c12 == c11 || c12 == (q04 = Q0.INVARIANT))) {
            if (c11 == q04) {
                c11 = c12;
            } else {
                this.f147914a.d(q0Var.b(), n0Var, Q02);
            }
        }
        if (n0Var == null || (q02 = n0Var.o()) == null) {
            q02 = Q0.INVARIANT;
        }
        if (!(q02 == c11 || q02 == (q03 = Q0.INVARIANT))) {
            if (c11 == q03) {
                c11 = q03;
            } else {
                this.f147914a.d(q0Var.b(), n0Var, Q02);
            }
        }
        a(type.getAnnotations(), Q02.getAnnotations());
        return new G0(c11, Q02 instanceof C18082F ? c((C18082F) Q02, type.M0()) : f(I0.a(Q02), type));
    }

    private final C18113f0 m(C18113f0 f0Var, C18135q0 q0Var, int i10) {
        y0 N02 = f0Var.N0();
        Iterable L02 = f0Var.L0();
        ArrayList arrayList = new ArrayList(C16877v.y(L02, 10));
        int i11 = 0;
        for (Object next : L02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            E0 e02 = (E0) next;
            E0 l10 = l(e02, q0Var, N02.getParameters().get(i11), i10 + 1);
            if (!l10.a()) {
                l10 = new G0(l10.c(), M0.q(l10.getType(), e02.getType().O0()));
            }
            arrayList.add(l10);
            i11 = i12;
        }
        return I0.f(f0Var, arrayList, (u0) null, 2, (Object) null);
    }

    public final C18113f0 i(C18135q0 q0Var, u0 u0Var) {
        C17542s.j(q0Var, "typeAliasExpansion");
        C17542s.j(u0Var, "attributes");
        return k(q0Var, u0Var, false, 0, true);
    }
}
