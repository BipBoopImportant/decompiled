package com.ingka.ikea.app.uicomponents.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/TapTwiceWorkaroundRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TapTwiceWorkaroundRecyclerView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapTwiceWorkaroundRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "e");
        boolean z10 = getScrollState() == 2;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && z10) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                M1();
                return false;
            }
        }
        return onInterceptTouchEvent;
    }
}
