package Db;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import qb.C10156a;
import sb.C10226e;

public final class g implements C10156a {

    /* renamed from: a  reason: collision with root package name */
    private final C10226e f59046a;

    public g(byte[] bArr) {
        this.f59046a = new C10226e(bArr);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] c10 = p.c(12);
        allocate.put(c10);
        this.f59046a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f59046a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
