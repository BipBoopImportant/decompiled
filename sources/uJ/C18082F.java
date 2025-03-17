package uJ;

import fJ.n;
import fJ.w;
import kotlin.jvm.internal.C17542s;
import vJ.g;
import yJ.C18737f;
import zJ.C18755d;

/* renamed from: uJ.F  reason: case insensitive filesystem */
public final class C18082F extends C18087K implements C18737f {

    /* renamed from: d  reason: collision with root package name */
    private final u0 f147814d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18082F(AI.C15429j r3, uJ.u0 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            uJ.f0 r0 = r3.I()
            java.lang.String r1 = "getNothingType(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            uJ.f0 r3 = r3.J()
            java.lang.String r1 = "getNullableAnyType(...)"
            kotlin.jvm.internal.C17542s.i(r3, r1)
            r2.<init>(r0, r3)
            r2.f147814d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.C18082F.<init>(AI.j, uJ.u0):void");
    }

    public u0 M0() {
        return this.f147814d;
    }

    public boolean O0() {
        return false;
    }

    public C18113f0 U0() {
        return W0();
    }

    public String X0(n nVar, w wVar) {
        C17542s.j(nVar, "renderer");
        C17542s.j(wVar, "options");
        return "dynamic";
    }

    /* renamed from: Y0 */
    public C18082F R0(boolean z10) {
        return this;
    }

    /* renamed from: Z0 */
    public C18082F S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: a1 */
    public C18082F T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new C18082F(C18755d.n(U0()), u0Var);
    }
}
