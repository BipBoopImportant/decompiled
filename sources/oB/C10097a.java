package ob;

import java.util.concurrent.Executor;

/* renamed from: ob.a  reason: case insensitive filesystem */
enum C10097a implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
