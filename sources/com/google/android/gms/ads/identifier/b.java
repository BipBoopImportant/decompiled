package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<AdvertisingIdClient> f47903a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47904b;

    /* renamed from: c  reason: collision with root package name */
    final CountDownLatch f47905c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    boolean f47906d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f47903a = new WeakReference<>(advertisingIdClient);
        this.f47904b = j10;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = this.f47903a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.b();
            this.f47906d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f47905c.await(this.f47904b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
