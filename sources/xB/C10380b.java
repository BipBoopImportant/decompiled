package xb;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import qb.C10156a;

/* renamed from: xb.b  reason: case insensitive filesystem */
public final class C10380b implements C10156a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f77693b = "b";

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f77694a;

    C10380b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f77694a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f77694a, gCMParameterSpec);
        instance.updateAAD(bArr2);
        return instance.doFinal(bArr, 12, bArr.length - 12);
    }

    private byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f77694a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private static void e() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f77693b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            e();
            return d(bArr, bArr2);
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return c(bArr, bArr2);
            } catch (AEADBadTagException e10) {
                throw e10;
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(f77693b, "encountered a potentially transient KeyStore error, will wait and retry", e11);
                e();
                return c(bArr, bArr2);
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
