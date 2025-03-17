package CI;

import AI.C15429j;
import CI.C15504k;
import DI.C15535F;
import DI.C15538I;
import DI.C15543N;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.C15565l;
import DI.C15566m;
import DI.C15572s;
import DI.C15573t;
import DI.C15578y;
import DI.C15579z;
import DI.h0;
import DI.i0;
import DI.u0;
import EI.C15648g;
import EI.C15649h;
import EJ.C15661b;
import EJ.C15671l;
import FI.C15685a;
import FI.C15687c;
import FI.C15688d;
import GI.C15714H;
import GI.C15741k;
import NI.j;
import QI.C16271n;
import QI.C16282z;
import VI.C16660B;
import VI.C16661C;
import VI.C16664F;
import XH.v;
import YH.C16877v;
import YH.g0;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import fI.C17221b;
import gJ.C17284o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nJ.C17656k;
import sJ.C17936m;
import tJ.C17981a;
import tJ.C17987g;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;
import uJ.C18096U;
import uJ.C18103a0;
import uJ.C18113f0;
import uJ.J0;

/* renamed from: CI.u  reason: case insensitive filesystem */
public final class C15514u implements C15685a, C15687c {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f133547i;

    /* renamed from: a  reason: collision with root package name */
    private final C15538I f133548a;

    /* renamed from: b  reason: collision with root package name */
    private final C15497d f133549b = C15497d.f133512a;

    /* renamed from: c  reason: collision with root package name */
    private final C17989i f133550c;

    /* renamed from: d  reason: collision with root package name */
    private final C18096U f133551d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i f133552e;

    /* renamed from: f  reason: collision with root package name */
    private final C17981a<C17066c, C15558e> f133553f;

    /* renamed from: g  reason: collision with root package name */
    private final C17989i f133554g;

    /* renamed from: h  reason: collision with root package name */
    private final C17987g<v<String, String>, C15649h> f133555h;

