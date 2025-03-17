package u5;

import QJ.C16340x0;
import QJ.M;
import java.util.concurrent.Executor;

/* renamed from: u5.b  reason: case insensitive filesystem */
public interface C8878b {
    Executor a();

    M b() {
        return C16340x0.b(c());
    }

    C8877a c();

    void d(Runnable runnable) {
        c().execute(runnable);
    }
}
