package androidx.fragment.app;

import androidx.fragment.app.a0;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
public final /* synthetic */ class C5176d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController f22039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0.d f22040b;

    public /* synthetic */ C5176d(DefaultSpecialEffectsController defaultSpecialEffectsController, a0.d dVar) {
        this.f22039a = defaultSpecialEffectsController;
        this.f22040b = dVar;
    }

    public final void run() {
        DefaultSpecialEffectsController.G(this.f22039a, this.f22040b);
    }
}
