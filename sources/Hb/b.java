package hb;

import android.content.pm.PackageManager;

public class b {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("org.chromium.arc");
    }
}
