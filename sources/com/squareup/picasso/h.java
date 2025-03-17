package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f122552a;

    /* renamed from: b  reason: collision with root package name */
    final WeakReference<ImageView> f122553b;

    /* renamed from: c  reason: collision with root package name */
    C14194e f122554c;

    h(x xVar, ImageView imageView, C14194e eVar) {
        this.f122552a = xVar;
        this.f122553b = new WeakReference<>(imageView);
        this.f122554c = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f122552a.a();
        this.f122554c = null;
        ImageView imageView = this.f122553b.get();
        if (imageView != null) {
            this.f122553b.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.f122553b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f122553b.clear();
            this.f122552a.k().j(width, height).e(imageView, this.f122554c);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
