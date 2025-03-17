package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.o  reason: case insensitive filesystem */
public final /* synthetic */ class C6180o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.b f31101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31102b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f31103c;

    public /* synthetic */ C6180o(C6173h.b bVar, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f31101a = bVar;
        this.f31102b = cameraCaptureSession;
        this.f31103c = i10;
    }

    public final void run() {
        this.f31101a.l(this.f31102b, this.f31103c);
    }
}
