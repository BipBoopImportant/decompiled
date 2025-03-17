package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import w.C6173h;

/* renamed from: w.n  reason: case insensitive filesystem */
public final /* synthetic */ class C6179n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f31098c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Surface f31099d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f31100e;

    public /* synthetic */ C6179n(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        this.f31096a = bVar;
        this.f31097b = cameraCaptureSession;
        this.f31098c = captureRequest;
        this.f31099d = surface;
        this.f31100e = j10;
    }

    public final void run() {
        this.f31096a.h(this.f31097b, this.f31098c, this.f31099d, this.f31100e);
    }
}
