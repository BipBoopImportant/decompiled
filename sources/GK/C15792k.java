package GK;

import KK.e;
import LK.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LGK/k;", "", "LLK/g;", "delegate", "<init>", "(LLK/g;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "LXH/N;", "a", "LLK/g;", "b", "()LLK/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.k  reason: case insensitive filesystem */
public final class C15792k {

    /* renamed from: a  reason: collision with root package name */
    private final g f135045a;

    public C15792k(g gVar) {
        C17542s.j(gVar, "delegate");
        this.f135045a = gVar;
    }

    public final void a() {
        this.f135045a.d();
    }

    public final g b() {
        return this.f135045a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15792k(int i10, long j10, TimeUnit timeUnit) {
        this(new g(e.f135927i, i10, j10, timeUnit));
        C17542s.j(timeUnit, "timeUnit");
    }

    public C15792k() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
