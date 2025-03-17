package uJ;

import DI.n0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import kotlin.jvm.internal.C17542s;
import vJ.g;

/* renamed from: uJ.m0  reason: case insensitive filesystem */
public final class C18127m0 extends F0 {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f147903a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f147904b = C16825p.a(s.PUBLICATION, new C18125l0(this));

    public C18127m0(n0 n0Var) {
        C17542s.j(n0Var, "typeParameter");
        this.f147903a = n0Var;
    }

    /* access modifiers changed from: private */
    public static final C18096U d(C18127m0 m0Var) {
        return C18129n0.b(m0Var.f147903a);
    }

    private final C18096U f() {
        return (C18096U) this.f147904b.getValue();
    }

    public boolean a() {
        return true;
    }

    public E0 b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    public Q0 c() {
        return Q0.OUT_VARIANCE;
    }

    public C18096U getType() {
        return f();
    }
}
