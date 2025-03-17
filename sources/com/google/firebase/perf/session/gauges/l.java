package com.google.firebase.perf.session.gauges;

import Ac.a;
import Gc.b;
import android.annotation.SuppressLint;
import com.google.firebase.perf.util.k;
import com.google.firebase.perf.util.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class l {

    /* renamed from: f  reason: collision with root package name */
    private static final a f68649f = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f68650a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f68651b;

    /* renamed from: c  reason: collision with root package name */
    private final Runtime f68652c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledFuture f68653d;

    /* renamed from: e  reason: collision with root package name */
    private long f68654e;

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private int d() {
        return o.c(k.BYTES.b(this.f68652c.totalMemory() - this.f68652c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(com.google.firebase.perf.util.l lVar) {
        b l10 = l(lVar);
        if (l10 != null) {
            this.f68651b.add(l10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(com.google.firebase.perf.util.l lVar) {
        b l10 = l(lVar);
        if (l10 != null) {
            this.f68651b.add(l10);
        }
    }

    private synchronized void h(com.google.firebase.perf.util.l lVar) {
        try {
            this.f68650a.schedule(new k(this, lVar), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f68649f;
            aVar.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, com.google.firebase.perf.util.l lVar) {
        this.f68654e = j10;
        try {
            this.f68653d = this.f68650a.scheduleAtFixedRate(new j(this, lVar), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f68649f;
            aVar.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private b l(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        return (b) b.k().E(lVar.b()).G(d()).g();
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        h(lVar);
    }

    public void j(long j10, com.google.firebase.perf.util.l lVar) {
        if (!e(j10)) {
            if (this.f68653d == null) {
                i(j10, lVar);
            } else if (this.f68654e != j10) {
                k();
                i(j10, lVar);
            }
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f68653d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f68653d = null;
            this.f68654e = -1;
        }
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f68653d = null;
        this.f68654e = -1;
        this.f68650a = scheduledExecutorService;
        this.f68651b = new ConcurrentLinkedQueue<>();
        this.f68652c = runtime;
    }
}
