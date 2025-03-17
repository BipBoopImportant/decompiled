package nJ;

import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import EJ.C15669j;
import LI.C16015b;
import YH.C16877v;
import cJ.C17069f;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: nJ.l  reason: case insensitive filesystem */
public abstract class C17657l implements C17656k {
    public Set<C17069f> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : g(C17649d.f144842v, C15669j.k())) {
            if (next instanceof h0) {
                C17069f name = ((h0) next).getName();
                C17542s.i(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Collection<? extends a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C16877v.n();
    }

    public Set<C17069f> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : g(C17649d.f144843w, C15669j.k())) {
            if (next instanceof h0) {
                C17069f name = ((h0) next).getName();
                C17542s.i(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Collection<? extends h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C16877v.n();
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return null;
    }

    public Set<C17069f> f() {
        return null;
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return C16877v.n();
    }
}
