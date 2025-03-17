package Db;

import Bb.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import vb.C10302b;
import zb.C10485a;

public final class m implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final C10302b.C1424b f59061d = C10302b.C1424b.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f59062a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f59063b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f59064c;

    public m(byte[] bArr) {
        r.a(bArr.length);
        this.f59062a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c10 = c();
        c10.init(1, this.f59062a);
        byte[] b10 = C10485a.b(c10.doFinal(new byte[16]));
        this.f59063b = b10;
        this.f59064c = C10485a.b(b10);
    }

    private static Cipher c() {
        if (f59061d.a()) {
            return i.f59050b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher c10 = c();
            c10.init(1, this.f59062a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            byte[] d10 = max * 16 == bArr.length ? f.d(bArr, (max - 1) * 16, this.f59063b, 0, 16) : f.e(C10485a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f59064c);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = c10.doFinal(f.d(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(c10.doFinal(f.e(d10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
