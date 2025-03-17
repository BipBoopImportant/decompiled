package PH;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0001\u0003\u0001\u00020\u0002ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"LPH/c;", "", "Ljava/nio/ByteBuffer;", "buffer", "b", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "offset", "length", "d", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "destination", "destinationOffset", "LXH/N;", "c", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: PH.c  reason: case insensitive filesystem */
public final class C16189c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137148a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final ByteBuffer f137149b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LPH/c$a;", "", "<init>", "()V", "LPH/c;", "Empty", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: PH.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteBuffer a() {
            return C16189c.f137149b;
        }

        private a() {
        }
    }

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        C17542s.i(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f137149b = b(order);
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "buffer");
        return byteBuffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        C17542s.j(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray() || byteBuffer.isReadOnly() || byteBuffer2.isReadOnly()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i10);
            duplicate.limit(i10 + i11);
            ByteBuffer duplicate2 = byteBuffer2.duplicate();
            duplicate2.position(i12);
            duplicate2.put(duplicate);
            return;
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + i12, i11);
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        return b(C16190d.d(byteBuffer, i10, i11));
    }
}
