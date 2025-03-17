package com.google.firebase.perf.session.gauges;

import Ac.a;
import Gc.e;
import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c {

    /* renamed from: g  reason: collision with root package name */
    private static final a f68626g = a.e();

    /* renamed from: h  reason: collision with root package name */
    private static final long f68627h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<e> f68628a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f68629b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c  reason: collision with root package name */
    private final String f68630c;

    /* renamed from: d  reason: collision with root package name */
    private final long f68631d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture f68632e = null;

    /* renamed from: f  reason: collision with root package name */
    private long f68633f = -1;

    @SuppressLint({"ThreadPoolCreation"})
    c() {
        int myPid = Process.myPid();
        this.f68630c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f68631d = e();
    }

    private long d(long j10) {
        return Math.round((((double) j10) / ((double) this.f68631d)) * ((double) f68627h));
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(l lVar) {
        e m10 = m(lVar);
        if (m10 != null) {
            this.f68628a.add(m10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(l lVar) {
        e m10 = m(lVar);
        if (m10 != null) {
            this.f68628a.add(m10);
        }
    }

    private synchronized void i(l lVar) {
        try {
            this.f68629b.schedule(new b(this, lVar), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f68626g;
            aVar.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, l lVar) {
        this.f68633f = j10;
        try {
            this.f68632e = this.f68629b.scheduleAtFixedRate(new a(this, lVar), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f68626g;
            aVar.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private e m(l lVar) {
        BufferedReader bufferedReader;
        if (lVar == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f68630c));
            long b10 = lVar.b();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            e eVar = (e) e.l().E(b10).G(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).H(d(parseLong + parseLong2)).g();
            bufferedReader.close();
            return eVar;
        } catch (IOException e10) {
            a aVar = f68626g;
            aVar.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e11) {
            a aVar2 = f68626g;
            aVar2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e11.getMessage());
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void c(l lVar) {
        i(lVar);
    }

    public void k(long j10, l lVar) {
        long j11 = this.f68631d;
        if (j11 != -1 && j11 != 0 && !f(j10)) {
            if (this.f68632e == null) {
                j(j10, lVar);
            } else if (this.f68633f != j10) {
                l();
                j(j10, lVar);
            }
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f68632e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f68632e = null;
            this.f68633f = -1;
        }
    }
}
