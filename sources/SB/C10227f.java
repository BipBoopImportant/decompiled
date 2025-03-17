package sb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import vb.C10302b;

/* renamed from: sb.f  reason: case insensitive filesystem */
abstract class C10227f {

    /* renamed from: c  reason: collision with root package name */
    public static final C10302b.C1424b f76490c = C10302b.C1424b.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    private final C10225d f76491a;

    /* renamed from: b  reason: collision with root package name */
    private final C10225d f76492b;

    public C10227f(byte[] bArr) {
        if (f76490c.a()) {
            this.f76491a = e(bArr, 1);
            this.f76492b = e(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f76492b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i10 = remaining % 16;
        int i11 = (i10 == 0 ? remaining : (remaining + 16) - i10) + length;
        ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i11);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                C10230i.f(c(bArr), d(bArr2, byteBuffer), bArr3);
                byteBuffer.position(position);
                return this.f76491a.c(bArr, byteBuffer);
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f76491a.d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] a10 = C10230i.a(c(bArr), d(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a10);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    public abstract C10225d e(byte[] bArr, int i10);
}
