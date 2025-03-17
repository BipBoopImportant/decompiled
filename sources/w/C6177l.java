package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.l  reason: case insensitive filesystem */
public final /* synthetic */ class C6177l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31089b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f31090c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f31091d;

    public /* synthetic */ C6177l(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        this.f31088a = bVar;
        this.f31089b = cameraCaptureSession;
        this.f31090c = i10;
        this.f31091d = j10;
    }

    public final void run() {
        this.f31088a.m(this.f31089b, this.f31090c, this.f31091d);
    }
}
