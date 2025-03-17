package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.a0;

/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
public final /* synthetic */ class C5181i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.d f22049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0.d f22050b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.g f22051c;

    public /* synthetic */ C5181i(a0.d dVar, a0.d dVar2, DefaultSpecialEffectsController.g gVar) {
        this.f22049a = dVar;
        this.f22050b = dVar2;
        this.f22051c = gVar;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.p(this.f22049a, this.f22050b, this.f22051c);
    }
}
