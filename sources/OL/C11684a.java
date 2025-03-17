package ol;

import U0.C4889m;
import U0.C4895p;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "b", "(LU0/m;I)Z", "T", "portrait", "landscape", "a", "(Ljava/lang/Object;Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ol.a  reason: case insensitive filesystem */
public final class C11684a {
    public static final <T> T a(T t10, T t11, C4889m mVar, int i10) {
        mVar.W(-1426468209);
        if (C4895p.J()) {
            C4895p.S(-1426468209, i10, -1, "com.ingka.ikea.app.uicomposables.getOrientationSpecificValue (CommonComposeFunctions.kt:21)");
        }
        if (!b(mVar, 0)) {
            t10 = t11;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return t10;
    }

    public static final boolean b(C4889m mVar, int i10) {
        mVar.W(709444168);
        if (C4895p.J()) {
            C4895p.S(709444168, i10, -1, "com.ingka.ikea.app.uicomposables.isInPortrait (CommonComposeFunctions.kt:15)");
        }
        boolean z10 = ((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).screenWidthDp < 600;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }
}
