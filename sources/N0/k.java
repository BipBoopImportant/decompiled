package N0;

import androidx.compose.material.ripple.RippleHostView;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RippleHostView f9228a;

    public /* synthetic */ k(RippleHostView rippleHostView) {
        this.f9228a = rippleHostView;
    }

    public final void run() {
        RippleHostView.setRippleState$lambda$2(this.f9228a);
    }
}
