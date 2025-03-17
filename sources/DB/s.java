package Db;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import qb.C10156a;
import sb.C10229h;

public final class s implements C10156a {

    /* renamed from: a  reason: collision with root package name */
    private final C10229h f59076a;

    public s(byte[] bArr) {
        this.f59076a = new C10229h(bArr);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] c10 = p.c(24);
        allocate.put(c10);
        this.f59076a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f59076a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
