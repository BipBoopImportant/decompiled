package v;

import androidx.camera.core.impl.X0;

/* renamed from: v.L  reason: case insensitive filesystem */
public final /* synthetic */ class C6035L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ X0.d f30257a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ X0 f30258b;

    public /* synthetic */ C6035L(X0.d dVar, X0 x02) {
        this.f30257a = dVar;
        this.f30258b = x02;
    }

    public final void run() {
        this.f30257a.a(this.f30258b, X0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }
}
