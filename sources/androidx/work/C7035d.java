package androidx.work;

import QJ.C16340x0;
import QJ.M;
import dI.C17165f;
import dI.C17168i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "Landroidx/work/N;", "f", "()Landroidx/work/N;", "LdI/i;", "d", "(LdI/i;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.d  reason: case insensitive filesystem */
public final class C7035d {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"androidx/work/d$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.d$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f45172a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f45173b;

        a(boolean z10) {
            this.f45173b = z10;
        }

        public Thread newThread(Runnable runnable) {
            C17542s.j(runnable, "runnable");
            String str = this.f45173b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f45172a.incrementAndGet());
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/work/d$b", "Landroidx/work/N;", "", "isEnabled", "()Z", "", "label", "LXH/N;", "a", "(Ljava/lang/String;)V", "d", "()V", "methodName", "", "cookie", "c", "(Ljava/lang/String;I)V", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.d$b */
    public static final class b implements N {
        b() {
        }

        public void a(String str) {
            C17542s.j(str, "label");
            V4.a.c(str);
        }

        public void b(String str, int i10) {
            C17542s.j(str, "methodName");
            V4.a.d(str, i10);
        }

        public void c(String str, int i10) {
            C17542s.j(str, "methodName");
            V4.a.a(str, i10);
        }

        public void d() {
            V4.a.f();
        }

        public boolean isEnabled() {
            return V4.a.h();
        }
    }

    /* access modifiers changed from: private */
    public static final Executor d(C17168i iVar) {
        C17165f fVar = iVar != null ? (C17165f) iVar.get(C17165f.f142966s0) : null;
        M m10 = fVar instanceof M ? (M) fVar : null;
        if (m10 != null) {
            return C16340x0.a(m10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final Executor e(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        C17542s.i(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    /* access modifiers changed from: private */
    public static final N f() {
        return new b();
    }
}
