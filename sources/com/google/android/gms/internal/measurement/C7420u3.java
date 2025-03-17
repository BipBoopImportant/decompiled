package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import u2.e;

/* renamed from: com.google.android.gms.internal.measurement.u3  reason: case insensitive filesystem */
final class C7420u3 implements C7381p3 {

    /* renamed from: c  reason: collision with root package name */
    private static C7420u3 f49086c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f49087a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f49088b;

    private C7420u3() {
        this.f49087a = null;
        this.f49088b = null;
    }

    static C7420u3 a(Context context) {
        C7420u3 u3Var;
        synchronized (C7420u3.class) {
            try {
                if (f49086c == null) {
                    f49086c = e.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C7420u3(context) : new C7420u3();
                }
                u3Var = f49086c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u3Var;
    }

    static synchronized void c() {
        Context context;
        synchronized (C7420u3.class) {
            try {
                C7420u3 u3Var = f49086c;
                if (!(u3Var == null || (context = u3Var.f49087a) == null || u3Var.f49088b == null)) {
                    context.getContentResolver().unregisterContentObserver(f49086c.f49088b);
                }
                f49086c = null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String zza(String str) {
        Context context = this.f49087a;
        if (context != null && !C7338k3.b(context)) {
            try {
                return (String) C7404s3.a(new C7412t3(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    private C7420u3(Context context) {
        this.f49087a = context;
        C7436w3 w3Var = new C7436w3(this, (Handler) null);
        this.f49088b = w3Var;
        context.getContentResolver().registerContentObserver(Z2.f48837a, true, w3Var);
    }
}
