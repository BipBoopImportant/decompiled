package sb;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: sb.g  reason: case insensitive filesystem */
public class C10228g extends C10225d {
    public C10228g(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    static int[] g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C10222a.c(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        C10222a.d(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* access modifiers changed from: package-private */
    public int[] b(int[] iArr, int i10) {
        if (iArr.length == e() / 4) {
            int[] iArr2 = new int[16];
            C10222a.c(iArr2, g(this.f76488a, iArr));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 24;
    }
}
