package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import com.google.android.gms.common.util.e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class J2 extends C7664p3 {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f49676l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public L2 f49677c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public L2 f49678d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue<N2<?>> f49679e = new PriorityBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<N2<?>> f49680f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f49681g = new K2(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f49682h = new K2(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f49683i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f49684j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f49685k;

    J2(P2 p22) {
        super(p22);
    }

    private final void w(N2<?> n22) {
        synchronized (this.f49683i) {
            try {
                this.f49679e.add(n22);
                L2 l22 = this.f49677c;
                if (l22 == null) {
                    L2 l23 = new L2(this, "Measurement Worker", this.f49679e);
                    this.f49677c = l23;
                    l23.setUncaughtExceptionHandler(this.f49681g);
                    this.f49677c.start();
                } else {
                    l22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(Runnable runnable) {
        m();
        C6620s.l(runnable);
        w(new N2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        m();
        C6620s.l(runnable);
        w(new N2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean H() {
        return Thread.currentThread() == this.f49678d;
    }

    public final boolean I() {
        return Thread.currentThread() == this.f49677c;
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final void i() {
        if (Thread.currentThread() != this.f49678d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final void k() {
        if (Thread.currentThread() != this.f49677c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = f().J();
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = f().J();
        r3.a("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T t(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.J2 r0 = r1.q()     // Catch:{ all -> 0x002c }
            r0.B(r6)     // Catch:{ all -> 0x002c }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.h2 r3 = r1.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.J()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.a(r4)
        L_0x002b:
            return r2
        L_0x002c:
            r3 = move-exception
            goto L_0x004a
        L_0x002e:
            com.google.android.gms.measurement.internal.h2 r3 = r1.f()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.i2 r3 = r3.J()     // Catch:{ all -> 0x002c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x002c }
            r4.append(r5)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x002c }
            r3.a(r4)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            r2 = 0
            return r2
        L_0x004a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.J2.t(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> u(Callable<V> callable) {
        m();
        C6620s.l(callable);
        N2 n22 = new N2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f49677c) {
            if (!this.f49679e.isEmpty()) {
                f().J().a("Callable skipped the worker queue.");
            }
            n22.run();
        } else {
            w(n22);
        }
        return n22;
    }

    public final void x(Runnable runnable) {
        m();
        C6620s.l(runnable);
        N2 n22 = new N2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f49683i) {
            try {
                this.f49680f.add(n22);
                L2 l22 = this.f49678d;
                if (l22 == null) {
                    L2 l23 = new L2(this, "Measurement Network", this.f49680f);
                    this.f49678d = l23;
                    l23.setUncaughtExceptionHandler(this.f49682h);
                    this.f49678d.start();
                } else {
                    l22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <V> Future<V> z(Callable<V> callable) {
        m();
        C6620s.l(callable);
        N2 n22 = new N2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f49677c) {
            n22.run();
        } else {
            w(n22);
        }
        return n22;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
