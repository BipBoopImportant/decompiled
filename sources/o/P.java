package O;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class P implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q f9558a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9559b;

    public /* synthetic */ P(Q q10, AtomicReference atomicReference) {
        this.f9558a = q10;
        this.f9559b = atomicReference;
    }

    public final void run() {
        this.f9558a.i(this.f9559b);
    }
}
