package s9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j9.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l9.h;
import l9.i;
import l9.p;
import m9.C8568e;
import m9.f;
import m9.g;
import m9.m;
import o9.C8611a;
import o9.C8613c;
import p9.C8639a;
import t9.C8855c;
import t9.C8856d;
import t9.C8863k;
import u9.C8888b;
import v9.C8903a;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56041a;

    /* renamed from: b  reason: collision with root package name */
    private final C8568e f56042b;

    /* renamed from: c  reason: collision with root package name */
    private final C8856d f56043c;

    /* renamed from: d  reason: collision with root package name */
    private final x f56044d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f56045e;

    /* renamed from: f  reason: collision with root package name */
    private final C8888b f56046f;

    /* renamed from: g  reason: collision with root package name */
    private final C8903a f56047g;

    /* renamed from: h  reason: collision with root package name */
    private final C8903a f56048h;

    /* renamed from: i  reason: collision with root package name */
    private final C8855c f56049i;

    public r(Context context, C8568e eVar, C8856d dVar, x xVar, Executor executor, C8888b bVar, C8903a aVar, C8903a aVar2, C8855c cVar) {
        this.f56041a = context;
        this.f56042b = eVar;
        this.f56043c = dVar;
        this.f56044d = xVar;
        this.f56045e = executor;
        this.f56046f = bVar;
        this.f56047g = aVar;
        this.f56048h = aVar2;
        this.f56049i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(p pVar) {
        return Boolean.valueOf(this.f56043c.j1(pVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(p pVar) {
        return this.f56043c.s0(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, p pVar, long j10) {
        this.f56043c.r1(iterable);
        this.f56043c.Z2(pVar, this.f56047g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f56043c.Q(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f56049i.c();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f56049i.f((long) ((Integer) entry.getValue()).intValue(), C8613c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(p pVar, long j10) {
        this.f56043c.Z2(pVar, this.f56047g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(p pVar, int i10) {
        this.f56044d.a(pVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.f56044d.a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(l9.p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            u9.b r0 = r3.f56046f     // Catch:{ a -> 0x0029 }
            t9.d r1 = r3.f56043c     // Catch:{ a -> 0x0029 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0029 }
            s9.i r2 = new s9.i     // Catch:{ a -> 0x0029 }
            r2.<init>(r1)     // Catch:{ a -> 0x0029 }
            r0.d(r2)     // Catch:{ a -> 0x0029 }
            boolean r0 = r3.k()     // Catch:{ a -> 0x0029 }
            if (r0 != 0) goto L_0x0022
            u9.b r0 = r3.f56046f     // Catch:{ a -> 0x0029 }
            s9.j r1 = new s9.j     // Catch:{ a -> 0x0029 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0029 }
            r0.d(r1)     // Catch:{ a -> 0x0029 }
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x0032
        L_0x0022:
            r3.u(r4, r5)     // Catch:{ a -> 0x0029 }
        L_0x0025:
            r6.run()
            goto L_0x0031
        L_0x0029:
            s9.x r0 = r3.f56044d     // Catch:{ all -> 0x0020 }
            int r5 = r5 + 1
            r0.a(r4, r5)     // Catch:{ all -> 0x0020 }
            goto L_0x0025
        L_0x0031:
            return
        L_0x0032:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.r.t(l9.p, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        C8888b bVar = this.f56046f;
        C8855c cVar = this.f56049i;
        Objects.requireNonNull(cVar);
        return mVar.a(i.a().i(this.f56047g.a()).o(this.f56048h.a()).n("GDT_CLIENT_METRICS").h(new h(c.b("proto"), ((C8611a) bVar.d(new h(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f56041a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g u(p pVar, int i10) {
        g b10;
        m mVar = this.f56042b.get(pVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f56046f.d(new k(this, pVar))).booleanValue()) {
                Iterable<C8863k> iterable = (Iterable) this.f56046f.d(new l(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (mVar == null) {
                    C8639a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C8863k b11 : iterable) {
                        arrayList.add(b11.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    b10 = mVar.b(f.a().b(arrayList).c(pVar.c()).a());
                }
                e10 = b10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f56046f.d(new m(this, iterable, pVar, j11));
                    this.f56044d.b(pVar, i10 + 1, true);
                    return e10;
                }
                this.f56046f.d(new n(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (pVar.e()) {
                        this.f56046f.d(new o(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C8863k b12 : iterable) {
                        String n10 = b12.b().n();
                        if (!hashMap.containsKey(n10)) {
                            hashMap.put(n10, 1);
                        } else {
                            hashMap.put(n10, Integer.valueOf(((Integer) hashMap.get(n10)).intValue() + 1));
                        }
                    }
                    this.f56046f.d(new p(this, hashMap));
                }
            }
            this.f56046f.d(new q(this, pVar, j11));
            return e10;
        }
    }

    public void v(p pVar, int i10, Runnable runnable) {
        this.f56045e.execute(new g(this, pVar, i10, runnable));
    }
}
