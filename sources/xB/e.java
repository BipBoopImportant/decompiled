package Xb;

import Nb.g;
import Qb.C;
import Qb.P;
import Qb.e0;
import Tb.F;
import Yb.d;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import j9.f;
import j9.i;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l9.l;
import xa.C8972m;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final double f64782a;

    /* renamed from: b  reason: collision with root package name */
    private final double f64783b;

    /* renamed from: c  reason: collision with root package name */
    private final long f64784c;

    /* renamed from: d  reason: collision with root package name */
    private final long f64785d;

    /* renamed from: e  reason: collision with root package name */
    private final int f64786e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<Runnable> f64787f;

    /* renamed from: g  reason: collision with root package name */
    private final ThreadPoolExecutor f64788g;

    /* renamed from: h  reason: collision with root package name */
    private final i<F> f64789h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final P f64790i;

    /* renamed from: j  reason: collision with root package name */
    private int f64791j;

    /* renamed from: k  reason: collision with root package name */
    private long f64792k;

    private final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C f64793a;

        /* renamed from: b  reason: collision with root package name */
        private final C8972m<C> f64794b;

        public void run() {
            e.this.p(this.f64793a, this.f64794b);
            e.this.f64790i.c();
            double e10 = e.this.g();
            g f10 = g.f();
            f10.b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e10 / 1000.0d)}) + " s for report: " + this.f64793a.d());
            e.q(e10);
        }

        private b(C c10, C8972m<C> mVar) {
            this.f64793a = c10;
            this.f64794b = mVar;
        }
    }

    e(i<F> iVar, d dVar, P p10) {
        this(dVar.f64904f, dVar.f64905g, ((long) dVar.f64906h) * 1000, iVar, p10);
    }

    /* access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f64782a) * Math.pow(this.f64783b, (double) h()));
    }

    private int h() {
        if (this.f64792k == 0) {
            this.f64792k = o();
        }
        int o10 = (int) ((o() - this.f64792k) / this.f64784c);
        int min = l() ? Math.min(100, this.f64791j + o10) : Math.max(0, this.f64791j - o10);
        if (this.f64791j != min) {
            this.f64791j = min;
            this.f64792k = o();
        }
        return min;
    }

    private boolean k() {
        return this.f64787f.size() < this.f64786e;
    }

    private boolean l() {
        return this.f64787f.size() == this.f64786e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f64789h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(C8972m mVar, boolean z10, C c10, Exception exc) {
        if (exc != null) {
            mVar.d(exc);
            return;
        }
        if (z10) {
            j();
        }
        mVar.e(c10);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public void p(C c10, C8972m<C> mVar) {
        g f10 = g.f();
        f10.b("Sending report through Google DataTransport: " + c10.d());
        this.f64789h.a(j9.d.i(c10.b()), new c(this, mVar, SystemClock.elapsedRealtime() - this.f64785d < 2000, c10));
    }

    /* access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public C8972m<C> i(C c10, boolean z10) {
        synchronized (this.f64787f) {
            try {
                C8972m<C> mVar = new C8972m<>();
                if (z10) {
                    this.f64790i.b();
                    if (k()) {
                        g f10 = g.f();
                        f10.b("Enqueueing report: " + c10.d());
                        g f11 = g.f();
                        f11.b("Queue size: " + this.f64787f.size());
                        this.f64788g.execute(new b(c10, mVar));
                        g f12 = g.f();
                        f12.b("Closing task for report: " + c10.d());
                        mVar.e(c10);
                        return mVar;
                    }
                    h();
                    g f13 = g.f();
                    f13.b("Dropping report due to queue being full: " + c10.d());
                    this.f64790i.a();
                    mVar.e(c10);
                    return mVar;
                }
                p(c10, mVar);
                return mVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new d(this, countDownLatch)).start();
        e0.c(countDownLatch, 2, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, i<F> iVar, P p10) {
        this.f64782a = d10;
        this.f64783b = d11;
        this.f64784c = j10;
        this.f64789h = iVar;
        this.f64790i = p10;
        this.f64785d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f64786e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f64787f = arrayBlockingQueue;
        this.f64788g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f64791j = 0;
        this.f64792k = 0;
    }
}
