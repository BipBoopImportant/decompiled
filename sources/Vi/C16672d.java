package VI;

import AI.C15439t;
import DI.i0;
import VI.C16659A;
import VI.C16692x;
import XI.n;
import ZI.C17005b;
import bJ.C17050i;
import cJ.C17065b;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qJ.C17801N;
import qJ.C17816d;
import qJ.C17817e;
import tJ.C17987g;
import tJ.C17994n;
import uJ.C18096U;

/* renamed from: VI.d  reason: case insensitive filesystem */
public abstract class C16672d<A, C> extends C16673e<A, C16675g<? extends A, ? extends C>> implements C17817e<A, C> {

    /* renamed from: c  reason: collision with root package name */
    private final C17987g<C16692x, C16675g<A, C>> f139344c;

    /* renamed from: VI.d$a */
    public static final class a implements C16692x.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16672d<A, C> f139345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap<C16659A, List<A>> f139346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16692x f139347c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HashMap<C16659A, C> f139348d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap<C16659A, C> f139349e;

        /* renamed from: VI.d$a$a  reason: collision with other inner class name */
        public final class C3412a extends b implements C16692x.e {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f139350d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3412a(a aVar, C16659A a10) {
                super(aVar, a10);
                C17542s.j(a10, "signature");
                this.f139350d = aVar;
            }

            public C16692x.a b(int i10, C17065b bVar, i0 i0Var) {
                C17542s.j(bVar, "classId");
                C17542s.j(i0Var, "source");
                C16659A e10 = C16659A.f139314b.e(d(), i10);
                List list = this.f139350d.f139346b.get(e10);
                if (list == null) {
                    list = new ArrayList();
                    this.f139350d.f139346b.put(e10, list);
                }
                return this.f139350d.f139345a.y(bVar, i0Var, list);
            }
        }

        /* renamed from: VI.d$a$b */
        public class b implements C16692x.c {

            /* renamed from: a  reason: collision with root package name */
            private final C16659A f139351a;

            /* renamed from: b  reason: collision with root package name */
            private final ArrayList<A> f139352b = new ArrayList<>();

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f139353c;

            public b(a aVar, C16659A a10) {
                C17542s.j(a10, "signature");
                this.f139353c = aVar;
                this.f139351a = a10;
            }

            public void a() {
                if (!this.f139352b.isEmpty()) {
                    this.f139353c.f139346b.put(this.f139351a, this.f139352b);
                }
            }

            public C16692x.a c(C17065b bVar, i0 i0Var) {
                C17542s.j(bVar, "classId");
                C17542s.j(i0Var, "source");
                return this.f139353c.f139345a.y(bVar, i0Var, this.f139352b);
            }

            /* access modifiers changed from: protected */
            public final C16659A d() {
                return this.f139351a;
            }
        }

        a(C16672d<A, C> dVar, HashMap<C16659A, List<A>> hashMap, C16692x xVar, HashMap<C16659A, C> hashMap2, HashMap<C16659A, C> hashMap3) {
            this.f139345a = dVar;
            this.f139346b = hashMap;
            this.f139347c = xVar;
            this.f139348d = hashMap2;
            this.f139349e = hashMap3;
        }

        public C16692x.e a(C17069f fVar, String str) {
            C17542s.j(fVar, "name");
            C17542s.j(str, "desc");
            C16659A.a aVar = C16659A.f139314b;
            String b10 = fVar.b();
            C17542s.i(b10, "asString(...)");
            return new C3412a(this, aVar.d(b10, str));
        }

        public C16692x.c b(C17069f fVar, String str, Object obj) {
            C I10;
            C17542s.j(fVar, "name");
            C17542s.j(str, "desc");
            C16659A.a aVar = C16659A.f139314b;
            String b10 = fVar.b();
            C17542s.i(b10, "asString(...)");
            C16659A a10 = aVar.a(b10, str);
            if (!(obj == null || (I10 = this.f139345a.I(str, obj)) == null)) {
                this.f139349e.put(a10, I10);
            }
            return new b(this, a10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16672d(C17994n nVar, C16690v vVar) {
        super(vVar);
        C17542s.j(nVar, "storageManager");
        C17542s.j(vVar, "kotlinClassFinder");
        this.f139344c = nVar.g(new C16669a(this));
    }

    /* access modifiers changed from: private */
    public static final Object G(C16675g gVar, C16659A a10) {
        C17542s.j(gVar, "$this$loadConstantFromProperty");
        C17542s.j(a10, "it");
        return gVar.b().get(a10);
    }

    private final C16675g<A, C> H(C16692x xVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        xVar.d(new a(this, hashMap, xVar, hashMap3, hashMap2), r(xVar));
        return new C16675g<>(hashMap, hashMap2, hashMap3);
    }

    private final C J(C17801N n10, n nVar, C17816d dVar, C18096U u10, p<? super C16675g<? extends A, ? extends C>, ? super C16659A, ? extends C> pVar) {
        C16659A s10;
        C invoke;
        C16692x p10 = p(n10, C16673e.f139354b.a(n10, true, true, C17005b.f140796B.d(nVar.V()), C17050i.f(nVar), v(), u()));
        if (p10 == null || (s10 = s(nVar, n10.b(), n10.d(), dVar, p10.b().d().d(C16682n.f139391b.a()))) == null || (invoke = pVar.invoke(this.f139344c.invoke(p10), s10)) == null) {
            return null;
        }
        return C15439t.d(u10) ? M(invoke) : invoke;
    }

    /* access modifiers changed from: private */
    public static final Object K(C16675g gVar, C16659A a10) {
        C17542s.j(gVar, "$this$loadConstantFromProperty");
        C17542s.j(a10, "it");
        return gVar.c().get(a10);
    }

    /* access modifiers changed from: private */
    public static final C16675g L(C16672d dVar, C16692x xVar) {
        C17542s.j(xVar, "kotlinClass");
        return dVar.H(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C16675g<A, C> q(C16692x xVar) {
        C17542s.j(xVar, "binaryClass");
        return this.f139344c.invoke(xVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: iJ.t$b$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(cJ.C17065b r3, java.util.Map<cJ.C17069f, ? extends iJ.C17373g<?>> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            zI.a r0 = zI.C18751a.f152800a
            cJ.b r0 = r0.a()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r0)
            r0 = 0
            if (r3 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.String r3 = "value"
            cJ.f r3 = cJ.C17069f.v(r3)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r3 instanceof iJ.C17386t
            r1 = 0
            if (r4 == 0) goto L_0x002a
            iJ.t r3 = (iJ.C17386t) r3
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.Object r3 = r3.b()
            boolean r4 = r3 instanceof iJ.C17386t.b.C3505b
            if (r4 == 0) goto L_0x0039
            r1 = r3
            iJ.t$b$b r1 = (iJ.C17386t.b.C3505b) r1
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            cJ.b r3 = r1.b()
            boolean r3 = r2.w(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: VI.C16672d.F(cJ.b, java.util.Map):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract C I(String str, Object obj);

    /* access modifiers changed from: protected */
    public abstract C M(C c10);

    public C a(C17801N n10, n nVar, C18096U u10) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17542s.j(u10, "expectedType");
        return J(n10, nVar, C17816d.PROPERTY_GETTER, u10, C16670b.f139342a);
    }

    public C d(C17801N n10, n nVar, C18096U u10) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17542s.j(u10, "expectedType");
        return J(n10, nVar, C17816d.PROPERTY, u10, C16671c.f139343a);
    }
}
