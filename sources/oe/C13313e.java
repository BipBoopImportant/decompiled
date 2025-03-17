package OE;

import HJ.C15854t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.adjust.sdk.AdjustConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0010\u0010\"R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b \u0010\rR\u001a\u0010&\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b%\u0010\rR \u0010,\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u000b\u0012\u0004\b*\u0010+\u001a\u0004\b\b\u0010\rR\"\u0010-\u001a\n \u000f*\u0004\u0018\u00010\u00040\u00048\u0006XD¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b)\u0010\rR\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\r¨\u00060"}, d2 = {"LOE/e;", "", "Landroid/content/Context;", "appContext", "", "decorateEngineVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "kotlin.jvm.PlatformType", "c", "Landroid/content/pm/PackageInfo;", "packageInfo", "", "d", "Z", "m", "()Z", "isDebuggable", "e", "applicationName", "f", "appPackageName", "g", "appPackageVersionName", "", "h", "I", "()I", "appPackageVersionCode", "buildNumberPretty", "j", "baseLibVersion", "k", "deviceModel", "l", "getAppEnvironment$annotations", "()V", "appEnvironment", "releaseVersion", "arCoreVersion", "libraryVersions", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OE.e  reason: case insensitive filesystem */
public final class C13313e {

    /* renamed from: n  reason: collision with root package name */
    public static final int f112802n = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f112803a;

    /* renamed from: b  reason: collision with root package name */
    private final String f112804b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageInfo f112805c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f112806d;

    /* renamed from: e  reason: collision with root package name */
    private final String f112807e;

    /* renamed from: f  reason: collision with root package name */
    private final String f112808f;

    /* renamed from: g  reason: collision with root package name */
    private final String f112809g;

    /* renamed from: h  reason: collision with root package name */
    private final int f112810h;

    /* renamed from: i  reason: collision with root package name */
    private final String f112811i;

    /* renamed from: j  reason: collision with root package name */
    private final String f112812j;

    /* renamed from: k  reason: collision with root package name */
    private final String f112813k;

    /* renamed from: l  reason: collision with root package name */
    private final String f112814l;

    /* renamed from: m  reason: collision with root package name */
    private final String f112815m;

    public C13313e(Context context, String str) {
        int i10;
        String str2;
        String str3;
        C17542s.j(context, "appContext");
        C17542s.j(str, "decorateEngineVersion");
        this.f112803a = context;
        this.f112804b = str;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        this.f112805c = packageInfo;
        this.f112806d = (context.getApplicationInfo().flags & 2) != 0;
        this.f112807e = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        String str4 = context.getApplicationInfo().packageName;
        C17542s.i(str4, "packageName");
        this.f112808f = str4;
        this.f112809g = (packageInfo == null || (str3 = packageInfo.versionName) == null) ? "1.0" : str3;
        try {
            i10 = context.getPackageManager().getPackageInfo(str4, 0).versionCode;
        } catch (Exception unused) {
            i10 = Integer.MAX_VALUE;
        }
        this.f112810h = i10;
        if (C15854t.c0(this.f112809g, '-', false, 2, (Object) null)) {
            str2 = this.f112805c.versionName;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            PackageInfo packageInfo2 = this.f112805c;
            str2 = packageInfo2.versionName + " (" + packageInfo2.versionCode + ")";
        }
        this.f112811i = str2;
        this.f112812j = "com.sugarcube.app.base:2.11.2";
        this.f112813k = "Android_" + Build.MANUFACTURER + "_" + Build.MODEL;
        this.f112814l = this.f112806d ? "development" : AdjustConfig.ENVIRONMENT_PRODUCTION;
        this.f112815m = Build.VERSION.RELEASE;
    }

    public final String a() {
        return this.f112814l;
    }

    public final String b() {
        return this.f112808f;
    }

    public final int c() {
        return this.f112810h;
    }

    public final String d() {
        return this.f112809g;
    }

    public final String e() {
        return this.f112807e;
    }

    public final String f() {
        String string = this.f112803a.getString(n.f113323a);
        C17542s.i(string, "getString(...)");
        try {
            PackageInfo packageInfo = this.f112803a.getPackageManager().getPackageInfo(string, 0);
            String str = packageInfo.packageName;
            String str2 = packageInfo.versionName;
            return str + ":" + str2;
        } catch (Exception unused) {
            return string + ":-1";
        }
    }

    public final String g() {
        return this.f112812j;
    }

    public final String h() {
        return this.f112811i;
    }

    public final String i() {
        return this.f112804b;
    }

    public final String j() {
        return this.f112813k;
    }

    public final String k() {
        String str = this.f112812j;
        String str2 = this.f112804b;
        String f10 = f();
        return str + "," + str2 + "," + f10;
    }

    public final String l() {
        return this.f112815m;
    }

    public final boolean m() {
        return this.f112806d;
    }
}
