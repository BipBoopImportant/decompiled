package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.a0;

/* renamed from: androidx.fragment.app.g  reason: case insensitive filesystem */
public final /* synthetic */ class C5179g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.d f22045a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.g f22046b;

    public /* synthetic */ C5179g(a0.d dVar, DefaultSpecialEffectsController.g gVar) {
        this.f22045a = dVar;
        this.f22046b = gVar;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.A(this.f22045a, this.f22046b);
    }
}
