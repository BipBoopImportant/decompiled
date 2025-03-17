package Qb;

import android.os.Process;

/* renamed from: Qb.d  reason: case insensitive filesystem */
public abstract class C9246d implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
