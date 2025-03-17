package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class d0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<d0> f68411d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f68412a;

    /* renamed from: b  reason: collision with root package name */
    private Z f68413b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f68414c;

    private d0(SharedPreferences sharedPreferences, Executor executor) {
        this.f68414c = executor;
        this.f68412a = sharedPreferences;
    }

    public static synchronized d0 a(Context context, Executor executor) {
        d0 d0Var;
        synchronized (d0.class) {
            try {
                WeakReference<d0> weakReference = f68411d;
                d0Var = weakReference != null ? weakReference.get() : null;
                if (d0Var == null) {
                    d0Var = new d0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    d0Var.c();
                    f68411d = new WeakReference<>(d0Var);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return d0Var;
    }

    private synchronized void c() {
        this.f68413b = Z.c(this.f68412a, "topic_operation_queue", ",", this.f68414c);
    }

    /* access modifiers changed from: package-private */
    public synchronized c0 b() {
        return c0.a(this.f68413b.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean d(c0 c0Var) {
        return this.f68413b.f(c0Var.e());
    }
}
