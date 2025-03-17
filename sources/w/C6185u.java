package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.u  reason: case insensitive filesystem */
public final /* synthetic */ class C6185u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31116b;

    public /* synthetic */ C6185u(C6173h.c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f31115a = cVar;
        this.f31116b = cameraCaptureSession;
    }

    public final void run() {
        this.f31115a.m(this.f31116b);
    }
}
