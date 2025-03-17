package com.google.ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.q  reason: case insensitive filesystem */
final /* synthetic */ class C9509q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9505m f67823a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraDevice f67824b;

    /* synthetic */ C9509q(C9505m mVar, CameraDevice cameraDevice) {
        this.f67823a = mVar;
        this.f67824b = cameraDevice;
    }

    public final /* synthetic */ void run() {
        this.f67823a.f67814b.onClosed(this.f67824b);
    }
}
