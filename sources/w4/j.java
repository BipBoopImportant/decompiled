package w4;

import android.graphics.Bitmap;
import androidx.media3.ui.PlayerView;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerView f57098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f57099b;

    public /* synthetic */ j(PlayerView playerView, Bitmap bitmap) {
        this.f57098a = playerView;
        this.f57099b = bitmap;
    }

    public final void run() {
        this.f57098a.M(this.f57099b);
    }
}
