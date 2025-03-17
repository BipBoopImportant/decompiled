package R2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"LR2/a;", "", "", "initialValue", "<init>", "(I)V", "c", "()I", "a", "b", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: R2.a  reason: case insensitive filesystem */
public final class C4797a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f12295a;

    public C4797a(int i10) {
        this.f12295a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f12295a.decrementAndGet();
    }

    public final int b() {
        return this.f12295a.get();
    }

    public final int c() {
        return this.f12295a.getAndIncrement();
    }

    public final int d() {
        return this.f12295a.incrementAndGet();
    }
}
