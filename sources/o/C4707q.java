package O;

import C.G0;
import H2.a;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: O.q  reason: case insensitive filesystem */
public final /* synthetic */ class C4707q implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4709t f9632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G0 f9633b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f9634c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Surface f9635d;

    public /* synthetic */ C4707q(C4709t tVar, G0 g02, SurfaceTexture surfaceTexture, Surface surface) {
        this.f9632a = tVar;
        this.f9633b = g02;
        this.f9634c = surfaceTexture;
        this.f9635d = surface;
    }

    public final void accept(Object obj) {
        this.f9632a.B(this.f9633b, this.f9634c, this.f9635d, (G0.g) obj);
    }
}
