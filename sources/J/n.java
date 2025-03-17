package J;

import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.X;
import java.util.concurrent.Executor;

public interface n extends S0 {

    /* renamed from: d  reason: collision with root package name */
    public static final X.a<Executor> f8791d = X.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    Executor T(Executor executor) {
        return (Executor) g(f8791d, executor);
    }
}
