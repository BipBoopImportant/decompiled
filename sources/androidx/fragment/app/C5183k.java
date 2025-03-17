package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final /* synthetic */ class C5183k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f22055a;

    public /* synthetic */ C5183k(ArrayList arrayList) {
        this.f22055a = arrayList;
    }

    public final void run() {
        DefaultSpecialEffectsController.g.r(this.f22055a);
    }
}
