package wa;

import K9.C6620s;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ka.b;
import ka.c;
import ka.i;

public class a {

    /* renamed from: r  reason: collision with root package name */
    private static final long f57368r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f57369s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f57370t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile e f57371u = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f57372a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f57373b;

    /* renamed from: c  reason: collision with root package name */
    private int f57374c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f57375d;

    /* renamed from: e  reason: collision with root package name */
    private long f57376e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f57377f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f57378g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f57379h;

    /* renamed from: i  reason: collision with root package name */
    b f57380i;

    /* renamed from: j  reason: collision with root package name */
    private e f57381j = h.d();

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f57382k;

    /* renamed from: l  reason: collision with root package name */
    private final String f57383l;

    /* renamed from: m  reason: collision with root package name */
    private final String f57384m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f57385n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, d> f57386o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f57387p = new AtomicInteger(0);

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f57388q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        C6620s.m(context, "WakeLock: context must not be null");
        C6620s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f57385n = context.getApplicationContext();
        this.f57384m = str;
        this.f57380i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f57383l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f57383l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f57373b = newWakeLock;
            if (r.c(context)) {
                WorkSource b10 = r.b(context, p.a(packageName) ? context.getPackageName() : packageName);
                this.f57382k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f57369s;
            if (scheduledExecutorService == null) {
                synchronized (f57370t) {
                    try {
                        scheduledExecutorService = f57369s;
                        if (scheduledExecutorService == null) {
                            ka.h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f57369s = scheduledExecutorService;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f57388q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new i(sb2.toString());
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f57372a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f57383l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f57374c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f57378g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    private final void g() {
        if (!this.f57377f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f57377f);
            this.f57377f.clear();
            if (arrayList.size() > 0) {
                f fVar = (f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f57372a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r0 = move-exception
            goto L_0x00a7
        L_0x000e:
            boolean r0 = r5.f57378g     // Catch:{ all -> 0x000b }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r5.f57374c     // Catch:{ all -> 0x000b }
            int r0 = r0 + -1
            r5.f57374c = r0     // Catch:{ all -> 0x000b }
            if (r0 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r5.f57374c = r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            r5.g()     // Catch:{ all -> 0x000b }
            java.util.Map<java.lang.String, wa.d> r0 = r5.f57386o     // Catch:{ all -> 0x000b }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x000b }
            wa.d r2 = (wa.d) r2     // Catch:{ all -> 0x000b }
            r2.f57390a = r1     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.Map<java.lang.String, wa.d> r0 = r5.f57386o     // Catch:{ all -> 0x000b }
            r0.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.Future<?> r0 = r5.f57375d     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r0.cancel(r1)     // Catch:{ all -> 0x000b }
            r5.f57375d = r2     // Catch:{ all -> 0x000b }
            r3 = 0
            r5.f57376e = r3     // Catch:{ all -> 0x000b }
        L_0x004f:
            r5.f57379h = r1     // Catch:{ all -> 0x000b }
            android.os.PowerManager$WakeLock r0 = r5.f57373b     // Catch:{ all -> 0x000b }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0094
            android.os.PowerManager$WakeLock r0 = r5.f57373b     // Catch:{ RuntimeException -> 0x0067 }
            r0.release()     // Catch:{ RuntimeException -> 0x0067 }
            ka.b r0 = r5.f57380i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f57380i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x0065:
            r0 = move-exception
            goto L_0x008d
        L_0x0067:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0065 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f57383l     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0065 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0065 }
            ka.b r0 = r5.f57380i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f57380i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x008c:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x008d:
            ka.b r1 = r5.f57380i     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0093
            r5.f57380i = r2     // Catch:{ all -> 0x000b }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x0094:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f57383l     // Catch:{ all -> 0x000b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x000b }
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x00a7:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f57387p.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f57368r), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f57372a) {
            try {
                if (!b()) {
                    this.f57380i = b.c(false, (c) null);
                    this.f57373b.acquire();
                    this.f57381j.c();
                }
                this.f57374c++;
                this.f57379h++;
                f((String) null);
                d dVar = this.f57386o.get((Object) null);
                if (dVar == null) {
                    dVar = new d((c) null);
                    this.f57386o.put((Object) null, dVar);
                }
                dVar.f57390a++;
                long c10 = this.f57381j.c();
                if (Long.MAX_VALUE - c10 > max) {
                    j11 = c10 + max;
                }
                if (j11 > this.f57376e) {
                    this.f57376e = j11;
                    Future<?> future = this.f57375d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f57375d = this.f57388q.schedule(new b(this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f57372a) {
            z10 = this.f57374c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f57387p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f57383l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f57372a) {
            try {
                f((String) null);
                if (this.f57386o.containsKey((Object) null)) {
                    d dVar = this.f57386o.get((Object) null);
                    if (dVar != null) {
                        int i10 = dVar.f57390a - 1;
                        dVar.f57390a = i10;
                        if (i10 == 0) {
                            this.f57386o.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f57383l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f57372a) {
            this.f57378g = z10;
        }
    }
}
