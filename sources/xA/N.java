package xa;

import java.util.concurrent.Executor;

final class N implements Executor {
    N() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
