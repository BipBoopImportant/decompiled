package Db;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import qb.C10156a;
import qb.C10175t;

public final class h implements C10156a {

    /* renamed from: a  reason: collision with root package name */
    private final l f59047a;

    /* renamed from: b  reason: collision with root package name */
    private final C10175t f59048b;

    /* renamed from: c  reason: collision with root package name */
    private final int f59049c;

    public h(l lVar, C10175t tVar, int i10) {
        this.f59047a = lVar;
        this.f59048b = tVar;
        this.f59049c = i10;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f59047a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(a10, this.f59048b.b(f.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f59049c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f59049c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f59048b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
            return this.f59047a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
