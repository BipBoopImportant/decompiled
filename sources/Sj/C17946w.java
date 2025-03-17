package sJ;

import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import DI.m0;
import EJ.C15660a;
import LI.C16015b;
import XH.C16807N;
import XI.i;
import XI.n;
import XI.r;
import YH.C16877v;
import YH.X;
import YH.g0;
import cJ.C17065b;
import cJ.C17069f;
import eJ.C17190a;
import eJ.C17206q;
import eJ.C17208s;
import gJ.C17281l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nJ.C17649d;
import nJ.C17657l;
import qJ.C17799L;
import qJ.C17828p;
import tI.C17978n;
import tJ.C17987g;
import tJ.C17988h;
import tJ.C17989i;
import tJ.C17990j;
import tJ.C17993m;
import uI.C18064m;

/* renamed from: sJ.w  reason: case insensitive filesystem */
public abstract class C17946w extends C17657l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f147103f;

    /* renamed from: b  reason: collision with root package name */
    private final C17828p f147104b;

    /* renamed from: c  reason: collision with root package name */
    private final a f147105c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i f147106d;

    /* renamed from: e  reason: collision with root package name */
    private final C17990j f147107e;

    /* renamed from: sJ.w$a */
    private interface a {
        Set<C17069f> a();

        Collection<a0> b(C17069f fVar, C16015b bVar);

        Set<C17069f> c();

        Collection<h0> d(C17069f fVar, C16015b bVar);

        m0 e(C17069f fVar);

        void f(Collection<C15566m> collection, C17649d dVar, C17642l<? super C17069f, Boolean> lVar, C16015b bVar);

        Set<C17069f> g();
    }

    /* renamed from: sJ.w$b */
    private final class b implements a {

        /* renamed from: o  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f147108o;

        /* renamed from: a  reason: collision with root package name */
        private final List<i> f147109a;

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f147110b;

        /* renamed from: c  reason: collision with root package name */
        private final List<r> f147111c;

        /* renamed from: d  reason: collision with root package name */
        private final C17989i f147112d;

        /* renamed from: e  reason: collision with root package name */
        private final C17989i f147113e;

        /* renamed from: f  reason: collision with root package name */
        private final C17989i f147114f;

        /* renamed from: g  reason: collision with root package name */
        private final C17989i f147115g;

        /* renamed from: h  reason: collision with root package name */
        private final C17989i f147116h;

        /* renamed from: i  reason: collision with root package name */
        private final C17989i f147117i;

        /* renamed from: j  reason: collision with root package name */
        private final C17989i f147118j;

        /* renamed from: k  reason: collision with root package name */
        private final C17989i f147119k;

        /* renamed from: l  reason: collision with root package name */
        private final C17989i f147120l;

        /* renamed from: m  reason: collision with root package name */
        private final C17989i f147121m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17946w f147122n;

        static {
            Class<b> cls = b.class;
            f147108o = new C18064m[]{P.h(new G(cls, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), P.h(new G(cls, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), P.h(new G(cls, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), P.h(new G(cls, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), P.h(new G(cls, "allProperties", "getAllProperties()Ljava/util/List;", 0)), P.h(new G(cls, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), P.h(new G(cls, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), P.h(new G(cls, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), P.h(new G(cls, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), P.h(new G(cls, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        }

        public b(C17946w wVar, List<i> list, List<n> list2, List<r> list3) {
            C17542s.j(list, "functionList");
            C17542s.j(list2, "propertyList");
            C17542s.j(list3, "typeAliasList");
            this.f147122n = wVar;
            this.f147109a = list;
            this.f147110b = list2;
            this.f147111c = !wVar.s().c().g().d() ? C16877v.n() : list3;
            this.f147112d = wVar.s().h().d(new C17947x(this));
            this.f147113e = wVar.s().h().d(new C17948y(this));
            this.f147114f = wVar.s().h().d(new C17949z(this));
            this.f147115g = wVar.s().h().d(new C17905A(this));
            this.f147116h = wVar.s().h().d(new C17906B(this));
            this.f147117i = wVar.s().h().d(new C17907C(this));
            this.f147118j = wVar.s().h().d(new C17908D(this));
            this.f147119k = wVar.s().h().d(new C17909E(this));
            this.f147120l = wVar.s().h().d(new C17910F(this, wVar));
            this.f147121m = wVar.s().h().d(new C17911G(this, wVar));
        }

        private final List<m0> A() {
            C17946w wVar = this.f147122n;
            ArrayList arrayList = new ArrayList();
            for (C17206q qVar : this.f147111c) {
                m0 z10 = wVar.s().f().z((r) qVar);
                if (z10 != null) {
                    arrayList.add(z10);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* access modifiers changed from: private */
        public static final Set D(b bVar, C17946w wVar) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C17946w wVar2 = bVar.f147122n;
            for (C17206q qVar : bVar.f147109a) {
                linkedHashSet.add(C17799L.b(wVar2.s().g(), ((i) qVar).Y()));
            }
            return g0.k(linkedHashSet, wVar.w());
        }

        /* access modifiers changed from: private */
        public static final Map E(b bVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : bVar.F()) {
                C17069f name = ((h0) next).getName();
                C17542s.i(name, "getName(...)");
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next);
            }
            return linkedHashMap;
        }

        private final List<h0> F() {
            return (List) C17993m.a(this.f147115g, this, f147108o[3]);
        }

        private final List<a0> G() {
            return (List) C17993m.a(this.f147116h, this, f147108o[4]);
        }

        private final List<m0> H() {
            return (List) C17993m.a(this.f147114f, this, f147108o[2]);
        }

        private final List<h0> I() {
            return (List) C17993m.a(this.f147112d, this, f147108o[0]);
        }

        private final List<a0> J() {
            return (List) C17993m.a(this.f147113e, this, f147108o[1]);
        }

        private final Map<C17069f, Collection<h0>> K() {
            return (Map) C17993m.a(this.f147118j, this, f147108o[6]);
        }

        private final Map<C17069f, Collection<a0>> L() {
            return (Map) C17993m.a(this.f147119k, this, f147108o[7]);
        }

        private final Map<C17069f, m0> M() {
            return (Map) C17993m.a(this.f147117i, this, f147108o[5]);
        }

        /* access modifiers changed from: private */
        public static final Map N(b bVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : bVar.G()) {
                C17069f name = ((a0) next).getName();
                C17542s.i(name, "getName(...)");
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next);
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Map O(b bVar) {
            Iterable H10 = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(H10, 10)), 16));
            for (Object next : H10) {
                C17069f name = ((m0) next).getName();
                C17542s.i(name, "getName(...)");
                linkedHashMap.put(name, next);
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Set P(b bVar, C17946w wVar) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C17946w wVar2 = bVar.f147122n;
            for (C17206q qVar : bVar.f147110b) {
                linkedHashSet.add(C17799L.b(wVar2.s().g(), ((n) qVar).X()));
            }
            return g0.k(linkedHashSet, wVar.x());
        }

        /* access modifiers changed from: private */
        public static final List r(b bVar) {
            return C16877v.V0(bVar.I(), bVar.u());
        }

        /* access modifiers changed from: private */
        public static final List s(b bVar) {
            return C16877v.V0(bVar.J(), bVar.v());
        }

        /* access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List<h0> u() {
            ArrayList arrayList = new ArrayList();
            for (C17069f x10 : this.f147122n.w()) {
                C16877v.E(arrayList, x(x10));
            }
            return arrayList;
        }

        private final List<a0> v() {
            ArrayList arrayList = new ArrayList();
            for (C17069f y10 : this.f147122n.x()) {
                C16877v.E(arrayList, y(y10));
            }
            return arrayList;
        }

        private final List<h0> w() {
            List<i> list = this.f147109a;
            C17946w wVar = this.f147122n;
            ArrayList arrayList = new ArrayList();
            for (C17206q qVar : list) {
                h0 s10 = wVar.s().f().s((i) qVar);
                if (!wVar.A(s10)) {
                    s10 = null;
                }
                if (s10 != null) {
                    arrayList.add(s10);
                }
            }
            return arrayList;
        }

        private final List<h0> x(C17069f fVar) {
            List<h0> I10 = I();
            C17946w wVar = this.f147122n;
            ArrayList arrayList = new ArrayList();
            for (Object next : I10) {
                if (C17542s.e(((C15566m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<a0> y(C17069f fVar) {
            List<a0> J10 = J();
            C17946w wVar = this.f147122n;
            ArrayList arrayList = new ArrayList();
            for (Object next : J10) {
                if (C17542s.e(((C15566m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<a0> z() {
            C17946w wVar = this.f147122n;
            ArrayList arrayList = new ArrayList();
            for (C17206q qVar : this.f147110b) {
                a0 u10 = wVar.s().f().u((n) qVar);
                if (u10 != null) {
                    arrayList.add(u10);
                }
            }
            return arrayList;
        }

        public Set<C17069f> a() {
            return (Set) C17993m.a(this.f147120l, this, f147108o[8]);
        }

        public Collection<a0> b(C17069f fVar, C16015b bVar) {
            C17542s.j(fVar, "name");
            C17542s.j(bVar, "location");
            if (!c().contains(fVar)) {
                return C16877v.n();
            }
            Collection<a0> collection = L().get(fVar);
            return collection == null ? C16877v.n() : collection;
        }

        public Set<C17069f> c() {
            return (Set) C17993m.a(this.f147121m, this, f147108o[9]);
        }

        public Collection<h0> d(C17069f fVar, C16015b bVar) {
            C17542s.j(fVar, "name");
            C17542s.j(bVar, "location");
            if (!a().contains(fVar)) {
                return C16877v.n();
            }
            Collection<h0> collection = K().get(fVar);
            return collection == null ? C16877v.n() : collection;
        }

        public m0 e(C17069f fVar) {
            C17542s.j(fVar, "name");
            return M().get(fVar);
        }

        public void f(Collection<C15566m> collection, C17649d dVar, C17642l<? super C17069f, Boolean> lVar, C16015b bVar) {
            C17542s.j(collection, "result");
            C17542s.j(dVar, "kindFilter");
            C17542s.j(lVar, "nameFilter");
            C17542s.j(bVar, "location");
            if (dVar.a(C17649d.f144823c.i())) {
                for (Object next : G()) {
                    C17069f name = ((a0) next).getName();
                    C17542s.i(name, "getName(...)");
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            if (dVar.a(C17649d.f144823c.d())) {
                for (Object next2 : F()) {
                    C17069f name2 = ((h0) next2).getName();
                    C17542s.i(name2, "getName(...)");
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }

        public Set<C17069f> g() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C17946w wVar = this.f147122n;
            for (C17206q qVar : this.f147111c) {
                linkedHashSet.add(C17799L.b(wVar.s().g(), ((r) qVar).R()));
            }
            return linkedHashSet;
        }
    }

    /* renamed from: sJ.w$c */
    private final class c implements a {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f147123j;

        /* renamed from: a  reason: collision with root package name */
        private final Map<C17069f, byte[]> f147124a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<C17069f, byte[]> f147125b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<C17069f, byte[]> f147126c;

        /* renamed from: d  reason: collision with root package name */
        private final C17987g<C17069f, Collection<h0>> f147127d;

        /* renamed from: e  reason: collision with root package name */
        private final C17987g<C17069f, Collection<a0>> f147128e;

        /* renamed from: f  reason: collision with root package name */
        private final C17988h<C17069f, m0> f147129f;

        /* renamed from: g  reason: collision with root package name */
        private final C17989i f147130g;

        /* renamed from: h  reason: collision with root package name */
        private final C17989i f147131h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17946w f147132i;

        /* renamed from: sJ.w$c$a */
        public static final class a implements C17631a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17208s f147133a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f147134b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17946w f147135c;

            public a(C17208s sVar, ByteArrayInputStream byteArrayInputStream, C17946w wVar) {
                this.f147133a = sVar;
                this.f147134b = byteArrayInputStream;
                this.f147135c = wVar;
            }

            /* renamed from: a */
            public final C17206q invoke() {
                return (C17206q) this.f147133a.d(this.f147134b, this.f147135c.s().c().k());
            }
        }

        static {
            Class<c> cls = c.class;
            f147123j = new C18064m[]{P.h(new G(cls, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), P.h(new G(cls, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        }

        public c(C17946w wVar, List<i> list, List<n> list2, List<r> list3) {
            Map<C17069f, byte[]> map;
            C17542s.j(list, "functionList");
            C17542s.j(list2, "propertyList");
            C17542s.j(list3, "typeAliasList");
            this.f147132i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                C17069f b10 = C17799L.b(wVar.s().g(), ((i) ((C17206q) next)).Y());
                Object obj = linkedHashMap.get(b10);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b10, obj);
                }
                ((List) obj).add(next);
            }
            this.f147124a = r(linkedHashMap);
            C17946w wVar2 = this.f147132i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next2 : list2) {
                C17069f b11 = C17799L.b(wVar2.s().g(), ((n) ((C17206q) next2)).X());
                Object obj2 = linkedHashMap2.get(b11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(b11, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f147125b = r(linkedHashMap2);
            if (this.f147132i.s().c().g().d()) {
                C17946w wVar3 = this.f147132i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object next3 : list3) {
                    C17069f b12 = C17799L.b(wVar3.s().g(), ((r) ((C17206q) next3)).R());
                    Object obj3 = linkedHashMap3.get(b12);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(b12, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = r(linkedHashMap3);
            } else {
                map = X.j();
            }
            this.f147126c = map;
            this.f147127d = this.f147132i.s().h().g(new C17912H(this));
            this.f147128e = this.f147132i.s().h().g(new C17913I(this));
            this.f147129f = this.f147132i.s().h().e(new C17914J(this));
            this.f147130g = this.f147132i.s().h().d(new C17915K(this, this.f147132i));
            this.f147131h = this.f147132i.s().h().d(new C17916L(this, this.f147132i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.Collection<DI.h0> m(cJ.C17069f r6) {
            /*
                r5 = this;
                java.util.Map<cJ.f, byte[]> r0 = r5.f147124a
                eJ.s<XI.i> r1 = XI.i.f139999w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C17542s.i(r1, r2)
                sJ.w r2 = r5.f147132i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002c
                sJ.w r3 = r5.f147132i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                sJ.w$c$a r0 = new sJ.w$c$a
                r0.<init>(r1, r4, r3)
                GJ.h r0 = GJ.C15768k.r(r0)
                java.util.List r0 = GJ.C15768k.a0(r0)
                if (r0 == 0) goto L_0x002c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L_0x0032
            L_0x002c:
                java.util.List r0 = YH.C16877v.n()
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x0032:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0042:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x006b
                java.lang.Object r1 = r0.next()
                XI.i r1 = (XI.i) r1
                qJ.p r4 = r2.s()
                qJ.K r4 = r4.f()
                kotlin.jvm.internal.C17542s.g(r1)
                DI.h0 r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r1 = 0
            L_0x0065:
                if (r1 == 0) goto L_0x0042
                r3.add(r1)
                goto L_0x0042
            L_0x006b:
                r2.n(r6, r3)
                java.util.List r6 = EJ.C15660a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sJ.C17946w.c.m(cJ.f):java.util.Collection");
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.Collection<DI.a0> n(cJ.C17069f r6) {
            /*
                r5 = this;
                java.util.Map<cJ.f, byte[]> r0 = r5.f147125b
                eJ.s<XI.n> r1 = XI.n.f140067w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C17542s.i(r1, r2)
                sJ.w r2 = r5.f147132i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002c
                sJ.w r3 = r5.f147132i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                sJ.w$c$a r0 = new sJ.w$c$a
                r0.<init>(r1, r4, r3)
                GJ.h r0 = GJ.C15768k.r(r0)
                java.util.List r0 = GJ.C15768k.a0(r0)
                if (r0 == 0) goto L_0x002c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L_0x0032
            L_0x002c:
                java.util.List r0 = YH.C16877v.n()
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x0032:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0042:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0063
                java.lang.Object r1 = r0.next()
                XI.n r1 = (XI.n) r1
                qJ.p r4 = r2.s()
                qJ.K r4 = r4.f()
                kotlin.jvm.internal.C17542s.g(r1)
                DI.a0 r1 = r4.u(r1)
                if (r1 == 0) goto L_0x0042
                r3.add(r1)
                goto L_0x0042
            L_0x0063:
                r2.o(r6, r3)
                java.util.List r6 = EJ.C15660a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sJ.C17946w.c.n(cJ.f):java.util.Collection");
        }

        private final m0 o(C17069f fVar) {
            r i02;
            byte[] bArr = this.f147126c.get(fVar);
            if (bArr == null || (i02 = r.i0(new ByteArrayInputStream(bArr), this.f147132i.s().c().k())) == null) {
                return null;
            }
            return this.f147132i.s().f().z(i02);
        }

        /* access modifiers changed from: private */
        public static final Set p(c cVar, C17946w wVar) {
            return g0.k(cVar.f147124a.keySet(), wVar.w());
        }

        /* access modifiers changed from: private */
        public static final Collection q(c cVar, C17069f fVar) {
            C17542s.j(fVar, "it");
            return cVar.m(fVar);
        }

        private final Map<C17069f, byte[]> r(Map<C17069f, ? extends Collection<? extends C17190a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C17190a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (C17190a c10 : iterable) {
                    c10.c(byteArrayOutputStream);
                    arrayList.add(C16807N.f139792a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Collection s(c cVar, C17069f fVar) {
            C17542s.j(fVar, "it");
            return cVar.n(fVar);
        }

        /* access modifiers changed from: private */
        public static final m0 t(c cVar, C17069f fVar) {
            C17542s.j(fVar, "it");
            return cVar.o(fVar);
        }

        /* access modifiers changed from: private */
        public static final Set u(c cVar, C17946w wVar) {
            return g0.k(cVar.f147125b.keySet(), wVar.x());
        }

        public Set<C17069f> a() {
            return (Set) C17993m.a(this.f147130g, this, f147123j[0]);
        }

        public Collection<a0> b(C17069f fVar, C16015b bVar) {
            C17542s.j(fVar, "name");
            C17542s.j(bVar, "location");
            return !c().contains(fVar) ? C16877v.n() : this.f147128e.invoke(fVar);
        }

        public Set<C17069f> c() {
            return (Set) C17993m.a(this.f147131h, this, f147123j[1]);
        }

        public Collection<h0> d(C17069f fVar, C16015b bVar) {
            C17542s.j(fVar, "name");
            C17542s.j(bVar, "location");
            return !a().contains(fVar) ? C16877v.n() : this.f147127d.invoke(fVar);
        }

        public m0 e(C17069f fVar) {
            C17542s.j(fVar, "name");
            return this.f147129f.invoke(fVar);
        }

        public void f(Collection<C15566m> collection, C17649d dVar, C17642l<? super C17069f, Boolean> lVar, C16015b bVar) {
            C17542s.j(collection, "result");
            C17542s.j(dVar, "kindFilter");
            C17542s.j(lVar, "nameFilter");
            C17542s.j(bVar, "location");
            if (dVar.a(C17649d.f144823c.i())) {
                ArrayList arrayList = new ArrayList();
                for (C17069f fVar : c()) {
                    if (lVar.invoke(fVar).booleanValue()) {
                        arrayList.addAll(b(fVar, bVar));
                    }
                }
                C17281l lVar2 = C17281l.f143309a;
                C17542s.i(lVar2, "INSTANCE");
                C16877v.C(arrayList, lVar2);
                collection.addAll(arrayList);
            }
            if (dVar.a(C17649d.f144823c.d())) {
                ArrayList arrayList2 = new ArrayList();
                for (C17069f fVar2 : a()) {
                    if (lVar.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(d(fVar2, bVar));
                    }
                }
                C17281l lVar3 = C17281l.f143309a;
                C17542s.i(lVar3, "INSTANCE");
                C16877v.C(arrayList2, lVar3);
                collection.addAll(arrayList2);
            }
        }

        public Set<C17069f> g() {
            return this.f147126c.keySet();
        }
    }

    static {
        Class<C17946w> cls = C17946w.class;
        f147103f = new C18064m[]{P.h(new G(cls, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), P.h(new G(cls, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};
    }

    protected C17946w(C17828p pVar, List<i> list, List<n> list2, List<r> list3, C17631a<? extends Collection<C17069f>> aVar) {
        C17542s.j(pVar, "c");
        C17542s.j(list, "functionList");
        C17542s.j(list2, "propertyList");
        C17542s.j(list3, "typeAliasList");
        C17542s.j(aVar, "classNames");
        this.f147104b = pVar;
        this.f147105c = q(list, list2, list3);
        this.f147106d = pVar.h().d(new C17944u(aVar));
        this.f147107e = pVar.h().a(new C17945v(this));
    }

    /* access modifiers changed from: private */
    public static final Set k(C17631a aVar) {
        return C16877v.y1((Iterable) aVar.invoke());
    }

    /* access modifiers changed from: private */
    public static final Set l(C17946w wVar) {
        Set<C17069f> v10 = wVar.v();
        if (v10 == null) {
            return null;
        }
        return g0.k(g0.k(wVar.t(), wVar.f147105c.g()), v10);
    }

    private final a q(List<i> list, List<n> list2, List<r> list3) {
        return this.f147104b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final C15558e r(C17069f fVar) {
        return this.f147104b.c().b(p(fVar));
    }

    private final Set<C17069f> u() {
        return (Set) C17993m.b(this.f147107e, this, f147103f[1]);
    }

    private final m0 y(C17069f fVar) {
        return this.f147105c.e(fVar);
    }

    /* access modifiers changed from: protected */
    public boolean A(h0 h0Var) {
        C17542s.j(h0Var, "function");
        return true;
    }

    public Set<C17069f> a() {
        return this.f147105c.a();
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return this.f147105c.b(fVar, bVar);
    }

    public Set<C17069f> c() {
        return this.f147105c.c();
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return this.f147105c.d(fVar, bVar);
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        if (z(fVar)) {
            return r(fVar);
        }
        if (this.f147105c.g().contains(fVar)) {
            return y(fVar);
        }
        return null;
    }

    public Set<C17069f> f() {
        return u();
    }

    /* access modifiers changed from: protected */
    public abstract void j(Collection<C15566m> collection, C17642l<? super C17069f, Boolean> lVar);

    /* access modifiers changed from: protected */
    public final Collection<C15566m> m(C17649d dVar, C17642l<? super C17069f, Boolean> lVar, C16015b bVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        C17542s.j(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        C17649d.a aVar = C17649d.f144823c;
        if (dVar.a(aVar.g())) {
            j(arrayList, lVar);
        }
        this.f147105c.f(arrayList, dVar, lVar, bVar);
        if (dVar.a(aVar.c())) {
            for (C17069f next : t()) {
                if (lVar.invoke(next).booleanValue()) {
                    C15660a.a(arrayList, r(next));
                }
            }
        }
        if (dVar.a(C17649d.f144823c.h())) {
            for (C17069f next2 : this.f147105c.g()) {
                if (lVar.invoke(next2).booleanValue()) {
                    C15660a.a(arrayList, this.f147105c.e(next2));
                }
            }
        }
        return C15660a.c(arrayList);
    }

    /* access modifiers changed from: protected */
    public void n(C17069f fVar, List<h0> list) {
        C17542s.j(fVar, "name");
        C17542s.j(list, "functions");
    }

    /* access modifiers changed from: protected */
    public void o(C17069f fVar, List<a0> list) {
        C17542s.j(fVar, "name");
        C17542s.j(list, "descriptors");
    }

    /* access modifiers changed from: protected */
    public abstract C17065b p(C17069f fVar);

    /* access modifiers changed from: protected */
    public final C17828p s() {
        return this.f147104b;
    }

    public final Set<C17069f> t() {
        return (Set) C17993m.a(this.f147106d, this, f147103f[0]);
    }

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> v();

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> w();

    /* access modifiers changed from: protected */
    public abstract Set<C17069f> x();

    /* access modifiers changed from: protected */
    public boolean z(C17069f fVar) {
        C17542s.j(fVar, "name");
        return t().contains(fVar);
    }
}
