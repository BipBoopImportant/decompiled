package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.AndroidComposeView;
import c2.t;
import kotlin.Metadata;
import o1.C5669i;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/d;", "d", "(I)Landroidx/compose/ui/focus/d;", "c", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "Lc2/t;", "e", "(I)Lc2/t;", "Landroid/view/View;", "Lo1/i;", "a", "(Landroid/view/View;)Lo1/i;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final C5669i a(View view) {
        int[] a10 = e.f18842a.a();
        view.getLocationInWindow(a10);
        int i10 = a10[0];
        return new C5669i((float) i10, (float) a10[1], ((float) i10) + ((float) view.getWidth()), ((float) a10[1]) + ((float) view.getHeight()));
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.h())) {
            return 33;
        }
        if (d.l(i10, aVar.a())) {
            return 130;
        }
        if (d.l(i10, aVar.d())) {
            return 17;
        }
        if (d.l(i10, aVar.g())) {
            return 66;
        }
        if (d.l(i10, aVar.e())) {
            return 2;
        }
        return d.l(i10, aVar.f()) ? 1 : null;
    }

    public static final d d(int i10) {
        if (i10 == 1) {
            return d.i(d.f18832b.f());
        }
        if (i10 == 2) {
            return d.i(d.f18832b.e());
        }
        if (i10 == 17) {
            return d.i(d.f18832b.d());
        }
        if (i10 == 33) {
            return d.i(d.f18832b.h());
        }
        if (i10 == 66) {
            return d.i(d.f18832b.g());
        }
        if (i10 != 130) {
            return null;
        }
        return d.i(d.f18832b.a());
    }

    public static final t e(int i10) {
        if (i10 == 0) {
            return t.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return t.Rtl;
    }
}
