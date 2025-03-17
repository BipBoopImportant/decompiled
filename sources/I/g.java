package I;

import androidx.concurrent.futures.c;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import ob.C10101e;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.a f7087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C10101e f7088b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7089c;

    public /* synthetic */ g(c.a aVar, C10101e eVar, long j10) {
        this.f7087a = aVar;
        this.f7088b = eVar;
        this.f7089c = j10;
    }

    public final Object call() {
        return Boolean.valueOf(this.f7087a.f(new TimeoutException("Future[" + this.f7088b + "] is not done within " + this.f7089c + " ms.")));
    }
}
