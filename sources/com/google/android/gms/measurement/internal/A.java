package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Handler;
import com.google.android.gms.internal.measurement.O0;

abstract class A {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f49516d;

    /* renamed from: a  reason: collision with root package name */
    private final C7657o3 f49517a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f49518b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f49519c;

    A(C7657o3 o3Var) {
        C6620s.l(o3Var);
        this.f49517a = o3Var;
        this.f49518b = new C7729z(this, o3Var);
    }

    private final Handler f() {
        Handler handler;
        if (f49516d != null) {
            return f49516d;
        }
        synchronized (A.class) {
            try {
                if (f49516d == null) {
                    f49516d = new O0(this.f49517a.zza().getMainLooper());
                }
                handler = f49516d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f49519c = 0;
        f().removeCallbacks(this.f49518b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f49519c = this.f49517a.zzb().a();
            if (!f().postDelayed(this.f49518b, j10)) {
                this.f49517a.f().E().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f49519c != 0;
    }
}
