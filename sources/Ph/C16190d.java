package PH;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a#\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"LPH/c;", "", "destination", "", "offset", "length", "destinationOffset", "LXH/N;", "b", "(Ljava/nio/ByteBuffer;[BIII)V", "Ljava/nio/ByteBuffer;", "a", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V", "c", "d", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: PH.d  reason: case insensitive filesystem */
public final class C16190d {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        C17542s.j(byteBuffer, "$this$copyTo");
        C17542s.j(byteBuffer2, "destination");
        int remaining = byteBuffer2.remaining();
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly() || !byteBuffer2.hasArray() || byteBuffer2.isReadOnly()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(remaining + i10);
            duplicate.position(i10);
            byteBuffer2.put(duplicate);
            return;
        }
        int position = byteBuffer2.position();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + position, remaining);
        byteBuffer2.position(position + remaining);
    }

    public static final void b(ByteBuffer byteBuffer, byte[] bArr, int i10, int i11, int i12) {
        C17542s.j(byteBuffer, "$this$copyTo");
        C17542s.j(bArr, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i12, i11);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, bArr, i12, i11);
        }
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        C17542s.j(byteBuffer, "$this$copyTo");
        C17542s.j(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            d(byteBuffer2, i10, byteBuffer.remaining()).put(byteBuffer);
            return;
        }
        byte[] array = byteBuffer.array();
        C17542s.i(array, "array()");
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        ByteBuffer order = ByteBuffer.wrap(array, arrayOffset, remaining).slice().order(ByteOrder.BIG_ENDIAN);
        C17542s.i(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        C16189c.c(C16189c.b(order), byteBuffer2, 0, remaining, i10);
        byteBuffer.position(byteBuffer.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        C17542s.j(byteBuffer, "<this>");
        ByteBuffer duplicate = byteBuffer.duplicate();
        C17542s.i(duplicate, "myDuplicate$lambda$1");
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer slice = duplicate.slice();
        C17542s.i(slice, "mySlice$lambda$2");
        return slice;
    }
}
