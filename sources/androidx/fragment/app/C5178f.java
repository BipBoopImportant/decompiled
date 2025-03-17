package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import kotlin.jvm.internal.O;

/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
public final /* synthetic */ class C5178f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ O f22044a;

    public /* synthetic */ C5178f(O o10) {
        this.f22044a = o10;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.z(this.f22044a);
    }
}
