package sa;

import com.google.android.gms.measurement.internal.C7691t3;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class M implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7691t3 f56091a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f56092b;

    public /* synthetic */ M(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f56091a = t3Var;
        this.f56092b = atomicReference;
    }

    public final void run() {
        C7691t3.Y(this.f56091a, this.f56092b);
    }
}
