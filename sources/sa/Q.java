package sa;

import com.google.android.gms.measurement.internal.C7691t3;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7691t3 f56099a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f56100b;

    public /* synthetic */ Q(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f56099a = t3Var;
        this.f56100b = atomicReference;
    }

    public final void run() {
        this.f56099a.s().V(this.f56100b, k0.x(X.SGTM_CLIENT));
    }
}
