package p0;

import U0.C4889m;
import U0.C4895p;
import c2.t;
import i1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.z;
import m0.C5570z;
import n0.C5596b;
import n0.T;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lp0/C;", "", "<init>", "()V", "Lp0/s;", "a", "(LU0/m;I)Lp0/s;", "Ln0/T;", "b", "(LU0/m;I)Ln0/T;", "Lc2/t;", "layoutDirection", "Lp0/v;", "orientation", "", "reverseScrolling", "c", "(Lc2/t;Lp0/v;Z)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.C  reason: case insensitive filesystem */
public final class C5680C {

    /* renamed from: a  reason: collision with root package name */
    public static final C5680C f26791a = new C5680C();

    private C5680C() {
    }

    public final s a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        C5570z b10 = z.b(mVar, 0);
        boolean V10 = mVar.V(b10);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new C5693k(b10, (h) null, 2, (DefaultConstructorMarker) null);
            mVar.u(D10);
        }
        C5693k kVar = (C5693k) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return kVar;
    }

    public final T b(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        T a10 = C5596b.a(mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    public final boolean c(t tVar, v vVar, boolean z10) {
        return (tVar != t.Rtl || vVar == v.Vertical) ? !z10 : z10;
    }
}
