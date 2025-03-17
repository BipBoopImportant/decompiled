package sb;

import Db.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: sb.d  reason: case insensitive filesystem */
abstract class C10225d {

    /* renamed from: a  reason: collision with root package name */
    int[] f76488a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76489b;

    public C10225d(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.f76488a = C10222a.e(bArr);
            this.f76489b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == e()) {
            int remaining = byteBuffer2.remaining();
            int i10 = remaining / 64;
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                ByteBuffer a10 = a(bArr, this.f76489b + i12);
                if (i12 == i10) {
                    f.c(byteBuffer, byteBuffer2, a10, remaining % 64);
                } else {
                    f.c(byteBuffer, byteBuffer2, a10, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer a(byte[] bArr, int i10) {
        int[] b10 = b(C10222a.e(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        C10222a.d(iArr);
        for (int i11 = 0; i11 < b10.length; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public abstract int[] b(int[] iArr, int i10);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    public abstract int e();
}
