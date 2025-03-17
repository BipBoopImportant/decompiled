package com.google.android.gms.common.util;

import S9.c;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest b10;
        PackageInfo e10 = c.a(context).e(str, 64);
        Signature[] signatureArr = e10.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b10 = b("SHA1")) == null) {
            return null;
        }
        return b10.digest(e10.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
