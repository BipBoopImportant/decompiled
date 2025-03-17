package v;

import android.hardware.camera2.TotalCaptureResult;
import v.C6109u;

/* renamed from: v.v  reason: case insensitive filesystem */
public final /* synthetic */ class C6112v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6109u.b f30724a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TotalCaptureResult f30725b;

    public /* synthetic */ C6112v(C6109u.b bVar, TotalCaptureResult totalCaptureResult) {
        this.f30724a = bVar;
        this.f30725b = totalCaptureResult;
    }

    public final void run() {
        this.f30724a.c(this.f30725b);
    }
}
