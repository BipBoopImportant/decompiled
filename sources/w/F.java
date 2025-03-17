package w;

import android.hardware.camera2.CameraDevice;
import w.C;

public final /* synthetic */ class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C.b f31038a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f31039b;

    public /* synthetic */ F(C.b bVar, CameraDevice cameraDevice) {
        this.f31038a = bVar;
        this.f31039b = cameraDevice;
    }

    public final void run() {
        this.f31038a.f(this.f31039b);
    }
}
