package V;

import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.X0;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f14348a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ X0.b f14349b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5040p f14350c;

    public /* synthetic */ S(AtomicBoolean atomicBoolean, X0.b bVar, C5040p pVar) {
        this.f14348a = atomicBoolean;
        this.f14349b = bVar;
        this.f14350c = pVar;
    }

    public final void run() {
        W.N0(this.f14348a, this.f14349b, this.f14350c);
    }
}
