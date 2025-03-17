package v;

import android.hardware.camera2.CameraDevice;

/* renamed from: v.N  reason: case insensitive filesystem */
public final /* synthetic */ class C6037N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f30333a;

    public /* synthetic */ C6037N(CameraDevice cameraDevice) {
        this.f30333a = cameraDevice;
    }

    public final void run() {
        this.f30333a.close();
    }
}
