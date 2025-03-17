package QJ;

import XH.C16807N;
import dI.C17168i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"LQJ/w0;", "LQJ/v0;", "LQJ/a0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LdI/i;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "R0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;LdI/i;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "LXH/N;", "Q0", "(LdI/i;Ljava/util/concurrent/RejectedExecutionException;)V", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "LQJ/n;", "continuation", "h0", "(JLQJ/n;)V", "LQJ/k0;", "u", "(JLjava/lang/Runnable;LdI/i;)LQJ/k0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Ljava/util/concurrent/Executor;", "P0", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.w0  reason: case insensitive filesystem */
public final class C16338w0 extends C16336v0 implements C16295a0 {

    /* renamed from: c  reason: collision with root package name */
    private final Executor f137686c;

    public C16338w0(Executor executor) {
        this.f137686c = executor;
        if (P0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) P0()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void Q0(C17168i iVar, RejectedExecutionException rejectedExecutionException) {
        I0.d(iVar, C16332t0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> R0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C17168i iVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            Q0(iVar, e10);
            return null;
        }
    }

    public void E0(C17168i iVar, Runnable runnable) {
        try {
            Executor P02 = P0();
            C16298c.a();
            P02.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C16298c.a();
            Q0(iVar, e10);
            C16311i0.b().E0(iVar, runnable);
        }
    }

    public Executor P0() {
        return this.f137686c;
    }

    public void close() {
        Executor P02 = P0();
        ExecutorService executorService = P02 instanceof ExecutorService ? (ExecutorService) P02 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C16338w0) && ((C16338w0) obj).P0() == P0();
    }

    public void h0(long j10, C16320n<? super C16807N> nVar) {
        Executor P02 = P0();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = P02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) P02 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = R0(scheduledExecutorService, new X0(this, nVar), nVar.getContext(), j10);
        }
        if (scheduledFuture != null) {
            r.c(nVar, new C16316l(scheduledFuture));
        } else {
            W.f137603h.h0(j10, nVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(P0());
    }

    public String toString() {
        return P0().toString();
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        Executor P02 = P0();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = P02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) P02 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = R0(scheduledExecutorService, runnable, iVar, j10);
        }
        return scheduledFuture != null ? new C16313j0(scheduledFuture) : W.f137603h.u(j10, runnable, iVar);
    }
}
