package a9;

import G8.t;
import android.os.Handler;
import kotlin.jvm.internal.C17542s;

public final class I6 {

    /* renamed from: a  reason: collision with root package name */
    public final t f42072a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f42073b;

    /* renamed from: c  reason: collision with root package name */
    public long f42074c;

    /* renamed from: d  reason: collision with root package name */
    public long f42075d;

    public I6(t tVar, Handler handler, long j10) {
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(handler, "uiHandler");
        this.f42072a = tVar;
        this.f42073b = handler;
        this.f42074c = j10;
    }

    public final void a(Runnable runnable, long j10) {
        if (this.f42072a.a() - this.f42075d > j10) {
            this.f42075d = this.f42072a.a();
            this.f42073b.post(runnable);
        }
    }
}
