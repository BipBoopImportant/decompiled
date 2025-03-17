package P;

import C.G0;
import H2.a;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final /* synthetic */ class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f11791a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f11792b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Surface f11793c;

    public /* synthetic */ m(o oVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.f11791a = oVar;
        this.f11792b = surfaceTexture;
        this.f11793c = surface;
    }

    public final void accept(Object obj) {
        this.f11791a.u(this.f11792b, this.f11793c, (G0.g) obj);
    }
}
