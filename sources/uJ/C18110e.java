package uJ;

import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import vJ.g;
import vJ.r;
import wJ.C18226h;
import wJ.C18230l;

/* renamed from: uJ.e  reason: case insensitive filesystem */
public abstract class C18110e extends C18113f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147872e = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final r f147873b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f147874c;

    /* renamed from: d  reason: collision with root package name */
    private final C17656k f147875d;

    /* renamed from: uJ.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C18110e(r rVar, boolean z10) {
        C17542s.j(rVar, "originalTypeVariable");
        this.f147873b = rVar;
        this.f147874c = z10;
        this.f147875d = C18230l.b(C18226h.STUB_TYPE_SCOPE, rVar.toString());
    }

    public List<E0> L0() {
        return C16877v.n();
    }

    public u0 M0() {
        return u0.f147932b.k();
    }

    public boolean O0() {
        return this.f147874c;
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        return z10 == O0() ? this : X0(z10);
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return this;
    }

    public final r W0() {
        return this.f147873b;
    }

    public abstract C18110e X0(boolean z10);

    /* renamed from: Y0 */
    public C18110e S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    public C17656k q() {
        return this.f147875d;
    }
}
