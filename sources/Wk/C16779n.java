package WK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"LWK/n;", "LWK/L;", "delegate", "<init>", "(LWK/L;)V", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "LWK/O;", "y", "()LWK/O;", "close", "", "toString", "()Ljava/lang/String;", "a", "LWK/L;", "()LWK/L;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.n  reason: case insensitive filesystem */
public abstract class C16779n implements L {

    /* renamed from: a  reason: collision with root package name */
    private final L f139695a;

    public C16779n(L l10) {
        C17542s.j(l10, "delegate");
        this.f139695a = l10;
    }

    public void close() {
        this.f139695a.close();
    }

    public void flush() {
        this.f139695a.flush();
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        this.f139695a.s3(eVar, j10);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f139695a + ')';
    }

    public O y() {
        return this.f139695a.y();
    }
}
