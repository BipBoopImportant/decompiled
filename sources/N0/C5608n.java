package n0;

import U0.C4889m;
import U0.C4895p;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(LU0/m;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.n  reason: case insensitive filesystem */
public final class C5608n {
    public static final boolean a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z10 = (((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (C4895p.J()) {
            C4895p.R();
        }
        return z10;
    }
}
