package QI;

import AI.C15429j;
import AI.C15435p;
import CI.C15518y;
import DI.C15535F;
import DI.C15543N;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.C15566m;
import DI.C15573t;
import DI.C15574u;
import DI.l0;
import DI.n0;
import DI.r0;
import DI.s0;
import DI.y0;
import EI.C15644c;
import EI.C15649h;
import EJ.C15660a;
import GI.C15740j;
import GJ.C15765h;
import LI.d;
import MI.C16048I;
import MI.V;
import MI.r;
import OI.C16161c;
import PI.C16193c;
import PI.C16198h;
import PI.C16201k;
import RI.C16377a;
import RI.C16378b;
import TI.C16497a;
import TI.C16503g;
import TI.j;
import TI.x;
import TI.y;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.U;
import YH.g0;
import bI.C17035a;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17068e;
import iJ.C17391y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17652g;
import nJ.C17656k;
import qJ.C17835w;
import tI.C17974j;
import tJ.C17989i;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18104b;
import uJ.C18113f0;
import uJ.G0;
import uJ.L0;
import uJ.Q0;
import uJ.u0;
import vJ.g;

/* renamed from: QI.n  reason: case insensitive filesystem */
public final class C16271n extends C15740j implements C16161c {

    /* renamed from: y  reason: collision with root package name */
    public static final a f137505y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    private static final Set<String> f137506z = g0.h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i  reason: collision with root package name */
    private final C16201k f137507i;

    /* renamed from: j  reason: collision with root package name */
    private final C16503g f137508j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C15558e f137509k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C16201k f137510l;

    /* renamed from: m  reason: collision with root package name */
    private final C16824o f137511m;

    /* renamed from: n  reason: collision with root package name */
    private final C15559f f137512n;

    /* renamed from: o  reason: collision with root package name */
    private final C15535F f137513o;

    /* renamed from: p  reason: collision with root package name */
    private final y0 f137514p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f137515q;

    /* renamed from: r  reason: collision with root package name */
    private final b f137516r;

    /* renamed from: s  reason: collision with root package name */
    private final C16282z f137517s;

    /* renamed from: t  reason: collision with root package name */
    private final DI.g0<C16282z> f137518t;

    /* renamed from: u  reason: collision with root package name */
    private final C17652g f137519u;

    /* renamed from: v  reason: collision with root package name */
    private final a0 f137520v;

    /* renamed from: w  reason: collision with root package name */
    private final C15649h f137521w;

    /* renamed from: x  reason: collision with root package name */
    private final C17989i<List<n0>> f137522x;

    /* renamed from: QI.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: QI.n$b */
    private final class b extends C18104b {

        /* renamed from: d  reason: collision with root package name */
        private final C17989i<List<n0>> f137523d;

        public b() {
            super(C16271n.this.f137510l.e());
            this.f137523d = C16271n.this.f137510l.e().d(new C16272o(C16271n.this));
        }

        private final C18096U L() {
            C17066c cVar;
            ArrayList arrayList;
            C17066c M10 = M();
            if (M10 == null || M10.c() || !M10.h(C15435p.f133048z)) {
                M10 = null;
            }
            if (M10 == null) {
                cVar = r.f136387a.b(C17506e.o(C16271n.this));
                if (cVar == null) {
                    return null;
                }
            } else {
                cVar = M10;
            }
            C15558e B10 = C17506e.B(C16271n.this.f137510l.d(), cVar, d.FROM_JAVA_LOADER);
            if (B10 == null) {
                return null;
            }
            int size = B10.k().getParameters().size();
            List<n0> parameters = C16271n.this.k().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                Iterable<n0> iterable = parameters;
                arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (n0 r10 : iterable) {
                    arrayList.add(new G0(Q0.INVARIANT, r10.r()));
                }
            } else if (size2 != 1 || size <= 1 || M10 != null) {
                return null;
            } else {
                G0 g02 = new G0(Q0.INVARIANT, ((n0) C16877v.b1(parameters)).r());
                C17974j jVar = new C17974j(1, size);
                ArrayList arrayList2 = new ArrayList(C16877v.y(jVar, 10));
                Iterator it = jVar.iterator();
                while (it.hasNext()) {
                    ((U) it).c();
                    arrayList2.add(g02);
                }
                arrayList = arrayList2;
            }
            return C18099X.h(u0.f147932b.k(), B10, arrayList);
        }

