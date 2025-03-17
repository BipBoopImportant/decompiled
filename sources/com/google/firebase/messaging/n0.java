package com.google.firebase.messaging;

import Q9.b;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xa.C8971l;
import xa.C8972m;

class n0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f68470a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f68471b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f68472c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f68473d;

    /* renamed from: e  reason: collision with root package name */
    private k0 f68474e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f68475f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f68476a;

        /* renamed from: b  reason: collision with root package name */
        private final C8972m<Void> f68477b = new C8972m<>();

        a(Intent intent) {
            this.f68476a = intent;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f68476a.getAction() + " finishing.");
            d();
        }

        /* access modifiers changed from: package-private */
        public void c(ScheduledExecutorService scheduledExecutorService) {
            e().b(scheduledExecutorService, new m0(scheduledExecutorService.schedule(new l0(this), 20, TimeUnit.SECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f68477b.e(null);
        }

        /* access modifiers changed from: package-private */
        public C8971l<Void> e() {
            return this.f68477b.a();
        }
    }

    n0(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f68473d.isEmpty()) {
            this.f68473d.poll().d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f68473d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                k0 k0Var = this.f68474e;
                if (k0Var == null || !k0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f68474e.c(this.f68473d.poll());
            }
        } finally {
            while (true) {
            }
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f68475f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f68475f) {
            this.f68475f = true;
            try {
                if (!b.b().a(this.f68470a, this.f68471b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f68475f = false;
                    b();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized C8971l<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f68472c);
            this.f68473d.add(aVar);
            c();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return aVar.e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f68475f = false;
            if (!(iBinder instanceof k0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                b();
                return;
            }
            this.f68474e = (k0) iBinder;
            c();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    n0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f68473d = new ArrayDeque();
        this.f68475f = false;
        Context applicationContext = context.getApplicationContext();
        this.f68470a = applicationContext;
        this.f68471b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f68472c = scheduledExecutorService;
    }
}
