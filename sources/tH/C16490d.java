package TH;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LTH/d;", "LTH/c;", "Ljava/nio/ByteBuffer;", "", "capacity", "bufferSize", "<init>", "(II)V", "s", "()Ljava/nio/ByteBuffer;", "instance", "q", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "LXH/N;", "t", "(Ljava/nio/ByteBuffer;)V", "h", "I", "getBufferSize", "()I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: TH.d  reason: case insensitive filesystem */
public final class C16490d extends C16489c<ByteBuffer> {

    /* renamed from: h  reason: collision with root package name */
    private final int f138537h;

    public C16490d(int i10, int i11) {
        super(i10);
        this.f138537h = i11;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public ByteBuffer e(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "instance");
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public ByteBuffer h() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f138537h);
        C17542s.g(allocateDirect);
        return allocateDirect;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void o(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "instance");
        if (byteBuffer.capacity() != this.f138537h) {
            throw new IllegalStateException("Check failed.");
        } else if (!byteBuffer.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
