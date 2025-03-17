package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.t  reason: case insensitive filesystem */
final /* synthetic */ class C9512t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9510r f67830a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraCaptureSession f67831b;

    /* synthetic */ C9512t(C9510r rVar, CameraCaptureSession cameraCaptureSession) {
        this.f67830a = rVar;
        this.f67831b = cameraCaptureSession;
    }

    public final /* synthetic */ void run() {
        this.f67830a.f67826b.onConfigureFailed(this.f67831b);
    }
}
