package wJ;

import AI.C15426g;
import AI.C15429j;
import DI.C15537H;
import DI.C15538I;
import DI.C15551W;
import DI.C15566m;
import DI.C15568o;
import EI.C15649h;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: wJ.e  reason: case insensitive filesystem */
public final class C18223e implements C15538I {

    /* renamed from: a  reason: collision with root package name */
    public static final C18223e f149151a = new C18223e();

    /* renamed from: b  reason: collision with root package name */
    private static final C17069f f149152b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<C15538I> f149153c = C16877v.n();

    /* renamed from: d  reason: collision with root package name */
    private static final List<C15538I> f149154d = C16877v.n();

    /* renamed from: e  reason: collision with root package name */
    private static final Set<C15538I> f149155e = g0.d();

    /* renamed from: f  reason: collision with root package name */
    private static final C16824o f149156f = C16825p.b(C18222d.f149150a);

    static {
        C17069f D10 = C17069f.D(C18220b.ERROR_MODULE.b());
        C17542s.i(D10, "special(...)");
        f149152b = D10;
    }

    private C18223e() {
    }

    /* access modifiers changed from: private */
    public static final C15426g j0() {
        return C15426g.f132982h.a();
    }

    public List<C15538I> A0() {
        return f149154d;
    }

    public C17069f F0() {
        return f149152b;
    }

    public C15566m a() {
        return this;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        C17542s.j(oVar, "visitor");
        return null;
    }

    public C15566m b() {
        return null;
    }

    public C15649h getAnnotations() {
        return C15649h.f134231V.b();
    }

    public C17069f getName() {
        return F0();
    }

    public <T> T l0(C15537H<T> h10) {
        C17542s.j(h10, "capability");
        return null;
    }

    public C15429j p() {
        return (C15429j) f149156f.getValue();
    }

    public Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        return C16877v.n();
    }

    public C15551W v0(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    public boolean z(C15538I i10) {
        C17542s.j(i10, "targetModule");
        return false;
    }
}
