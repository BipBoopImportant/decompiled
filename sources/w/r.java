package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import w.C6173h;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31109b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Surface f31110c;

    public /* synthetic */ r(C6173h.c cVar, CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f31108a = cVar;
        this.f31109b = cameraCaptureSession;
        this.f31110c = surface;
    }

    public final void run() {
        this.f31108a.n(this.f31109b, this.f31110c);
    }
}
