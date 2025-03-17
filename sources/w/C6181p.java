package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C6173h;

/* renamed from: w.p  reason: case insensitive filesystem */
public final /* synthetic */ class C6181p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6173h.c f31104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f31105b;

    public /* synthetic */ C6181p(C6173h.c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f31104a = cVar;
        this.f31105b = cameraCaptureSession;
    }

    public final void run() {
        this.f31104a.h(this.f31105b);
    }
}
