package I;

import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f7096a;

    public /* synthetic */ k(ScheduledFuture scheduledFuture) {
        this.f7096a = scheduledFuture;
    }

    public final void run() {
        this.f7096a.cancel(true);
    }
}
