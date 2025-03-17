package uJ;

import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import vJ.r;
import yJ.C18742k;

/* renamed from: uJ.o0  reason: case insensitive filesystem */
public final class C18131o0 extends C18110e implements C18742k {

    /* renamed from: f  reason: collision with root package name */
    private final y0 f147908f;

    /* renamed from: g  reason: collision with root package name */
    private final C17656k f147909g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18131o0(r rVar, boolean z10, y0 y0Var) {
        super(rVar, z10);
        C17542s.j(rVar, "originalTypeVariable");
        C17542s.j(y0Var, "constructor");
        this.f147908f = y0Var;
        this.f147909g = rVar.p().i().q();
    }

    public y0 N0() {
        return this.f147908f;
    }

    public C18110e X0(boolean z10) {
        return new C18131o0(W0(), z10, N0());
    }

    public C17656k q() {
        return this.f147909g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(W0());
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }
}
