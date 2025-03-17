package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final /* synthetic */ class C5177e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22041a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f22042b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.a f22043c;

    public /* synthetic */ C5177e(ViewGroup viewGroup, View view, DefaultSpecialEffectsController.a aVar) {
        this.f22041a = viewGroup;
        this.f22042b = view;
        this.f22043c = aVar;
    }

    public final void run() {
        DefaultSpecialEffectsController.a.C0338a.b(this.f22041a, this.f22042b, this.f22043c);
    }
}
