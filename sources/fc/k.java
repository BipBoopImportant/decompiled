package Fc;

import Ac.b;
import Fb.f;
import Gc.c;
import Gc.d;
import Gc.g;
import Gc.h;
import Gc.i;
import Gc.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import j9.j;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.C10036b;
import nc.e;
import wc.C10352a;
import wc.C10356e;

public class k implements a.b {

    /* renamed from: r  reason: collision with root package name */
    private static final Ac.a f60461r = Ac.a.e();

    /* renamed from: s  reason: collision with root package name */
    private static final k f60462s = new k();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f60463a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f60464b = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f60465c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private f f60466d;

    /* renamed from: e  reason: collision with root package name */
    private C10356e f60467e;

    /* renamed from: f  reason: collision with root package name */
    private e f60468f;

    /* renamed from: g  reason: collision with root package name */
    private C10036b<j> f60469g;

    /* renamed from: h  reason: collision with root package name */
    private b f60470h;

    /* renamed from: i  reason: collision with root package name */
    private ExecutorService f60471i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: j  reason: collision with root package name */
    private Context f60472j;

    /* renamed from: k  reason: collision with root package name */
    private com.google.firebase.perf.config.a f60473k;

    /* renamed from: l  reason: collision with root package name */
    private d f60474l;

    /* renamed from: m  reason: collision with root package name */
    private a f60475m;

    /* renamed from: n  reason: collision with root package name */
    private c.b f60476n;

    /* renamed from: o  reason: collision with root package name */
    private String f60477o;

    /* renamed from: p  reason: collision with root package name */
    private String f60478p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f60479q = false;

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f60463a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private i D(i.b bVar, d dVar) {
        G();
        c.b K10 = this.f60476n.K(dVar);
        if (bVar.d() || bVar.b()) {
            K10 = ((c.b) K10.clone()).G(j());
        }
        return (i) bVar.E(K10).g();
    }

    /* access modifiers changed from: private */
    public void E() {
        Context k10 = this.f60466d.k();
        this.f60472j = k10;
        this.f60477o = k10.getPackageName();
        this.f60473k = com.google.firebase.perf.config.a.g();
        this.f60474l = new d(this.f60472j, new com.google.firebase.perf.util.i(100, 1, TimeUnit.MINUTES), 500);
        this.f60475m = a.b();
        this.f60470h = new b(this.f60469g, this.f60473k.a());
        h();
    }

