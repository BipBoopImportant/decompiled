package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.m  reason: case insensitive filesystem */
final class C9505m extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f67813a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CameraDevice.StateCallback f67814b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedCamera f67815c;

    C9505m(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f67813a = handler;
        this.f67814b = stateCallback;
        this.f67815c = sharedCamera;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f67813a.post(new C9509q(this, cameraDevice));
        this.f67815c.e(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f67813a.post(new C9507o(this, cameraDevice));
        this.f67815c.f(cameraDevice);
    }

    public final void onError(CameraDevice cameraDevice, int i10) {
        this.f67813a.post(new C9508p(this, cameraDevice, i10));
        this.f67815c.b();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f67815c.n().b(cameraDevice);
        this.f67813a.post(new C9506n(this, cameraDevice));
        this.f67815c.d(cameraDevice);
        SharedCamera sharedCamera = this.f67815c;
        sharedCamera.n().e(sharedCamera.l());
        SharedCamera sharedCamera2 = this.f67815c;
        sharedCamera2.n().g(sharedCamera2.m());
    }
}
