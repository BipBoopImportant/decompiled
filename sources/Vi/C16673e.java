package VI;

import DI.i0;
import HJ.C15854t;
import VI.C16659A;
import VI.C16673e.a;
import VI.C16692x;
import XI.C16829b;
import XI.C16830c;
import XI.C16831d;
import XI.i;
import XI.n;
import XI.q;
import XI.s;
import XI.u;
import YH.C16877v;
import ZI.C17005b;
import ZI.e;
import ZI.f;
import ZI.g;
import aJ.C17030a;
import bJ.C17043b;
import bJ.C17045d;
import bJ.C17046e;
import bJ.C17050i;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import eJ.C17198i;
import eJ.C17206q;
import fI.C17221b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17557d;
import qJ.C17801N;
import qJ.C17816d;
import qJ.C17820h;
import zI.C18751a;

/* renamed from: VI.e  reason: case insensitive filesystem */
public abstract class C16673e<A, S extends a<? extends A>> implements C17820h<A> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f139354b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C16690v f139355a;

    /* renamed from: VI.e$a */
    public static abstract class a<A> {
        public abstract Map<C16659A, List<A>> a();
    }

    /* renamed from: VI.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16692x a(C17801N n10, boolean z10, boolean z11, Boolean bool, boolean z12, C16690v vVar, C17046e eVar) {
            C17801N.a h10;
            C17542s.j(n10, "container");
            C17542s.j(vVar, "kotlinClassFinder");
            C17542s.j(eVar, "jvmMetadataVersion");
            if (z10) {
                if (bool != null) {
                    if (n10 instanceof C17801N.a) {
                        C17801N.a aVar = (C17801N.a) n10;
                        if (aVar.g() == C16830c.C3435c.INTERFACE) {
                            C17065b e10 = aVar.e();
                            C17069f v10 = C17069f.v("DefaultImpls");
                            C17542s.i(v10, "identifier(...)");
                            return C16691w.b(vVar, e10.d(v10), eVar);
                        }
                    }
                    if (bool.booleanValue() && (n10 instanceof C17801N.b)) {
                        i0 c10 = n10.c();
                        C16686r rVar = c10 instanceof C16686r ? (C16686r) c10 : null;
                        C17557d f10 = rVar != null ? rVar.f() : null;
                        if (f10 != null) {
                            C17065b.a aVar2 = C17065b.f141241d;
                            String f11 = f10.f();
                            C17542s.i(f11, "getInternalName(...)");
                            return C16691w.b(vVar, aVar2.c(new C17066c(C15854t.P(f11, '/', '.', false, 4, (Object) null))), eVar);
                        }
                    }
                } else {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + n10 + ')').toString());
                }
            }
            if (z11 && (n10 instanceof C17801N.a)) {
                C17801N.a aVar3 = (C17801N.a) n10;
                if (aVar3.g() == C16830c.C3435c.COMPANION_OBJECT && (h10 = aVar3.h()) != null && (h10.g() == C16830c.C3435c.CLASS || h10.g() == C16830c.C3435c.ENUM_CLASS || (z12 && (h10.g() == C16830c.C3435c.INTERFACE || h10.g() == C16830c.C3435c.ANNOTATION_CLASS)))) {
                    i0 c11 = h10.c();
                    C16694z zVar = c11 instanceof C16694z ? (C16694z) c11 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(n10 instanceof C17801N.b) || !(n10.c() instanceof C16686r)) {
                return null;
            }
            i0 c12 = n10.c();
            C17542s.h(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            C16686r rVar2 = (C16686r) c12;
            C16692x g10 = rVar2.g();
            return g10 == null ? C16691w.b(vVar, rVar2.d(), eVar) : g10;
        }

        private b() {
        }
    }

    /* renamed from: VI.e$c */
    private enum c {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* renamed from: VI.e$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f139356a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                qJ.d[] r0 = qJ.C17816d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                qJ.d r1 = qJ.C17816d.PROPERTY_GETTER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                qJ.d r1 = qJ.C17816d.PROPERTY_SETTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                qJ.d r1 = qJ.C17816d.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f139356a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: VI.C16673e.d.<clinit>():void");
        }
    }

    /* renamed from: VI.e$e  reason: collision with other inner class name */
    public static final class C3413e implements C16692x.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16673e<A, S> f139357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f139358b;

        C3413e(C16673e<A, S> eVar, ArrayList<A> arrayList) {
            this.f139357a = eVar;
            this.f139358b = arrayList;
        }

        public void a() {
        }

        public C16692x.a c(C17065b bVar, i0 i0Var) {
            C17542s.j(bVar, "classId");
            C17542s.j(i0Var, "source");
            return this.f139357a.y(bVar, i0Var, this.f139358b);
        }
    }

    public C16673e(C16690v vVar) {
        C17542s.j(vVar, "kotlinClassFinder");
        this.f139355a = vVar;
    }

    private final C16692x A(C17801N.a aVar) {
        i0 c10 = aVar.c();
        C16694z zVar = c10 instanceof C16694z ? (C16694z) c10 : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(C17801N n10, C17206q qVar) {
        if (qVar instanceof i) {
            if (!f.g((i) qVar)) {
                return 0;
            }
        } else if (qVar instanceof n) {
            if (!f.h((n) qVar)) {
                return 0;
            }
        } else if (qVar instanceof C16831d) {
            C17542s.h(n10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            C17801N.a aVar = (C17801N.a) n10;
            if (aVar.g() == C16830c.C3435c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + qVar.getClass());
        }
        return 1;
    }

    private final List<A> n(C17801N n10, C16659A a10, boolean z10, boolean z11, Boolean bool, boolean z12) {
        C16692x p10 = p(n10, f139354b.a(n10, z10, z11, bool, z12, this.f139355a, u()));
        if (p10 == null) {
            return C16877v.n();
        }
        List<A> list = (List) q(p10).a().get(a10);
        return list == null ? C16877v.n() : list;
    }

    static /* synthetic */ List o(C16673e eVar, C17801N n10, C16659A a10, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return eVar.n(n10, a10, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ C16659A t(C16673e eVar, C17206q qVar, ZI.c cVar, g gVar, C17816d dVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return eVar.s(qVar, cVar, gVar, dVar, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final List<A> z(C17801N n10, n nVar, c cVar) {
        c cVar2 = cVar;
        Boolean f10 = C17005b.f140796B.d(nVar.V());
        C17542s.i(f10, "get(...)");
        f10.booleanValue();
        boolean f11 = C17050i.f(nVar);
        if (cVar2 == c.PROPERTY) {
            C16659A b10 = C16674f.b(nVar, n10.b(), n10.d(), false, true, false, 40, (Object) null);
            return b10 == null ? C16877v.n() : o(this, n10, b10, true, false, f10, f11, 8, (Object) null);
        }
        C16659A b11 = C16674f.b(nVar, n10.b(), n10.d(), true, false, false, 48, (Object) null);
        if (b11 == null) {
            return C16877v.n();
        }
        boolean z10 = false;
        boolean d02 = C15854t.d0(b11.a(), "$delegate", false, 2, (Object) null);
        if (cVar2 == c.DELEGATE_FIELD) {
            z10 = true;
        }
        return d02 != z10 ? C16877v.n() : n(n10, b11, true, true, f10, f11);
    }

    public List<A> b(s sVar, ZI.c cVar) {
        C17542s.j(sVar, "proto");
        C17542s.j(cVar, "nameResolver");
        Object p10 = sVar.p(C17030a.f140994h);
        C17542s.i(p10, "getExtension(...)");
        Iterable<C16829b> iterable = (Iterable) p10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b bVar : iterable) {
            C17542s.g(bVar);
            arrayList.add(i(bVar, cVar));
        }
        return arrayList;
    }

    public List<A> c(C17801N n10, n nVar) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        return z(n10, nVar, c.BACKING_FIELD);
    }

    public List<A> e(C17801N n10, C17206q qVar, C17816d dVar) {
        C17542s.j(n10, "container");
        C17542s.j(qVar, "proto");
        C17542s.j(dVar, "kind");
        C16659A t10 = t(this, qVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        if (t10 == null) {
            return C16877v.n();
        }
        return o(this, n10, C16659A.f139314b.e(t10, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List<A> f(C17801N.a aVar) {
        C17542s.j(aVar, "container");
        C16692x A10 = A(aVar);
        if (A10 != null) {
            ArrayList arrayList = new ArrayList(1);
            A10.c(new C3413e(this, arrayList), r(A10));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    public List<A> g(C17801N n10, n nVar) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        return z(n10, nVar, c.DELEGATE_FIELD);
    }

    public List<A> h(q qVar, ZI.c cVar) {
        C17542s.j(qVar, "proto");
        C17542s.j(cVar, "nameResolver");
        Object p10 = qVar.p(C17030a.f140992f);
        C17542s.i(p10, "getExtension(...)");
        Iterable<C16829b> iterable = (Iterable) p10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b bVar : iterable) {
            C17542s.g(bVar);
            arrayList.add(i(bVar, cVar));
        }
        return arrayList;
    }

    public abstract A i(C16829b bVar, ZI.c cVar);

    public List<A> j(C17801N n10, C17206q qVar, C17816d dVar) {
        C17542s.j(n10, "container");
        C17542s.j(qVar, "proto");
        C17542s.j(dVar, "kind");
        if (dVar == C17816d.PROPERTY) {
            return z(n10, (n) qVar, c.PROPERTY);
        }
        C16659A t10 = t(this, qVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        return t10 == null ? C16877v.n() : o(this, n10, t10, false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List<A> k(C17801N n10, XI.g gVar) {
        C17542s.j(n10, "container");
        C17542s.j(gVar, "proto");
        return o(this, n10, C16659A.f139314b.a(n10.b().getString(gVar.A()), C17043b.b(((C17801N.a) n10).e().b())), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List<A> l(C17801N n10, C17206q qVar, C17816d dVar, int i10, u uVar) {
        C17542s.j(n10, "container");
        C17542s.j(qVar, "callableProto");
        C17542s.j(dVar, "kind");
        C17542s.j(uVar, "proto");
        C16659A t10 = t(this, qVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        if (t10 == null) {
            return C16877v.n();
        }
        return o(this, n10, C16659A.f139314b.e(t10, i10 + m(n10, qVar)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final C16692x p(C17801N n10, C16692x xVar) {
        C17542s.j(n10, "container");
        if (xVar != null) {
            return xVar;
        }
        if (n10 instanceof C17801N.a) {
            return A((C17801N.a) n10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract S q(C16692x xVar);

    /* access modifiers changed from: protected */
    public byte[] r(C16692x xVar) {
        C17542s.j(xVar, "kotlinClass");
        return null;
    }

    /* access modifiers changed from: protected */
    public final C16659A s(C17206q qVar, ZI.c cVar, g gVar, C17816d dVar, boolean z10) {
        C17542s.j(qVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17542s.j(dVar, "kind");
        if (qVar instanceof C16831d) {
            C16659A.a aVar = C16659A.f139314b;
            C17045d.b b10 = C17050i.f141191a.b((C16831d) qVar, cVar, gVar);
            if (b10 == null) {
                return null;
            }
            return aVar.b(b10);
        } else if (qVar instanceof i) {
            C16659A.a aVar2 = C16659A.f139314b;
            C17045d.b e10 = C17050i.f141191a.e((i) qVar, cVar, gVar);
            if (e10 == null) {
                return null;
            }
            return aVar2.b(e10);
        } else if (!(qVar instanceof n)) {
            return null;
        } else {
            C17198i.f<n, C17030a.d> fVar = C17030a.f140990d;
            C17542s.i(fVar, "propertySignature");
            C17030a.d dVar2 = (C17030a.d) e.a((C17198i.d) qVar, fVar);
            if (dVar2 == null) {
                return null;
            }
            int i10 = d.f139356a[dVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return C16674f.a((n) qVar, cVar, gVar, true, true, z10);
                } else if (!dVar2.C()) {
                    return null;
                } else {
                    C16659A.a aVar3 = C16659A.f139314b;
                    C17030a.c x10 = dVar2.x();
                    C17542s.i(x10, "getSetter(...)");
                    return aVar3.c(cVar, x10);
                }
            } else if (!dVar2.B()) {
                return null;
            } else {
                C16659A.a aVar4 = C16659A.f139314b;
                C17030a.c w10 = dVar2.w();
                C17542s.i(w10, "getGetter(...)");
                return aVar4.c(cVar, w10);
            }
        }
    }

    public abstract C17046e u();

    /* access modifiers changed from: protected */
    public final C16690v v() {
        return this.f139355a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r4 = VI.C16691w.b(r3.f139355a, r4, u());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(cJ.C17065b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            cJ.b r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            cJ.f r0 = r4.h()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "Container"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r0 != 0) goto L_0x001d
            goto L_0x0032
        L_0x001d:
            VI.v r0 = r3.f139355a
            bJ.e r2 = r3.u()
            VI.x r4 = VI.C16691w.b(r0, r4, r2)
            if (r4 == 0) goto L_0x0032
            zI.a r0 = zI.C18751a.f152800a
            boolean r4 = r0.c(r4)
            if (r4 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: VI.C16673e.w(cJ.b):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract C16692x.a x(C17065b bVar, i0 i0Var, List<A> list);

    /* access modifiers changed from: protected */
    public final C16692x.a y(C17065b bVar, i0 i0Var, List<A> list) {
        C17542s.j(bVar, "annotationClassId");
        C17542s.j(i0Var, "source");
        C17542s.j(list, "result");
        if (C18751a.f152800a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, i0Var, list);
    }
}
