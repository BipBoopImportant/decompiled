package com.google.android.gms.ads.identifier;

import G9.C6520a;
import G9.C6522c;
import K9.C6620s;
import X9.e;
import X9.f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.VisibleForTesting;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {

    /* renamed from: a  reason: collision with root package name */
    C6520a f47893a;

    /* renamed from: b  reason: collision with root package name */
    f f47894b;

    /* renamed from: c  reason: collision with root package name */
    boolean f47895c;

    /* renamed from: d  reason: collision with root package name */
    final Object f47896d = new Object();

    /* renamed from: e  reason: collision with root package name */
    b f47897e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f47898f;

    /* renamed from: g  reason: collision with root package name */
    final long f47899g;

    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        private final String f47900a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f47901b;

        @Deprecated
        public Info(String str, boolean z10) {
            this.f47900a = str;
            this.f47901b = z10;
        }

        public String getId() {
            return this.f47900a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f47901b;
        }

        public String toString() {
            String str = this.f47900a;
            boolean z10 = this.f47901b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C6620s.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f47898f = context;
        this.f47895c = false;
        this.f47899g = j10;
    }

    public static void a(boolean z10) {
    }

    private final Info e(int i10) {
        Info info;
        C6620s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f47895c) {
                    synchronized (this.f47896d) {
                        b bVar = this.f47897e;
                        if (bVar == null || !bVar.f47906d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    c(false);
                    if (!this.f47895c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
                C6620s.l(this.f47893a);
                C6620s.l(this.f47894b);
                info = new Info(this.f47894b.zzc(), this.f47894b.R(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception");
            } catch (Exception e11) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|9|10|(1:12)|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f47896d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.b r1 = r5.f47897e     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.util.concurrent.CountDownLatch r1 = r1.f47905c     // Catch:{ all -> 0x0012 }
            r1.countDown()     // Catch:{ all -> 0x0012 }
            com.google.android.gms.ads.identifier.b r1 = r5.f47897e     // Catch:{ InterruptedException -> 0x0014 }
            r1.join()     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            goto L_0x0025
        L_0x0014:
            long r1 = r5.f47899g     // Catch:{ all -> 0x0012 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            com.google.android.gms.ads.identifier.b r3 = new com.google.android.gms.ads.identifier.b     // Catch:{ all -> 0x0012 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0012 }
            r5.f47897e = r3     // Catch:{ all -> 0x0012 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.f():void");
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.c(false);
            Info e10 = advertisingIdClient.e(-1);
            advertisingIdClient.d(e10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.b();
            return e10;
        } catch (Throwable th2) {
            advertisingIdClient.b();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            K9.C6620s.k(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f47898f     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            G9.a r0 = r3.f47893a     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0033
        L_0x000f:
            boolean r0 = r3.f47895c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            Q9.b r0 = Q9.b.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f47898f     // Catch:{ all -> 0x001f }
            G9.a r2 = r3.f47893a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0031 }
        L_0x0027:
            r0 = 0
            r3.f47895c = r0     // Catch:{ all -> 0x0031 }
            r0 = 0
            r3.f47894b = r0     // Catch:{ all -> 0x0031 }
            r3.f47893a = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.b():void");
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void c(boolean z10) {
        C6620s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f47895c) {
                    b();
                }
                Context context = this.f47898f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = b.f().h(context, d.f48050a);
                if (h10 != 0) {
                    if (h10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C6520a aVar = new C6520a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (Q9.b.b().a(context, intent, aVar, 1)) {
                    this.f47893a = aVar;
                    this.f47894b = e.I3(aVar.a(10000, TimeUnit.MILLISECONDS));
                    this.f47895c = true;
                    if (z10) {
                        f();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C6522c(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean d(Info info, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String id2 = info.getId();
            if (id2 != null) {
                hashMap.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            hashMap.put(UiComponentContainer.RESULT_ERROR, th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new a(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
        super.finalize();
    }
}
