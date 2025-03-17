package Db;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import qb.C10156a;
import vb.C10302b;

public final class b implements C10156a {

    /* renamed from: e  reason: collision with root package name */
    public static final C10302b.C1424b f59014e = C10302b.C1424b.ALGORITHM_NOT_FIPS;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f59015f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f59016g = new C0977b();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f59017a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f59018b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f59019c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59020d;

    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f59050b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: Db.b$b  reason: collision with other inner class name */
    class C0977b extends ThreadLocal<Cipher> {
        C0977b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f59050b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10) {
        if (!f59014e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i10 == 12 || i10 == 16) {
            this.f59020d = i10;
            r.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f59019c = secretKeySpec;
            Cipher cipher = f59015f.get();
            cipher.init(1, secretKeySpec);
            byte[] c10 = c(cipher.doFinal(new byte[16]));
            this.f59017a = c10;
            this.f59018b = c(c10);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(f(bArr2, this.f59017a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i13 + i11, i11 + i12))));
    }

    private byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.f59017a);
        }
        byte[] copyOf = Arrays.copyOf(this.f59018b, 16);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            copyOf[i10] = (byte) (copyOf[i10] ^ bArr[i10]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i10 = this.f59020d;
        if (length <= 2147483631 - i10) {
            byte[] bArr4 = new byte[(bArr3.length + i10 + 16)];
            byte[] c10 = p.c(i10);
            System.arraycopy(c10, 0, bArr4, 0, this.f59020d);
            Cipher cipher = f59015f.get();
            cipher.init(1, this.f59019c);
            byte[] d10 = d(cipher, 0, c10, 0, c10.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] d11 = d(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f59016g.get();
            cipher2.init(1, this.f59019c, new IvParameterSpec(d10));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f59020d);
            byte[] d12 = d(cipher, 2, bArr4, this.f59020d, bArr3.length);
            int length2 = bArr3.length + this.f59020d;
            for (int i11 = 0; i11 < 16; i11++) {
                bArr4[length2 + i11] = (byte) ((d11[i11] ^ d10[i11]) ^ d12[i11]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f59020d) - 16;
        if (length >= 0) {
            Cipher cipher = f59015f.get();
            cipher.init(1, this.f59019c);
            byte[] d10 = d(cipher, 0, bArr, 0, this.f59020d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d11 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d12 = d(cipher, 2, bArr, this.f59020d, length);
            int length2 = bArr.length - 16;
            byte b10 = 0;
            for (int i10 = 0; i10 < 16; i10++) {
                b10 = (byte) (b10 | (((bArr[length2 + i10] ^ d11[i10]) ^ d10[i10]) ^ d12[i10]));
            }
            if (b10 == 0) {
                Cipher cipher2 = f59016g.get();
                cipher2.init(1, this.f59019c, new IvParameterSpec(d10));
                return cipher2.doFinal(bArr, this.f59020d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
