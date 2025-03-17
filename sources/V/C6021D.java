package v;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: v.D  reason: case insensitive filesystem */
public final /* synthetic */ class C6021D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Surface f30176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f30177b;

    public /* synthetic */ C6021D(Surface surface, SurfaceTexture surfaceTexture) {
        this.f30176a = surface;
        this.f30177b = surfaceTexture;
    }

    public final void run() {
        C6036M.i0(this.f30176a, this.f30177b);
    }
}
