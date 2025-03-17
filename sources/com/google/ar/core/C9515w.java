package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.w  reason: case insensitive filesystem */
final /* synthetic */ class C9515w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9510r f67836a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraCaptureSession f67837b;

    /* synthetic */ C9515w(C9510r rVar, CameraCaptureSession cameraCaptureSession) {
        this.f67836a = rVar;
        this.f67837b = cameraCaptureSession;
    }

    public final /* synthetic */ void run() {
        this.f67836a.f67826b.onClosed(this.f67837b);
    }
}
