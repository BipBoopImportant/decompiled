package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import w.C6173h;

/* renamed from: w.i  reason: case insensitive filesystem */
public final /* synthetic */ class C6174i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31076b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f31077c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f31078d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f31079e;

    public /* synthetic */ C6174i(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        this.f31075a = bVar;
        this.f31076b = cameraCaptureSession;
        this.f31077c = captureRequest;
        this.f31078d = j10;
        this.f31079e = j11;
    }

    public final void run() {
        this.f31075a.n(this.f31076b, this.f31077c, this.f31078d, this.f31079e);
    }
}
