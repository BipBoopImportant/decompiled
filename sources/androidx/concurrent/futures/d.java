package androidx.concurrent.futures;

import java.util.concurrent.Executor;

public enum d implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
