package H;

import java.util.concurrent.Executor;

final class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f6654a;

    b() {
    }

    static Executor a() {
        if (f6654a != null) {
            return f6654a;
        }
        synchronized (b.class) {
            try {
                if (f6654a == null) {
                    f6654a = new b();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f6654a;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
