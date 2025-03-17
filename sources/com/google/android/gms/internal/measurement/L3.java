package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import j0.C5445a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class L3 implements C7381p3 {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, L3> f48726g = new C5445a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f48727a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f48728b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f48729c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f48730d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, ?> f48731e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C7365n3> f48732f = new ArrayList();

    private L3(SharedPreferences sharedPreferences, Runnable runnable) {
        O3 o32 = new O3(this);
        this.f48729c = o32;
        this.f48727a = sharedPreferences;
        this.f48728b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(o32);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (C7338k3.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences a10 = A0.a(context, str.substring(12), 0, C7433w0.f49109a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a10;
            }
            SharedPreferences a11 = A0.a(context, str, 0, C7433w0.f49109a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a11;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static L3 b(Context context, String str, Runnable runnable) {
        L3 l32;
        if (!((!C7338k3.a() || str.startsWith("direct_boot:")) ? true : C7338k3.c(context))) {
            return null;
        }
        synchronized (L3.class) {
            try {
                Map<String, L3> map = f48726g;
                l32 = map.get(str);
                if (l32 == null) {
                    l32 = new L3(a(context, str), runnable);
                    map.put(str, l32);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l32;
    }

    static synchronized void c() {
        synchronized (L3.class) {
            try {
                for (L3 next : f48726g.values()) {
                    next.f48727a.unregisterOnSharedPreferenceChangeListener(next.f48729c);
                }
                f48726g.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void d(L3 l32, SharedPreferences sharedPreferences, String str) {
        synchronized (l32.f48730d) {
            l32.f48731e = null;
            l32.f48728b.run();
        }
        synchronized (l32) {
            try {
                for (C7365n3 zza : l32.f48732f) {
                    zza.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object zza(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        Map<String, ?> map = this.f48731e;
        if (map == null) {
            synchronized (this.f48730d) {
                try {
                    map = this.f48731e;
                    if (map == null) {
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.f48727a.getAll();
                        this.f48731e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
