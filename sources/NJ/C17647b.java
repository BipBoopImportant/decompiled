package nJ;

import DI.C15534E;
import DI.C15561h;
import DI.C15562i;
import DI.C15566m;
import DI.a0;
import DI.h0;
import DJ.C15580a;
import EJ.C15670k;
import LI.C16015b;
import YH.C16870n;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nJ.C17656k;

/* renamed from: nJ.b  reason: case insensitive filesystem */
public final class C17647b implements C17656k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f144817d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f144818b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17656k[] f144819c;

    /* renamed from: nJ.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17656k a(String str, Iterable<? extends C17656k> iterable) {
            C17542s.j(str, "debugName");
            C17542s.j(iterable, "scopes");
            C15670k kVar = new C15670k();
            for (C17656k kVar2 : iterable) {
                if (kVar2 != C17656k.b.f144864b) {
                    if (kVar2 instanceof C17647b) {
                        C16877v.F(kVar, ((C17647b) kVar2).f144819c);
                    } else {
                        kVar.add(kVar2);
                    }
                }
            }
            return b(str, kVar);
        }

        public final C17656k b(String str, List<? extends C17656k> list) {
            C17542s.j(str, "debugName");
            C17542s.j(list, "scopes");
            int size = list.size();
            return size != 0 ? size != 1 ? new C17647b(str, (C17656k[]) list.toArray(new C17656k[0]), (DefaultConstructorMarker) null) : (C17656k) list.get(0) : C17656k.b.f144864b;
        }

        private a() {
        }
    }

    public /* synthetic */ C17647b(String str, C17656k[] kVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVarArr);
    }

    public Set<C17069f> a() {
        C17656k[] kVarArr = this.f144819c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17656k a10 : kVarArr) {
            C16877v.E(linkedHashSet, a10.a());
        }
        return linkedHashSet;
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C17656k[] kVarArr = this.f144819c;
        int length = kVarArr.length;
        if (length == 0) {
            return C16877v.n();
        }
        if (length == 1) {
            return kVarArr[0].b(fVar, bVar);
        }
        Collection<a0> collection = null;
        for (C17656k b10 : kVarArr) {
            collection = C15580a.a(collection, b10.b(fVar, bVar));
        }
        return collection == null ? g0.d() : collection;
    }

    public Set<C17069f> c() {
        C17656k[] kVarArr = this.f144819c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17656k c10 : kVarArr) {
            C16877v.E(linkedHashSet, c10.c());
        }
        return linkedHashSet;
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C17656k[] kVarArr = this.f144819c;
        int length = kVarArr.length;
        if (length == 0) {
            return C16877v.n();
        }
        if (length == 1) {
            return kVarArr[0].d(fVar, bVar);
        }
        Collection<h0> collection = null;
        for (C17656k d10 : kVarArr) {
            collection = C15580a.a(collection, d10.d(fVar, bVar));
        }
        return collection == null ? g0.d() : collection;
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15561h hVar = null;
        for (C17656k e10 : this.f144819c) {
            C15561h e11 = e10.e(fVar, bVar);
            if (e11 != null) {
                if (!(e11 instanceof C15562i) || !((C15534E) e11).m0()) {
                    return e11;
                }
                if (hVar == null) {
                    hVar = e11;
                }
            }
        }
        return hVar;
    }

    public Set<C17069f> f() {
        return C17658m.a(C16870n.T(this.f144819c));
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        C17656k[] kVarArr = this.f144819c;
        int length = kVarArr.length;
        if (length == 0) {
            return C16877v.n();
        }
        if (length == 1) {
            return kVarArr[0].g(dVar, lVar);
        }
        Collection<C15566m> collection = null;
        for (C17656k g10 : kVarArr) {
            collection = C15580a.a(collection, g10.g(dVar, lVar));
        }
        return collection == null ? g0.d() : collection;
    }

    public String toString() {
        return this.f144818b;
    }

    private C17647b(String str, C17656k[] kVarArr) {
        this.f144818b = str;
        this.f144819c = kVarArr;
    }
}
