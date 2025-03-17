package com.auth0.android.provider;

import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46317a = "a";

    a() {
    }

    private String d(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        return d(e(c(str)));
    }

    /* access modifiers changed from: package-private */
    public String b() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: package-private */
    public byte[] c(String str) {
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    /* access modifiers changed from: package-private */
    public byte[] e(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            instance.update(bArr, 0, bArr.length);
            return instance.digest();
        } catch (NoSuchAlgorithmException e10) {
            Log.e(f46317a, "Failed to get SHA-256 signature", e10);
            throw new IllegalStateException("Failed to get SHA-256 signature", e10);
        }
    }
}
