package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f43081a;

    public /* synthetic */ f(g gVar) {
        this.f43081a = gVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f43081a.f(surfaceTexture);
    }
}
