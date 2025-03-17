package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.v  reason: case insensitive filesystem */
public final /* synthetic */ class C6186v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31118b;

    public /* synthetic */ C6186v(C6173h.c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f31117a = cVar;
        this.f31118b = cameraCaptureSession;
    }

    public final void run() {
        this.f31117a.k(this.f31118b);
    }
}