    /* renamed from: CI.u$a */
    private enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* renamed from: CI.u$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f133556a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                CI.u$a[] r0 = CI.C15514u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                CI.u$a r1 = CI.C15514u.a.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                CI.u$a r1 = CI.C15514u.a.DEPRECATED_LIST_METHODS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                CI.u$a r1 = CI.C15514u.a.NOT_CONSIDERED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                CI.u$a r1 = CI.C15514u.a.DROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                CI.u$a r1 = CI.C15514u.a.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f133556a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: CI.C15514u.b.<clinit>():void");
        }
    }

    /* renamed from: CI.u$c */
    public static final class c extends C15714H {
        c(C15538I i10, C17066c cVar) {
            super(i10, cVar);
        }

        /* renamed from: H0 */
        public C17656k.b q() {
            return C17656k.b.f144864b;
        }
    }

    /* renamed from: CI.u$d */
    public static final class d extends C15661b.C3305b<C15558e, a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f133557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<a> f133558b;

        d(String str, O<a> o10) {
            this.f133557a = str;
            this.f133558b = o10;
        }

        /* renamed from: d */
        public boolean c(C15558e eVar) {
            C17542s.j(eVar, "javaClassDescriptor");
            String a10 = C16660B.a(C16664F.f139318a, eVar, this.f133557a);
            C15517x xVar = C15517x.f133562a;
            if (xVar.f().contains(a10)) {
                this.f133558b.f144348a = a.HIDDEN;
            } else if (xVar.i().contains(a10)) {
                this.f133558b.f144348a = a.VISIBLE;
            } else if (xVar.c().contains(a10)) {
                this.f133558b.f144348a = a.DEPRECATED_LIST_METHODS;
            } else if (xVar.d().contains(a10)) {
                this.f133558b.f144348a = a.DROP;
            }
            return this.f133558b.f144348a == null;
        }

        /* renamed from: e */
        public a a() {
            a aVar = (a) this.f133558b.f144348a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    static {
        Class<C15514u> cls = C15514u.class;
        f133547i = new C18064m[]{P.h(new G(cls, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), P.h(new G(cls, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), P.h(new G(cls, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};
    }

    public C15514u(C15538I i10, C17994n nVar, C17631a<C15504k.b> aVar) {
        C17542s.j(i10, "moduleDescriptor");
        C17542s.j(nVar, "storageManager");
        C17542s.j(aVar, "settingsComputation");
        this.f133548a = i10;
        this.f133550c = nVar.d(aVar);
        this.f133551d = q(nVar);
        this.f133552e = nVar.d(new C15505l(this, nVar));
        this.f133553f = nVar.b();
        this.f133554g = nVar.d(new C15506m(this));
        this.f133555h = nVar.g(new C15507n(this));
    }

    private final a A(C15579z zVar) {
        C15566m b10 = zVar.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b11 = C15661b.b(C16877v.e((C15558e) b10), new C15513t(this), new d(C16661C.c(zVar, false, false, 3, (Object) null), new O()));
        C17542s.i(b11, "dfs(...)");
        return (a) b11;
    }

    /* access modifiers changed from: private */
    public static final Iterable B(C15514u uVar, C15558e eVar) {
        Collection<C18096U> a10 = eVar.k().a();
        C17542s.i(a10, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        for (C18096U N02 : a10) {
            C15561h e10 = N02.N0().e();
            C15558e eVar2 = null;
            C15561h a11 = e10 != null ? e10.a() : null;
            C15558e eVar3 = a11 instanceof C15558e ? (C15558e) a11 : null;
            if (eVar3 != null && (eVar2 = uVar.z(eVar3)) == null) {
                eVar2 = eVar3;
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }

    private final C15649h C() {
        return (C15649h) C17993m.a(this.f133554g, this, f133547i[2]);
    }

    private final C15504k.b D() {
        return (C15504k.b) C17993m.a(this.f133550c, this, f133547i[0]);
    }

    private final boolean E(h0 h0Var, boolean z10) {
        C15566m b10 = h0Var.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c10 = C16661C.c(h0Var, false, false, 3, (Object) null);
        if (z10 ^ C15517x.f133562a.g().contains(C16660B.a(C16664F.f139318a, (C15558e) b10, c10))) {
            return true;
        }
        Boolean e10 = C15661b.e(C16877v.e(h0Var), C15511r.f133544a, new C15512s(this));
        C17542s.i(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Iterable F(C15555b bVar) {
        return bVar.a().e();
    }

    /* access modifiers changed from: private */
    public static final Boolean G(C15514u uVar, C15555b bVar) {
        boolean z10;
        if (bVar.h() == C15555b.a.DECLARATION) {
            C15497d dVar = uVar.f133549b;
            C15566m b10 = bVar.b();
            C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (dVar.c((C15558e) b10)) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    private final boolean H(C15565l lVar, C15558e eVar) {
        if (lVar.j().size() == 1) {
            List<u0> j10 = lVar.j();
            C17542s.i(j10, "getValueParameters(...)");
            C15561h e10 = ((u0) C16877v.b1(j10)).getType().N0().e();
            if (C17542s.e(e10 != null ? C17506e.p(e10) : null, C17506e.p(eVar))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C15649h I(C15514u uVar) {
        return C15649h.f134231V.a(C16877v.e(C15648g.c(uVar.f133548a.p(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", (String) null, (String) null, true, 6, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C18113f0 o(C15514u uVar, C17994n nVar) {
        return C15578y.d(uVar.D().a(), C15500g.f133516d.a(), new C15543N(nVar, uVar.D().a())).r();
    }

    private final h0 p(C17936m mVar, h0 h0Var) {
        C15579z.a<? extends h0> x10 = h0Var.x();
        x10.l(mVar);
        x10.f(C15573t.f133853e);
        x10.t(mVar.r());
        x10.q(mVar.J0());
        Object g10 = x10.g();
        C17542s.g(g10);
        return (h0) g10;
    }

    private final C18096U q(C17994n nVar) {
        C15741k kVar = new C15741k(new c(this.f133548a, new C17066c("java.io")), C17069f.v("Serializable"), C15535F.ABSTRACT, C15559f.INTERFACE, C16877v.e(new C18103a0(nVar, new C15508o(this))), i0.f133841a, false, nVar);
        kVar.K0(C17656k.b.f144864b, g0.d(), (C15557d) null);
        C18113f0 r10 = kVar.r();
        C17542s.i(r10, "getDefaultType(...)");
        return r10;
    }

    /* access modifiers changed from: private */
    public static final C18096U r(C15514u uVar) {
        C18113f0 i10 = uVar.f133548a.p().i();
        C17542s.i(i10, "getAnyType(...)");
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C15649h s(C15514u uVar, v vVar) {
        C17542s.j(vVar, "<destruct>");
        String str = (String) vVar.b();
        return C15649h.f134231V.a(C16877v.e(C15648g.b(uVar.f133548a.p(), '\'' + ((String) vVar.a()) + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str + "()' stdlib extension instead", str + "()", "HIDDEN", false)));
    }

    private final Collection<h0> t(C15558e eVar, C17642l<? super C17656k, ? extends Collection<? extends h0>> lVar) {
        C16271n z10 = z(eVar);
        if (z10 == null) {
            return C16877v.n();
        }
        Iterable<C15558e> g10 = this.f133549b.g(C17506e.o(z10), C15495b.f133490h.a());
        C15558e eVar2 = (C15558e) C16877v.J0(g10);
        if (eVar2 == null) {
            return C16877v.n();
        }
        C15671l.b bVar = C15671l.f134268c;
        ArrayList arrayList = new ArrayList(C16877v.y(g10, 10));
        for (C15558e o10 : g10) {
            arrayList.add(C17506e.o(o10));
        }
        C15671l b10 = bVar.b(arrayList);
        boolean c10 = this.f133549b.c(eVar);
        C17656k X10 = this.f133553f.a(C17506e.o(z10), new C15510q(z10, eVar2)).X();
        C17542s.i(X10, "getUnsubstitutedMemberScope(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object next : (Iterable) lVar.invoke(X10)) {
            h0 h0Var = (h0) next;
            if (h0Var.h() == C15555b.a.DECLARATION && h0Var.getVisibility().d() && !C15429j.l0(h0Var)) {
                Collection<? extends C15579z> e10 = h0Var.e();
                C17542s.i(e10, "getOverriddenDescriptors(...)");
                Iterable iterable = e10;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C15566m b11 = ((C15579z) it.next()).b();
                        C17542s.i(b11, "getContainingDeclaration(...)");
                        if (b10.contains(C17506e.o(b11))) {
                            break;
                        }
                    }
                }
                if (!E(h0Var, c10)) {
                    arrayList2.add(next);
                }
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final C15558e u(C16271n nVar, C15558e eVar) {
        j jVar = j.f136563a;
        C17542s.i(jVar, "EMPTY");
        return nVar.P0(jVar, eVar);
    }

    private final C18113f0 v() {
        return (C18113f0) C17993m.a(this.f133552e, this, f133547i[1]);
    }

    private static final boolean w(C15565l lVar, J0 j02, C15565l lVar2) {
        return C17284o.x(lVar, lVar2.c(j02)) == C17284o.i.a.OVERRIDABLE;
    }

    /* access modifiers changed from: private */
    public static final Collection x(C17069f fVar, C17656k kVar) {
        C17542s.j(kVar, "it");
        return kVar.d(fVar, LI.d.FROM_BUILTINS);
    }

    private final C16271n z(C15558e eVar) {
        C17065b n10;
        C17066c a10;
        if (C15429j.b0(eVar) || !C15429j.C0(eVar)) {
            return null;
        }
        C17067d p10 = C17506e.p(eVar);
        if (!p10.f() || (n10 = C15496c.f133492a.n(p10)) == null || (a10 = n10.a()) == null) {
            return null;
        }
        C15558e d10 = C15572s.d(D().a(), a10, LI.d.FROM_BUILTINS);
        if (d10 instanceof C16271n) {
            return (C16271n) d10;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<DI.h0> a(cJ.C17069f r7, DI.C15558e r8) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            CI.a$a r0 = CI.C15494a.f133488e
            cJ.f r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r7, r0)
            if (r0 == 0) goto L_0x0093
            boolean r0 = r8 instanceof sJ.C17936m
            if (r0 == 0) goto L_0x0093
            boolean r0 = AI.C15429j.e0(r8)
            if (r0 == 0) goto L_0x0093
            sJ.m r8 = (sJ.C17936m) r8
            XI.c r0 = r8.e1()
            java.util.List r0 = r0.C0()
            java.lang.String r1 = "getFunctionList(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x003f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()
            XI.i r1 = (XI.i) r1
            qJ.p r2 = r8.d1()
            ZI.c r2 = r2.g()
            int r1 = r1.Y()
            cJ.f r1 = qJ.C17799L.b(r2, r1)
            CI.a$a r2 = CI.C15494a.f133488e
            cJ.f r2 = r2.a()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 == 0) goto L_0x0043
            java.util.List r7 = YH.C16877v.n()
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x0072:
            uJ.f0 r0 = r6.v()
            nJ.k r0 = r0.q()
            LI.d r1 = LI.d.FROM_BUILTINS
            java.util.Collection r7 = r0.d(r7, r1)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = YH.C16877v.a1(r7)
            DI.h0 r7 = (DI.h0) r7
            DI.h0 r7 = r6.p(r8, r7)
            java.util.List r7 = YH.C16877v.e(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x0093:
            CI.k$b r0 = r6.D()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x00a4
            java.util.List r7 = YH.C16877v.n()
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x00a4:
            CI.p r0 = new CI.p
            r0.<init>(r7)
            java.util.Collection r7 = r6.t(r8, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01a4
            java.lang.Object r1 = r7.next()
            DI.h0 r1 = (DI.h0) r1
            DI.m r2 = r1.b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C17542s.h(r2, r3)
            DI.e r2 = (DI.C15558e) r2
            uJ.z0 r2 = CI.C15518y.a(r2, r8)
            uJ.J0 r2 = r2.c()
            DI.z r2 = r1.c(r2)
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            kotlin.jvm.internal.C17542s.h(r2, r3)
            DI.h0 r2 = (DI.h0) r2
            DI.z$a r2 = r2.x()
            r2.l(r8)
            DI.d0 r3 = r8.J0()
            r2.q(r3)
            r2.n()
            CI.u$a r3 = r6.A(r1)
            int[] r4 = CI.C15514u.b.f133556a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0189
            r4 = 2
            if (r3 == r4) goto L_0x0121
            r1 = 3
            if (r3 == r1) goto L_0x0119
            r1 = 4
            if (r3 == r1) goto L_0x019d
            r1 = 5
            if (r3 != r1) goto L_0x0113
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x0193
        L_0x0113:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x0119:
            EI.h r1 = r6.C()
            r2.i(r1)
            goto L_0x0193
        L_0x0121:
            cJ.f r3 = r1.getName()
            cJ.f r4 = CI.C15515v.f133559a
            boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r4 == 0) goto L_0x0146
            tJ.g<XH.v<java.lang.String, java.lang.String>, EI.h> r3 = r6.f133555h
            cJ.f r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r4 = "first"
            XH.v r1 = XH.C16796C.a(r1, r4)
            java.lang.Object r1 = r3.invoke(r1)
            EI.h r1 = (EI.C15649h) r1
            goto L_0x0166
        L_0x0146:
            cJ.f r4 = CI.C15515v.f133560b
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x016a
            tJ.g<XH.v<java.lang.String, java.lang.String>, EI.h> r3 = r6.f133555h
            cJ.f r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r4 = "last"
            XH.v r1 = XH.C16796C.a(r1, r4)
            java.lang.Object r1 = r3.invoke(r1)
            EI.h r1 = (EI.C15649h) r1
        L_0x0166:
            r2.i(r1)
            goto L_0x0193
        L_0x016a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unexpected name: "
            r8.append(r0)
            cJ.f r0 = r1.getName()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0189:
            boolean r1 = DI.C15536G.a(r8)
            if (r1 == 0) goto L_0x0190
            goto L_0x019d
        L_0x0190:
            r2.e()
        L_0x0193:
            DI.z r1 = r2.g()
            kotlin.jvm.internal.C17542s.g(r1)
            r5 = r1
            DI.h0 r5 = (DI.h0) r5
        L_0x019d:
            if (r5 == 0) goto L_0x00b8
            r0.add(r5)
            goto L_0x00b8
        L_0x01a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: CI.C15514u.a(cJ.f, DI.e):java.util.Collection");
    }

    public boolean b(C15558e eVar, h0 h0Var) {
        C17542s.j(eVar, "classDescriptor");
        C17542s.j(h0Var, "functionDescriptor");
        C16271n z10 = z(eVar);
        if (z10 == null || !h0Var.getAnnotations().f2(C15688d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String c10 = C16661C.c(h0Var, false, false, 3, (Object) null);
        C16282z U02 = z10.X();
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        Iterable<h0> d10 = U02.d(name, LI.d.FROM_BUILTINS);
        if (!(d10 instanceof Collection) || !((Collection) d10).isEmpty()) {
            for (h0 c11 : d10) {
                if (C17542s.e(C16661C.c(c11, false, false, 3, (Object) null), c10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Collection<C18096U> c(C15558e eVar) {
        C17542s.j(eVar, "classDescriptor");
        C17067d p10 = C17506e.p(eVar);
        C15517x xVar = C15517x.f133562a;
        if (!xVar.j(p10)) {
            return xVar.k(p10) ? C16877v.e(this.f133551d) : C16877v.n();
        }
        return C16877v.q(v(), this.f133551d);
    }

    public Collection<C15557d> d(C15558e eVar) {
        C17542s.j(eVar, "classDescriptor");
        if (eVar.h() != C15559f.CLASS || !D().b()) {
            return C16877v.n();
        }
        C16271n z10 = z(eVar);
        if (z10 == null) {
            return C16877v.n();
        }
        C15558e f10 = C15497d.f(this.f133549b, C17506e.o(z10), C15495b.f133490h.a(), (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return C16877v.n();
        }
        J0 c10 = C15518y.a(f10, z10).c();
        ArrayList<C15557d> arrayList = new ArrayList<>();
        for (Object next : z10.l()) {
            C15557d dVar = (C15557d) next;
            if (dVar.getVisibility().d()) {
                Collection<C15557d> l10 = f10.l();
                C17542s.i(l10, "getConstructors(...)");
                Iterable iterable = l10;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C15557d dVar2 = (C15557d) it.next();
                        C17542s.g(dVar2);
                        if (w(dVar2, c10, dVar)) {
                            break;
                        }
                    }
                }
                if (!H(dVar, eVar) && !C15429j.l0(dVar) && !C15517x.f133562a.e().contains(C16660B.a(C16664F.f139318a, z10, C16661C.c(dVar, false, false, 3, (Object) null)))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (C15557d dVar3 : arrayList) {
            C15579z.a<? extends C15579z> x10 = dVar3.x();
            x10.l(eVar);
            x10.t(eVar.r());
            x10.n();
            x10.d(c10.j());
            if (!C15517x.f133562a.h().contains(C16660B.a(C16664F.f139318a, z10, C16661C.c(dVar3, false, false, 3, (Object) null)))) {
                x10.i(C());
            }
            Object g10 = x10.g();
            C17542s.h(g10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C15557d) g10);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = (r2 = r2.U0()).a();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<cJ.C17069f> e(DI.C15558e r2) {
        /*
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            CI.k$b r0 = r1.D()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0014
            java.util.Set r2 = YH.g0.d()
            return r2
        L_0x0014:
            QI.n r2 = r1.z(r2)
            if (r2 == 0) goto L_0x0026
            QI.z r2 = r2.X()
            if (r2 == 0) goto L_0x0026
            java.util.Set r2 = r2.a()
            if (r2 != 0) goto L_0x002a
        L_0x0026:
            java.util.Set r2 = YH.g0.d()
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: CI.C15514u.e(DI.e):java.util.Set");
    }
}
