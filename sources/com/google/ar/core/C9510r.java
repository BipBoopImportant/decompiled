package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* renamed from: com.google.ar.core.r  reason: case insensitive filesystem */
final class C9510r extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f67825a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CameraCaptureSession.StateCallback f67826b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedCamera f67827c;

    C9510r(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f67825a = handler;
        this.f67826b = stateCallback;
        this.f67827c = sharedCamera;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f67825a.post(new C9514v(this, cameraCaptureSession));
        this.f67827c.g(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f67825a.post(new C9515w(this, cameraCaptureSession));
        this.f67827c.h(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f67825a.post(new C9512t(this, cameraCaptureSession));
        this.f67827c.i(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f67825a.post(new C9511s(this, cameraCaptureSession));
        this.f67827c.j(cameraCaptureSession);
        if (this.f67827c.n().a() != null) {
            this.f67827c.c();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f67825a.post(new C9513u(this, cameraCaptureSession));
        this.f67827c.k(cameraCaptureSession);
    }
}
