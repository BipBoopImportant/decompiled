package WK;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LWK/u;", "LWK/N;", "Ljava/io/InputStream;", "input", "LWK/O;", "timeout", "<init>", "(Ljava/io/InputStream;LWK/O;)V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "close", "()V", "y", "()LWK/O;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "LWK/O;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
class u implements N {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f139715a;

    /* renamed from: b  reason: collision with root package name */
    private final O f139716b;

    public u(InputStream inputStream, O o10) {
        C17542s.j(inputStream, "input");
        C17542s.j(o10, "timeout");
        this.f139715a = inputStream;
        this.f139716b = o10;
    }

    public void close() {
        this.f139715a.close();
    }

    public String toString() {
        return "source(" + this.f139715a + ')';
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            try {
                this.f139716b.f();
                I I02 = eVar.I0(1);
                int read = this.f139715a.read(I02.f139610a, I02.f139612c, (int) Math.min(j10, (long) (8192 - I02.f139612c)));
                if (read != -1) {
                    I02.f139612c += read;
                    long j11 = (long) read;
                    eVar.p0(eVar.size() + j11);
                    return j11;
                } else if (I02.f139611b != I02.f139612c) {
                    return -1;
                } else {
                    eVar.f139653a = I02.b();
                    J.b(I02);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (y.e(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    public O y() {
        return this.f139716b;
    }
}
