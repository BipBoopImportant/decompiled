package RH;

import PH.C16190d;
import XH.C16807N;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LRH/a;", "Ljava/nio/ByteBuffer;", "dst", "", "length", "LXH/N;", "a", "(LRH/a;Ljava/nio/ByteBuffer;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.g  reason: case insensitive filesystem */
public final class C16374g {
    /* JADX INFO: finally extract failed */
    public static final void a(C16368a aVar, ByteBuffer byteBuffer, int i10) {
        C17542s.j(aVar, "<this>");
        C17542s.j(byteBuffer, "dst");
        ByteBuffer h10 = aVar.h();
        int i11 = aVar.i();
        if (aVar.k() - i11 >= i10) {
            int limit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                C16190d.a(h10, byteBuffer, i11);
                byteBuffer.limit(limit);
                C16807N n10 = C16807N.f139792a;
                aVar.c(i10);
            } catch (Throwable th2) {
                byteBuffer.limit(limit);
                throw th2;
            }
        } else {
            throw new EOFException("Not enough bytes to read a " + "buffer content" + " of size " + i10 + '.');
        }
    }
}
