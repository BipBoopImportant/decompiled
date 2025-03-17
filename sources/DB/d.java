package Db;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import qb.C10160e;
import vb.C10302b;
import zb.C10485a;

public final class d implements C10160e {

    /* renamed from: c  reason: collision with root package name */
    public static final C10302b.C1424b f59023c = C10302b.C1424b.ALGORITHM_NOT_FIPS;

    /* renamed from: d  reason: collision with root package name */
    private static final Collection<Integer> f59024d = Arrays.asList(new Integer[]{64});

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f59025e = new byte[16];

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f59026f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    private final m f59027a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f59028b;

    public d(byte[] bArr) {
        if (!f59023c.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (f59024d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f59028b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f59027a = new m(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f59027a.a(f59026f, 16);
        }
        byte[] a10 = this.f59027a.a(f59025e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a10 = f.e(C10485a.b(a10), this.f59027a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f59027a.a(bArr3.length >= 16 ? f.f(bArr3, a10) : f.e(C10485a.a(bArr3), C10485a.b(a10)), 16);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a10 = i.f59050b.a("AES/CTR/NoPadding");
            byte[] c10 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c10.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f59028b, "AES"), new IvParameterSpec(bArr3));
            return f.a(c10, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a10 = i.f59050b.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(2, new SecretKeySpec(this.f59028b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a10.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && q.b()) {
                doFinal = new byte[0];
            }
            if (f.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
