package PI;

import DI.C15544O;
import DI.C15550V;
import EJ.C15660a;
import MI.C16075t;
import PI.C16206p;
import QI.C16252D;
import TI.u;
import XH.C16814e;
import XH.C16825p;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tJ.C17981a;

/* renamed from: PI.j  reason: case insensitive filesystem */
public final class C16200j implements C15550V {

    /* renamed from: a  reason: collision with root package name */
    private final C16201k f137186a;

    /* renamed from: b  reason: collision with root package name */
    private final C17981a<C17066c, C16252D> f137187b;

    public C16200j(C16194d dVar) {
        C17542s.j(dVar, "components");
        C16201k kVar = new C16201k(dVar, C16206p.a.f137199a, C16825p.c(null));
        this.f137186a = kVar;
        this.f137187b = kVar.e().b();
    }

    private final C16252D e(C17066c cVar) {
        u a10 = C16075t.a(this.f137186a.a().d(), cVar, false, 2, (Object) null);
        if (a10 == null) {
            return null;
        }
        return this.f137187b.a(cVar, new C16199i(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16252D f(C16200j jVar, u uVar) {
        return new C16252D(jVar.f137186a, uVar);
    }

    public boolean a(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return C16075t.a(this.f137186a.a().d(), cVar, false, 2, (Object) null) == null;
    }

    @C16814e
    public List<C16252D> b(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return C16877v.r(e(cVar));
    }

    public void c(C17066c cVar, Collection<C15544O> collection) {
        C17542s.j(cVar, "fqName");
        C17542s.j(collection, "packageFragments");
        C15660a.a(collection, e(cVar));
    }

    /* renamed from: g */
    public List<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        C16252D e10 = e(cVar);
        List<C17066c> Q02 = e10 != null ? e10.Q0() : null;
        return Q02 == null ? C16877v.n() : Q02;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f137186a.a().m();
    }
}
