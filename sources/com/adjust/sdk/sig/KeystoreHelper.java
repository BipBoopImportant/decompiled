package com.adjust.sdk.sig;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

public class KeystoreHelper implements IKeystoreHelper {
    private static final String ENCRYPTED_KEY = "encrypted_key";
    private static final String KEY_ALIAS = "key2";
    private static final String SHARED_PREFS_NAME = "adjust_keys";
    private static final String TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private final int apiLevel;

    static class UnsupportedApiException extends RuntimeException {
        UnsupportedApiException() {
        }
    }

    KeystoreHelper(int i10) {
        this.apiLevel = i10;
    }

    private byte[] generateRandomByteArray() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private Key getSecretKey(Context context) {
        int i10 = this.apiLevel;
        if (i10 >= 23) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.getKey(KEY_ALIAS, (char[]) null);
        } else if (i10 >= 18) {
            String string = context.getSharedPreferences(SHARED_PREFS_NAME, 0).getString(ENCRYPTED_KEY, (String) null);
            if (string != null) {
                return new SecretKeySpec(rsaDecrypt(Base64.decode(string, 0)), "AES");
            }
            throw new RuntimeException("Failed to find encrypted key in SharedPreferences");
        } else {
            throw new RuntimeException("Unsupported version");
        }
    }

    @SuppressLint({"NewApi"})
    @TargetApi(18)
    private void initKeyPostJBMR2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, 0);
        if (!sharedPreferences.contains(ENCRYPTED_KEY)) {
            Date time = Calendar.getInstance().getTime();
            Calendar instance = Calendar.getInstance();
            instance.add(1, 1);
            KeyPairGeneratorSpec.Builder endDate = new KeyPairGeneratorSpec.Builder(context).setAlias(KEY_ALIAS).setSubject(new X500Principal("CN=key2")).setSerialNumber(BigInteger.TEN).setStartDate(time).setEndDate(instance.getTime());
            if (this.apiLevel >= 19) {
                endDate.setKeySize(1024);
            }
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance2.initialize(endDate.build());
            instance2.genKeyPair();
            String encodeToString = Base64.encodeToString(rsaEncrypt(generateRandomByteArray()), 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(ENCRYPTED_KEY, encodeToString);
            edit.apply();
        }
    }

    @TargetApi(23)
    private void initKeyPostM() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        if (!instance.containsAlias(KEY_ALIAS)) {
            KeyGenerator instance2 = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
            instance2.init(new KeyGenParameterSpec.Builder(KEY_ALIAS, 4).build());
            instance2.generateKey();
        }
    }

    private byte[] rsaDecrypt(byte[] bArr) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Cipher instance2 = Cipher.getInstance(TRANSFORMATION);
        instance2.init(2, ((KeyStore.PrivateKeyEntry) instance.getEntry(KEY_ALIAS, (KeyStore.ProtectionParameter) null)).getPrivateKey());
        return instance2.doFinal(bArr);
    }

    private byte[] rsaEncrypt(byte[] bArr) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Cipher instance2 = Cipher.getInstance(TRANSFORMATION);
        instance2.init(1, ((KeyStore.PrivateKeyEntry) instance.getEntry(KEY_ALIAS, (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
        return instance2.doFinal(bArr);
    }

    public void deleteKeys(Context context) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        instance.deleteEntry(KEY_ALIAS);
        context.getSharedPreferences(SHARED_PREFS_NAME, 0).edit().remove(ENCRYPTED_KEY).apply();
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public byte[] getHmac(Context context, byte[] bArr) {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(getSecretKey(context));
        instance.update(bArr);
        return instance.doFinal();
    }

    public void initKeys(Context context) {
        int i10 = this.apiLevel;
        if (i10 >= 23) {
            initKeyPostM();
        } else if (i10 >= 18) {
            initKeyPostJBMR2(context);
        } else {
            throw new UnsupportedApiException();
        }
    }
}
