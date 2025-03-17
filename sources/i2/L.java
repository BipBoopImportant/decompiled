package I2;

import android.view.View;
import android.view.ViewTreeObserver;

public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f8600a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f8601b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f8602c;

    private L(View view, Runnable runnable) {
        this.f8600a = view;
        this.f8601b = view.getViewTreeObserver();
        this.f8602c = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            L l10 = new L(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(l10);
            view.addOnAttachStateChangeListener(l10);
            return l10;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f8601b.isAlive()) {
            this.f8601b.removeOnPreDrawListener(this);
        } else {
            this.f8600a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f8600a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f8602c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f8601b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
