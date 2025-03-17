package Qb;

import Fb.f;
import Nb.g;
import Rb.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import xa.C8971l;
import xa.C8972m;

public class F {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f62912a;

    /* renamed from: b  reason: collision with root package name */
    private final f f62913b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f62914c;

    /* renamed from: d  reason: collision with root package name */
    C8972m<Void> f62915d = new C8972m<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f62916e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f62917f = false;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f62918g;

    /* renamed from: h  reason: collision with root package name */
    private final C8972m<Void> f62919h = new C8972m<>();

    public F(f fVar) {
        Object obj = new Object();
        this.f62914c = obj;
        Context k10 = fVar.k();
        this.f62913b = fVar;
        this.f62912a = C9251i.q(k10);
        Boolean b10 = b();
        this.f62918g = b10 == null ? a(k10) : b10;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f62915d.e(null);
                    this.f62916e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g10 = g(context);
        if (g10 == null) {
            this.f62917f = false;
            return null;
        }
        this.f62917f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g10));
    }

    private Boolean b() {
        if (!this.f62912a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f62917f = false;
        return Boolean.valueOf(this.f62912a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f62913b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        g.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z10 ? "ENABLED" : "DISABLED", this.f62918g == null ? "global Firebase setting" : this.f62917f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z10) {
        if (z10) {
            this.f62919h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.f62918g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f62917f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f62918g = bool != null ? bool : a(this.f62913b.k());
        i(this.f62912a, bool);
        synchronized (this.f62914c) {
            if (d()) {
                if (!this.f62916e) {
                    this.f62915d.e(null);
                    this.f62916e = true;
                }
            } else if (this.f62916e) {
                this.f62915d = new C8972m<>();
                this.f62916e = false;
            }
        }
    }

    public C8971l<Void> j() {
        C8971l<Void> a10;
        synchronized (this.f62914c) {
            a10 = this.f62915d.a();
        }
        return a10;
    }

    public C8971l<Void> k() {
        return b.c(this.f62919h.a(), j());
    }
}
