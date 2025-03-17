package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class P implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f16281a;

    public /* synthetic */ P(Runnable runnable) {
        this.f16281a = runnable;
    }

    public final void onBackInvoked() {
        this.f16281a.run();
    }
}
