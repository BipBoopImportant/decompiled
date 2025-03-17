package androidx.camera.view;

import C.G0;
import android.view.Surface;
import ob.C10101e;

public final /* synthetic */ class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F f17090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Surface f17091b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C10101e f17092c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ G0 f17093d;

    public /* synthetic */ E(F f10, Surface surface, C10101e eVar, G0 g02) {
        this.f17090a = f10;
        this.f17091b = surface;
        this.f17092c = eVar;
        this.f17093d = g02;
    }

    public final void run() {
        this.f17090a.q(this.f17091b, this.f17092c, this.f17093d);
    }
}
