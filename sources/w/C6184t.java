package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.t  reason: case insensitive filesystem */
public final /* synthetic */ class C6184t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31114b;

    public /* synthetic */ C6184t(C6173h.c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f31113a = cVar;
        this.f31114b = cameraCaptureSession;
    }

    public final void run() {
        this.f31113a.l(this.f31114b);
    }
}
