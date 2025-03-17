package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f44463a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyGenParameterSpec f44464b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44465a;

        static {
            int[] iArr = new int[c.values().length];
            f44465a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.security.crypto.b$b  reason: collision with other inner class name */
    public static final class C0765b {

        /* renamed from: a  reason: collision with root package name */
        final String f44466a;

        /* renamed from: b  reason: collision with root package name */
        KeyGenParameterSpec f44467b;

        /* renamed from: c  reason: collision with root package name */
        c f44468c;

        /* renamed from: d  reason: collision with root package name */
        boolean f44469d;

        /* renamed from: e  reason: collision with root package name */
        int f44470e;

        /* renamed from: f  reason: collision with root package name */
        boolean f44471f;

        /* renamed from: g  reason: collision with root package name */
        final Context f44472g;

        /* renamed from: androidx.security.crypto.b$b$a */
        static class a {

            /* renamed from: androidx.security.crypto.b$b$a$a  reason: collision with other inner class name */
            static class C0766a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    KeyGenParameterSpec.Builder unused = builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: androidx.security.crypto.b$b$a$b  reason: collision with other inner class name */
            static class C0767b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    KeyGenParameterSpec.Builder unused = builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static b a(C0765b bVar) {
                c cVar = bVar.f44468c;
                if (cVar == null && bVar.f44467b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (cVar == c.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(bVar.f44466a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                    if (bVar.f44469d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C0767b.a(keySize, bVar.f44470e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(bVar.f44470e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && bVar.f44471f && bVar.f44472g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0766a.a(keySize);
                    }
                    bVar.f44467b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = bVar.f44467b;
                if (keyGenParameterSpec != null) {
                    return new b(e.c(keyGenParameterSpec), bVar.f44467b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C0765b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public b a() {
            return a.a(this);
        }

        public C0765b b(c cVar) {
            if (a.f44465a[cVar.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + cVar);
            } else if (this.f44467b == null) {
                this.f44468c = cVar;
                return this;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }

        public C0765b(Context context, String str) {
            this.f44472g = context.getApplicationContext();
            this.f44466a = str;
        }
    }

    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f44463a = str;
        this.f44464b = (KeyGenParameterSpec) obj;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f44463a;
    }

    public boolean b() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(this.f44463a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f44463a + ", isKeyStoreBacked=" + b() + "}";
    }
}
