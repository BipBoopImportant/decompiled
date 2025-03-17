package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzhd {
    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (!(packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0)) {
                Signature signature = signatureArr[0];
                if (signature != null) {
                    return zzb(signature);
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    private static String zzb(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return zzns.zzd().zze(digest, 0, digest.length);
        } catch (NoSuchAlgorithmException e10) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e10);
            return null;
        }
    }
}