        private final C17066c M() {
            String str;
            C15649h annotations = C16271n.this.getAnnotations();
            C17066c cVar = C16048I.f136306r;
            C17542s.i(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            C15644c v10 = annotations.v(cVar);
            if (v10 == null) {
                return null;
            }
            Object c12 = C16877v.c1(v10.a().values());
            C17391y yVar = c12 instanceof C17391y ? (C17391y) c12 : null;
            if (yVar == null || (str = (String) yVar.b()) == null || !C17068e.e(str)) {
                return null;
            }
            return new C17066c(str);
        }

        /* access modifiers changed from: private */
        public static final List N(C16271n nVar) {
            return r0.g(nVar);
        }

        /* renamed from: J */
        public C15558e e() {
            return C16271n.this;
        }

        public boolean f() {
            return true;
        }

        public List<n0> getParameters() {
            return (List) this.f137523d.invoke();
        }

        /* access modifiers changed from: protected */
        public Collection<C18096U> s() {
            Object obj;
            Collection<j> a10 = C16271n.this.S0().a();
            ArrayList arrayList = new ArrayList(a10.size());
            ArrayList<x> arrayList2 = new ArrayList<>(0);
            C18096U L10 = L();
            Iterator<j> it = a10.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                j next = it.next();
                C18096U q10 = C16271n.this.f137510l.a().r().q(C16271n.this.f137510l.g().p(next, C16378b.b(L0.SUPERTYPE, false, false, (n0) null, 7, (Object) null)), C16271n.this.f137510l);
                if (q10.N0().e() instanceof C15543N.b) {
                    arrayList2.add(next);
                }
                uJ.y0 N02 = q10.N0();
                if (L10 != null) {
                    obj = L10.N0();
                }
                if (!C17542s.e(N02, obj) && !C15429j.c0(q10)) {
                    arrayList.add(q10);
                }
            }
            C15558e K02 = C16271n.this.f137509k;
            if (K02 != null) {
                obj = C15518y.a(K02, C16271n.this).c().p(K02.r(), Q0.INVARIANT);
            }
            C15660a.a(arrayList, obj);
            C15660a.a(arrayList, L10);
            if (!arrayList2.isEmpty()) {
                C17835w c10 = C16271n.this.f137510l.a().c();
                C15558e J10 = e();
                ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
                for (x xVar : arrayList2) {
                    C17542s.h(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((j) xVar).F());
                }
                c10.b(J10, arrayList3);
            }
            return !arrayList.isEmpty() ? C16877v.t1(arrayList) : C16877v.e(C16271n.this.f137510l.d().p().i());
        }

        public String toString() {
            String b10 = C16271n.this.getName().b();
            C17542s.i(b10, "asString(...)");
            return b10;
        }

