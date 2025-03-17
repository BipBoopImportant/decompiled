package qJ;

import AI.C15428i;
import AI.C15429j;
import AI.C15435p;
import DI.C15554a;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.C15578y;
import DI.m0;
import DI.n0;
import EI.C15649h;
import GJ.C15768k;
import XI.q;
import XI.s;
import YH.C16877v;
import YH.X;
import ZI.C17005b;
import ZI.f;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import nI.C17642l;
import sJ.C17922S;
import sJ.C17924a;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.C18121j0;
import uJ.C18123k0;
import uJ.C18127m0;
import uJ.C18145z;
import uJ.E0;
import uJ.G0;
import uJ.Q0;
import uJ.t0;
import uJ.u0;
import uJ.y0;
import vJ.g;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

/* renamed from: qJ.X  reason: case insensitive filesystem */
public final class C17810X {

    /* renamed from: a  reason: collision with root package name */
    private final C17828p f146533a;

    /* renamed from: b  reason: collision with root package name */
    private final C17810X f146534b;

    /* renamed from: c  reason: collision with root package name */
    private final String f146535c;

    /* renamed from: d  reason: collision with root package name */
    private final String f146536d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<Integer, C15561h> f146537e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<Integer, C15561h> f146538f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, n0> f146539g;

    /* renamed from: qJ.X$a */
    /* synthetic */ class a extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final a f146540b = new a();

        a() {
            super(C17065b.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);
        }

