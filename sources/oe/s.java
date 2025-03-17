package OE;

import HJ.C15854t;
import YH.C16870n;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/content/Context;", "", "Landroid/content/pm/Signature;", "e", "(Landroid/content/Context;)[Landroid/content/pm/Signature;", "", "g", "([Landroid/content/pm/Signature;)Ljava/lang/String;", "f", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r3 = r3.getApkContentsSigners();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.pm.Signature[] e(android.content.Context r3) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x003a }
            r2 = 28
            if (r1 < r2) goto L_0x0025
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ Exception -> 0x003a }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x003a }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch:{ Exception -> 0x003a }
            android.content.pm.SigningInfo r3 = r3.signingInfo     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0022
            android.content.pm.Signature[] r3 = r3.getApkContentsSigners()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0022
            goto L_0x003c
        L_0x0022:
            android.content.pm.Signature[] r3 = new android.content.pm.Signature[r0]     // Catch:{ Exception -> 0x003a }
            goto L_0x003c
        L_0x0025:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ Exception -> 0x003a }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x003a }
            r2 = 64
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch:{ Exception -> 0x003a }
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ Exception -> 0x003a }
            if (r3 != 0) goto L_0x003c
            android.content.pm.Signature[] r3 = new android.content.pm.Signature[r0]     // Catch:{ Exception -> 0x003a }
            goto L_0x003c
        L_0x003a:
            android.content.pm.Signature[] r3 = new android.content.pm.Signature[r0]
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: OE.s.e(android.content.Context):android.content.pm.Signature[]");
    }

    /* access modifiers changed from: private */
    public static final String f(Signature[] signatureArr) {
        String str = "";
        for (Signature byteArray : signatureArr) {
            MessageDigest instance = MessageDigest.getInstance("SHA");
            instance.update(byteArray.toByteArray());
            String encodeToString = Base64.encodeToString(instance.digest(), 0);
            C17542s.i(encodeToString, "encodeToString(...)");
            String obj = C15854t.z1(encodeToString).toString();
            if (str.length() == 0) {
                str = obj;
            } else {
                str = str + ":" + obj;
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static final String g(Signature[] signatureArr) {
        String str = "";
        for (Signature byteArray : signatureArr) {
            MessageDigest instance = MessageDigest.getInstance("SHA256");
            instance.update(byteArray.toByteArray());
            byte[] digest = instance.digest();
            C17542s.i(digest, "digest(...)");
            String B02 = C16870n.B0(digest, ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new r(), 30, (Object) null);
            if (str.length() == 0) {
                str = B02;
            } else {
                str = str + "," + B02;
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static final CharSequence h(byte b10) {
        V v10 = V.f144353a;
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        C17542s.i(format, "format(...)");
        return format;
    }
}
