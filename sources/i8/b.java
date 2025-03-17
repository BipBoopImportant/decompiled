package I8;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class b implements RejectedExecutionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f37089a;

    public /* synthetic */ b(c cVar) {
        this.f37089a = cVar;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        c.p(this.f37089a, runnable, threadPoolExecutor);
    }
}
