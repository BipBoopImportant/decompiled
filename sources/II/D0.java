package ii;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/pm/PackageManager;", "", "packageName", "", "c", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z", "", "flags", "Landroid/content/pm/PackageInfo;", "b", "(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D0 {
    private static final PackageInfo b(PackageManager packageManager, String str, int i10) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo a10 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) i10));
            C17542s.g(a10);
            return a10;
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(str, i10);
        C17542s.g(packageInfo);
        return packageInfo;
    }

    /* access modifiers changed from: private */
    public static final boolean c(PackageManager packageManager, String str) {
        try {
            b(packageManager, str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
