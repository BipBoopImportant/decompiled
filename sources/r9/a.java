package R9;

import android.os.Handler;
import android.os.Looper;
import ca.C7112f;
import java.util.concurrent.Executor;

public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39751a;

    public a(Looper looper) {
        this.f39751a = new C7112f(looper);
    }

    public final void execute(Runnable runnable) {
        this.f39751a.post(runnable);
    }
}