        /* access modifiers changed from: protected */
        public l0 w() {
            return C16271n.this.f137510l.a().v();
        }
    }

    /* renamed from: QI.n$c */
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(C17506e.o((C15558e) t10).a(), C17506e.o((C15558e) t11).a());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16271n(C16201k kVar, C15566m mVar, C16503g gVar, C15558e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, mVar, gVar, (i10 & 8) != 0 ? null : eVar);
    }

    /* access modifiers changed from: private */
    public static final List Q0(C16271n nVar) {
        Iterable<y> typeParameters = nVar.f137508j.getTypeParameters();
        ArrayList arrayList = new ArrayList(C16877v.y(typeParameters, 10));
        for (y yVar : typeParameters) {
            n0 a10 = nVar.f137510l.f().a(yVar);
            if (a10 != null) {
                arrayList.add(a10);
            } else {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + nVar.f137508j + ", so it must be resolved");
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List W0(C16271n nVar) {
        C17065b n10 = C17506e.n(nVar);
        if (n10 != null) {
            return nVar.f137507i.a().f().a(n10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16282z X0(C16271n nVar, g gVar) {
        C17542s.j(gVar, "it");
        return new C16282z(nVar.f137510l, nVar, nVar.f137508j, nVar.f137509k != null, nVar.f137517s);
    }

    public C15557d F() {
        return null;
    }

    public boolean I0() {
        return false;
    }

    public final C16271n P0(NI.j jVar, C15558e eVar) {
        C17542s.j(jVar, "javaResolverCache");
        C16201k kVar = this.f137510l;
        C16201k m10 = C16193c.m(kVar, kVar.a().x(jVar));
        C15566m b10 = b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        return new C16271n(m10, b10, this.f137508j, eVar);
    }

    /* renamed from: R0 */
    public List<C15557d> l() {
        return (List) this.f137517s.a1().invoke();
    }

    public final C16503g S0() {
        return this.f137508j;
    }

    public final List<C16497a> T0() {
        return (List) this.f137511m.getValue();
    }

    public C17656k U() {
        return this.f137519u;
    }

    /* renamed from: U0 */
    public C16282z X() {
        C17656k X10 = super.X();
        C17542s.h(X10, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C16282z) X10;
    }

    public s0<C18113f0> V() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public C16282z j0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this.f137518t.c(gVar);
    }

    public boolean Y() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean g0() {
        return false;
    }

    public C15649h getAnnotations() {
        return this.f137521w;
    }

    public C15574u getVisibility() {
        if (!C17542s.e(this.f137514p, C15573t.f133849a) || this.f137508j.h() != null) {
            return V.d(this.f137514p);
        }
        C15574u uVar = MI.y.f136402a;
        C17542s.g(uVar);
        return uVar;
    }

    public C15559f h() {
        return this.f137512n;
    }

    public boolean isInline() {
        return false;
    }

    public uJ.y0 k() {
        return this.f137516r;
    }

    public Collection<C15558e> m() {
        if (this.f137513o != C15535F.SEALED) {
            return C16877v.n();
        }
        C16377a b10 = C16378b.b(L0.COMMON, false, false, (n0) null, 7, (Object) null);
        C15765h<j> D10 = this.f137508j.D();
        ArrayList arrayList = new ArrayList();
        for (j p10 : D10) {
            C15561h e10 = this.f137510l.g().p(p10, b10).N0().e();
            C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return C16877v.g1(arrayList, new c());
    }

    public boolean m0() {
        return false;
    }

    public boolean n() {
        return this.f137515q;
    }

    public C17656k o0() {
        return this.f137520v;
    }

    public C15558e p0() {
        return null;
    }

    public List<n0> t() {
        return (List) this.f137522x.invoke();
    }

    public String toString() {
        return "Lazy Java class " + C17506e.p(this);
    }

    public C15535F u() {
        return this.f137513o;
    }

    public boolean v() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16271n(C16201k kVar, C15566m mVar, C16503g gVar, C15558e eVar) {
        super(kVar.e(), mVar, gVar.getName(), kVar.a().t().a(gVar), false);
        C15559f fVar;
        C15535F f10;
        C15558e eVar2 = eVar;
        C17542s.j(kVar, "outerContext");
        C17542s.j(mVar, "containingDeclaration");
        C17542s.j(gVar, "jClass");
        this.f137507i = kVar;
        this.f137508j = gVar;
        this.f137509k = eVar2;
        C16201k f11 = C16193c.f(kVar, this, gVar, 0, 4, (Object) null);
        this.f137510l = f11;
        f11.a().h().b(gVar, this);
        gVar.M();
        this.f137511m = C16825p.b(new C16268k(this));
        if (gVar.o()) {
            fVar = C15559f.ANNOTATION_CLASS;
        } else if (gVar.L()) {
            fVar = C15559f.INTERFACE;
        } else if (gVar.x()) {
            fVar = C15559f.ENUM_CLASS;
        } else {
            fVar = C15559f.CLASS;
        }
        this.f137512n = fVar;
        if (gVar.o() || gVar.x()) {
            f10 = C15535F.FINAL;
        } else {
            f10 = C15535F.Companion.a(gVar.c(), gVar.c() || gVar.isAbstract() || gVar.L(), !gVar.isFinal());
        }
        this.f137513o = f10;
        this.f137514p = gVar.getVisibility();
        this.f137515q = gVar.h() != null && !gVar.g();
        this.f137516r = new b();
        C16282z zVar = new C16282z(f11, this, gVar, eVar2 != null, (C16282z) null, 16, (DefaultConstructorMarker) null);
        this.f137517s = zVar;
        this.f137518t = DI.g0.f133835e.a(this, f11.e(), f11.a().k().c(), new C16269l(this));
        this.f137519u = new C17652g(zVar);
        this.f137520v = new a0(f11, gVar, this);
        this.f137521w = C16198h.a(f11, gVar);
        this.f137522x = f11.e().d(new C16270m(this));
    }
}
