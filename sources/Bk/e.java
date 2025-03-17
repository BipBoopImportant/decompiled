package BK;

import DK.C15581a;
import DK.C15582b;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f133419a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<c> f133420b = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f133421c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    private androidx.browser.customtabs.e f133422d;

    class a extends androidx.browser.customtabs.e {
        a() {
        }

        private void c(c cVar) {
            e.this.f133420b.set(cVar);
            e.this.f133421c.countDown();
        }

        public void a(ComponentName componentName, c cVar) {
            C15581a.a("CustomTabsService is connected", new Object[0]);
            cVar.h(0);
            c(cVar);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C15581a.a("CustomTabsService is disconnected", new Object[0]);
            c((c) null);
        }
    }

    public e(Context context) {
        this.f133419a = new WeakReference<>(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            androidx.browser.customtabs.e r0 = r2.f133422d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            BK.e$a r0 = new BK.e$a     // Catch:{ all -> 0x0021 }
            r0.<init>()     // Catch:{ all -> 0x0021 }
            r2.f133422d = r0     // Catch:{ all -> 0x0021 }
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f133419a     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0021 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            androidx.browser.customtabs.e r1 = r2.f133422d     // Catch:{ all -> 0x0021 }
            boolean r3 = androidx.browser.customtabs.c.a(r0, r3, r1)     // Catch:{ all -> 0x0021 }
            if (r3 != 0) goto L_0x0030
            goto L_0x0023
        L_0x0021:
            r3 = move-exception
            goto L_0x0032
        L_0x0023:
            java.lang.String r3 = "Unable to bind custom tabs service"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0021 }
            DK.C15581a.e(r3, r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.CountDownLatch r3 = r2.f133421c     // Catch:{ all -> 0x0021 }
            r3.countDown()     // Catch:{ all -> 0x0021 }
        L_0x0030:
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: BK.e.c(java.lang.String):void");
    }

    public f d(b bVar, Uri... uriArr) {
        c f10 = f();
        if (f10 == null) {
            return null;
        }
        f e10 = f10.e(bVar);
        if (e10 == null) {
            C15581a.g("Failed to create custom tabs session through custom tabs client", new Object[0]);
            return null;
        }
        if (uriArr != null && uriArr.length > 0) {
            e10.f(uriArr[0], (Bundle) null, C15582b.f(uriArr, 1));
        }
        return e10;
    }

    public d.C0230d e(Uri... uriArr) {
        return new d.C0230d(d((b) null, uriArr));
    }

    public c f() {
        try {
            this.f133421c.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C15581a.e("Interrupted while waiting for browser connection", new Object[0]);
            this.f133421c.countDown();
        }
        return this.f133420b.get();
    }
}
