package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.v  reason: case insensitive filesystem */
final /* synthetic */ class C9514v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9510r f67834a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraCaptureSession f67835b;

    /* synthetic */ C9514v(C9510r rVar, CameraCaptureSession cameraCaptureSession) {
        this.f67834a = rVar;
        this.f67835b = cameraCaptureSession;
    }

    public final /* synthetic */ void run() {
        this.f67834a.f67826b.onActive(this.f67835b);
    }
}
