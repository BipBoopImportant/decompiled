package N6;

import WK.C16770e;
import WK.L;
import WK.O;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LN6/a;", "LWK/L;", "delegate", "<init>", "(LWK/L;)V", "LXH/N;", "close", "()V", "flush", "LWK/O;", "y", "()LWK/O;", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "a", "LWK/L;", "<set-?>", "b", "J", "c", "()J", "bytesWritten", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class a implements L {

    /* renamed from: a  reason: collision with root package name */
    private final L f39123a;

    /* renamed from: b  reason: collision with root package name */
    private long f39124b;

    public a(L l10) {
        C17542s.j(l10, "delegate");
        this.f39123a = l10;
    }

    public final long c() {
        return this.f39124b;
    }

    public void close() {
        this.f39123a.close();
    }

    public void flush() {
        this.f39123a.flush();
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        this.f39123a.s3(eVar, j10);
        this.f39124b += j10;
    }

    public O y() {
        return this.f39123a.y();
    }
}
