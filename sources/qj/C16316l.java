package QJ;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LQJ/l;", "LQJ/m;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "", "cause", "LXH/N;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/concurrent/Future;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.l  reason: case insensitive filesystem */
final class C16316l implements C16318m {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f137645a;

    public C16316l(Future<?> future) {
        this.f137645a = future;
    }

    public void b(Throwable th2) {
        this.f137645a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f137645a + ']';
    }
}
