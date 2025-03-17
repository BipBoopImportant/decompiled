package RH;

import PH.C16190d;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LRH/a;", "Ljava/nio/ByteBuffer;", "source", "LXH/N;", "a", "(LRH/a;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.e  reason: case insensitive filesystem */
public final class C16372e {
    public static final void a(C16368a aVar, ByteBuffer byteBuffer) {
        C17542s.j(aVar, "<this>");
        C17542s.j(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        int g10 = aVar.g() - k10;
        if (g10 >= remaining) {
            C16190d.c(byteBuffer, h10, k10);
            aVar.a(remaining);
            return;
        }
        throw new r("buffer content", remaining, g10);
    }
}