        public Object get(Object obj) {
            return ((C17065b) obj).e();
        }
    }

    public C17810X(C17828p pVar, C17810X x10, List<s> list, String str, String str2) {
        Map<Integer, n0> map;
        C17542s.j(pVar, "c");
        C17542s.j(list, "typeParameterProtos");
        C17542s.j(str, "debugName");
        C17542s.j(str2, "containerPresentableName");
        this.f146533a = pVar;
        this.f146534b = x10;
        this.f146535c = str;
        this.f146536d = str2;
        this.f146537e = pVar.h().e(new C17805S(this));
        this.f146538f = pVar.h().e(new C17806T(this));
        if (list.isEmpty()) {
            map = X.j();
        } else {
            map = new LinkedHashMap<>();
            int i10 = 0;
            for (s sVar : list) {
                map.put(Integer.valueOf(sVar.H()), new C17922S(this.f146533a, sVar, i10));
                i10++;
            }
        }
        this.f146539g = map;
    }

    /* access modifiers changed from: private */
    public static final int A(q qVar) {
        C17542s.j(qVar, "it");
        return qVar.P();
    }

    /* access modifiers changed from: private */
    public static final C15561h f(C17810X x10, int i10) {
        return x10.g(i10);
    }

    private final C15561h g(int i10) {
        C17065b a10 = C17799L.a(this.f146533a.g(), i10);
        return a10.i() ? this.f146533a.c().b(a10) : C15578y.c(this.f146533a.c().q(), a10);
    }

    private final C18113f0 h(int i10) {
        if (C17799L.a(this.f146533a.g(), i10).i()) {
            return this.f146533a.c().o().a();
        }
        return null;
    }

    private final C15561h i(int i10) {
        C17065b a10 = C17799L.a(this.f146533a.g(), i10);
        if (a10.i()) {
            return null;
        }
        return C15578y.f(this.f146533a.c().q(), a10);
    }

    private final C18113f0 j(C18096U u10, C18096U u11) {
        C15429j n10 = C18755d.n(u10);
        C15649h annotations = u10.getAnnotations();
        C18096U k10 = C15428i.k(u10);
        List<C18096U> e10 = C15428i.e(u10);
        Iterable<E0> o02 = C16877v.o0(C15428i.m(u10), 1);
        ArrayList arrayList = new ArrayList(C16877v.y(o02, 10));
        for (E0 type : o02) {
            arrayList.add(type.getType());
        }
        return C15428i.b(n10, annotations, k10, e10, arrayList, (List<C17069f>) null, u11, true).U0(u10.O0());
    }

    private final C18113f0 k(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10) {
        C18113f0 f0Var;
        int size;
        int size2 = y0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            f0Var = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                y0 k10 = y0Var.p().Y(size).k();
                C17542s.i(k10, "getTypeConstructor(...)");
                f0Var = C18099X.k(u0Var, k10, list, z10, (g) null, 16, (Object) null);
            }
        } else {
            f0Var = l(u0Var, y0Var, list, z10);
        }
        return f0Var == null ? C18230l.f149170a.f(C18229k.INCONSISTENT_SUSPEND_FUNCTION, list, y0Var, new String[0]) : f0Var;
    }

    private final C18113f0 l(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10) {
        C18113f0 k10 = C18099X.k(u0Var, y0Var, list, z10, (g) null, 16, (Object) null);
        if (!C15428i.q(k10)) {
            return null;
        }
        return t(k10);
    }

    private final n0 n(int i10) {
        n0 n0Var = this.f146539g.get(Integer.valueOf(i10));
        if (n0Var != null) {
            return n0Var;
        }
        C17810X x10 = this.f146534b;
        if (x10 != null) {
            return x10.n(i10);
        }
        return null;
    }

    private static final List<q.b> p(q qVar, C17810X x10) {
        List<q.b> Q10 = qVar.Q();
        C17542s.i(Q10, "getArgumentList(...)");
        Collection collection = Q10;
        q j10 = f.j(qVar, x10.f146533a.j());
        List<q.b> p10 = j10 != null ? p(j10, x10) : null;
        if (p10 == null) {
            p10 = C16877v.n();
        }
        return C16877v.V0(collection, p10);
    }

    public static /* synthetic */ C18113f0 q(C17810X x10, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x10.o(qVar, z10);
    }

    /* access modifiers changed from: private */
    public static final List r(C17810X x10, q qVar) {
        return x10.f146533a.c().d().h(qVar, x10.f146533a.g());
    }

    private final u0 s(List<? extends t0> list, C15649h hVar, y0 y0Var, C15566m mVar) {
        Iterable<t0> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (t0 a10 : iterable) {
            arrayList.add(a10.a(hVar, y0Var, mVar));
        }
        return u0.f147932b.j(C16877v.A(arrayList));
    }

    private final C18113f0 t(C18096U u10) {
        C18096U type;
        E0 e02 = (E0) C16877v.K0(C15428i.m(u10));
        C17066c cVar = null;
        if (e02 == null || (type = e02.getType()) == null) {
            return null;
        }
        C15561h e10 = type.N0().e();
        C17066c o10 = e10 != null ? C17506e.o(e10) : null;
        if (type.L0().size() != 1 || (!C17542s.e(o10, C15435p.f133044v) && !C17542s.e(o10, C17811Y.f146541a))) {
            return (C18113f0) u10;
        }
        C18096U type2 = ((E0) C16877v.b1(type.L0())).getType();
        C17542s.i(type2, "getType(...)");
        C15566m e11 = this.f146533a.e();
        C15554a aVar = e11 instanceof C15554a ? (C15554a) e11 : null;
        if (aVar != null) {
            cVar = C17506e.k(aVar);
        }
        return C17542s.e(cVar, C17804Q.f146525a) ? j(u10, type2) : j(u10, type2);
    }

    /* access modifiers changed from: private */
    public static final C15561h v(C17810X x10, int i10) {
        return x10.i(i10);
    }

    private final E0 w(n0 n0Var, q.b bVar) {
        if (bVar.s() == q.b.c.STAR) {
            return n0Var == null ? new C18123k0(this.f146533a.c().q().p()) : new C18127m0(n0Var);
        }
        C17802O o10 = C17802O.f146513a;
        q.b.c s10 = bVar.s();
        C17542s.i(s10, "getProjection(...)");
        Q0 c10 = o10.c(s10);
        q p10 = f.p(bVar, this.f146533a.j());
        return p10 == null ? new G0(C18230l.d(C18229k.NO_RECORDED_TYPE, bVar.toString())) : new G0(c10, u(p10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: DI.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: DI.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: DI.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: DI.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final uJ.y0 x(XI.q r4) {
        /*
            r3 = this;
            boolean r0 = r4.g0()
            if (r0 == 0) goto L_0x0022
            nI.l<java.lang.Integer, DI.h> r0 = r3.f146537e
            int r1 = r4.R()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            DI.h r0 = (DI.C15561h) r0
            if (r0 != 0) goto L_0x00c0
            int r0 = r4.R()
            DI.e r0 = y(r3, r4, r0)
            goto L_0x00c0
        L_0x0022:
            boolean r0 = r4.p0()
            if (r0 == 0) goto L_0x0049
            int r0 = r4.c0()
            DI.n0 r0 = r3.n(r0)
            if (r0 != 0) goto L_0x00c0
            wJ.l r0 = wJ.C18230l.f149170a
            wJ.k r1 = wJ.C18229k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER
            int r4 = r4.c0()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r3.f146536d
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            wJ.j r4 = r0.e(r1, r4)
            return r4
        L_0x0049:
            boolean r0 = r4.q0()
            if (r0 == 0) goto L_0x00a0
            qJ.p r0 = r3.f146533a
            ZI.c r0 = r0.g()
            int r4 = r4.d0()
            java.lang.String r4 = r0.getString(r4)
            java.util.List r0 = r3.m()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0067:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r0.next()
            r2 = r1
            DI.n0 r2 = (DI.n0) r2
            cJ.f r2 = r2.getName()
            java.lang.String r2 = r2.b()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r4)
            if (r2 == 0) goto L_0x0067
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            r0 = r1
            DI.n0 r0 = (DI.n0) r0
            if (r0 != 0) goto L_0x00c0
            wJ.l r0 = wJ.C18230l.f149170a
            wJ.k r1 = wJ.C18229k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME
            qJ.p r2 = r3.f146533a
            DI.m r2 = r2.e()
            java.lang.String r2 = r2.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            wJ.j r4 = r0.e(r1, r4)
            return r4
        L_0x00a0:
            boolean r0 = r4.o0()
            if (r0 == 0) goto L_0x00ca
            nI.l<java.lang.Integer, DI.h> r0 = r3.f146538f
            int r1 = r4.b0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            DI.h r0 = (DI.C15561h) r0
            if (r0 != 0) goto L_0x00c0
            int r0 = r4.b0()
            DI.e r0 = y(r3, r4, r0)
        L_0x00c0:
            uJ.y0 r4 = r0.k()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            return r4
        L_0x00ca:
            wJ.l r4 = wJ.C18230l.f149170a
            wJ.k r0 = wJ.C18229k.UNKNOWN_TYPE
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            wJ.j r4 = r4.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qJ.C17810X.x(XI.q):uJ.y0");
    }

    private static final C15558e y(C17810X x10, q qVar, int i10) {
        C17065b a10 = C17799L.a(x10.f146533a.g(), i10);
        List b02 = C15768k.b0(C15768k.S(C15768k.q(qVar, new C17808V(x10)), C17809W.f146532a));
        int C10 = C15768k.C(C15768k.q(a10, a.f146540b));
        while (b02.size() < C10) {
            b02.add(0);
        }
        return x10.f146533a.c().r().d(a10, b02);
    }

    /* access modifiers changed from: private */
    public static final q z(C17810X x10, q qVar) {
        C17542s.j(qVar, "it");
        return f.j(qVar, x10.f146533a.j());
    }

    public final List<n0> m() {
        return C16877v.t1(this.f146539g.values());
    }

    public final C18113f0 o(q qVar, boolean z10) {
        C18113f0 f0Var;
        C18113f0 j10;
        q qVar2 = qVar;
        C17542s.j(qVar2, "proto");
        C18113f0 h10 = qVar.g0() ? h(qVar.R()) : qVar.o0() ? h(qVar.b0()) : null;
        if (h10 != null) {
            return h10;
        }
        y0 x10 = x(qVar);
        if (C18230l.m(x10.e())) {
            return C18230l.f149170a.c(C18229k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, x10, x10.toString());
        }
        C17924a aVar = new C17924a(this.f146533a.h(), new C17807U(this, qVar2));
        u0 s10 = s(this.f146533a.c().v(), aVar, x10, this.f146533a.e());
        Iterable p10 = p(qVar2, this);
        ArrayList arrayList = new ArrayList(C16877v.y(p10, 10));
        int i10 = 0;
        for (Object next : p10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            List<n0> parameters = x10.getParameters();
            C17542s.i(parameters, "getParameters(...)");
            arrayList.add(w((n0) C16877v.z0(parameters, i10), (q.b) next));
            i10 = i11;
        }
        List t12 = C16877v.t1(arrayList);
        C15561h e10 = x10.e();
        if (z10 && (e10 instanceof m0)) {
            C18113f0 c10 = C18099X.c((m0) e10, t12);
            f0Var = c10.U0(C18100Y.b(c10) || qVar.Y()).V0(s(this.f146533a.c().v(), C15649h.f134231V.a(C16877v.T0(aVar, c10.getAnnotations())), x10, this.f146533a.e()));
        } else if (C17005b.f140811a.d(qVar.U()).booleanValue()) {
            f0Var = k(s10, x10, t12, qVar.Y());
        } else {
            f0Var = C18099X.k(s10, x10, t12, qVar.Y(), (g) null, 16, (Object) null);
            if (C17005b.f140812b.d(qVar.U()).booleanValue()) {
                C18145z c11 = C18145z.a.c(C18145z.f147953d, f0Var, true, false, 4, (Object) null);
                if (c11 != null) {
                    f0Var = c11;
                } else {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + f0Var + '\'').toString());
                }
            }
        }
        q a10 = f.a(qVar2, this.f146533a.j());
        return (a10 == null || (j10 = C18121j0.j(f0Var, o(a10, false))) == null) ? f0Var : j10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f146535c);
        if (this.f146534b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f146534b.f146535c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final C18096U u(q qVar) {
        C17542s.j(qVar, "proto");
        if (!qVar.i0()) {
            return o(qVar, true);
        }
        String string = this.f146533a.g().getString(qVar.V());
        C18113f0 q10 = q(this, qVar, false, 2, (Object) null);
        q f10 = f.f(qVar, this.f146533a.j());
        C17542s.g(f10);
        return this.f146533a.c().m().a(qVar, string, q10, q(this, f10, false, 2, (Object) null));
    }
}
