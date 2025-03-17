package Y7;

import java.util.concurrent.Executor;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f41007a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f41008b = new b();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f41008b;
    }

    public static Executor b() {
        return f41007a;
    }
}
