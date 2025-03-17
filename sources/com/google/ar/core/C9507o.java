package com.google.ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.o  reason: case insensitive filesystem */
final /* synthetic */ class C9507o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9505m f67818a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraDevice f67819b;

    /* synthetic */ C9507o(C9505m mVar, CameraDevice cameraDevice) {
        this.f67818a = mVar;
        this.f67819b = cameraDevice;
    }

    public final /* synthetic */ void run() {
        this.f67818a.f67814b.onDisconnected(this.f67819b);
    }
}
