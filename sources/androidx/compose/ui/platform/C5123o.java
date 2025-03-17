package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.o  reason: case insensitive filesystem */
public final /* synthetic */ class C5123o implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f19532a;

    public /* synthetic */ C5123o(AndroidComposeView androidComposeView) {
        this.f19532a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z10) {
        AndroidComposeView.U0(this.f19532a, z10);
    }
}
