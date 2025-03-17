package uJ;

import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;

public abstract class R0 extends C18096U {
    public R0() {
        super((DefaultConstructorMarker) null);
    }

    public List<E0> L0() {
        return R0().L0();
    }

    public u0 M0() {
        return R0().M0();
    }

    public y0 N0() {
        return R0().N0();
    }

    public boolean O0() {
        return R0().O0();
    }

    public final P0 Q0() {
        C18096U R02 = R0();
        while (R02 instanceof R0) {
            R02 = ((R0) R02).R0();
        }
        C17542s.h(R02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (P0) R02;
    }

    /* access modifiers changed from: protected */
    public abstract C18096U R0();

    public boolean S0() {
        return true;
    }

    public C17656k q() {
        return R0().q();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
