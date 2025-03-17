package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.u  reason: case insensitive filesystem */
final /* synthetic */ class C9513u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9510r f67832a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraCaptureSession f67833b;

    /* synthetic */ C9513u(C9510r rVar, CameraCaptureSession cameraCaptureSession) {
        this.f67832a = rVar;
        this.f67833b = cameraCaptureSession;
    }

    public final /* synthetic */ void run() {
        this.f67832a.f67826b.onReady(this.f67833b);
    }
}