    private void F(i.b bVar, d dVar) {
        if (u()) {
            i D10 = D(bVar, dVar);
            if (t(D10)) {
                g(D10);
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
            }
        } else if (s(bVar)) {
            f60461r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
            this.f60464b.add(new c(bVar, dVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G() {
        /*
            r4 = this;
            com.google.firebase.perf.config.a r0 = r4.f60473k
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0070
            Gc.c$b r0 = r4.f60476n
            boolean r0 = r0.E()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.f60479q
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            nc.e r0 = r4.f60468f     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            xa.l r0 = r0.getId()     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = xa.C8974o.b(r0, r2, r1)     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            goto L_0x005d
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x004d
        L_0x002d:
            Ac.a r1 = f60461r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x003d:
            Ac.a r1 = f60461r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x004d:
            Ac.a r1 = f60461r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L_0x005c:
            r0 = 0
        L_0x005d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0069
            Gc.c$b r1 = r4.f60476n
            r1.I(r0)
            goto L_0x0070
        L_0x0069:
            Ac.a r0 = f60461r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc.k.G():void");
    }

    private void H() {
        if (this.f60467e == null && u()) {
            this.f60467e = C10356e.c();
        }
    }

    private void g(i iVar) {
        if (iVar.d()) {
            f60461r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.e()));
        } else {
            f60461r.g("Logging %s", n(iVar));
        }
        this.f60470h.b(iVar);
    }

    private void h() {
        this.f60475m.k(new WeakReference(f60462s));
        c.b w10 = c.w();
        this.f60476n = w10;
        w10.L(this.f60466d.n().c()).H(Gc.a.o().E(this.f60477o).G(C10352a.f77590b).H(p(this.f60472j)));
        this.f60465c.set(true);
        while (!this.f60464b.isEmpty()) {
            c poll = this.f60464b.poll();
            if (poll != null) {
                this.f60471i.execute(new j(this, poll));
            }
        }
    }

    private String i(m mVar) {
        String G10 = mVar.G();
        return G10.startsWith("_st_") ? b.c(this.f60478p, this.f60477o, G10) : b.a(this.f60478p, this.f60477o, G10);
    }

    private Map<String, String> j() {
        H();
        C10356e eVar = this.f60467e;
        return eVar != null ? eVar.b() : Collections.emptyMap();
    }

    public static k k() {
        return f60462s;
    }

    private static String l(g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gVar.v()), Integer.valueOf(gVar.s()), Integer.valueOf(gVar.r())});
    }

    private static String m(h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{hVar.K(), hVar.N() ? String.valueOf(hVar.C()) : "UNKNOWN", new DecimalFormat("#.####").format(((double) (hVar.R() ? hVar.I() : 0)) / 1000.0d)});
    }

    private static String n(Gc.j jVar) {
        return jVar.d() ? o(jVar.e()) : jVar.b() ? m(jVar.c()) : jVar.a() ? l(jVar.f()) : "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{mVar.G(), new DecimalFormat("#.####").format(((double) mVar.D()) / 1000.0d)});
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(i iVar) {
        if (iVar.d()) {
            this.f60475m.d(com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (iVar.b()) {
            this.f60475m.d(com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    private boolean s(Gc.j jVar) {
        Integer num = this.f60463a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int intValue = num.intValue();
        Integer num2 = this.f60463a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int intValue2 = num2.intValue();
        Integer num3 = this.f60463a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int intValue3 = num3.intValue();
        if (jVar.d() && intValue > 0) {
            this.f60463a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.b() && intValue2 > 0) {
            this.f60463a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!jVar.a() || intValue3 <= 0) {
            f60461r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), num, num2, num3);
            return false;
        } else {
            this.f60463a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    private boolean t(i iVar) {
        if (!this.f60473k.K()) {
            f60461r.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        } else if (!iVar.m().s()) {
            f60461r.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        } else if (!Cc.e.b(iVar, this.f60472j)) {
            f60461r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        } else if (!this.f60474l.h(iVar)) {
            q(iVar);
            f60461r.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        } else if (!this.f60474l.g(iVar)) {
            return true;
        } else {
            q(iVar);
            f60461r.g("Rate limited (per device) - %s", n(iVar));
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(c cVar) {
        F(cVar.f60428a, cVar.f60429b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, d dVar) {
        F(i.o().I(mVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(h hVar, d dVar) {
        F(i.o().H(hVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(g gVar, d dVar) {
        F(i.o().G(gVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f60474l.a(this.f60479q);
    }

    public void A(g gVar, d dVar) {
        this.f60471i.execute(new f(this, gVar, dVar));
    }

    public void B(h hVar, d dVar) {
        this.f60471i.execute(new h(this, hVar, dVar));
    }

    public void C(m mVar, d dVar) {
        this.f60471i.execute(new g(this, mVar, dVar));
    }

    public void onUpdateAppState(d dVar) {
        this.f60479q = dVar == d.FOREGROUND;
        if (u()) {
            this.f60471i.execute(new e(this));
        }
    }

    public void r(f fVar, e eVar, C10036b<j> bVar) {
        this.f60466d = fVar;
        this.f60478p = fVar.n().e();
        this.f60468f = eVar;
        this.f60469g = bVar;
        this.f60471i.execute(new i(this));
    }

    public boolean u() {
        return this.f60465c.get();
    }
}
