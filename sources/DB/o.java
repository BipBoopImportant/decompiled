package Db;

import Bb.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import qb.C10175t;

public class o implements C10175t {

    /* renamed from: a  reason: collision with root package name */
    private final a f59071a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59072b;

    public o(a aVar, int i10) {
        this.f59071a = aVar;
        this.f59072b = i10;
        if (i10 >= 10) {
            aVar.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public byte[] b(byte[] bArr) {
        return this.f59071a.a(bArr, this.f59072b);
    }
}
