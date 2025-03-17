package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class X {

    /* renamed from: e  reason: collision with root package name */
    private static X f68357e;

    /* renamed from: a  reason: collision with root package name */
    private String f68358a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f68359b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f68360c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f68361d = new ArrayDeque();

    private X() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentName;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                componentName = i0.h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return 402;
        }
    }

    static synchronized X b() {
        X x10;
        synchronized (X.class) {
            try {
                if (f68357e == null) {
                    f68357e = new X();
                }
                x10 = f68357e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return x10;
    }

    private synchronized String f(Context context, Intent intent) {
        try {
            String str = this.f68358a;
            if (str != null) {
                return str;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (serviceInfo != null) {
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        String str2 = serviceInfo.name;
                        if (str2 != null) {
                            if (str2.startsWith(".")) {
                                this.f68358a = context.getPackageName() + serviceInfo.name;
                            } else {
                                this.f68358a = serviceInfo.name;
                            }
                            return this.f68358a;
                        }
                    }
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    return null;
                }
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        return this.f68361d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f68360c == null) {
            this.f68360c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f68359b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f68360c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f68359b == null) {
            this.f68359b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f68359b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f68359b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f68361d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
