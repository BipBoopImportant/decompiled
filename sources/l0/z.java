package l0;

import U0.C4889m;
import U0.C4895p;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import kotlin.Metadata;
import m0.C5523B;
import m0.C5570z;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lm0/z;", "b", "(LU0/m;I)Lm0/z;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final float f25441a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f25441a;
    }

    public static final <T> C5570z<T> b(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) mVar.Q(C5100f0.e());
        boolean c10 = mVar.c(dVar.getDensity());
        Object D10 = mVar.D();
        if (c10 || D10 == C4889m.f14007a.a()) {
            D10 = C5523B.d(new y(dVar));
            mVar.u(D10);
        }
        C5570z<T> zVar = (C5570z) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return zVar;
    }
}
