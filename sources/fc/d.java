package Fc;

import Gc.k;
import android.content.Context;
import com.google.firebase.perf.util.c;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.o;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f60430a;

    /* renamed from: b  reason: collision with root package name */
    private final double f60431b;

    /* renamed from: c  reason: collision with root package name */
    private final double f60432c;

    /* renamed from: d  reason: collision with root package name */
    private a f60433d;

    /* renamed from: e  reason: collision with root package name */
    private a f60434e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f60435f;

    static class a {

        /* renamed from: k  reason: collision with root package name */
        private static final Ac.a f60436k = Ac.a.e();

        /* renamed from: l  reason: collision with root package name */
        private static final long f60437l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        private final com.google.firebase.perf.util.a f60438a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f60439b;

        /* renamed from: c  reason: collision with root package name */
        private l f60440c;

        /* renamed from: d  reason: collision with root package name */
        private i f60441d;

        /* renamed from: e  reason: collision with root package name */
        private long f60442e;

        /* renamed from: f  reason: collision with root package name */
        private double f60443f;

        /* renamed from: g  reason: collision with root package name */
        private i f60444g;

        /* renamed from: h  reason: collision with root package name */
        private i f60445h;

        /* renamed from: i  reason: collision with root package name */
        private long f60446i;

        /* renamed from: j  reason: collision with root package name */
        private long f60447j;

        a(i iVar, long j10, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f60438a = aVar;
            this.f60442e = j10;
            this.f60441d = iVar;
            this.f60443f = (double) j10;
            this.f60440c = aVar.a();
            g(aVar2, str, z10);
            this.f60439b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            String str2 = str;
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i iVar = new i(e10, f10, timeUnit);
            this.f60444g = iVar;
            this.f60446i = e10;
            if (z10) {
                f60436k.b("Foreground %s logging rate:%f, burst capacity:%d", str2, iVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            i iVar2 = new i(c10, d10, timeUnit);
            this.f60445h = iVar2;
            this.f60447j = c10;
            if (z10) {
                f60436k.b("Background %s logging rate:%f, capacity:%d", str2, iVar2, Long.valueOf(c10));
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(boolean z10) {
            i iVar;
            if (z10) {
                try {
                    iVar = this.f60444g;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            } else {
                iVar = this.f60445h;
            }
            this.f60441d = iVar;
            this.f60442e = z10 ? this.f60446i : this.f60447j;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean b(Gc.i r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                com.google.firebase.perf.util.a r5 = r4.f60438a     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.l r5 = r5.a()     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.l r0 = r4.f60440c     // Catch:{ all -> 0x002e }
                long r0 = r0.d(r5)     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.i r2 = r4.f60441d     // Catch:{ all -> 0x002e }
                double r2 = r2.a()     // Catch:{ all -> 0x002e }
                double r0 = r0 * r2
                long r2 = f60437l     // Catch:{ all -> 0x002e }
                double r2 = (double) r2     // Catch:{ all -> 0x002e }
                double r0 = r0 / r2
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0030
                double r2 = r4.f60443f     // Catch:{ all -> 0x002e }
                double r2 = r2 + r0
                long r0 = r4.f60442e     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x002e }
                r4.f60443f = r0     // Catch:{ all -> 0x002e }
                r4.f60440c = r5     // Catch:{ all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r5 = move-exception
                goto L_0x004c
            L_0x0030:
                double r0 = r4.f60443f     // Catch:{ all -> 0x002e }
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                double r0 = r0 - r2
                r4.f60443f = r0     // Catch:{ all -> 0x002e }
                monitor-exit(r4)
                r5 = 1
                return r5
            L_0x003e:
                boolean r5 = r4.f60439b     // Catch:{ all -> 0x002e }
                if (r5 == 0) goto L_0x0049
                Ac.a r5 = f60436k     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "Exceeded log rate limit, dropping the log."
                r5.j(r0)     // Catch:{ all -> 0x002e }
            L_0x0049:
                monitor-exit(r4)
                r5 = 0
                return r5
            L_0x004c:
                monitor-exit(r4)     // Catch:{ all -> 0x002e }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc.d.a.b(Gc.i):boolean");
        }
    }

    public d(Context context, i iVar, long j10) {
        this(iVar, j10, new com.google.firebase.perf.util.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f60435f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List<k> list) {
        return list.size() > 0 && list.get(0).n() > 0 && list.get(0).m(0) == Gc.l.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f60432c < this.f60430a.f();
    }

    private boolean e() {
        return this.f60431b < this.f60430a.s();
    }

    private boolean f() {
        return this.f60431b < this.f60430a.G();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f60433d.a(z10);
        this.f60434e.a(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean g(Gc.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.b()) {
            return !this.f60434e.b(iVar);
        }
        if (iVar.d()) {
            return !this.f60433d.b(iVar);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean h(Gc.i iVar) {
        if (iVar.d() && !f() && !c(iVar.e().H())) {
            return false;
        }
        if (!i(iVar) || d() || c(iVar.e().H())) {
            return !iVar.b() || e() || c(iVar.c().D());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean i(Gc.i iVar) {
        return iVar.d() && iVar.e().G().startsWith("_st_") && iVar.e().w("Hosting_activity");
    }

    /* access modifiers changed from: package-private */
    public boolean j(Gc.i iVar) {
        return (!iVar.d() || ((!iVar.e().G().equals(c.FOREGROUND_TRACE_NAME.toString()) && !iVar.e().G().equals(c.BACKGROUND_TRACE_NAME.toString())) || iVar.e().z() <= 0)) && !iVar.a();
    }

    d(i iVar, long j10, com.google.firebase.perf.util.a aVar, double d10, double d11, com.google.firebase.perf.config.a aVar2) {
        double d12 = d10;
        double d13 = d11;
        this.f60433d = null;
        this.f60434e = null;
        boolean z10 = false;
        this.f60435f = false;
        o.a(0.0d <= d12 && d12 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d13 && d13 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f60431b = d12;
        this.f60432c = d13;
        this.f60430a = aVar2;
        i iVar2 = iVar;
        long j11 = j10;
        com.google.firebase.perf.util.a aVar3 = aVar;
        com.google.firebase.perf.config.a aVar4 = aVar2;
        this.f60433d = new a(iVar2, j11, aVar3, aVar4, "Trace", this.f60435f);
        this.f60434e = new a(iVar2, j11, aVar3, aVar4, "Network", this.f60435f);
    }
}
