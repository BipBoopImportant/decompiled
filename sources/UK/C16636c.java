package UK;

import WK.C16770e;
import WK.N;
import WK.t;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LUK/c;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "LWK/e;", "buffer", "LXH/N;", "c", "(LWK/e;)V", "close", "()V", "a", "Z", "b", "LWK/e;", "deflatedBytes", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "LWK/t;", "d", "LWK/t;", "inflaterSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.c  reason: case insensitive filesystem */
public final class C16636c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139180a;

    /* renamed from: b  reason: collision with root package name */
    private final C16770e f139181b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f139182c;

    /* renamed from: d  reason: collision with root package name */
    private final t f139183d;

    public C16636c(boolean z10) {
        this.f139180a = z10;
        C16770e eVar = new C16770e();
        this.f139181b = eVar;
        Inflater inflater = new Inflater(true);
        this.f139182c = inflater;
        this.f139183d = new t((N) eVar, inflater);
    }

    public final void c(C16770e eVar) {
        C17542s.j(eVar, "buffer");
        if (this.f139181b.size() == 0) {
            if (this.f139180a) {
                this.f139182c.reset();
            }
            this.f139181b.Y(eVar);
            this.f139181b.d0(65535);
            long bytesRead = this.f139182c.getBytesRead() + this.f139181b.size();
            do {
                this.f139183d.c(eVar, Long.MAX_VALUE);
            } while (this.f139182c.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public void close() {
        this.f139183d.close();
    }
}
