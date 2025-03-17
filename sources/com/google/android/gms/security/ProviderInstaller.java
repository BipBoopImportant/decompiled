package com.google.android.gms.security;

import G9.C6522c;
import K9.C6620s;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import ca.g;
import ca.h;
import ca.j;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

public class ProviderInstaller {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final b f50550a = b.f();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f50551b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Method f50552c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f50553d = false;

    public interface a {
        void d0();

        void m0(int i10, Intent intent);
    }

    public static void a(Context context) {
        Context context2;
        C6620s.m(context, "Context must not be null");
        f50550a.k(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f50551b) {
            Context context3 = null;
            if (!f50553d) {
                try {
                    context2 = DynamiteModule.e(context, DynamiteModule.f48097f, "com.google.android.gms.providerinstaller.dynamite").b();
                } catch (DynamiteModule.a e10) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    d(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z10 = f50553d;
            Context d10 = d.d(context);
            if (d10 != null) {
                f50553d = true;
                if (!z10) {
                    try {
                        j.b("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", d10.getClassLoader(), h.a(Context.class, context), g.d(uptimeMillis), g.d(SystemClock.uptimeMillis()));
                    } catch (Exception e11) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e11.toString()));
                    }
                }
                context3 = d10;
            }
            if (context3 != null) {
                d(context3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C6522c(8);
            }
        }
    }

    public static void b(Context context, a aVar) {
        C6620s.m(context, "Context must not be null");
        C6620s.m(aVar, "Listener must not be null");
        C6620s.e("Must be called on the UI thread");
        new a(context, aVar).execute(new Void[0]);
    }

    private static void d(Context context, Context context2, String str) {
        try {
            if (f50552c == null) {
                f50552c = context.getClassLoader().loadClass(str).getMethod("insertProvider", new Class[]{Context.class});
            }
            f50552c.invoke((Object) null, new Object[]{context});
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new C6522c(8);
        }
    }
}
