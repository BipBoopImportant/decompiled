package sc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import jc.C9896c;
import u2.C6012a;

/* renamed from: sc.a  reason: case insensitive filesystem */
public class C10231a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f76493a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f76494b;

    /* renamed from: c  reason: collision with root package name */
    private final C9896c f76495c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76496d = c();

    public C10231a(Context context, String str, C9896c cVar) {
        Context a10 = a(context);
        this.f76493a = a10;
        this.f76494b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f76495c = cVar;
    }

    private static Context a(Context context) {
        return C6012a.b(context);
    }

    private boolean c() {
        return this.f76494b.contains("firebase_data_collection_default_enabled") ? this.f76494b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f76493a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f76493a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f76496d;
    }
}
