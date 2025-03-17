package uJ;

import EI.C15642a;
import EI.C15649h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import vJ.g;
import vJ.v;
import yJ.C18740i;

/* renamed from: uJ.U  reason: case insensitive filesystem */
public abstract class C18096U implements C15642a, C18740i {

    /* renamed from: a  reason: collision with root package name */
    private int f147848a;

    public /* synthetic */ C18096U(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int K0() {
        return C18100Y.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List<E0> L0();

    public abstract u0 M0();

    public abstract y0 N0();

    public abstract boolean O0();

    public abstract C18096U P0(g gVar);

    public abstract P0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18096U)) {
            return false;
        }
        C18096U u10 = (C18096U) obj;
        return O0() == u10.O0() && v.f149077a.a(Q0(), u10.Q0());
    }

    public C15649h getAnnotations() {
        return C18140u.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f147848a;
        if (i10 != 0) {
            return i10;
        }
        int K02 = K0();
        this.f147848a = K02;
        return K02;
    }

    public abstract C17656k q();

    private C18096U() {
    }
}
