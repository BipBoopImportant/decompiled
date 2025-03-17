package R9;

import android.os.Process;

final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f39754a;

    public c(Runnable runnable, int i10) {
        this.f39754a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f39754a.run();
    }
}
