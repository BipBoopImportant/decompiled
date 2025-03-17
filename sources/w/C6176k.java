package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import w.C6173h;

/* renamed from: w.k  reason: case insensitive filesystem */
public final /* synthetic */ class C6176k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f31086c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CaptureResult f31087d;

    public /* synthetic */ C6176k(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f31084a = bVar;
        this.f31085b = cameraCaptureSession;
        this.f31086c = captureRequest;
        this.f31087d = captureResult;
    }

    public final void run() {
        this.f31084a.k(this.f31085b, this.f31086c, this.f31087d);
    }
}
