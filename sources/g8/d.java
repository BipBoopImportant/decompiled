package G8;

import D8.c;
import XH.C16822m;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011R\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010#\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0011\u0010%\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0017\u0010(\u001a\u00020\u000f8F¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b\t\u0010\u0011¨\u0006)"}, d2 = {"LG8/d;", "", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroid/content/pm/PackageInfo;", "k", "(Landroid/app/Application;)Landroid/content/pm/PackageInfo;", "a", "Landroid/app/Application;", "LD8/c;", "b", "LD8/c;", "logger", "", "i", "()Ljava/lang/String;", "sdkVersion", "", "h", "()I", "sdkBuild", "c", "applicationName", "d", "applicationVersion", "", "e", "()J", "applicationVersionCode", "applicationId", "g", "minSdkVersion", "j", "targetSdkVersion", "f", "compileSdkVersion", "getAppKotlinVersion$annotations", "()V", "appKotlinVersion", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Application f36263a;

    /* renamed from: b  reason: collision with root package name */
    private final c f36264b = new c("BuildInformation");

    public d(Application application) {
        C17542s.j(application, "application");
        this.f36263a = application;
    }

    private final PackageInfo k(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f36264b.i(e10, "Failed to getPackageInfo from the application");
            return null;
        }
    }

    public final String a() {
        try {
            return C16822m.f139803f.toString();
        } catch (Exception unused) {
            return "Kotlin not present";
        }
    }

    public final String b() {
        String packageName = this.f36263a.getPackageName();
        C17542s.i(packageName, "application.packageName");
        return packageName;
    }

    public final String c() {
        return this.f36263a.getApplicationInfo().loadLabel(this.f36263a.getPackageManager()).toString();
    }

    public final String d() {
        String str;
        PackageInfo k10 = k(this.f36263a);
        if (k10 == null || (str = k10.versionName) == null || str.length() == 0) {
            return "unknown";
        }
        C17542s.i(str, "versionName");
        return str;
    }

    public final long e() {
        PackageInfo k10 = k(this.f36263a);
        if (k10 == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return (long) k10.versionCode;
        }
        long unused = k10.getLongVersionCode();
        return k10.getLongVersionCode();
    }

    public final int f() {
        ApplicationInfo applicationInfo;
        PackageInfo k10 = k(this.f36263a);
        if (k10 == null || Build.VERSION.SDK_INT < 31 || (applicationInfo = k10.applicationInfo) == null) {
            return 0;
        }
        return applicationInfo.compileSdkVersion;
    }

    public final int g() {
        ApplicationInfo applicationInfo;
        PackageInfo k10 = k(this.f36263a);
        if (k10 == null || (applicationInfo = k10.applicationInfo) == null) {
            return 0;
        }
        return applicationInfo.minSdkVersion;
    }

    public final int h() {
        return 1043600;
    }

    public final String i() {
        return "4.36.0";
    }

    public final int j() {
        ApplicationInfo applicationInfo;
        PackageInfo k10 = k(this.f36263a);
        if (k10 == null || (applicationInfo = k10.applicationInfo) == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }
}
