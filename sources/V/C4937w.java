package V;

import java.util.concurrent.Executor;

/* renamed from: V.w  reason: case insensitive filesystem */
public final /* synthetic */ class C4937w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f14481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f14482b;

    public /* synthetic */ C4937w(Executor executor, Runnable runnable) {
        this.f14481a = executor;
        this.f14482b = runnable;
    }

    public final void run() {
        this.f14481a.execute(this.f14482b);
    }
}
