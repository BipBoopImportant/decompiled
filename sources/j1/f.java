package J1;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "Lc2/h;", "a", "(ILU0/m;I)F", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final float a(int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(804324951, i11, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float B10 = h.B(((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getResources().getDimension(i10) / ((d) mVar.Q(C5100f0.e())).getDensity());
        if (C4895p.J()) {
            C4895p.R();
        }
        return B10;
    }
}
