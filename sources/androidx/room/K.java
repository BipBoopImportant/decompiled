package androidx.room;

import XH.C16807N;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/room/K;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "LXH/N;", "execute", "(Ljava/lang/Runnable;)V", "c", "()V", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "b", "Ljava/util/ArrayDeque;", "tasks", "Ljava/lang/Runnable;", "active", "", "d", "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class K implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f44249a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f44250b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f44251c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f44252d = new Object();

    public K(Executor executor) {
        C17542s.j(executor, "executor");
        this.f44249a = executor;
    }

    /* access modifiers changed from: private */
    public static final void b(Runnable runnable, K k10) {
        C17542s.j(runnable, "$command");
        C17542s.j(k10, "this$0");
        try {
            runnable.run();
        } finally {
            k10.c();
        }
    }

    public final void c() {
        synchronized (this.f44252d) {
            try {
                Runnable poll = this.f44250b.poll();
                Runnable runnable = poll;
                this.f44251c = runnable;
                if (poll != null) {
                    this.f44249a.execute(runnable);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute(Runnable runnable) {
        C17542s.j(runnable, "command");
        synchronized (this.f44252d) {
            try {
                this.f44250b.offer(new J(runnable, this));
                if (this.f44251c == null) {
                    c();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
