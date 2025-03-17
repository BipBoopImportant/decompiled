package w;

import android.hardware.camera2.CameraDevice;
import w.C;

public final /* synthetic */ class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C.b f31035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f31036b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f31037c;

    public /* synthetic */ E(C.b bVar, CameraDevice cameraDevice, int i10) {
        this.f31035a = bVar;
        this.f31036b = cameraDevice;
        this.f31037c = i10;
    }

    public final void run() {
        this.f31035a.g(this.f31036b, this.f31037c);
    }
}
