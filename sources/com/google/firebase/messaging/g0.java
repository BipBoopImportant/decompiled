package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class g0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f68437f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f68438g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f68439h;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f68440a;

    /* renamed from: b  reason: collision with root package name */
    private final I f68441b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f68442c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f0 f68443d;

    /* renamed from: e  reason: collision with root package name */
    private final long f68444e;

    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private g0 f68445a;

        public a(g0 g0Var) {
            this.f68445a = g0Var;
        }

        public void a() {
            if (g0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            g0.this.f68440a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            try {
                g0 g0Var = this.f68445a;
                if (g0Var != null) {
                    if (g0Var.i()) {
                        if (g0.j()) {
                            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                        }
                        this.f68445a.f68443d.l(this.f68445a, 0);
                        context.unregisterReceiver(this);
                        this.f68445a = null;
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    g0(f0 f0Var, Context context, I i10, long j10) {
        this.f68443d = f0Var;
        this.f68440a = context;
        this.f68444e = j10;
        this.f68441b = i10;
        this.f68442c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f68437f) {
            try {
                Boolean bool = f68439h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f68439h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f68437f) {
            try {
                Boolean bool = f68438g;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f68438g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f68440a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f68440a)) {
            this.f68442c.acquire(C9546d.f68410a);
        }
        try {
            this.f68443d.m(true);
            if (!this.f68441b.g()) {
                this.f68443d.m(false);
                if (h(this.f68440a)) {
                    try {
                        this.f68442c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f68440a) || i()) {
                if (this.f68443d.p()) {
                    this.f68443d.m(false);
                } else {
                    this.f68443d.q(this.f68444e);
                }
                if (h(this.f68440a)) {
                    try {
                        wakeLock = this.f68442c;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f68440a)) {
                    try {
                        this.f68442c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            this.f68443d.m(false);
            if (h(this.f68440a)) {
                wakeLock = this.f68442c;
            }
        } catch (Throwable th2) {
            if (h(this.f68440a)) {
                try {
                    this.f68442c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
