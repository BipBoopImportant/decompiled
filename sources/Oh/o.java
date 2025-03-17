package oH;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/view/View;", "LoH/m;", "d", "(Landroid/view/View;)LoH/m;", "paddingDimensions", "c", "marginDimensions", "insetter"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class o {
    /* access modifiers changed from: private */
    public static final m c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return m.f145281f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return new m(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    /* access modifiers changed from: private */
    public static final m d(View view) {
        return new m(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }
}
