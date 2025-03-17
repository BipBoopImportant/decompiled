package v;

import C.C4391e0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv/j2;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "LXH/N;", "f", "()V", "c", "h", "", "e", "()I", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f30596a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f30597b = new AtomicInteger(0);

    public j2(Executor executor) {
        C17542s.j(executor, "executor");
        this.f30596a = executor;
    }

    /* access modifiers changed from: private */
    public static final void d(j2 j2Var) {
        C17542s.j(j2Var, "this$0");
        int decrementAndGet = j2Var.f30597b.decrementAndGet();
        if (decrementAndGet < 0) {
            C4391e0.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
            return;
        }
        C4391e0.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
    }

    /* access modifiers changed from: private */
    public static final void g(j2 j2Var) {
        C17542s.j(j2Var, "this$0");
        int incrementAndGet = j2Var.f30597b.incrementAndGet();
        C4391e0.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + incrementAndGet);
    }

    public final void c() {
        this.f30596a.execute(new h2(this));
    }

    public final int e() {
        return this.f30597b.get();
    }

    public final void f() {
        this.f30596a.execute(new i2(this));
    }

    public final void h() {
        this.f30597b.set(0);
        C4391e0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
