package I;

import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f7090a;

    public /* synthetic */ h(ScheduledFuture scheduledFuture) {
        this.f7090a = scheduledFuture;
    }

    public final void run() {
        this.f7090a.cancel(true);
    }
}
