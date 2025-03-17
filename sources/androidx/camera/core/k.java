package androidx.camera.core;

import I.c;
import androidx.camera.core.impl.C5048t0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class k extends i {

    /* renamed from: t  reason: collision with root package name */
    final Executor f17041t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f17042u = new Object();

    /* renamed from: v  reason: collision with root package name */
    n f17043v;

    /* renamed from: w  reason: collision with root package name */
    private b f17044w;

    class a implements c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17045a;

        a(b bVar) {
            this.f17045a = bVar;
        }

        public void b(Throwable th2) {
            this.f17045a.close();
        }

        /* renamed from: c */
        public void a(Void voidR) {
        }
    }

    static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        final WeakReference<k> f17047d;

        b(n nVar, k kVar) {
            super(nVar);
            this.f17047d = new WeakReference<>(kVar);
            c(new l(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(n nVar) {
            k kVar = this.f17047d.get();
            if (kVar != null) {
                kVar.f17041t.execute(new m(kVar));
            }
        }
    }

    k(Executor executor) {
        this.f17041t = executor;
    }

    /* access modifiers changed from: package-private */
    public n d(C5048t0 t0Var) {
        return t0Var.b();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        synchronized (this.f17042u) {
            try {
                n nVar = this.f17043v;
                if (nVar != null) {
                    nVar.close();
                    this.f17043v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(androidx.camera.core.n r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f17042u
            monitor-enter(r0)
            boolean r1 = r5.f16712s     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            r6.close()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r6 = move-exception
            goto L_0x0050
        L_0x000e:
            androidx.camera.core.k$b r1 = r5.f17044w     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0037
            C.W r1 = r6.F2()     // Catch:{ all -> 0x000c }
            long r1 = r1.a()     // Catch:{ all -> 0x000c }
            androidx.camera.core.k$b r3 = r5.f17044w     // Catch:{ all -> 0x000c }
            C.W r3 = r3.F2()     // Catch:{ all -> 0x000c }
            long r3 = r3.a()     // Catch:{ all -> 0x000c }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002c
            r6.close()     // Catch:{ all -> 0x000c }
            goto L_0x0035
        L_0x002c:
            androidx.camera.core.n r1 = r5.f17043v     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x0033:
            r5.f17043v = r6     // Catch:{ all -> 0x000c }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0037:
            androidx.camera.core.k$b r1 = new androidx.camera.core.k$b     // Catch:{ all -> 0x000c }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x000c }
            r5.f17044w = r1     // Catch:{ all -> 0x000c }
            ob.e r6 = r5.e(r1)     // Catch:{ all -> 0x000c }
            androidx.camera.core.k$a r2 = new androidx.camera.core.k$a     // Catch:{ all -> 0x000c }
            r2.<init>(r1)     // Catch:{ all -> 0x000c }
            java.util.concurrent.Executor r1 = H.a.a()     // Catch:{ all -> 0x000c }
            I.n.j(r6, r2, r1)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.k.o(androidx.camera.core.n):void");
    }

    /* access modifiers changed from: package-private */
    public void z() {
        synchronized (this.f17042u) {
            try {
                this.f17044w = null;
                n nVar = this.f17043v;
                if (nVar != null) {
                    this.f17043v = null;
                    o(nVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
