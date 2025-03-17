package a9;

import G8.g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.s2  reason: case insensitive filesystem */
public final class C6927s2 implements E0 {
    public final boolean a(View view, ViewGroup viewGroup) {
        C17542s.j(view, "thisView");
        C17542s.j(viewGroup, "withThisParent");
        return (view instanceof ImageView) && (g.h(viewGroup, "SwipeRefreshLayout") || g.h(viewGroup, "SwipeToRefreshLayout"));
    }
}
