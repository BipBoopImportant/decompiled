package QI;

import AI.C15429j;
import DI.C15535F;
import DI.C15554a;
import DI.C15566m;
import DI.a0;
import DI.d0;
import DI.h0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import EJ.C15660a;
import GI.C15717K;
import LI.C16015b;
import LI.d;
import MI.V;
import OI.C16163e;
import OI.C16164f;
import PI.C16193c;
import PI.C16198h;
import PI.C16201k;
import RI.C16378b;
import TI.n;
import TI.r;
import TI.y;
import VI.C16661C;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import cJ.C17069f;
import gJ.C17277h;
import gJ.C17278i;
import gJ.C17287r;
import iJ.C17373g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nJ.C17648c;
import nJ.C17649d;
import nJ.C17656k;
import nJ.C17657l;
import tJ.C17987g;
import tJ.C17988h;
import tJ.C17989i;
import tJ.C17990j;
import tJ.C17993m;
import uI.C18064m;
import uJ.C18096U;
import uJ.L0;
import uJ.M0;

public abstract class U extends C17657l {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f137444m;

    /* renamed from: b  reason: collision with root package name */
    private final C16201k f137445b;

    /* renamed from: c  reason: collision with root package name */
    private final U f137446c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i<Collection<C15566m>> f137447d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i<C16260c> f137448e;

    /* renamed from: f  reason: collision with root package name */
    private final C17987g<C17069f, Collection<h0>> f137449f;

    /* renamed from: g  reason: collision with root package name */
    private final C17988h<C17069f, a0> f137450g;

    /* renamed from: h  reason: collision with root package name */
    private final C17987g<C17069f, Collection<h0>> f137451h;

    /* renamed from: i  reason: collision with root package name */
    private final C17989i f137452i;

    /* renamed from: j  reason: collision with root package name */
    private final C17989i f137453j;

    /* renamed from: k  reason: collision with root package name */
    private final C17989i f137454k;

    /* renamed from: l  reason: collision with root package name */
    private final C17987g<C17069f, List<a0>> f137455l;

    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C18096U f137456a;

        /* renamed from: b  reason: collision with root package name */
        private final C18096U f137457b;

        /* renamed from: c  reason: collision with root package name */
        private final List<u0> f137458c;

        /* renamed from: d  reason: collision with root package name */
        private final List<n0> f137459d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137460e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f137461f;

        public a(C18096U u10, C18096U u11, List<? extends u0> list, List<? extends n0> list2, boolean z10, List<String> list3) {
            C17542s.j(u10, "returnType");
            C17542s.j(list, "valueParameters");
            C17542s.j(list2, "typeParameters");
            C17542s.j(list3, "errors");
            this.f137456a = u10;
            this.f137457b = u11;
            this.f137458c = list;
            this.f137459d = list2;
            this.f137460e = z10;
            this.f137461f = list3;
        }

        public final List<String> a() {
            return this.f137461f;
        }

        public final boolean b() {
            return this.f137460e;
        }

        public final C18096U c() {
            return this.f137457b;
        }

        public final C18096U d() {
            return this.f137456a;
        }

