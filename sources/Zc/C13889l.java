package ZC;

import android.view.TextureView;
import android.view.ViewTreeObserver;
import androidx.media3.exoplayer.ExoPlayer;

/* renamed from: ZC.l  reason: case insensitive filesystem */
public final /* synthetic */ class C13889l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f118351a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextureView f118352b;

    public /* synthetic */ C13889l(ExoPlayer exoPlayer, TextureView textureView) {
        this.f118351a = exoPlayer;
        this.f118352b = textureView;
    }

    public final void onGlobalLayout() {
        C13892o.B(this.f118351a, this.f118352b);
    }
}
