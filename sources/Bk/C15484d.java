package BK;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Iterator;

/* renamed from: BK.d  reason: case insensitive filesystem */
public final class C15484d {

    /* renamed from: a  reason: collision with root package name */
    static final Intent f133418a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null));

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[Catch:{ NameNotFoundException -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[Catch:{ NameNotFoundException -> 0x0023 }] */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<BK.C15482b> a(android.content.Context r9) {
        /*
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Intent r1 = f133418a
            r2 = 0
            android.content.pm.ResolveInfo r3 = r9.resolveActivity(r1, r2)
            if (r3 == 0) goto L_0x0017
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = 131136(0x20040, float:1.8376E-40)
            java.util.List r1 = r9.queryIntentActivities(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            boolean r5 = c(r4)
            if (r5 != 0) goto L_0x0036
            goto L_0x0023
        L_0x0036:
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch:{ NameNotFoundException -> 0x0023 }
            java.lang.String r5 = r5.packageName     // Catch:{ NameNotFoundException -> 0x0023 }
            r6 = 64
            android.content.pm.PackageInfo r5 = r9.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r6 = r4.activityInfo     // Catch:{ NameNotFoundException -> 0x0023 }
            java.lang.String r6 = r6.packageName     // Catch:{ NameNotFoundException -> 0x0023 }
            boolean r6 = b(r9, r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r6 == 0) goto L_0x0061
            BK.b r6 = new BK.b     // Catch:{ NameNotFoundException -> 0x0023 }
            r7 = 1
            r6.<init>(r5, r7)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r8 = r4.activityInfo     // Catch:{ NameNotFoundException -> 0x0023 }
            java.lang.String r8 = r8.packageName     // Catch:{ NameNotFoundException -> 0x0023 }
            boolean r8 = r8.equals(r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r8 == 0) goto L_0x005e
            r0.add(r2, r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            goto L_0x0062
        L_0x005e:
            r0.add(r6)     // Catch:{ NameNotFoundException -> 0x0023 }
        L_0x0061:
            r7 = r2
        L_0x0062:
            BK.b r6 = new BK.b     // Catch:{ NameNotFoundException -> 0x0023 }
            r6.<init>(r5, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch:{ NameNotFoundException -> 0x0023 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0023 }
            boolean r4 = r4.equals(r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r4 == 0) goto L_0x0075
            r0.add(r7, r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            goto L_0x0023
        L_0x0075:
            r0.add(r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            goto L_0x0023
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: BK.C15484d.a(android.content.Context):java.util.List");
    }

    private static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    private static boolean c(ResolveInfo resolveInfo) {
        IntentFilter intentFilter = resolveInfo.filter;
        if (intentFilter == null || !intentFilter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> schemesIterator = resolveInfo.filter.schemesIterator();
        boolean z10 = false;
        boolean z11 = false;
        while (schemesIterator.hasNext()) {
            String next = schemesIterator.next();
            z10 |= "http".equals(next);
            z11 |= Constants.SCHEME.equals(next);
            if (z10 && z11) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static C15482b d(Context context, C15483c cVar) {
        C15482b bVar = null;
        for (C15482b next : a(context)) {
            if (cVar.a(next)) {
                if (next.f133417d.booleanValue()) {
                    return next;
                }
                if (bVar == null) {
                    bVar = next;
                }
            }
        }
        return bVar;
    }
}
