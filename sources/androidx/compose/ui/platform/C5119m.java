package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.m  reason: case insensitive filesystem */
public final /* synthetic */ class C5119m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f19519a;

    public /* synthetic */ C5119m(AndroidComposeView androidComposeView) {
        this.f19519a = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.p0(this.f19519a);
    }
}
