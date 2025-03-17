package ea;

import java.util.concurrent.Executor;

enum j0 implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
