package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import wa.a;

final class i0 {

    /* renamed from: a  reason: collision with root package name */
    static final long f68456a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f68457b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f68458c;

    private static void b(Context context) {
        if (f68458c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f68458c = aVar;
            aVar.d(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f68457b) {
            try {
                if (f68458c != null && d(intent)) {
                    g(intent, false);
                    f68458c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    static void f(Context context, n0 n0Var, Intent intent) {
        synchronized (f68457b) {
            try {
                b(context);
                boolean d10 = d(intent);
                g(intent, true);
                if (!d10) {
                    f68458c.a(f68456a);
                }
                n0Var.d(intent).c(new h0(intent));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName h(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f68457b
            monitor-enter(r0)
            b(r3)     // Catch:{ all -> 0x0017 }
            boolean r1 = d(r4)     // Catch:{ all -> 0x0017 }
            r2 = 1
            g(r4, r2)     // Catch:{ all -> 0x0017 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r3 = 0
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0024
        L_0x0019:
            if (r1 != 0) goto L_0x0022
            wa.a r4 = f68458c     // Catch:{ all -> 0x0017 }
            long r1 = f68456a     // Catch:{ all -> 0x0017 }
            r4.a(r1)     // Catch:{ all -> 0x0017 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r3
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.i0.h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
