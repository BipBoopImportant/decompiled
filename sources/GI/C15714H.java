package GI;

import DI.C15538I;
import DI.C15544O;
import DI.C15566m;
import DI.C15568o;
import DI.i0;
import EI.C15649h;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;

/* renamed from: GI.H  reason: case insensitive filesystem */
public abstract class C15714H extends C15744n implements C15544O {

    /* renamed from: e  reason: collision with root package name */
    private final C17066c f134502e;

    /* renamed from: f  reason: collision with root package name */
    private final String f134503f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15714H(C15538I i10, C17066c cVar) {
        super(i10, C15649h.f134231V.b(), cVar.g(), i0.f133841a);
        C17542s.j(i10, "module");
        C17542s.j(cVar, "fqName");
        this.f134502e = cVar;
        this.f134503f = "package " + cVar + " of " + i10;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        C17542s.j(oVar, "visitor");
        return oVar.e(this, d10);
    }

    public final C17066c f() {
        return this.f134502e;
    }

    public i0 i() {
        i0 i0Var = i0.f133841a;
        C17542s.i(i0Var, "NO_SOURCE");
        return i0Var;
    }

    public String toString() {
        return this.f134503f;
    }

    public C15538I b() {
        C15566m b10 = super.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (C15538I) b10;
    }
}
