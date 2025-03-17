package rK;

import G1.C4505h;
import G1.C4506i;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG1/h;", "LrK/l;", "b", "(LG1/h;)LrK/l;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.n  reason: case insensitive filesystem */
public final class C17879n {
    public static final C17877l b(C4505h hVar) {
        C17542s.j(hVar, "<this>");
        return new C17878m(hVar);
    }

    /* access modifiers changed from: private */
    public static final void c(C4505h hVar) {
        C17542s.j(hVar, "$this_hapticFeedbackPerformer");
        ((View) C4506i.a(hVar, AndroidCompositionLocals_androidKt.k())).performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 13 : 6);
    }
}
