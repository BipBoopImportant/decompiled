package com.google.ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.n  reason: case insensitive filesystem */
final /* synthetic */ class C9506n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C9505m f67816a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CameraDevice f67817b;

    /* synthetic */ C9506n(C9505m mVar, CameraDevice cameraDevice) {
        this.f67816a = mVar;
        this.f67817b = cameraDevice;
    }

    public final /* synthetic */ void run() {
        this.f67816a.f67814b.onOpened(this.f67817b);
    }
}
