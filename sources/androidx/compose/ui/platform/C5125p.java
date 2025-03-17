package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.p  reason: case insensitive filesystem */
public final /* synthetic */ class C5125p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f19554a;

    public /* synthetic */ C5125p(AndroidComposeView androidComposeView) {
        this.f19554a = androidComposeView;
    }

    public final void run() {
        AndroidComposeView.P0(this.f19554a);
    }
}
