package Db;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vb.C10302b;

public final class a implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final C10302b.C1424b f59009d = C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f59010e = new C0976a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f59011a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59012b;

    /* renamed from: c  reason: collision with root package name */
    private final int f59013c;

    /* renamed from: Db.a$a  reason: collision with other inner class name */
    class C0976a extends ThreadLocal<Cipher> {
        C0976a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f59050b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        if (f59009d.a()) {
            r.a(bArr.length);
            this.f59011a = new SecretKeySpec(bArr, "AES");
            int blockSize = f59010e.get().getBlockSize();
            this.f59013c = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f59012b = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = f59010e.get();
        byte[] bArr4 = new byte[this.f59013c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f59012b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f59011a, ivParameterSpec);
        } else {
            cipher.init(2, this.f59011a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f59012b;
        if (length <= Integer.MAX_VALUE - i10) {
            byte[] bArr2 = new byte[(bArr.length + i10)];
            byte[] c10 = p.c(i10);
            System.arraycopy(c10, 0, bArr2, 0, this.f59012b);
            c(bArr, 0, bArr.length, bArr2, this.f59012b, c10, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f59012b));
    }

    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f59012b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr.length;
            int i11 = this.f59012b;
            byte[] bArr3 = new byte[(length2 - i11)];
            c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
