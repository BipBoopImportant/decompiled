package s;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s.a  reason: case insensitive filesystem */
class C5822a {

    /* renamed from: s.a$a  reason: collision with other inner class name */
    static class C0455a implements c {
        C0455a() {
        }

        public List<byte[]> a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature a10 : signingInfo.getApkContentsSigners()) {
                    arrayList.add(C5822a.a(a10));
                }
            } else {
                arrayList.add(C5822a.a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }
    }

    /* renamed from: s.a$b */
    static class b implements c {
        b() {
        }

        @SuppressLint({"PackageManagerGetSignatures"})
        public List<byte[]> a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature a10 : packageInfo.signatures) {
                byte[] a11 = C5822a.a(a10);
                if (a11 == null) {
                    return null;
                }
                arrayList.add(a11);
            }
            return arrayList;
        }
    }

    /* renamed from: s.a$c */
    interface c {
        List<byte[]> a(String str, PackageManager packageManager);
    }

    static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("PackageIdentity", "Could not get fingerprint for package.", e10);
            return null;
        }
    }

    private static c c() {
        return Build.VERSION.SDK_INT >= 28 ? new C0455a() : new b();
    }
}
