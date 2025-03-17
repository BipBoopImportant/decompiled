package nJ;

import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import DI.k0;
import EJ.C15660a;
import LI.C16015b;
import XH.C16824o;
import XH.C16825p;
import cJ.C17069f;
import hJ.C17334e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17659n;
import uJ.H0;
import uJ.J0;

/* renamed from: nJ.t  reason: case insensitive filesystem */
public final class C17665t implements C17656k {

    /* renamed from: b  reason: collision with root package name */
    private final C17656k f144874b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f144875c;

    /* renamed from: d  reason: collision with root package name */
    private final J0 f144876d;

    /* renamed from: e  reason: collision with root package name */
    private Map<C15566m, C15566m> f144877e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f144878f = C16825p.b(new C17664s(this));

    public C17665t(C17656k kVar, J0 j02) {
        C17542s.j(kVar, "workerScope");
        C17542s.j(j02, "givenSubstitutor");
        this.f144874b = kVar;
        this.f144875c = C16825p.b(new C17663r(j02));
        H0 j10 = j02.j();
        C17542s.i(j10, "getSubstitution(...)");
        this.f144876d = C17334e.h(j10, false, 1, (Object) null).c();
    }

    /* access modifiers changed from: private */
    public static final Collection h(C17665t tVar) {
        return tVar.m(C17659n.a.a(tVar.f144874b, (C17649d) null, (C17642l) null, 3, (Object) null));
    }

    private final Collection<C15566m> k() {
        return (Collection) this.f144878f.getValue();
    }

    private final <D extends C15566m> D l(D d10) {
        if (this.f144876d.k()) {
            return d10;
        }
        if (this.f144877e == null) {
            this.f144877e = new HashMap();
        }
        Map<C15566m, C15566m> map = this.f144877e;
        C17542s.g(map);
        D d11 = map.get(d10);
        if (d11 == null) {
            if (d10 instanceof k0) {
                d11 = ((k0) d10).c(this.f144876d);
                if (d11 != null) {
                    map.put(d10, d11);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
        }
        D d12 = (C15566m) d11;
        C17542s.h(d12, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d12;
    }

    private final <D extends C15566m> Collection<D> m(Collection<? extends D> collection) {
        if (this.f144876d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g10 = C15660a.g(collection.size());
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            g10.add(l((C15566m) it.next()));
        }
        return g10;
    }

    /* access modifiers changed from: private */
    public static final J0 n(J0 j02) {
        return j02.j().c();
    }

    public Set<C17069f> a() {
        return this.f144874b.a();
    }

    public Collection<? extends a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return m(this.f144874b.b(fVar, bVar));
    }

    public Set<C17069f> c() {
        return this.f144874b.c();
    }

    public Collection<? extends h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return m(this.f144874b.d(fVar, bVar));
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15561h e10 = this.f144874b.e(fVar, bVar);
        if (e10 != null) {
            return (C15561h) l(e10);
        }
        return null;
    }

    public Set<C17069f> f() {
        return this.f144874b.f();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return k();
    }
}
