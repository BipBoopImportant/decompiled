package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import w.C6173h;

/* renamed from: w.m  reason: case insensitive filesystem */
public final /* synthetic */ class C6178m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31093b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f31094c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CaptureFailure f31095d;

    public /* synthetic */ C6178m(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f31092a = bVar;
        this.f31093b = cameraCaptureSession;
        this.f31094c = captureRequest;
        this.f31095d = captureFailure;
    }

    public final void run() {
        this.f31092a.j(this.f31093b, this.f31094c, this.f31095d);
    }
}