        public final List<n0> e() {
            return this.f137459d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f137456a, aVar.f137456a) && C17542s.e(this.f137457b, aVar.f137457b) && C17542s.e(this.f137458c, aVar.f137458c) && C17542s.e(this.f137459d, aVar.f137459d) && this.f137460e == aVar.f137460e && C17542s.e(this.f137461f, aVar.f137461f);
        }

        public final List<u0> f() {
            return this.f137458c;
        }

        public int hashCode() {
            int hashCode = this.f137456a.hashCode() * 31;
            C18096U u10 = this.f137457b;
            return ((((((((hashCode + (u10 == null ? 0 : u10.hashCode())) * 31) + this.f137458c.hashCode()) * 31) + this.f137459d.hashCode()) * 31) + Boolean.hashCode(this.f137460e)) * 31) + this.f137461f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f137456a + ", receiverType=" + this.f137457b + ", valueParameters=" + this.f137458c + ", typeParameters=" + this.f137459d + ", hasStableParameterNames=" + this.f137460e + ", errors=" + this.f137461f + ')';
        }
    }

    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<u0> f137462a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f137463b;

        public b(List<? extends u0> list, boolean z10) {
            C17542s.j(list, "descriptors");
            this.f137462a = list;
            this.f137463b = z10;
        }

        public final List<u0> a() {
            return this.f137462a;
        }

        public final boolean b() {
            return this.f137463b;
        }
    }

    static {
        Class<U> cls = U.class;
        f137444m = new C18064m[]{P.h(new G(cls, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), P.h(new G(cls, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), P.h(new G(cls, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(C16201k kVar, U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? null : u10);
    }

    private final C15717K E(n nVar) {
        C16164f f12 = C16164f.f1(R(), C16198h.a(this.f137445b, nVar), C15535F.FINAL, V.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f137445b.a().t().a(nVar), U(nVar));
        C17542s.i(f12, "create(...)");
        return f12;
    }

    /* access modifiers changed from: private */
    public static final a0 F(U u10, C17069f fVar) {
        C17542s.j(fVar, "name");
        U u11 = u10.f137446c;
        if (u11 != null) {
            return u11.f137450g.invoke(fVar);
        }
        n f10 = ((C16260c) u10.f137448e.invoke()).f(fVar);
        if (f10 == null || f10.K()) {
            return null;
        }
        return u10.a0(f10);
    }

    /* access modifiers changed from: private */
    public static final Collection G(U u10, C17069f fVar) {
        C17542s.j(fVar, "name");
        U u11 = u10.f137446c;
        if (u11 != null) {
            return u11.f137449f.invoke(fVar);
        }
        ArrayList arrayList = new ArrayList();
        for (r next : ((C16260c) u10.f137448e.invoke()).c(fVar)) {
            C16163e Z10 = u10.Z(next);
            if (u10.V(Z10)) {
                u10.f137445b.a().h().d(next, Z10);
                arrayList.add(Z10);
            }
        }
        u10.y(arrayList, fVar);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C16260c H(U u10) {
        return u10.z();
    }

    /* access modifiers changed from: private */
    public static final Set I(U u10) {
        return u10.x(C17649d.f144842v, (C17642l<? super C17069f, Boolean>) null);
    }

    /* access modifiers changed from: private */
    public static final Collection J(U u10, C17069f fVar) {
        C17542s.j(fVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(u10.f137449f.invoke(fVar));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, fVar);
        return C16877v.t1(u10.f137445b.a().r().p(u10.f137445b, linkedHashSet));
    }

    private final Set<C17069f> M() {
        return (Set) C17993m.a(this.f137454k, this, f137444m[2]);
    }

    private final Set<C17069f> P() {
        return (Set) C17993m.a(this.f137452i, this, f137444m[0]);
    }

    private final Set<C17069f> S() {
        return (Set) C17993m.a(this.f137453j, this, f137444m[1]);
    }

    private final C18096U T(n nVar) {
        C18096U p10 = this.f137445b.g().p(nVar.getType(), C16378b.b(L0.COMMON, false, false, (n0) null, 7, (Object) null));
        if ((!C15429j.t0(p10) && !C15429j.w0(p10)) || !U(nVar) || !nVar.P()) {
            return p10;
        }
        C18096U n10 = M0.n(p10);
        C17542s.i(n10, "makeNotNullable(...)");
        return n10;
    }

    private final boolean U(n nVar) {
        return nVar.isFinal() && nVar.g();
    }

    /* access modifiers changed from: private */
    public static final List W(U u10, C17069f fVar) {
        C17542s.j(fVar, "name");
        ArrayList arrayList = new ArrayList();
        C15660a.a(arrayList, u10.f137450g.invoke(fVar));
        u10.C(fVar, arrayList);
        return C17278i.t(u10.R()) ? C16877v.t1(arrayList) : C16877v.t1(u10.f137445b.a().r().p(u10.f137445b, arrayList));
    }

    /* access modifiers changed from: private */
    public static final Set X(U u10) {
        return u10.D(C17649d.f144843w, (C17642l<? super C17069f, Boolean>) null);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [DI.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final DI.a0 a0(TI.n r10) {
        /*
            r9 = this;
            kotlin.jvm.internal.O r0 = new kotlin.jvm.internal.O
            r0.<init>()
            GI.K r1 = r9.E(r10)
            r0.f144348a = r1
            r2 = 0
            r1.V0(r2, r2, r2, r2)
            uJ.U r4 = r9.T(r10)
            T r1 = r0.f144348a
            r3 = r1
            GI.K r3 = (GI.C15717K) r3
            java.util.List r5 = YH.C16877v.n()
            DI.d0 r6 = r9.O()
            r7 = 0
            java.util.List r8 = YH.C16877v.n()
            r3.b1(r4, r5, r6, r7, r8)
            DI.m r1 = r9.R()
            boolean r3 = r1 instanceof DI.C15558e
            if (r3 == 0) goto L_0x0033
            r2 = r1
            DI.e r2 = (DI.C15558e) r2
        L_0x0033:
            if (r2 == 0) goto L_0x004b
            PI.k r1 = r9.f137445b
            PI.d r1 = r1.a()
            lJ.f r1 = r1.w()
            T r3 = r0.f144348a
            GI.K r3 = (GI.C15717K) r3
            PI.k r4 = r9.f137445b
            GI.K r1 = r1.e(r2, r3, r4)
            r0.f144348a = r1
        L_0x004b:
            T r1 = r0.f144348a
            r2 = r1
            DI.v0 r2 = (DI.v0) r2
            GI.K r1 = (GI.C15717K) r1
            uJ.U r1 = r1.getType()
            boolean r1 = gJ.C17278i.K(r2, r1)
            if (r1 == 0) goto L_0x0068
            T r1 = r0.f144348a
            GI.K r1 = (GI.C15717K) r1
            QI.I r2 = new QI.I
            r2.<init>(r9, r10, r0)
            r1.L0(r2)
        L_0x0068:
            PI.k r1 = r9.f137445b
            PI.d r1 = r1.a()
            NI.j r1 = r1.h()
            T r2 = r0.f144348a
            DI.a0 r2 = (DI.a0) r2
            r1.c(r10, r2)
            T r10 = r0.f144348a
            DI.a0 r10 = (DI.a0) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.U.a0(TI.n):DI.a0");
    }

    /* access modifiers changed from: private */
    public static final C17990j b0(U u10, n nVar, O o10) {
        return u10.f137445b.e().a(new J(u10, nVar, o10));
    }

    /* access modifiers changed from: private */
    public static final C17373g c0(U u10, n nVar, O o10) {
        return u10.f137445b.a().g().a(nVar, (a0) o10.f144348a);
    }

    private final void e0(Set<h0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : set) {
            String c10 = C16661C.c((h0) next, false, false, 2, (Object) null);
            Object obj = linkedHashMap.get(c10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c10, obj);
            }
            ((List) obj).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collection = list;
                Collection b10 = C17287r.b(collection, T.f137443a);
                set.removeAll(collection);
                set.addAll(b10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C15554a f0(h0 h0Var) {
        C17542s.j(h0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return h0Var;
    }

    /* access modifiers changed from: private */
    public static final Collection t(U u10) {
        return u10.w(C17649d.f144835o, C17656k.f144861a.c());
    }

    /* access modifiers changed from: private */
    public static final Set u(U u10) {
        return u10.v(C17649d.f144840t, (C17642l<? super C17069f, Boolean>) null);
    }

    /* access modifiers changed from: protected */
    public final C18096U A(r rVar, C16201k kVar) {
        C17542s.j(rVar, "method");
        C17542s.j(kVar, "c");
        return kVar.g().p(rVar.getReturnType(), C16378b.b(L0.COMMON, rVar.Q().o(), false, (n0) null, 6, (Object) null));
    }

    /* access modifiers changed from: protected */
    public abstract void B(Collection<h0> collection, C17069f fVar);

    /* access modifiers changed from: protected */
    public abstract void C(C17069f fVar, Collection<a0> collection);

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> D(C17649d dVar, C17642l<? super C17069f, Boolean> lVar);

    /* access modifiers changed from: protected */
    public final C17989i<Collection<C15566m>> K() {
        return this.f137447d;
    }

    /* access modifiers changed from: protected */
    public final C16201k L() {
        return this.f137445b;
    }

    /* access modifiers changed from: protected */
    public final C17989i<C16260c> N() {
        return this.f137448e;
    }

    /* access modifiers changed from: protected */
    public abstract d0 O();

    /* access modifiers changed from: protected */
    public final U Q() {
        return this.f137446c;
    }

    /* access modifiers changed from: protected */
    public abstract C15566m R();

    /* access modifiers changed from: protected */
    public boolean V(C16163e eVar) {
        C17542s.j(eVar, "<this>");
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract a Y(r rVar, List<? extends n0> list, C18096U u10, List<? extends u0> list2);

    /* access modifiers changed from: protected */
    public final C16163e Z(r rVar) {
        r rVar2 = rVar;
        C17542s.j(rVar2, "method");
        C16163e p12 = C16163e.p1(R(), C16198h.a(this.f137445b, rVar2), rVar.getName(), this.f137445b.a().t().a(rVar2), ((C16260c) this.f137448e.invoke()).e(rVar.getName()) != null && rVar.j().isEmpty());
        C17542s.i(p12, "createJavaMethod(...)");
        C16201k i10 = C16193c.i(this.f137445b, p12, rVar, 0, 4, (Object) null);
        Iterable<y> typeParameters = rVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C16877v.y(typeParameters, 10));
        for (y a10 : typeParameters) {
            n0 a11 = i10.f().a(a10);
            C17542s.g(a11);
            arrayList.add(a11);
        }
        b d02 = d0(i10, p12, rVar.j());
        a Y10 = Y(rVar2, arrayList, A(rVar2, i10), d02.a());
        C18096U c10 = Y10.c();
        C16163e eVar = p12;
        p12.o1(c10 != null ? C17277h.i(p12, c10, C15649h.f134231V.b()) : null, O(), C16877v.n(), Y10.e(), Y10.f(), Y10.d(), C15535F.Companion.a(false, rVar.isAbstract(), true ^ rVar.isFinal()), V.d(rVar.getVisibility()), Y10.c() != null ? X.f(C16796C.a(C16163e.f136911G, C16877v.w0(d02.a()))) : X.j());
        eVar.s1(Y10.b(), d02.b());
        if (!Y10.a().isEmpty()) {
            i10.a().s().b(eVar, Y10.a());
        }
        return eVar;
    }

    public Set<C17069f> a() {
        return P();
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return !c().contains(fVar) ? C16877v.n() : this.f137455l.invoke(fVar);
    }

    public Set<C17069f> c() {
        return S();
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return !a().contains(fVar) ? C16877v.n() : this.f137451h.invoke(fVar);
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [TI.x] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final QI.U.b d0(PI.C16201k r21, DI.C15579z r22, java.util.List<? extends TI.C16494B> r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r23
            java.lang.String r2 = "c"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "function"
            r15 = r22
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "jValueParameters"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Iterable r2 = YH.C16877v.B1(r2)
            java.util.ArrayList r14 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r2, r3)
            r14.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x002c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0139
            java.lang.Object r4 = r2.next()
            YH.Q r4 = (YH.Q) r4
            int r6 = r4.a()
            java.lang.Object r4 = r4.b()
            TI.B r4 = (TI.C16494B) r4
            EI.h r7 = PI.C16198h.a(r0, r4)
            uJ.L0 r8 = uJ.L0.COMMON
            r12 = 7
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            RI.a r5 = RI.C16378b.b(r8, r9, r10, r11, r12, r13)
            boolean r8 = r4.b()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0096
            TI.x r8 = r4.getType()
            boolean r11 = r8 instanceof TI.C16502f
            if (r11 == 0) goto L_0x0064
            r9 = r8
            TI.f r9 = (TI.C16502f) r9
        L_0x0064:
            if (r9 == 0) goto L_0x007f
            RI.e r8 = r21.g()
            uJ.U r5 = r8.l(r9, r5, r10)
            DI.I r8 = r21.d()
            AI.j r8 = r8.p()
            uJ.U r8 = r8.k(r5)
            XH.v r5 = XH.C16796C.a(r5, r8)
            goto L_0x00a6
        L_0x007f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0096:
            RI.e r8 = r21.g()
            TI.x r11 = r4.getType()
            uJ.U r5 = r8.p(r11, r5)
            XH.v r5 = XH.C16796C.a(r5, r9)
        L_0x00a6:
            java.lang.Object r8 = r5.a()
            r9 = r8
            uJ.U r9 = (uJ.C18096U) r9
            java.lang.Object r5 = r5.b()
            r13 = r5
            uJ.U r13 = (uJ.C18096U) r13
            cJ.f r5 = r22.getName()
            java.lang.String r5 = r5.b()
            java.lang.String r8 = "equals"
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 == 0) goto L_0x00e6
            int r5 = r23.size()
            if (r5 != r10) goto L_0x00e6
            DI.I r5 = r21.d()
            AI.j r5 = r5.p()
            uJ.f0 r5 = r5.J()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 == 0) goto L_0x00e6
            java.lang.String r5 = "other"
            cJ.f r5 = cJ.C17069f.v(r5)
        L_0x00e2:
            r16 = r3
            r8 = r5
            goto L_0x010a
        L_0x00e6:
            cJ.f r5 = r4.getName()
            if (r5 != 0) goto L_0x00ed
            r3 = r10
        L_0x00ed:
            if (r5 != 0) goto L_0x00e2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = 112(0x70, float:1.57E-43)
            r5.append(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cJ.f r5 = cJ.C17069f.v(r5)
            java.lang.String r8 = "identifier(...)"
            kotlin.jvm.internal.C17542s.i(r5, r8)
            goto L_0x00e2
        L_0x010a:
            kotlin.jvm.internal.C17542s.g(r8)
            GI.V r12 = new GI.V
            PI.d r3 = r21.a()
            SI.b r3 = r3.t()
            SI.a r17 = r3.a(r4)
            r5 = 0
            r10 = 0
            r11 = 0
            r18 = 0
            r3 = r12
            r4 = r22
            r19 = r12
            r12 = r18
            r0 = r14
            r14 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r19
            r0.add(r3)
            r14 = r0
            r3 = r16
            r0 = r21
            goto L_0x002c
        L_0x0139:
            r0 = r14
            java.util.List r0 = YH.C16877v.t1(r0)
            QI.U$b r1 = new QI.U$b
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.U.d0(PI.k, DI.z, java.util.List):QI.U$b");
    }

    public Set<C17069f> f() {
        return M();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return (Collection) this.f137447d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> v(C17649d dVar, C17642l<? super C17069f, Boolean> lVar);

    /* access modifiers changed from: protected */
    public final List<C15566m> w(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        d dVar2 = d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(C17649d.f144823c.c())) {
            for (C17069f next : v(dVar, lVar)) {
                if (lVar.invoke(next).booleanValue()) {
                    C15660a.a(linkedHashSet, e(next, dVar2));
                }
            }
        }
        if (dVar.a(C17649d.f144823c.d()) && !dVar.l().contains(C17648c.a.f144820a)) {
            for (C17069f next2 : x(dVar, lVar)) {
                if (lVar.invoke(next2).booleanValue()) {
                    linkedHashSet.addAll(d(next2, dVar2));
                }
            }
        }
        if (dVar.a(C17649d.f144823c.i()) && !dVar.l().contains(C17648c.a.f144820a)) {
            for (C17069f next3 : D(dVar, lVar)) {
                if (lVar.invoke(next3).booleanValue()) {
                    linkedHashSet.addAll(b(next3, dVar2));
                }
            }
        }
        return C16877v.t1(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> x(C17649d dVar, C17642l<? super C17069f, Boolean> lVar);

    /* access modifiers changed from: protected */
    public void y(Collection<h0> collection, C17069f fVar) {
        C17542s.j(collection, "result");
        C17542s.j(fVar, "name");
    }

    /* access modifiers changed from: protected */
    public abstract C16260c z();

    public U(C16201k kVar, U u10) {
        C17542s.j(kVar, "c");
        this.f137445b = kVar;
        this.f137446c = u10;
        this.f137447d = kVar.e().h(new C16256H(this), C16877v.n());
        this.f137448e = kVar.e().d(new K(this));
        this.f137449f = kVar.e().g(new L(this));
        this.f137450g = kVar.e().e(new M(this));
        this.f137451h = kVar.e().g(new N(this));
        this.f137452i = kVar.e().d(new O(this));
        this.f137453j = kVar.e().d(new P(this));
        this.f137454k = kVar.e().d(new Q(this));
        this.f137455l = kVar.e().g(new S(this));
    }
}
