package G9;

import K9.C6620s;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.d;

public class e {

    /* renamed from: c  reason: collision with root package name */
    private static e f36316c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f36317a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f36318b;

    public e(Context context) {
        this.f36317a = context.getApplicationContext();
    }

    public static e a(Context context) {
        C6620s.l(context);
        synchronized (e.class) {
            try {
                if (f36316c == null) {
                    s.d(context);
                    f36316c = new e(context);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f36316c;
    }

    static final o d(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < oVarArr.length; i10++) {
                if (oVarArr[i10].equals(pVar)) {
                    return oVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            G9.o[] r4 = G9.r.f36328a
            G9.o r4 = d(r2, r4)
            goto L_0x0045
        L_0x0039:
            G9.o[] r4 = G9.r.f36328a
            r4 = r4[r1]
            G9.o[] r4 = new G9.o[]{r4}
            G9.o r4 = d(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final G9.B f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            G9.B r6 = G9.B.c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f36318b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = G9.s.e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f36317a
            boolean r7 = com.google.android.gms.common.d.f(r7)
            G9.B r7 = G9.s.b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f36317a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f36317a
            boolean r1 = com.google.android.gms.common.d.f(r1)
            if (r8 != 0) goto L_0x003c
            G9.B r7 = G9.B.c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            G9.p r7 = new G9.p
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            G9.B r1 = G9.s.a(r3, r7, r1, r0)
            boolean r4 = r1.f36305a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            G9.B r7 = G9.s.a(r3, r7, r0, r2)
            boolean r7 = r7.f36305a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            G9.B r7 = G9.B.c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            G9.B r7 = G9.B.c(r7)
        L_0x007d:
            boolean r8 = r7.f36305a
            if (r8 == 0) goto L_0x0083
            r5.f36318b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            G9.B r6 = G9.B.d(r6, r7)
            return r6
        L_0x0090:
            G9.B r6 = G9.B.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.f(java.lang.String, boolean, boolean):G9.B");
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (d.f(this.f36317a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        B b10;
        int length;
        String[] packagesForUid = this.f36317a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C6620s.l(b10);
                    break;
                }
                b10 = f(packagesForUid[i11], false, false);
                if (b10.f36305a) {
                    break;
                }
                i11++;
            }
        } else {
            b10 = B.c("no pkgs");
        }
        b10.e();
        return b10.f36305a;
    }
}
