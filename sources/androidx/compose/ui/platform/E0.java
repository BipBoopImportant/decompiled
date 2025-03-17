package androidx.compose.ui.platform;

import U0.C4889m;
import U0.C4895p;
import android.view.View;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;
import tI.C17978n;
import z1.C6271a;
import z1.e;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0002\u001a\"\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0011\u001a\u00020\u0004*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001a\u001a\u00020\u0004*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "e", "(F)F", "offset", "", "f", "(F)I", "i", "(I)F", "l", "", "consumed", "Lo1/g;", "available", "j", "([IJ)J", "Lz1/e;", "k", "(I)I", "Landroid/view/View;", "hostView", "Lz1/a;", "h", "(Landroid/view/View;LU0/m;II)Lz1/a;", "g", "(J)I", "scrollAxes", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class E0 {
    private static final float e(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil((double) f10) : Math.floor((double) f10));
    }

    public static final int f(float f10) {
        return ((int) e(f10)) * -1;
    }

    /* access modifiers changed from: private */
    public static final int g(long j10) {
        int i10 = Math.abs(C5667g.m(j10)) >= 0.5f ? 1 : 0;
        return Math.abs(C5667g.n(j10)) >= 0.5f ? i10 | 2 : i10;
    }

    public static final C6271a h(View view, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            view = (View) mVar.Q(AndroidCompositionLocals_androidKt.k());
        }
        if (C4895p.J()) {
            C4895p.S(1075877987, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        boolean V10 = mVar.V(view);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new D0(view);
            mVar.u(D10);
        }
        D0 d02 = (D0) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return d02;
    }

    private static final float i(int i10) {
        return ((float) i10) * -1.0f;
    }

    /* access modifiers changed from: private */
    public static final long j(int[] iArr, long j10) {
        return C5668h.a(C5667g.m(j10) >= 0.0f ? C17978n.h(i(iArr[0]), C5667g.m(j10)) : C17978n.d(i(iArr[0]), C5667g.m(j10)), C5667g.n(j10) >= 0.0f ? C17978n.h(i(iArr[1]), C5667g.n(j10)) : C17978n.d(i(iArr[1]), C5667g.n(j10)));
    }

    /* access modifiers changed from: private */
    public static final int k(int i10) {
        return e.d(i10, e.f32374a.b()) ^ true ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final float l(float f10) {
        return f10 * -1.0f;
    }
}
