package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;

/* renamed from: androidx.fragment.app.l  reason: case insensitive filesystem */
public final /* synthetic */ class C5184l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.g f22056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22057b;

    public /* synthetic */ C5184l(DefaultSpecialEffectsController.g gVar, ViewGroup viewGroup) {
        this.f22056a = gVar;
        this.f22057b = viewGroup;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.b.a.c(this.f22056a, this.f22057b);
    }
}
