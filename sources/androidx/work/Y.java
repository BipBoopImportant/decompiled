package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f45128a;

    public /* synthetic */ Y(AtomicBoolean atomicBoolean) {
        this.f45128a = atomicBoolean;
    }

    public final void run() {
        a0.g(this.f45128a);
    }
}
