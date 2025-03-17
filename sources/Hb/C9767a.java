package hb;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: hb.a  reason: case insensitive filesystem */
public class C9767a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f73504a = Arrays.asList(new String[]{"com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome"});

    /* renamed from: b  reason: collision with root package name */
    static final List<String> f73505b = Arrays.asList(new String[]{"com.chrome.beta", "com.android.chrome"});

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f73506c = Arrays.asList(new String[]{"com.google.android.apps.chrome", "org.chromium.chrome"});

    private static boolean a(PackageManager packageManager, String str, int i10) {
        return f73506c.contains(str) || b(packageManager, str) >= i10;
    }

    static int b(PackageManager packageManager, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? (int) packageManager.getPackageInfo(str, 0).getLongVersionCode() : packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean c(PackageManager packageManager, String str) {
        if (!f73504a.contains(str)) {
            return true;
        }
        return a(packageManager, str, 368300000);
    }

    public static boolean d(PackageManager packageManager, String str) {
        if (!f73504a.contains(str)) {
            return false;
        }
        return a(packageManager, str, 362600000);
    }
}
