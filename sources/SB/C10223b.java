package sb;

import Db.i;
import Db.q;
import Db.r;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vb.C10302b;

/* renamed from: sb.b  reason: case insensitive filesystem */
public final class C10223b {

    /* renamed from: c  reason: collision with root package name */
    public static final C10302b.C1424b f76484c = C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f76485d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f76486a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f76487b;

    /* renamed from: sb.b$a */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f59050b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C10223b(byte[] bArr, boolean z10) {
        if (f76484c.a()) {
            r.a(bArr.length);
            this.f76486a = new SecretKeySpec(bArr, "AES");
            this.f76487b = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i10, int i11) {
        return (!q.b() || q.a() > 19) ? new GCMParameterSpec(128, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z10 = this.f76487b;
            if (bArr2.length >= (z10 ? 28 : 16)) {
                int i10 = 0;
                if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec c10 = c(bArr);
                    ThreadLocal<Cipher> threadLocal = f76485d;
                    threadLocal.get().init(2, this.f76486a, c10);
                    if (!(bArr3 == null || bArr3.length == 0)) {
                        threadLocal.get().updateAAD(bArr3);
                    }
                    boolean z11 = this.f76487b;
                    if (z11) {
                        i10 = 12;
                    }
                    return threadLocal.get().doFinal(bArr2, i10, z11 ? bArr2.length - 12 : bArr2.length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        } else if (bArr2.length <= 2147483619) {
            boolean z10 = this.f76487b;
            byte[] bArr4 = new byte[(z10 ? bArr2.length + 28 : bArr2.length + 16)];
            if (z10) {
                System.arraycopy(bArr, 0, bArr4, 0, 12);
            }
            AlgorithmParameterSpec c10 = c(bArr);
            ThreadLocal<Cipher> threadLocal = f76485d;
            threadLocal.get().init(1, this.f76486a, c10);
            if (!(bArr3 == null || bArr3.length == 0)) {
                threadLocal.get().updateAAD(bArr3);
            }
            int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, this.f76487b ? 12 : 0);
            if (doFinal == bArr2.length + 16) {
                return bArr4;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr2.length)}));
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }
}
