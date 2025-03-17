package QI;

import AI.C15435p;
import DI.C15558e;
import DI.C15561h;
import DI.h0;
import EJ.C15660a;
import EJ.C15661b;
import GJ.C15768k;
import LI.C16015b;
import LI.d;
import NI.C16097a;
import OI.C16161c;
import OI.h;
import PI.C16201k;
import TI.C16503g;
import TI.q;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import gJ.C17277h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17649d;
import nJ.C17656k;
import uJ.C18096U;

public final class a0 extends b0 {

    /* renamed from: n  reason: collision with root package name */
    private final C16503g f137470n;

    /* renamed from: o  reason: collision with root package name */
    private final C16161c f137471o;

    public static final class a extends C15661b.C3305b<C15558e, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15558e f137472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set<R> f137473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C17656k, Collection<R>> f137474c;

        a(C15558e eVar, Set<R> set, C17642l<? super C17656k, ? extends Collection<? extends R>> lVar) {
            this.f137472a = eVar;
            this.f137473b = set;
            this.f137474c = lVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            e();
            return C16807N.f139792a;
        }

        /* renamed from: d */
        public boolean c(C15558e eVar) {
            C17542s.j(eVar, "current");
            if (eVar == this.f137472a) {
                return true;
            }
            C17656k o02 = eVar.o0();
            C17542s.i(o02, "getStaticScope(...)");
            if (!(o02 instanceof b0)) {
                return true;
            }
            this.f137473b.addAll(this.f137474c.invoke(o02));
            return false;
        }

        public void e() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(C16201k kVar, C16503g gVar, C16161c cVar) {
        super(kVar);
        C17542s.j(kVar, "c");
        C17542s.j(gVar, "jClass");
        C17542s.j(cVar, "ownerDescriptor");
        this.f137470n = gVar;
        this.f137471o = cVar;
    }

    /* access modifiers changed from: private */
    public static final boolean m0(q qVar) {
        C17542s.j(qVar, "it");
        return qVar.g();
    }

    /* access modifiers changed from: private */
    public static final Collection n0(C17069f fVar, C17656k kVar) {
        C17542s.j(kVar, "it");
        return kVar.b(fVar, d.WHEN_GET_SUPER_MEMBERS);
    }

    /* access modifiers changed from: private */
    public static final Collection o0(C17656k kVar) {
        C17542s.j(kVar, "it");
        return kVar.c();
    }

    private final <R> Set<R> p0(C15558e eVar, Set<R> set, C17642l<? super C17656k, ? extends Collection<? extends R>> lVar) {
        C15661b.b(C16877v.e(eVar), Y.f137467a, new a(eVar, set, lVar));
        return set;
    }

    /* access modifiers changed from: private */
    public static final Iterable q0(C15558e eVar) {
        Collection<C18096U> a10 = eVar.k().a();
        C17542s.i(a10, "getSupertypes(...)");
        return C15768k.A(C15768k.T(C16877v.h0(a10), Z.f137468a));
    }

    /* access modifiers changed from: private */
    public static final C15558e r0(C18096U u10) {
        C15561h e10 = u10.N0().e();
        if (e10 instanceof C15558e) {
            return (C15558e) e10;
        }
        return null;
    }

    private final DI.a0 t0(DI.a0 a0Var) {
        if (a0Var.h().a()) {
            return a0Var;
        }
        Collection<? extends DI.a0> e10 = a0Var.e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        Iterable<DI.a0> iterable = e10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (DI.a0 a0Var2 : iterable) {
            C17542s.g(a0Var2);
            arrayList.add(t0(a0Var2));
        }
        return (DI.a0) C16877v.b1(C16877v.m0(arrayList));
    }

    private final Set<h0> u0(C17069f fVar, C15558e eVar) {
        a0 b10 = h.b(eVar);
        return b10 == null ? g0.d() : C16877v.y1(b10.d(fVar, d.WHEN_GET_SUPER_MEMBERS));
    }

    /* access modifiers changed from: protected */
    public void B(Collection<h0> collection, C17069f fVar) {
        C17542s.j(collection, "result");
        C17542s.j(fVar, "name");
        Collection<D> e10 = C16097a.e(fVar, u0(fVar, R()), collection, R(), L().a().c(), L().a().k().a());
        C17542s.i(e10, "resolveOverridesForStaticMembers(...)");
        collection.addAll(e10);
        if (!this.f137470n.x()) {
            return;
        }
        if (C17542s.e(fVar, C15435p.f133028f)) {
            h0 g10 = C17277h.g(R());
            C17542s.i(g10, "createEnumValueOfMethod(...)");
            collection.add(g10);
        } else if (C17542s.e(fVar, C15435p.f133026d)) {
            h0 h10 = C17277h.h(R());
            C17542s.i(h10, "createEnumValuesMethod(...)");
            collection.add(h10);
        }
    }

    /* access modifiers changed from: protected */
    public void C(C17069f fVar, Collection<DI.a0> collection) {
        C17542s.j(fVar, "name");
        C17542s.j(collection, "result");
        Set p02 = p0(R(), new LinkedHashSet(), new X(fVar));
        if (!collection.isEmpty()) {
            Collection<D> e10 = C16097a.e(fVar, p02, collection, R(), L().a().c(), L().a().k().a());
            C17542s.i(e10, "resolveOverridesForStaticMembers(...)");
            collection.addAll(e10);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : p02) {
                DI.a0 t02 = t0((DI.a0) next);
                Object obj = linkedHashMap.get(t02);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(t02, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry value : linkedHashMap.entrySet()) {
                Collection<D> e11 = C16097a.e(fVar, (Collection) value.getValue(), collection, R(), L().a().c(), L().a().k().a());
                C17542s.i(e11, "resolveOverridesForStaticMembers(...)");
                C16877v.E(arrayList, e11);
            }
            collection.addAll(arrayList);
        }
        if (this.f137470n.x() && C17542s.e(fVar, C15435p.f133027e)) {
            C15660a.a(collection, C17277h.f(R()));
        }
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> D(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        Set<C17069f> x12 = C16877v.x1(((C16260c) N().invoke()).d());
        p0(R(), x12, W.f137465a);
        if (this.f137470n.x()) {
            x12.add(C15435p.f133027e);
        }
        return x12;
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public C16259b z() {
        return new C16259b(this.f137470n, V.f137464a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public C16161c R() {
        return this.f137471o;
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> v(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> x(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        Set<C17069f> x12 = C16877v.x1(((C16260c) N().invoke()).a());
        a0 b10 = h.b(R());
        Set<C17069f> a10 = b10 != null ? b10.a() : null;
        if (a10 == null) {
            a10 = g0.d();
        }
        x12.addAll(a10);
        if (this.f137470n.x()) {
            x12.addAll(C16877v.q(C15435p.f133028f, C15435p.f133026d));
        }
        x12.addAll(L().a().w().d(R(), L()));
        return x12;
    }

    /* access modifiers changed from: protected */
    public void y(Collection<h0> collection, C17069f fVar) {
        C17542s.j(collection, "result");
        C17542s.j(fVar, "name");
        L().a().w().b(R(), fVar, collection, L());
    }
}
