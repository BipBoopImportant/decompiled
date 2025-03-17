package v2;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: v2.a  reason: case insensitive filesystem */
public final class C6156a {

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    private static class C0483a {
        static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0483a.a(packageInfo) : (long) packageInfo.versionCode;
    }
}
