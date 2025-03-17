package sa;

import com.google.android.gms.measurement.internal.C7685s4;
import com.google.android.gms.measurement.internal.E5;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7685s4 f56116a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f56117b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ E5 f56118c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ k0 f56119d;

    public /* synthetic */ e0(C7685s4 s4Var, AtomicReference atomicReference, E5 e52, k0 k0Var) {
        this.f56116a = s4Var;
        this.f56117b = atomicReference;
        this.f56118c = e52;
        this.f56119d = k0Var;
    }

    public final void run() {
        C7685s4.N(this.f56116a, this.f56117b, this.f56118c, this.f56119d);
    }
}
