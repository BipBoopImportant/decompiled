package WK;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"LWK/O;", "", "<init>", "()V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)LWK/O;", "h", "()J", "", "e", "()Z", "c", "deadlineNanoTime", "d", "(J)LWK/O;", "b", "()LWK/O;", "a", "LXH/N;", "f", "Z", "hasDeadline", "J", "timeoutNanos", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class O {

    /* renamed from: d  reason: collision with root package name */
    public static final b f139625d = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final O f139626e = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f139627a;

    /* renamed from: b  reason: collision with root package name */
    private long f139628b;

    /* renamed from: c  reason: collision with root package name */
    private long f139629c;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"WK/O$a", "LWK/O;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)LWK/O;", "deadlineNanoTime", "d", "(J)LWK/O;", "LXH/N;", "f", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends O {
        a() {
        }

        public O d(long j10) {
            return this;
        }

        public void f() {
        }

        public O g(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "unit");
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LWK/O$b;", "", "<init>", "()V", "LWK/O;", "NONE", "LWK/O;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public O a() {
        this.f139627a = false;
        return this;
    }

    public O b() {
        this.f139629c = 0;
        return this;
    }

    public long c() {
        if (this.f139627a) {
            return this.f139628b;
        }
        throw new IllegalStateException("No deadline");
    }

    public O d(long j10) {
        this.f139627a = true;
        this.f139628b = j10;
        return this;
    }

    public boolean e() {
        return this.f139627a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f139627a && this.f139628b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public O g(long j10, TimeUnit timeUnit) {
        C17542s.j(timeUnit, "unit");
        if (j10 >= 0) {
            this.f139629c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f139629c;
    }
}
