package H9;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class C implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f36491a;

    public /* synthetic */ C(Handler handler) {
        this.f36491a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f36491a.post(runnable);
    }
}
