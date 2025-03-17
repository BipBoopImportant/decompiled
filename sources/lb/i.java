package Lb;

import java.util.concurrent.Executor;

public class i {

    private enum a implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new j(executor);
    }
}
