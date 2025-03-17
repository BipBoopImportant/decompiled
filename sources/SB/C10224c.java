package sb;

import java.nio.ByteBuffer;

/* renamed from: sb.c  reason: case insensitive filesystem */
public class C10224c extends C10225d {
    public C10224c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public int[] b(int[] iArr, int i10) {
        if (iArr.length == e() / 4) {
            int[] iArr2 = new int[16];
            C10222a.c(iArr2, this.f76488a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    public int e() {
        return 12;
    }
}
