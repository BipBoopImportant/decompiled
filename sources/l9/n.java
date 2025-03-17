package l9;

import java.util.concurrent.Executor;
import p9.C8639a;

class n implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f54895a;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f54896a;

        a(Runnable runnable) {
            this.f54896a = runnable;
        }

        public void run() {
            try {
                this.f54896a.run();
            } catch (Exception e10) {
                C8639a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f54895a = executor;
    }

    public void execute(Runnable runnable) {
        this.f54895a.execute(new a(runnable));
    }
}
