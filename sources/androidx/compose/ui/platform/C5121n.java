package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.n  reason: case insensitive filesystem */
public final /* synthetic */ class C5121n implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f19521a;

    public /* synthetic */ C5121n(AndroidComposeView androidComposeView) {
        this.f19521a = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.O0(this.f19521a);
    }
}
