package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@Deprecated
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final KeyGenParameterSpec f44473a = a("_androidx_security_master_key_");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f44474b = new Object();

    private static KeyGenParameterSpec a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
    }

    private static void b(KeyGenParameterSpec keyGenParameterSpec) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(keyGenParameterSpec);
            instance.generateKey();
        } catch (ProviderException e10) {
            throw new GeneralSecurityException(e10.getMessage(), e10);
        }
    }

    public static String c(KeyGenParameterSpec keyGenParameterSpec) {
        e(keyGenParameterSpec);
        synchronized (f44474b) {
            try {
                if (!d(keyGenParameterSpec.getKeystoreAlias())) {
                    b(keyGenParameterSpec);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    private static boolean d(String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance.containsAlias(str);
    }

    static void e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        } else if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }
}
