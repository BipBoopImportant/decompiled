package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.a  reason: case insensitive filesystem */
class C4989a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f16490a;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    private static class C0228a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C4989a(ActionBarContainer actionBarContainer) {
        this.f16490a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f16490a;
        if (actionBarContainer.f15955h) {
            Drawable drawable = actionBarContainer.f15954g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f15952e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f16490a;
        Drawable drawable3 = actionBarContainer2.f15953f;
        if (drawable3 != null && actionBarContainer2.f15956i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f16490a;
        if (!actionBarContainer.f15955h) {
            Drawable drawable = actionBarContainer.f15952e;
            if (drawable != null) {
                C0228a.a(drawable, outline);
            }
        } else if (actionBarContainer.f15954g != null) {
            C0228a.a(actionBarContainer.f15952e, outline);
        }
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
