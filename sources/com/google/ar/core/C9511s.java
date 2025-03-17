package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.s  reason: case insensitive filesystem */
final /* synthetic */ class C9511s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9510r f67828a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraCaptureSession f67829b;

    /* synthetic */ C9511s(C9510r rVar, CameraCaptureSession cameraCaptureSession) {
        this.f67828a = rVar;
        this.f67829b = cameraCaptureSession;
    }

    public final /* synthetic */ void run() {
        this.f67828a.f67826b.onConfigured(this.f67829b);
    }
}
