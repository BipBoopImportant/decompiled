package Zc;

import java.util.concurrent.Executor;
import xa.C8960a;
import xa.C8961b;
import xa.C8972m;

public final /* synthetic */ class z implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f65144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8960a f65145b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8961b f65146c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C8972m f65147d;

    public /* synthetic */ z(Executor executor, C8960a aVar, C8961b bVar, C8972m mVar) {
        this.f65144a = executor;
        this.f65145b = aVar;
        this.f65146c = bVar;
        this.f65147d = mVar;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f65144a;
        C8960a aVar = this.f65145b;
        C8961b bVar = this.f65146c;
        C8972m mVar = this.f65147d;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            if (aVar.a()) {
                bVar.a();
            } else {
                mVar.b(e10);
            }
            throw e10;
        }
    }
}
