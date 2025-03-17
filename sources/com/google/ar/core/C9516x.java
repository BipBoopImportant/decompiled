package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ar.core.x  reason: case insensitive filesystem */
final class C9516x {

    /* renamed from: a  reason: collision with root package name */
    private CameraDevice f67838a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map f67839b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private SurfaceTexture f67840c = null;

    /* renamed from: d  reason: collision with root package name */
    private Surface f67841d = null;

    /* synthetic */ C9516x(byte[] bArr) {
    }

    public final CameraDevice a() {
        return this.f67838a;
    }

    public final void b(CameraDevice cameraDevice) {
        this.f67838a = cameraDevice;
    }

    public final void c(String str, List list) {
        this.f67839b.put(str, list);
    }

    public final SurfaceTexture d() {
        return this.f67840c;
    }

    public final void e(SurfaceTexture surfaceTexture) {
        this.f67840c = surfaceTexture;
    }

    public final Surface f() {
        return this.f67841d;
    }

    public final void g(Surface surface) {
        this.f67841d = surface;
    }
}
