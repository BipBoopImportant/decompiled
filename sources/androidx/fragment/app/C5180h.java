package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.a0;

/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
public final /* synthetic */ class C5180h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.d f22047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.g f22048b;

    public /* synthetic */ C5180h(a0.d dVar, DefaultSpecialEffectsController.g gVar) {
        this.f22047a = dVar;
        this.f22048b = gVar;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.y(this.f22047a, this.f22048b);
    }
}
