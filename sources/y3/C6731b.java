package Y3;

import W3.C6712b;
import W3.C6713c;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q3.z;
import t3.B;
import t3.C5950a;

/* renamed from: Y3.b  reason: case insensitive filesystem */
public final class C6731b extends C6713c {
    /* access modifiers changed from: protected */
    public z b(C6712b bVar, ByteBuffer byteBuffer) {
        return new z(c(new B(byteBuffer.array(), byteBuffer.limit())));
    }

    public C6730a c(B b10) {
        return new C6730a((String) C5950a.e(b10.B()), (String) C5950a.e(b10.B()), b10.A(), b10.A(), Arrays.copyOfRange(b10.e(), b10.f(), b10.g()));
    }
}
