package com.auth0.android.provider;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;
import v7.l;

class b extends o {

    /* renamed from: b  reason: collision with root package name */
    private Signature f46318b;

    b(PublicKey publicKey) {
        super(Collections.singletonList("RS256"));
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            this.f46318b = instance;
            instance.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void b(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        sb2.append(strArr[0]);
        sb2.append(".");
        sb2.append(strArr[1]);
        byte[] bytes = sb2.toString().getBytes(StandardCharsets.UTF_8);
        try {
            byte[] decode = Base64.decode(strArr[2], 10);
            this.f46318b.update(bytes);
            z10 = this.f46318b.verify(decode);
        } catch (Exception unused) {
        }
        if (!z10) {
            throw new l();
        }
    }
}
