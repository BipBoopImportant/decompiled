package com.google.ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.p  reason: case insensitive filesystem */
final /* synthetic */ class C9508p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9505m f67820a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraDevice f67821b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f67822c;

    /* synthetic */ C9508p(C9505m mVar, CameraDevice cameraDevice, int i10) {
        this.f67820a = mVar;
        this.f67821b = cameraDevice;
        this.f67822c = i10;
    }

    public final /* synthetic */ void run() {
        this.f67820a.f67814b.onError(this.f67821b, this.f67822c);
    }
}
