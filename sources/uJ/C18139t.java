package uJ;

import EI.C15649h;
import EI.C15651j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import uI.C18055d;

/* renamed from: uJ.t  reason: case insensitive filesystem */
public final class C18139t extends s0<C18139t> {

    /* renamed from: a  reason: collision with root package name */
    private final C15649h f147929a;

    public C18139t(C15649h hVar) {
        C17542s.j(hVar, "annotations");
        this.f147929a = hVar;
    }

    public C18055d<? extends C18139t> b() {
        return P.b(C18139t.class);
    }

    /* renamed from: d */
    public C18139t a(C18139t tVar) {
        return tVar == null ? this : new C18139t(C15651j.a(this.f147929a, tVar.f147929a));
    }

    public final C15649h e() {
        return this.f147929a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18139t)) {
            return false;
        }
        return C17542s.e(((C18139t) obj).f147929a, this.f147929a);
    }

    /* renamed from: f */
    public C18139t c(C18139t tVar) {
        if (C17542s.e(tVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f147929a.hashCode();
    }
}
