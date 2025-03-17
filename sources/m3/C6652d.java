package M3;

import android.graphics.SurfaceTexture;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* renamed from: M3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C6652d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SphericalGLSurfaceView f38476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f38477b;

    public /* synthetic */ C6652d(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        this.f38476a = sphericalGLSurfaceView;
        this.f38477b = surfaceTexture;
    }

    public final void run() {
        this.f38476a.f(this.f38477b);
    }
}
