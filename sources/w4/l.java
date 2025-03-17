package w4;

import androidx.media3.ui.PlayerView;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerView f57100a;

    public /* synthetic */ l(PlayerView playerView) {
        this.f57100a = playerView;
    }

    public final void run() {
        this.f57100a.invalidate();
    }
}
