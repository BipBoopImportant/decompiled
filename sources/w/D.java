package w;

import android.hardware.camera2.CameraDevice;
import w.C;

public final /* synthetic */ class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C.b f31033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f31034b;

    public /* synthetic */ D(C.b bVar, CameraDevice cameraDevice) {
        this.f31033a = bVar;
        this.f31034b = cameraDevice;
    }

    public final void run() {
        this.f31033a.e(this.f31034b);
    }
}
