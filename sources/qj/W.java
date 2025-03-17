package QJ;

import QJ.C16325p0;
import dI.C17168i;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\b8TX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n¨\u00063"}, d2 = {"LQJ/W;", "LQJ/p0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "LXH/N;", "O2", "Ljava/lang/Thread;", "G2", "()Ljava/lang/Thread;", "", "M2", "()Z", "E2", "task", "N1", "(Ljava/lang/Runnable;)V", "", "now", "LQJ/p0$c;", "delayedTask", "y1", "(JLQJ/p0$c;)V", "shutdown", "timeMillis", "block", "LdI/i;", "context", "LQJ/k0;", "u", "(JLjava/lang/Runnable;LdI/i;)LQJ/k0;", "run", "", "toString", "()Ljava/lang/String;", "i", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "H2", "isShutDown", "J2", "isShutdownRequested", "o1", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W extends C16325p0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h  reason: collision with root package name */
    public static final W f137603h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f137604i;

    static {
        Long l10;
        W w10 = new W();
        f137603h = w10;
        C16323o0.X0(w10, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f137604i = timeUnit.toNanos(l10.longValue());
    }

    private W() {
    }

    private final synchronized void E2() {
        if (J2()) {
            debugStatus = 3;
            n2();
            C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread G2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f137603h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean H2() {
        return debugStatus == 4;
    }

    private final boolean J2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean M2() {
        if (J2()) {
            return false;
        }
        debugStatus = 1;
        C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void O2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void N1(Runnable runnable) {
        if (H2()) {
            O2();
        }
        super.N1(runnable);
    }

    /* access modifiers changed from: protected */
    public Thread o1() {
        Thread thread = _thread;
        return thread == null ? G2() : thread;
    }

    public void run() {
        e1.f137624a.d(this);
        C16298c.a();
        try {
            if (M2()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long b12 = b1();
                    if (b12 == Long.MAX_VALUE) {
                        C16298c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f137604i + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            E2();
                            C16298c.a();
                            if (!f2()) {
                                o1();
                                return;
                            }
                            return;
                        }
                        b12 = C17978n.j(b12, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (b12 > 0) {
                        if (J2()) {
                            _thread = null;
                            E2();
                            C16298c.a();
                            if (!f2()) {
                                o1();
                                return;
                            }
                            return;
                        }
                        C16298c.a();
                        LockSupport.parkNanos(this, b12);
                    }
                }
            }
        } finally {
            _thread = null;
            E2();
            C16298c.a();
            if (!f2()) {
                o1();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public String toString() {
        return "DefaultExecutor";
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        return t2(j10, runnable);
    }

    /* access modifiers changed from: protected */
    public void y1(long j10, C16325p0.c cVar) {
        O2();
    }
}
