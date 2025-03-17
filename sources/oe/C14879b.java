package oE;

import android.content.Context;
import android.content.pm.PackageManager;
import pE.C14918c;

/* renamed from: oE.b  reason: case insensitive filesystem */
class C14879b {

    /* renamed from: a  reason: collision with root package name */
    public static String f130022a = "MixpanelAPI.ConfigurationChecker";

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager == null || packageName == null) {
            C14918c.k(f130022a, "Can't check configuration when using a Context with null packageManager or packageName");
            return false;
        } else if (packageManager.checkPermission("android.permission.INTERNET", packageName) == 0) {
            return true;
        } else {
            C14918c.k(f130022a, "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
            C14918c.e(f130022a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
    }
}
