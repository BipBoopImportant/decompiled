package uJ;

import DI.C15561h;
import DI.n0;
import GI.C15726U;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vJ.i;
import vJ.r;
import vJ.s;
import yJ.C18736e;

/* renamed from: uJ.z  reason: case insensitive filesystem */
public final class C18145z extends C18078B implements C18143x, C18736e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f147953d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f147954b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f147955c;

    /* renamed from: uJ.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(P0 p02) {
            return (p02.N0() instanceof r) || (p02.N0().e() instanceof n0) || (p02 instanceof i) || (p02 instanceof C18131o0);
        }

        public static /* synthetic */ C18145z c(a aVar, P0 p02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(p02, z10, z11);
        }

        private final boolean d(P0 p02, boolean z10) {
            if (!a(p02)) {
                return false;
            }
            if (p02 instanceof C18131o0) {
                return M0.l(p02);
            }
            C15561h e10 = p02.N0().e();
            C15726U u10 = e10 instanceof C15726U ? (C15726U) e10 : null;
            if (u10 == null || u10.T0()) {
                return (!z10 || !(p02.N0().e() instanceof n0)) ? !s.f149074a.a(p02) : M0.l(p02);
            }
            return true;
        }

        public final C18145z b(P0 p02, boolean z10, boolean z11) {
            C17542s.j(p02, "type");
            if (p02 instanceof C18145z) {
                return (C18145z) p02;
            }
            if (!z11 && !d(p02, z10)) {
                return null;
            }
            if (p02 instanceof C18087K) {
                C18087K k10 = (C18087K) p02;
                C17542s.e(k10.V0().N0(), k10.W0().N0());
            }
            return new C18145z(C18090N.c(p02).U0(false), z10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C18145z(C18113f0 f0Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, z10);
    }

    public boolean F0() {
        return (W0().N0() instanceof r) || (W0().N0().e() instanceof n0);
    }

    public boolean O0() {
        return false;
    }

    public C18096U S(C18096U u10) {
        C17542s.j(u10, "replacement");
        return C18121j0.e(u10.Q0(), this.f147955c);
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        return z10 ? W0().U0(z10) : this;
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new C18145z(W0().V0(u0Var), this.f147955c);
    }

    /* access modifiers changed from: protected */
    public C18113f0 W0() {
        return this.f147954b;
    }

    public final C18113f0 Z0() {
        return this.f147954b;
    }

    /* renamed from: a1 */
    public C18145z Y0(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        return new C18145z(f0Var, this.f147955c);
    }

    public String toString() {
        return W0() + " & Any";
    }

    private C18145z(C18113f0 f0Var, boolean z10) {
        this.f147954b = f0Var;
        this.f147955c = z10;
    }
}
