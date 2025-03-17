package com.android.volley;

import android.os.Process;
import com.android.volley.b;
import java.util.concurrent.BlockingQueue;

public class c extends Thread {

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f46199g = v.f46286b;

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<n<?>> f46200a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<n<?>> f46201b;

    /* renamed from: c  reason: collision with root package name */
    private final b f46202c;

    /* renamed from: d  reason: collision with root package name */
    private final q f46203d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f46204e = false;

    /* renamed from: f  reason: collision with root package name */
    private final w f46205f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f46206a;

        a(n nVar) {
            this.f46206a = nVar;
        }

        public void run() {
            try {
                c.this.f46201b.put(this.f46206a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, b bVar, q qVar) {
        this.f46200a = blockingQueue;
        this.f46201b = blockingQueue2;
        this.f46202c = bVar;
        this.f46203d = qVar;
        this.f46205f = new w(this, blockingQueue2, qVar);
    }

    private void b() {
        c(this.f46200a.take());
    }

    /* access modifiers changed from: package-private */
    public void c(n<?> nVar) {
        nVar.addMarker("cache-queue-take");
        nVar.sendEvent(1);
        try {
            if (nVar.isCanceled()) {
                nVar.finish("cache-discard-canceled");
                return;
            }
            b.a aVar = this.f46202c.get(nVar.getCacheKey());
            if (aVar == null) {
                nVar.addMarker("cache-miss");
                if (!this.f46205f.c(nVar)) {
                    this.f46201b.put(nVar);
                }
                nVar.sendEvent(2);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.b(currentTimeMillis)) {
                nVar.addMarker("cache-hit-expired");
                nVar.setCacheEntry(aVar);
                if (!this.f46205f.c(nVar)) {
                    this.f46201b.put(nVar);
                }
                nVar.sendEvent(2);
                return;
            }
            nVar.addMarker("cache-hit");
            p<?> parseNetworkResponse = nVar.parseNetworkResponse(new k(aVar.f46191a, aVar.f46197g));
            nVar.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.b()) {
                nVar.addMarker("cache-parsing-failed");
                this.f46202c.a(nVar.getCacheKey(), true);
                nVar.setCacheEntry((b.a) null);
                if (!this.f46205f.c(nVar)) {
                    this.f46201b.put(nVar);
                }
                nVar.sendEvent(2);
                return;
            }
            if (!aVar.c(currentTimeMillis)) {
                this.f46203d.a(nVar, parseNetworkResponse);
            } else {
                nVar.addMarker("cache-hit-refresh-needed");
                nVar.setCacheEntry(aVar);
                parseNetworkResponse.f46248d = true;
                if (!this.f46205f.c(nVar)) {
                    this.f46203d.b(nVar, parseNetworkResponse, new a(nVar));
                } else {
                    this.f46203d.a(nVar, parseNetworkResponse);
                }
            }
            nVar.sendEvent(2);
        } finally {
            nVar.sendEvent(2);
        }
    }

    public void d() {
        this.f46204e = true;
        interrupt();
    }

    public void run() {
        if (f46199g) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f46202c.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f46204e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
