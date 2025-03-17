package com.google.firebase.remoteconfig.internal;

import K4.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xa.C8964e;
import xa.C8966g;
import xa.C8967h;
import xa.C8971l;
import xa.C8974o;

public class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, f> f68736d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f68737e = new m();

    /* renamed from: a  reason: collision with root package name */
    private final Executor f68738a;

    /* renamed from: b  reason: collision with root package name */
    private final u f68739b;

    /* renamed from: c  reason: collision with root package name */
    private C8971l<g> f68740c = null;

    private static class b<TResult> implements C8967h<TResult>, C8966g, C8964e {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f68741a;

        private b() {
            this.f68741a = new CountDownLatch(1);
        }

        public void a(TResult tresult) {
            this.f68741a.countDown();
        }

        public boolean b(long j10, TimeUnit timeUnit) {
            return this.f68741a.await(j10, timeUnit);
        }

        public void c(Exception exc) {
            this.f68741a.countDown();
        }

        public void onCanceled() {
            this.f68741a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f68738a = executor;
        this.f68739b = uVar;
    }

    private static <TResult> TResult c(C8971l<TResult> lVar, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f68737e;
        lVar.f(executor, bVar);
        lVar.d(executor, bVar);
        lVar.a(executor, bVar);
        if (!bVar.b(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (lVar.q()) {
            return lVar.m();
        } else {
            throw new ExecutionException(lVar.l());
        }
    }

    public static synchronized f h(Executor executor, u uVar) {
        f fVar;
        synchronized (f.class) {
            try {
                String b10 = uVar.b();
                Map<String, f> map = f68736d;
                if (!map.containsKey(b10)) {
                    map.put(b10, new f(executor, uVar));
                }
                fVar = map.get(b10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void i(g gVar) {
        return this.f68739b.e(gVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l j(boolean z10, g gVar, Void voidR) {
        if (z10) {
            m(gVar);
        }
        return C8974o.f(gVar);
    }

    private synchronized void m(g gVar) {
        this.f68740c = C8974o.f(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f68740c = C8974o.f(null);
        }
        this.f68739b.a();
    }

    public synchronized C8971l<g> e() {
        try {
            C8971l<g> lVar = this.f68740c;
            if (lVar != null) {
                if (lVar.p() && !this.f68740c.q()) {
                }
            }
            Executor executor = this.f68738a;
            u uVar = this.f68739b;
            Objects.requireNonNull(uVar);
            this.f68740c = C8974o.c(executor, new c(uVar));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f68740c;
    }

    public g f() {
        return g(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.g) c(e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.g g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            xa.l<com.google.firebase.remoteconfig.internal.g> r0 = r2.f68740c     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.q()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            xa.l<com.google.firebase.remoteconfig.internal.g> r3 = r2.f68740c     // Catch:{ all -> 0x0015 }
            java.lang.Object r3 = r3.m()     // Catch:{ all -> 0x0015 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.g) r3     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            r3 = move-exception
            goto L_0x0033
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            xa.l r0 = r2.e()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.g) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.f.g(long):com.google.firebase.remoteconfig.internal.g");
    }

    public C8971l<g> k(g gVar) {
        return l(gVar, true);
    }

    public C8971l<g> l(g gVar, boolean z10) {
        return C8974o.c(this.f68738a, new d(this, gVar)).r(this.f68738a, new e(this, z10, gVar));
    }
}
