package S9;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f39928a;

    public b(Context context) {
        this.f39928a = context;
    }

    public int a(String str) {
        return this.f39928a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f39928a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f39928a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        Context context = this.f39928a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i10) {
        return this.f39928a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f39928a);
        }
        if (!l.e() || (nameForUid = this.f39928a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f39928a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean g(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f39928a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i10, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
