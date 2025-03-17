package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.s  reason: case insensitive filesystem */
public final /* synthetic */ class C6183s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31112b;

    public /* synthetic */ C6183s(C6173h.c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f31111a = cVar;
        this.f31112b = cameraCaptureSession;
    }

    public final void run() {
        this.f31111a.i(this.f31112b);
    }
}
