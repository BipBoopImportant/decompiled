package J;

import C.G0;
import H2.a;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Surface f8748a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f8749b;

    public /* synthetic */ e(Surface surface, SurfaceTexture surfaceTexture) {
        this.f8748a = surface;
        this.f8749b = surfaceTexture;
    }

    public final void accept(Object obj) {
        f.X(this.f8748a, this.f8749b, (G0.g) obj);
    }
}
