package nJ;

import DI.C15558e;
import DI.C15561h;
import DI.C15562i;
import DI.m0;
import LI.C16015b;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: nJ.g  reason: case insensitive filesystem */
public final class C17652g extends C17657l {

    /* renamed from: b  reason: collision with root package name */
    private final C17656k f144857b;

    public C17652g(C17656k kVar) {
        C17542s.j(kVar, "workerScope");
        this.f144857b = kVar;
    }

    public Set<C17069f> a() {
        return this.f144857b.a();
    }

    public Set<C17069f> c() {
        return this.f144857b.c();
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15561h e10 = this.f144857b.e(fVar, bVar);
        if (e10 == null) {
            return null;
        }
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        if (eVar != null) {
            return eVar;
        }
        if (e10 instanceof m0) {
            return (m0) e10;
        }
        return null;
    }

    public Set<C17069f> f() {
        return this.f144857b.f();
    }

    /* renamed from: h */
    public List<C15561h> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        C17649d n10 = dVar.n(C17649d.f144823c.c());
        if (n10 == null) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f144857b.g(n10, lVar)) {
            if (next instanceof C15562i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f144857b;
    }
}
