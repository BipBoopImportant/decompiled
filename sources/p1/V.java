package p1;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp1/V0;", "Landroid/graphics/PathEffect;", "b", "(Lp1/V0;)Landroid/graphics/PathEffect;", "", "intervals", "", "phase", "a", "([FF)Lp1/V0;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class V {
    public static final V0 a(float[] fArr, float f10) {
        return new U(new DashPathEffect(fArr, f10));
    }

    public static final PathEffect b(V0 v02) {
        C17542s.h(v02, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((U) v02).a();
    }
}
