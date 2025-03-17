package WK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LWK/o;", "LWK/N;", "delegate", "<init>", "(LWK/N;)V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "LXH/N;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "LWK/N;", "c", "()LWK/N;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.o  reason: case insensitive filesystem */
public abstract class C16780o implements N {

    /* renamed from: a  reason: collision with root package name */
    private final N f139696a;

    public C16780o(N n10) {
        C17542s.j(n10, "delegate");
        this.f139696a = n10;
    }

    public final N c() {
        return this.f139696a;
    }

    public void close() {
        this.f139696a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f139696a + ')';
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        return this.f139696a.u0(eVar, j10);
    }

    public O y() {
        return this.f139696a.y();
    }
}
