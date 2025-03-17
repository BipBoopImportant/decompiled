package com.android.volley;

import com.android.volley.b;
import com.android.volley.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

class w implements n.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<n<?>>> f46294a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final q f46295b;

    /* renamed from: c  reason: collision with root package name */
    private final o f46296c = null;

    /* renamed from: d  reason: collision with root package name */
    private final c f46297d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<n<?>> f46298e;

    w(c cVar, BlockingQueue<n<?>> blockingQueue, q qVar) {
        this.f46295b = qVar;
        this.f46297d = cVar;
        this.f46298e = blockingQueue;
    }

    public void a(n<?> nVar, p<?> pVar) {
        List<n> remove;
        b.a aVar = pVar.f46246b;
        if (aVar == null || aVar.a()) {
            b(nVar);
            return;
        }
        String cacheKey = nVar.getCacheKey();
        synchronized (this) {
            remove = this.f46294a.remove(cacheKey);
        }
        if (remove != null) {
            if (v.f46286b) {
                v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
            }
            for (n a10 : remove) {
                this.f46295b.a(a10, pVar);
            }
        }
    }

    public synchronized void b(n<?> nVar) {
        BlockingQueue<n<?>> blockingQueue;
        try {
            String cacheKey = nVar.getCacheKey();
            List remove = this.f46294a.remove(cacheKey);
            if (remove != null && !remove.isEmpty()) {
                if (v.f46286b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
                }
                n nVar2 = (n) remove.remove(0);
                this.f46294a.put(cacheKey, remove);
                nVar2.setNetworkRequestCompleteListener(this);
                o oVar = this.f46296c;
                if (oVar != null) {
                    oVar.f(nVar2);
                } else if (!(this.f46297d == null || (blockingQueue = this.f46298e) == null)) {
                    blockingQueue.put(nVar2);
                }
            }
        } catch (InterruptedException e10) {
            v.c("Couldn't add request to queue. %s", e10.toString());
            Thread.currentThread().interrupt();
            this.f46297d.d();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c(com.android.volley.n<?> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.getCacheKey()     // Catch:{ all -> 0x001d }
            java.util.Map<java.lang.String, java.util.List<com.android.volley.n<?>>> r1 = r3.f46294a     // Catch:{ all -> 0x001d }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x003c
            java.util.Map<java.lang.String, java.util.List<com.android.volley.n<?>>> r1 = r3.f46294a     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001d }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x001d }
            r1.<init>()     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r4 = move-exception
            goto L_0x0055
        L_0x001f:
            java.lang.String r2 = "waiting-for-response"
            r4.addMarker(r2)     // Catch:{ all -> 0x001d }
            r1.add(r4)     // Catch:{ all -> 0x001d }
            java.util.Map<java.lang.String, java.util.List<com.android.volley.n<?>>> r4 = r3.f46294a     // Catch:{ all -> 0x001d }
            r4.put(r0, r1)     // Catch:{ all -> 0x001d }
            boolean r4 = com.android.volley.v.f46286b     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x001d }
            com.android.volley.v.b(r4, r0)     // Catch:{ all -> 0x001d }
        L_0x0039:
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x003c:
            java.util.Map<java.lang.String, java.util.List<com.android.volley.n<?>>> r1 = r3.f46294a     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.put(r0, r2)     // Catch:{ all -> 0x001d }
            r4.setNetworkRequestCompleteListener(r3)     // Catch:{ all -> 0x001d }
            boolean r4 = com.android.volley.v.f46286b     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = "new request, sending to network %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x001d }
            com.android.volley.v.b(r4, r0)     // Catch:{ all -> 0x001d }
        L_0x0052:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0055:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.w.c(com.android.volley.n):boolean");
    }
}
