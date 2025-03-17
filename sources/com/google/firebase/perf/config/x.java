package com.google.firebase.perf.config;

import Ac.a;
import Fb.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.perf.util.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class x {

    /* renamed from: c  reason: collision with root package name */
    private static final a f68554c = a.e();

    /* renamed from: d  reason: collision with root package name */
    private static x f68555d;

    /* renamed from: a  reason: collision with root package name */
    private volatile SharedPreferences f68556a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f68557b;

    public x(ExecutorService executorService) {
        this.f68557b = executorService;
    }

    private Context e() {
        try {
            f.l();
            return f.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x f() {
        x xVar;
        synchronized (x.class) {
            try {
                if (f68555d == null) {
                    f68555d = new x(Executors.newSingleThreadExecutor());
                }
                xVar = f68555d;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return xVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Context context) {
        if (this.f68556a == null && context != null) {
            this.f68556a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public void b(String str) {
        if (str == null) {
            f68554c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f68556a.edit().remove(str).apply();
        }
    }

    public g<Boolean> c(String str) {
        if (str == null) {
            f68554c.a("Key is null when getting boolean value on device cache.");
            return g.a();
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return g.a();
            }
        }
        if (!this.f68556a.contains(str)) {
            return g.a();
        }
        try {
            return g.e(Boolean.valueOf(this.f68556a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f68554c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return g.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return com.google.firebase.perf.util.g.e(java.lang.Double.valueOf(java.lang.Float.valueOf(r3.f68556a.getFloat(r4, 0.0f)).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        f68554c.b("Key %s from sharedPreferences has type other than double: %s", r4, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        return com.google.firebase.perf.util.g.a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.perf.util.g<java.lang.Double> d(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x000e
            Ac.a r4 = f68554c
            java.lang.String r0 = "Key is null when getting double value on device cache."
            r4.a(r0)
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.a()
            return r4
        L_0x000e:
            android.content.SharedPreferences r0 = r3.f68556a
            if (r0 != 0) goto L_0x0022
            android.content.Context r0 = r3.e()
            r3.j(r0)
            android.content.SharedPreferences r0 = r3.f68556a
            if (r0 != 0) goto L_0x0022
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.a()
            return r4
        L_0x0022:
            android.content.SharedPreferences r0 = r3.f68556a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x002f
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.a()
            return r4
        L_0x002f:
            android.content.SharedPreferences r0 = r3.f68556a     // Catch:{ ClassCastException -> 0x0044 }
            r1 = 0
            long r0 = r0.getLong(r4, r1)     // Catch:{ ClassCastException -> 0x0044 }
            double r0 = java.lang.Double.longBitsToDouble(r0)     // Catch:{ ClassCastException -> 0x0044 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x0044 }
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.e(r0)     // Catch:{ ClassCastException -> 0x0044 }
            return r4
        L_0x0044:
            android.content.SharedPreferences r0 = r3.f68556a     // Catch:{ ClassCastException -> 0x005c }
            r1 = 0
            float r0 = r0.getFloat(r4, r1)     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            double r0 = r0.doubleValue()     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.e(r0)     // Catch:{ ClassCastException -> 0x005c }
            return r4
        L_0x005c:
            r0 = move-exception
            Ac.a r1 = f68554c
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "Key %s from sharedPreferences has type other than double: %s"
            r1.b(r0, r4)
            com.google.firebase.perf.util.g r4 = com.google.firebase.perf.util.g.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.x.d(java.lang.String):com.google.firebase.perf.util.g");
    }

    public g<Long> g(String str) {
        if (str == null) {
            f68554c.a("Key is null when getting long value on device cache.");
            return g.a();
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return g.a();
            }
        }
        if (!this.f68556a.contains(str)) {
            return g.a();
        }
        try {
            return g.e(Long.valueOf(this.f68556a.getLong(str, 0)));
        } catch (ClassCastException e10) {
            f68554c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<String> h(String str) {
        if (str == null) {
            f68554c.a("Key is null when getting String value on device cache.");
            return g.a();
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return g.a();
            }
        }
        if (!this.f68556a.contains(str)) {
            return g.a();
        }
        try {
            return g.e(this.f68556a.getString(str, ""));
        } catch (ClassCastException e10) {
            f68554c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public synchronized void j(Context context) {
        if (this.f68556a == null && context != null) {
            this.f68557b.execute(new w(this, context));
        }
    }

    public boolean k(String str, double d10) {
        if (str == null) {
            f68554c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return false;
            }
        }
        this.f68556a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean l(String str, long j10) {
        if (str == null) {
            f68554c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return false;
            }
        }
        this.f68556a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean m(String str, String str2) {
        if (str == null) {
            f68554c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f68556a.edit().remove(str).apply();
            return true;
        }
        this.f68556a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean n(String str, boolean z10) {
        if (str == null) {
            f68554c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f68556a == null) {
            j(e());
            if (this.f68556a == null) {
                return false;
            }
        }
        this.f68556a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
