package uJ;

import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import tJ.C17989i;
import tJ.C17994n;
import vJ.g;

/* renamed from: uJ.a0  reason: case insensitive filesystem */
public final class C18103a0 extends R0 {

    /* renamed from: b  reason: collision with root package name */
    private final C17994n f147867b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C18096U> f147868c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i<C18096U> f147869d;

    public C18103a0(C17994n nVar, C17631a<? extends C18096U> aVar) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(aVar, "computation");
        this.f147867b = nVar;
        this.f147868c = aVar;
        this.f147869d = nVar.d(aVar);
    }

    /* access modifiers changed from: private */
    public static final C18096U V0(g gVar, C18103a0 a0Var) {
        return gVar.h(a0Var.f147868c.invoke());
    }

    /* access modifiers changed from: protected */
    public C18096U R0() {
        return (C18096U) this.f147869d.invoke();
    }

    public boolean S0() {
        return this.f147869d.w();
    }

    /* renamed from: U0 */
    public C18103a0 P0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return new C18103a0(this.f147867b, new C18101Z(gVar, this));
    }
}
