package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import w.C6173h;

/* renamed from: w.j  reason: case insensitive filesystem */
public final /* synthetic */ class C6175j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31081b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f31082c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TotalCaptureResult f31083d;

    public /* synthetic */ C6175j(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f31080a = bVar;
        this.f31081b = cameraCaptureSession;
        this.f31082c = captureRequest;
        this.f31083d = totalCaptureResult;
    }

    public final void run() {
        this.f31080a.i(this.f31081b, this.f31082c, this.f31083d);
    }
}
