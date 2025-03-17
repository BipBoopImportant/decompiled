package w;

import android.hardware.camera2.CameraDevice;
import w.C;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C.b f31040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f31041b;

    public /* synthetic */ G(C.b bVar, CameraDevice cameraDevice) {
        this.f31040a = bVar;
        this.f31041b = cameraDevice;
    }

    public final void run() {
        this.f31040a.h(this.f31041b);
    }
}
