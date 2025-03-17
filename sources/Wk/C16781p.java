package WK;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0002\u001a\u00020\u00018G@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0004¨\u0006\u001f"}, d2 = {"LWK/p;", "LWK/O;", "delegate", "<init>", "(LWK/O;)V", "j", "(LWK/O;)LWK/p;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)LWK/O;", "h", "()J", "", "e", "()Z", "c", "deadlineNanoTime", "d", "(J)LWK/O;", "b", "()LWK/O;", "a", "LXH/N;", "f", "()V", "LWK/O;", "i", "setDelegate", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.p  reason: case insensitive filesystem */
public class C16781p extends O {

    /* renamed from: f  reason: collision with root package name */
    private O f139697f;

    public C16781p(O o10) {
        C17542s.j(o10, "delegate");
        this.f139697f = o10;
    }

    public O a() {
        return this.f139697f.a();
    }

    public O b() {
        return this.f139697f.b();
    }

    public long c() {
        return this.f139697f.c();
    }

    public O d(long j10) {
        return this.f139697f.d(j10);
    }

    public boolean e() {
        return this.f139697f.e();
    }

    public void f() {
        this.f139697f.f();
    }

    public O g(long j10, TimeUnit timeUnit) {
        C17542s.j(timeUnit, "unit");
        return this.f139697f.g(j10, timeUnit);
    }

    public long h() {
        return this.f139697f.h();
    }

    public final O i() {
        return this.f139697f;
    }

    public final C16781p j(O o10) {
        C17542s.j(o10, "delegate");
        this.f139697f = o10;
        return this;
    }
}
