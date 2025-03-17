package RH;

import SH.C16416a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LRH/k;", "Ljava/nio/ByteBuffer;", "dst", "", "b", "(LRH/k;Ljava/nio/ByteBuffer;)I", "bb", "copied", "a", "(LRH/k;Ljava/nio/ByteBuffer;I)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.i  reason: case insensitive filesystem */
public final class C16376i {
    private static final int a(k kVar, ByteBuffer byteBuffer, int i10) {
        C16416a t02;
        while (byteBuffer.hasRemaining() && (t02 = kVar.t0(1)) != null) {
            int remaining = byteBuffer.remaining();
            int k10 = t02.k() - t02.i();
            if (remaining >= k10) {
                C16374g.a(t02, byteBuffer, k10);
                kVar.P0(t02);
                i10 += k10;
            } else {
                C16374g.a(t02, byteBuffer, remaining);
                kVar.Q0(t02.i());
                return i10 + remaining;
            }
        }
        return i10;
    }

    public static final int b(k kVar, ByteBuffer byteBuffer) {
        C17542s.j(kVar, "<this>");
        C17542s.j(byteBuffer, "dst");
        int a10 = a(kVar, byteBuffer, 0);
        if (!byteBuffer.hasRemaining()) {
            return a10;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + byteBuffer.remaining() + " more bytes required");
    }
}
