package a9;

import android.view.View;
import kotlin.jvm.internal.C17542s;

public final class C6 {
    public static boolean a(View view) {
        C17542s.j(view, "view");
        return view.isLaidOut() && view.getVisibility() == 0 && (view.getAnimation() != null || !view.getMatrix().isIdentity());
    }
}
