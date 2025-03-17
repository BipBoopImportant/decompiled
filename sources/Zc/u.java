package Zc;

import java.util.concurrent.Executor;

enum u implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        C9398g.a().f65093a.post(runnable);
    }
}
