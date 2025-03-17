package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class i extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<n<?>> f46220a;

    /* renamed from: b  reason: collision with root package name */
    private final h f46221b;

    /* renamed from: c  reason: collision with root package name */
    private final b f46222c;

    /* renamed from: d  reason: collision with root package name */
    private final q f46223d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f46224e = false;

    public i(BlockingQueue<n<?>> blockingQueue, h hVar, b bVar, q qVar) {
        this.f46220a = blockingQueue;
        this.f46221b = hVar;
        this.f46222c = bVar;
        this.f46223d = qVar;
    }

    @TargetApi(14)
    private void a(n<?> nVar) {
        TrafficStats.setThreadStatsTag(nVar.getTrafficStatsTag());
    }

    private void b(n<?> nVar, u uVar) {
        this.f46223d.c(nVar, nVar.parseNetworkError(uVar));
    }

    private void c() {
        d(this.f46220a.take());
    }

    /* access modifiers changed from: package-private */
    public void d(n<?> nVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nVar.sendEvent(3);
        try {
            nVar.addMarker("network-queue-take");
            if (nVar.isCanceled()) {
                nVar.finish("network-discard-cancelled");
                nVar.notifyListenerResponseNotUsable();
                nVar.sendEvent(4);
                return;
            }
            a(nVar);
            k a10 = this.f46221b.a(nVar);
            nVar.addMarker("network-http-complete");
            if (!a10.f46229e || !nVar.hasHadResponseDelivered()) {
                p<?> parseNetworkResponse = nVar.parseNetworkResponse(a10);
                nVar.addMarker("network-parse-complete");
                if (nVar.shouldCache() && parseNetworkResponse.f46246b != null) {
                    this.f46222c.c(nVar.getCacheKey(), parseNetworkResponse.f46246b);
                    nVar.addMarker("network-cache-written");
                }
                nVar.markDelivered();
                this.f46223d.a(nVar, parseNetworkResponse);
                nVar.notifyListenerResponseReceived(parseNetworkResponse);
                nVar.sendEvent(4);
                return;
            }
            nVar.finish("not-modified");
            nVar.notifyListenerResponseNotUsable();
            nVar.sendEvent(4);
        } catch (u e10) {
            e10.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            b(nVar, e10);
            nVar.notifyListenerResponseNotUsable();
        } catch (Exception e11) {
            v.d(e11, "Unhandled exception %s", e11.toString());
            u uVar = new u((Throwable) e11);
            uVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f46223d.c(nVar, uVar);
            nVar.notifyListenerResponseNotUsable();
        } catch (Throwable th2) {
            nVar.sendEvent(4);
            throw th2;
        }
    }

    public void e() {
        this.f46224e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f46224e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
