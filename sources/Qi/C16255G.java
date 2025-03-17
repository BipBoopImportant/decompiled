package QI;

import DI.C15558e;
import DI.C15566m;
import DI.a0;
import DI.h0;
import EJ.C15662c;
import EJ.C15669j;
import LI.C16015b;
import MI.C16076u;
import PI.C16201k;
import QI.C16260c;
import TI.C16496D;
import TI.C16503g;
import TI.u;
import VI.C16690v;
import VI.C16691w;
import VI.C16692x;
import WI.C16730a;
import XH.t;
import YH.C16877v;
import YH.g0;
import bJ.C17046e;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import cJ.C17071h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nJ.C17649d;
import tJ.C17988h;
import tJ.C17990j;

/* renamed from: QI.G  reason: case insensitive filesystem */
public final class C16255G extends b0 {

    /* renamed from: n  reason: collision with root package name */
    private final u f137419n;

    /* renamed from: o  reason: collision with root package name */
    private final C16252D f137420o;

    /* renamed from: p  reason: collision with root package name */
    private final C17990j<Set<String>> f137421p;

    /* renamed from: q  reason: collision with root package name */
    private final C17988h<a, C15558e> f137422q;

    /* renamed from: QI.G$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17069f f137423a;

        /* renamed from: b  reason: collision with root package name */
        private final C16503g f137424b;

        public a(C17069f fVar, C16503g gVar) {
            C17542s.j(fVar, "name");
            this.f137423a = fVar;
            this.f137424b = gVar;
        }

        public final C16503g a() {
            return this.f137424b;
        }

        public final C17069f b() {
            return this.f137423a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C17542s.e(this.f137423a, ((a) obj).f137423a);
        }

        public int hashCode() {
            return this.f137423a.hashCode();
        }
    }

    /* renamed from: QI.G$b */
    private static abstract class b {

        /* renamed from: QI.G$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C15558e f137425a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C15558e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "descriptor");
                this.f137425a = eVar;
            }

            public final C15558e a() {
                return this.f137425a;
            }
        }

        /* renamed from: QI.G$b$b  reason: collision with other inner class name */
        public static final class C3371b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3371b f137426a = new C3371b();

            private C3371b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: QI.G$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f137427a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16255G(C16201k kVar, u uVar, C16252D d10) {
        super(kVar);
        C17542s.j(kVar, "c");
        C17542s.j(uVar, "jPackage");
        C17542s.j(d10, "ownerDescriptor");
        this.f137419n = uVar;
        this.f137420o = d10;
        this.f137421p = kVar.e().a(new C16253E(kVar, this));
        this.f137422q = kVar.e().e(new C16254F(this, kVar));
    }

    /* access modifiers changed from: private */
    public static final C15558e i0(C16255G g10, C16201k kVar, a aVar) {
        C17542s.j(aVar, "request");
        C17065b bVar = new C17065b(g10.R().f(), aVar.b());
        C16690v.a b10 = aVar.a() != null ? kVar.a().j().b(aVar.a(), g10.m0()) : kVar.a().j().c(bVar, g10.m0());
        C16692x a10 = b10 != null ? b10.a() : null;
        C17065b k10 = a10 != null ? a10.k() : null;
        if (k10 != null && (k10.j() || k10.i())) {
            return null;
        }
        C16255G g11 = g10;
        b p02 = g10.p0(a10);
        if (p02 instanceof b.a) {
            return ((b.a) p02).a();
        }
        if (p02 instanceof b.c) {
            return null;
        }
        if (p02 instanceof b.C3371b) {
            C16503g a11 = aVar.a();
            if (a11 == null) {
                C16076u d10 = kVar.a().d();
                C16690v.a.C3417a aVar2 = b10 instanceof C16690v.a.C3417a ? (C16690v.a.C3417a) b10 : null;
                a11 = d10.a(new C16076u.a(bVar, aVar2 != null ? aVar2.b() : null, (C16503g) null, 4, (DefaultConstructorMarker) null));
            }
            C16503g gVar = a11;
            if ((gVar != null ? gVar.M() : null) != C16496D.BINARY) {
                C17066c f10 = gVar != null ? gVar.f() : null;
                if (f10 == null || f10.c() || !C17542s.e(f10.d(), g10.R().f())) {
                    return null;
                }
                C16271n nVar = new C16271n(kVar, g10.R(), gVar, (C15558e) null, 8, (DefaultConstructorMarker) null);
                kVar.a().e().a(nVar);
                return nVar;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + C16691w.a(kVar.a().j(), gVar, g10.m0()) + "\nfindKotlinClass(ClassId) = " + C16691w.b(kVar.a().j(), bVar, g10.m0()) + 10);
        }
        throw new t();
    }

    private final C15558e j0(C17069f fVar, C16503g gVar) {
        if (!C17071h.f141262a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f137421p.invoke();
        if (gVar != null || set == null || set.contains(fVar.b())) {
            return this.f137422q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    private final C17046e m0() {
        return C15662c.a(L().a().b().f().g());
    }

    /* access modifiers changed from: private */
    public static final Set o0(C16201k kVar, C16255G g10) {
        return kVar.a().d().b(g10.R().f());
    }

    private final b p0(C16692x xVar) {
        if (xVar == null) {
            return b.C3371b.f137426a;
        }
        if (xVar.b().c() != C16730a.C3422a.CLASS) {
            return b.c.f137427a;
        }
        C15558e n10 = L().a().b().n(xVar);
        return n10 != null ? new b.a(n10) : b.C3371b.f137426a;
    }

    /* access modifiers changed from: protected */
    public void B(Collection<h0> collection, C17069f fVar) {
        C17542s.j(collection, "result");
        C17542s.j(fVar, "name");
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> D(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        return g0.d();
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C16877v.n();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        C17649d.a aVar = C17649d.f144823c;
        if (!dVar.a(aVar.e() | aVar.c())) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) K().invoke()) {
            C15566m mVar = (C15566m) next;
            if (mVar instanceof C15558e) {
                C17069f name = ((C15558e) mVar).getName();
                C17542s.i(name, "getName(...)");
                if (lVar.invoke(name).booleanValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final C15558e k0(C16503g gVar) {
        C17542s.j(gVar, "javaClass");
        return j0(gVar.getName(), gVar);
    }

    /* renamed from: l0 */
    public C15558e e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return j0(fVar, (C16503g) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public C16252D R() {
        return this.f137420o;
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> v(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        if (!dVar.a(C17649d.f144823c.e())) {
            return g0.d();
        }
        Set<String> set = (Set) this.f137421p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String v10 : set) {
                hashSet.add(C17069f.v(v10));
            }
            return hashSet;
        }
        u uVar = this.f137419n;
        if (lVar == null) {
            lVar = C15669j.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16503g gVar : uVar.G(lVar)) {
            C17069f name = gVar.M() == C16496D.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> x(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public C16260c z() {
        return C16260c.a.f137481a;
    }
}
