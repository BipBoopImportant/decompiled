package W3;

import java.nio.ByteBuffer;
import q3.z;
import t3.C5950a;

/* renamed from: W3.c  reason: case insensitive filesystem */
public abstract class C6713c implements C6711a {
    public final z a(C6712b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(bVar.f32279d);
        C5950a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract z b(C6712b bVar, ByteBuffer byteBuffer);
}
