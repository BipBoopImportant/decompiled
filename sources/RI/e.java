package RI;

import AI.C15432m;
import CI.C15497d;
import DI.C15558e;
import DI.C15561h;
import DI.n0;
import EI.C15644c;
import EI.C15649h;
import EI.C15656o;
import MI.V;
import PI.C16197g;
import PI.C16201k;
import PI.C16206p;
import TI.C16495C;
import TI.C16502f;
import TI.j;
import TI.v;
import TI.x;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.A0;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18103a0;
import uJ.C18113f0;
import uJ.D0;
import uJ.E0;
import uJ.G0;
import uJ.L0;
import uJ.M0;
import uJ.Q0;
import uJ.u0;
import uJ.v0;
import uJ.y0;
import vJ.g;
import wJ.C18227i;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final C16201k f138000a;

    /* renamed from: b  reason: collision with root package name */
    private final C16206p f138001b;

    /* renamed from: c  reason: collision with root package name */
    private final g f138002c;

    /* renamed from: d  reason: collision with root package name */
    private final D0 f138003d;

    public e(C16201k kVar, C16206p pVar) {
        C17542s.j(kVar, "c");
        C17542s.j(pVar, "typeParameterResolver");
        this.f138000a = kVar;
        this.f138001b = pVar;
        g gVar = new g();
        this.f138002c = gVar;
        this.f138003d = new D0(gVar, (A0) null, 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r2 = r2.o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(TI.j r2, DI.C15558e r3) {
        /*
            r1 = this;
            java.util.List r2 = r2.A()
            java.lang.Object r2 = YH.C16877v.K0(r2)
            TI.x r2 = (TI.x) r2
            boolean r2 = TI.C16493A.a(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0012
            return r0
        L_0x0012:
            CI.d r2 = CI.C15497d.f133512a
            DI.e r2 = r2.b(r3)
            uJ.y0 r2 = r2.k()
            java.util.List r2 = r2.getParameters()
            java.lang.String r3 = "getParameters(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            java.lang.Object r2 = YH.C16877v.K0(r2)
            DI.n0 r2 = (DI.n0) r2
            if (r2 == 0) goto L_0x0038
            uJ.Q0 r2 = r2.o()
            if (r2 == 0) goto L_0x0038
            uJ.Q0 r3 = uJ.Q0.OUT_VARIANCE
            if (r2 == r3) goto L_0x0038
            r0 = 1
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RI.e.b(TI.j, DI.e):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.isEmpty() == false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<uJ.E0> c(TI.j r10, RI.C16377a r11, uJ.y0 r12) {
        /*
            r9 = this;
            boolean r0 = r10.t()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L_0x0024
            java.util.List r0 = r10.A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.C17542s.i(r2, r1)
            if (r0 == 0) goto L_0x0033
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L_0x0033:
            int r11 = r2.size()
            java.util.List r12 = r10.A()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L_0x007e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = YH.C16877v.y(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L_0x0052:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0079
            java.lang.Object r12 = r11.next()
            DI.n0 r12 = (DI.n0) r12
            uJ.G0 r0 = new uJ.G0
            wJ.k r1 = wJ.C18229k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            cJ.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            wJ.i r12 = wJ.C18230l.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L_0x0052
        L_0x0079:
            java.util.List r10 = YH.C16877v.t1(r10)
            return r10
        L_0x007e:
            java.util.List r10 = r10.A()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = YH.C16877v.B1(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = YH.C16877v.y(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00ca
            java.lang.Object r12 = r10.next()
            YH.Q r12 = (YH.Q) r12
            int r0 = r12.a()
            java.lang.Object r12 = r12.b()
            TI.x r12 = (TI.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            DI.n0 r0 = (DI.n0) r0
            uJ.L0 r3 = uJ.L0.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            RI.a r1 = RI.C16378b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.C17542s.g(r0)
            uJ.E0 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L_0x0095
        L_0x00ca:
            java.util.List r10 = YH.C16877v.t1(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: RI.e.c(TI.j, RI.a, uJ.y0):java.util.List");
    }

    private final List<E0> d(j jVar, List<? extends n0> list, y0 y0Var, C16377a aVar) {
        E0 e02;
        Iterable<n0> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (n0 n0Var : iterable) {
            if (C18755d.q(n0Var, (y0) null, aVar.c())) {
                e02 = M0.t(n0Var, aVar);
            } else {
                e02 = this.f138002c.a(n0Var, aVar.j(jVar.t()), this.f138003d, new C18103a0(this.f138000a.e(), new d(this, n0Var, aVar, y0Var, jVar)));
            }
            arrayList.add(e02);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C18096U e(e eVar, n0 n0Var, C16377a aVar, y0 y0Var, j jVar) {
        D0 d02 = eVar.f138003d;
        C15561h e10 = y0Var.e();
        return d02.e(n0Var, aVar.k(e10 != null ? e10.r() : null).j(jVar.t()));
    }

    private final C18113f0 f(j jVar, C16377a aVar, C18113f0 f0Var) {
        u0 b10;
        if (f0Var == null || (b10 = f0Var.M0()) == null) {
            b10 = v0.b(new C16197g(this.f138000a, jVar, false, 4, (DefaultConstructorMarker) null));
        }
        u0 u0Var = b10;
        y0 g10 = g(jVar, aVar);
        y0 y0Var = null;
        if (g10 == null) {
            return null;
        }
        boolean j10 = j(aVar);
        if (f0Var != null) {
            y0Var = f0Var.N0();
        }
        return (!C17542s.e(y0Var, g10) || jVar.t() || !j10) ? C18099X.k(u0Var, g10, c(jVar, aVar, g10), j10, (g) null, 16, (Object) null) : f0Var.U0(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r5 = r5.k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final uJ.y0 g(TI.j r4, RI.C16377a r5) {
        /*
            r3 = this;
            TI.i r0 = r4.e()
            if (r0 != 0) goto L_0x000b
            uJ.y0 r4 = r3.h(r4)
            return r4
        L_0x000b:
            boolean r1 = r0 instanceof TI.C16503g
            if (r1 == 0) goto L_0x0050
            r1 = r0
            TI.g r1 = (TI.C16503g) r1
            cJ.c r2 = r1.f()
            if (r2 == 0) goto L_0x0039
            DI.e r5 = r3.k(r4, r5, r2)
            if (r5 != 0) goto L_0x002c
            PI.k r5 = r3.f138000a
            PI.d r5 = r5.a()
            PI.n r5 = r5.n()
            DI.e r5 = r5.a(r1)
        L_0x002c:
            if (r5 == 0) goto L_0x0034
            uJ.y0 r5 = r5.k()
            if (r5 != 0) goto L_0x0064
        L_0x0034:
            uJ.y0 r5 = r3.h(r4)
            goto L_0x0064
        L_0x0039:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Class type should have a FQ name: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
        L_0x0050:
            boolean r4 = r0 instanceof TI.y
            if (r4 == 0) goto L_0x0065
            PI.p r4 = r3.f138001b
            TI.y r0 = (TI.y) r0
            DI.n0 r4 = r4.a(r0)
            if (r4 == 0) goto L_0x0063
            uJ.y0 r5 = r4.k()
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            return r5
        L_0x0065:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Unknown classifier kind: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: RI.e.g(TI.j, RI.a):uJ.y0");
    }

    private final y0 h(j jVar) {
        y0 k10 = this.f138000a.a().b().f().r().d(C17065b.f141241d.c(new C17066c(jVar.I())), C16877v.e(0)).k();
        C17542s.i(k10, "getTypeConstructor(...)");
        return k10;
    }

    private final boolean i(Q0 q02, n0 n0Var) {
        return (n0Var.o() == Q0.INVARIANT || q02 == n0Var.o()) ? false : true;
    }

    private final boolean j(C16377a aVar) {
        return (aVar.g() == C16379c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == L0.SUPERTYPE) ? false : true;
    }

    private final C15558e k(j jVar, C16377a aVar, C17066c cVar) {
        if (aVar.h() && C17542s.e(cVar, f.f138004a)) {
            return this.f138000a.a().p().d();
        }
        C15497d dVar = C15497d.f133512a;
        C15558e f10 = C15497d.f(dVar, cVar, this.f138000a.d().p(), (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return null;
        }
        return (!dVar.d(f10) || !(aVar.g() == C16379c.FLEXIBLE_LOWER_BOUND || aVar.b() == L0.SUPERTYPE || b(jVar, f10))) ? f10 : dVar.b(f10);
    }

    public static /* synthetic */ C18096U m(e eVar, C16502f fVar, C16377a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(fVar, aVar, z10);
    }

    private final C18096U n(j jVar, C16377a aVar) {
        boolean z10 = !aVar.h() && aVar.b() != L0.SUPERTYPE;
        boolean t10 = jVar.t();
        if (t10 || z10) {
            C18113f0 f10 = f(jVar, aVar.l(C16379c.FLEXIBLE_LOWER_BOUND), (C18113f0) null);
            if (f10 == null) {
                return o(jVar);
            }
            C18113f0 f11 = f(jVar, aVar.l(C16379c.FLEXIBLE_UPPER_BOUND), f10);
            return f11 == null ? o(jVar) : t10 ? new k(f10, f11) : C18099X.e(f10, f11);
        }
        C18113f0 f12 = f(jVar, aVar, (C18113f0) null);
        return f12 != null ? f12 : o(jVar);
    }

    private static final C18227i o(j jVar) {
        return C18230l.d(C18229k.UNRESOLVED_JAVA_CLASS, jVar.F());
    }

    private final E0 q(x xVar, C16377a aVar, n0 n0Var) {
        if (!(xVar instanceof C16495C)) {
            return new G0(Q0.INVARIANT, p(xVar, aVar));
        }
        C16495C c10 = (C16495C) xVar;
        x y10 = c10.y();
        Q0 q02 = c10.N() ? Q0.OUT_VARIANCE : Q0.IN_VARIANCE;
        if (y10 == null || i(q02, n0Var)) {
            E0 t10 = M0.t(n0Var, aVar);
            C17542s.i(t10, "makeStarProjection(...)");
            return t10;
        }
        C15644c a10 = V.a(this.f138000a, c10);
        C18096U p10 = p(y10, C16378b.b(L0.COMMON, false, false, (n0) null, 7, (Object) null));
        if (a10 != null) {
            p10 = C18755d.C(p10, C15649h.f134231V.a(C16877v.U0(p10.getAnnotations(), a10)));
        }
        return C18755d.k(p10, q02, n0Var);
    }

    public final C18096U l(C16502f fVar, C16377a aVar, boolean z10) {
        C17542s.j(fVar, "arrayType");
        C17542s.j(aVar, "attr");
        x n10 = fVar.n();
        C15432m mVar = null;
        v vVar = n10 instanceof v ? (v) n10 : null;
        if (vVar != null) {
            mVar = vVar.getType();
        }
        C16197g gVar = new C16197g(this.f138000a, fVar, true);
        if (mVar != null) {
            C18113f0 P10 = this.f138000a.d().p().P(mVar);
            C17542s.g(P10);
            C18096U C10 = C18755d.C(P10, new C15656o(P10.getAnnotations(), gVar));
            C17542s.h(C10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            C18113f0 f0Var = (C18113f0) C10;
            return aVar.h() ? f0Var : C18099X.e(f0Var, f0Var.U0(true));
        }
        C18096U p10 = p(n10, C16378b.b(L0.COMMON, aVar.h(), false, (n0) null, 6, (Object) null));
        if (aVar.h()) {
            C18113f0 n11 = this.f138000a.d().p().n(z10 ? Q0.OUT_VARIANCE : Q0.INVARIANT, p10, gVar);
            C17542s.i(n11, "getArrayType(...)");
            return n11;
        }
        C18113f0 n12 = this.f138000a.d().p().n(Q0.INVARIANT, p10, gVar);
        C17542s.i(n12, "getArrayType(...)");
        return C18099X.e(n12, this.f138000a.d().p().n(Q0.OUT_VARIANCE, p10, gVar).U0(true));
    }

    public final C18096U p(x xVar, C16377a aVar) {
        C18096U p10;
        C17542s.j(aVar, "attr");
        if (xVar instanceof v) {
            C15432m type = ((v) xVar).getType();
            C18113f0 S10 = type != null ? this.f138000a.d().p().S(type) : this.f138000a.d().p().a0();
            C17542s.g(S10);
            return S10;
        } else if (xVar instanceof j) {
            return n((j) xVar, aVar);
        } else {
            if (xVar instanceof C16502f) {
                return m(this, (C16502f) xVar, aVar, false, 4, (Object) null);
            } else if (xVar instanceof C16495C) {
                x y10 = ((C16495C) xVar).y();
                if (y10 != null && (p10 = p(y10, aVar)) != null) {
                    return p10;
                }
                C18113f0 z10 = this.f138000a.d().p().z();
                C17542s.i(z10, "getDefaultBound(...)");
                return z10;
            } else if (xVar == null) {
                C18113f0 z11 = this.f138000a.d().p().z();
                C17542s.i(z11, "getDefaultBound(...)");
                return z11;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + xVar);
            }
        }
    }
}
