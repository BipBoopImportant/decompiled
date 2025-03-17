package D2;

import H2.i;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class h {

    private static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f5510a;

        a(Handler handler) {
            this.f5510a = (Handler) i.g(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f5510a.post((Runnable) i.g(runnable))) {
                throw new RejectedExecutionException(this.f5510a + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
