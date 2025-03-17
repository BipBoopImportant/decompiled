package tb;

import Db.i;
import Db.p;
import Db.q;
import Db.r;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import qb.C10156a;

/* renamed from: tb.a  reason: case insensitive filesystem */
public final class C10248a implements C10156a {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f76781b = new C1411a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f76782a;

    /* renamed from: tb.a$a  reason: collision with other inner class name */
    class C1411a extends ThreadLocal<Cipher> {
        C1411a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f59050b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C10248a(byte[] bArr) {
        r.a(bArr.length);
        this.f76782a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i10, int i11) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i10, i11);
        } catch (ClassNotFoundException unused) {
            if (q.b()) {
                return new IvParameterSpec(bArr, i10, i11);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 28)];
            byte[] c10 = p.c(12);
            System.arraycopy(c10, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c11 = c(c10);
            ThreadLocal<Cipher> threadLocal = f76781b;
            threadLocal.get().init(1, this.f76782a, c11);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec d10 = d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f76781b;
            threadLocal.get().init(2, this.f76782a, d10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
