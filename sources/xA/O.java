package xa;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import la.a;

final class O implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f57768a = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f57768a.post(runnable);
    }
}
