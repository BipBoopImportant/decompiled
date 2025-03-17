package rb;

import Cb.A;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import qb.C10156a;
import qb.C10179x;

/* renamed from: rb.E  reason: case insensitive filesystem */
public final class C10201E implements C10156a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f76263c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final A f76264a;

    /* renamed from: b  reason: collision with root package name */
    private final C10156a f76265b;

    public C10201E(A a10, C10156a aVar) {
        this.f76264a = a10;
        this.f76265b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = C10179x.j(this.f76264a).a();
        return c(this.f76265b.a(a10, f76263c), ((C10156a) C10179x.g(this.f76264a.W(), a10, C10156a.class)).a(bArr, bArr2));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C10156a) C10179x.g(this.f76264a.W(), this.f76265b.b(bArr3, f76263c), C10156a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
