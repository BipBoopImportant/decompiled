package Z5;

import WK.C16770e;
import WK.N;
import WK.O;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "LWK/N;", "a", "(Ljava/nio/ByteBuffer;)LWK/N;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Z5/e$a", "LWK/N;", "LXH/N;", "close", "()V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "a", "Ljava/nio/ByteBuffer;", "buffer", "", "b", "I", "len", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements N {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f41376a;

        /* renamed from: b  reason: collision with root package name */
        private final int f41377b;

        a(ByteBuffer byteBuffer) {
            ByteBuffer slice = byteBuffer.slice();
            this.f41376a = slice;
            this.f41377b = slice.capacity();
        }

        public void close() {
        }

        public long u0(C16770e eVar, long j10) {
            if (this.f41376a.position() == this.f41377b) {
                return -1;
            }
            this.f41376a.limit(C17978n.i((int) (((long) this.f41376a.position()) + j10), this.f41377b));
            return (long) eVar.write(this.f41376a);
        }

        public O y() {
            return O.f139626e;
        }
    }

    public static final N a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
