package Db;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public interface j<T> {

    public static class a implements j<Cipher> {
        /* renamed from: b */
        public Cipher a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    public static class b implements j<KeyAgreement> {
        /* renamed from: b */
        public KeyAgreement a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    public static class c implements j<KeyFactory> {
        /* renamed from: b */
        public KeyFactory a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    public static class d implements j<KeyPairGenerator> {
        /* renamed from: b */
        public KeyPairGenerator a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    public static class e implements j<Mac> {
        /* renamed from: b */
        public Mac a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    public static class f implements j<MessageDigest> {
        /* renamed from: b */
        public MessageDigest a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public static class g implements j<Signature> {
        /* renamed from: b */
        public Signature a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}
