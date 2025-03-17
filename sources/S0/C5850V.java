package s0;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019\u001a8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Ls0/T;", "insets", "j", "(Ls0/T;Ls0/T;)Ls0/T;", "h", "d", "Ls0/Y;", "sides", "i", "(Ls0/T;I)Ls0/T;", "Ls0/E;", "f", "(Ls0/T;LU0/m;I)Ls0/E;", "Lc2/d;", "density", "g", "(Ls0/T;Lc2/d;)Ls0/E;", "e", "(Ls0/E;)Ls0/T;", "", "left", "top", "right", "bottom", "a", "(IIII)Ls0/T;", "Lc2/h;", "b", "(FFFF)Ls0/T;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.V  reason: case insensitive filesystem */
public final class C5850V {
    public static final C5848T a(int i10, int i11, int i12, int i13) {
        return new C5869o(i10, i11, i12, i13);
    }

    public static final C5848T b(float f10, float f11, float f12, float f13) {
        return new C5868n(f10, f11, f12, f13, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5848T c(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.B((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.B((float) 0);
        }
        return b(f10, f11, f12, f13);
    }

    public static final C5848T d(C5848T t10, C5848T t11) {
        return new C5855a(t10, t11);
    }

    public static final C5848T e(C5834E e10) {
        return new C5837H(e10);
    }

    public static final C5834E f(C5848T t10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        C5877w wVar = new C5877w(t10, (d) mVar.Q(C5100f0.e()));
        if (C4895p.J()) {
            C4895p.R();
        }
        return wVar;
    }

    public static final C5834E g(C5848T t10, d dVar) {
        return new C5877w(t10, dVar);
    }

    public static final C5848T h(C5848T t10, C5848T t11) {
        return new C5867m(t10, t11);
    }

    public static final C5848T i(C5848T t10, int i10) {
        return new C5832C(t10, i10, (DefaultConstructorMarker) null);
    }

    public static final C5848T j(C5848T t10, C5848T t11) {
        return new C5846Q(t10, t11);
    }
}
