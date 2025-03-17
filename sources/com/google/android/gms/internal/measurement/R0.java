package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class R0 extends U0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Bundle> f48797a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f48798b;

    public static <T> T K3(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received" + ": %s, %s", new Object[]{canonicalName, canonicalName2}), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle J3(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f48797a
            monitor-enter(r0)
            boolean r1 = r2.f48798b     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f48797a     // Catch:{ InterruptedException -> 0x000f }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0012
        L_0x000d:
            r3 = move-exception
            goto L_0x001c
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            r3 = 0
            return r3
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f48797a     // Catch:{ all -> 0x000d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x000d }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R0.J3(long):android.os.Bundle");
    }

    public final Long L3(long j10) {
        return (Long) K3(J3(j10), Long.class);
    }

    public final String M3(long j10) {
        return (String) K3(J3(j10), String.class);
    }

    public final void o(Bundle bundle) {
        synchronized (this.f48797a) {
            try {
                this.f48797a.set(bundle);
                this.f48798b = true;
                this.f48797a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
