package Bc;

import Gc.m;
import com.google.firebase.perf.metrics.AppStartTrace;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f58890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m.b f58891b;

    public /* synthetic */ e(AppStartTrace appStartTrace, m.b bVar) {
        this.f58890a = appStartTrace;
        this.f58891b = bVar;
    }

    public final void run() {
        this.f58890a.r(this.f58891b);
    }
}
