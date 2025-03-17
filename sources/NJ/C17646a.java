package nJ;

import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import LI.C16015b;
import cJ.C17069f;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: nJ.a  reason: case insensitive filesystem */
public abstract class C17646a implements C17656k {
    public Set<C17069f> a() {
        return i().a();
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return i().b(fVar, bVar);
    }

    public Set<C17069f> c() {
        return i().c();
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return i().d(fVar, bVar);
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return i().e(fVar, bVar);
    }

    public Set<C17069f> f() {
        return i().f();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return i().g(dVar, lVar);
    }

    public final C17656k h() {
        if (!(i() instanceof C17646a)) {
            return i();
        }
        C17656k i10 = i();
        C17542s.h(i10, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C17646a) i10).h();
    }

    /* access modifiers changed from: protected */
    public abstract C17656k i();
}
