package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;

/* renamed from: androidx.fragment.app.j  reason: case insensitive filesystem */
public final /* synthetic */ class C5182j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f22052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f22053b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f22054c;

    public /* synthetic */ C5182j(U u10, View view, Rect rect) {
        this.f22052a = u10;
        this.f22053b = view;
        this.f22054c = rect;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.q(this.f22052a, this.f22053b, this.f22054c);
    }
}
