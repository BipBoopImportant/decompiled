package J1;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", "a", "(LU0/m;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final Resources a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        mVar.Q(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getResources();
        if (C4895p.J()) {
            C4895p.R();
        }
        return resources;
    }
}
