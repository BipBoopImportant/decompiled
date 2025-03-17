package J3;

import K3.C6579a;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import t3.C5950a;
import t3.I;
import t3.N;
import t3.q;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final c f37300d = g(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f37301e = g(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f37302f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f37303g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6579a f37304a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f37305b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f37306c;

    public interface b<T extends e> {
        void h(T t10, long j10, long j11, int i10) {
        }

        void k(T t10, long j10, long j11);

        c q(T t10, long j10, long j11, IOException iOException, int i10);

        void v(T t10, long j10, long j11, boolean z10);
    }

    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f37307a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f37308b;

        public boolean c() {
            int i10 = this.f37307a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f37307a = i10;
            this.f37308b = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f37309a;

        /* renamed from: b  reason: collision with root package name */
        private final T f37310b;

        /* renamed from: c  reason: collision with root package name */
        private final long f37311c;

        /* renamed from: d  reason: collision with root package name */
        private b<T> f37312d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f37313e;

        /* renamed from: f  reason: collision with root package name */
        private int f37314f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f37315g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f37316h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f37317i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f37310b = t10;
            this.f37312d = bVar;
            this.f37309a = i10;
            this.f37311c = j10;
        }

        private void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((b) C5950a.e(this.f37312d)).h(this.f37310b, elapsedRealtime, elapsedRealtime - this.f37311c, this.f37314f);
            this.f37313e = null;
            l.this.f37304a.execute((Runnable) C5950a.e(l.this.f37305b));
        }

        private void c() {
            d unused = l.this.f37305b = null;
        }

        private long d() {
            return (long) Math.min((this.f37314f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f37317i = z10;
            this.f37313e = null;
            if (hasMessages(1)) {
                this.f37316h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f37316h = true;
                        this.f37310b.c();
                        Thread thread = this.f37315g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C5950a.e(this.f37312d)).v(this.f37310b, elapsedRealtime, elapsedRealtime - this.f37311c, true);
                this.f37312d = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f37313e;
            if (iOException != null && this.f37314f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            C5950a.g(l.this.f37305b == null);
            d unused = l.this.f37305b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            if (!this.f37317i) {
                int i10 = message.what;
                if (i10 == 1) {
                    b();
                } else if (i10 != 4) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = elapsedRealtime - this.f37311c;
                    b bVar = (b) C5950a.e(this.f37312d);
                    if (this.f37316h) {
                        bVar.v(this.f37310b, elapsedRealtime, j10, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 2) {
                        try {
                            bVar.k(this.f37310b, elapsedRealtime, j10);
                        } catch (RuntimeException e10) {
                            q.d("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = l.this.f37306c = new h(e10);
                        }
                    } else if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f37313e = iOException;
                        int i12 = this.f37314f + 1;
                        this.f37314f = i12;
                        c q10 = bVar.q(this.f37310b, elapsedRealtime, j10, iOException, i12);
                        if (q10.f37307a == 3) {
                            IOException unused2 = l.this.f37306c = this.f37313e;
                        } else if (q10.f37307a != 2) {
                            if (q10.f37307a == 1) {
                                this.f37314f = 1;
                            }
                            f(q10.f37308b != -9223372036854775807L ? q10.f37308b : d());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f37316h;
                    this.f37315g = Thread.currentThread();
                }
                if (!z10) {
                    I.a("load:" + this.f37310b.getClass().getSimpleName());
                    this.f37310b.b();
                    I.b();
                }
                synchronized (this) {
                    this.f37315g = null;
                    Thread.interrupted();
                }
                if (!this.f37317i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e10) {
                if (!this.f37317i) {
                    obtainMessage(3, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f37317i) {
                    q.d("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(3, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f37317i) {
                    q.d("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(3, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f37317i) {
                    q.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th2) {
                I.b();
                throw th2;
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void m();
    }

    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f37319a;

        public g(f fVar) {
            this.f37319a = fVar;
        }

        public void run() {
            this.f37319a.m();
        }
    }

    public static final class h extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L_0x0031
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x0033
            L_0x0031:
                java.lang.String r1 = ""
            L_0x0033:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: J3.l.h.<init>(java.lang.Throwable):void");
        }
    }

    public l(String str) {
        this(C6579a.o0(N.Q0("ExoPlayer:Loader:" + str), new k()));
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) C5950a.i(this.f37305b)).a(false);
    }

    public void f() {
        this.f37306c = null;
    }

    public boolean h() {
        return this.f37306c != null;
    }

    public boolean i() {
        return this.f37305b != null;
    }

    public void j() {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) {
        IOException iOException = this.f37306c;
        if (iOException == null) {
            d<? extends e> dVar = this.f37305b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f37309a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m((f) null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f37305b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f37304a.execute(new g(fVar));
        }
        this.f37304a.release();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f37306c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) C5950a.i(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }

    public l(C6579a aVar) {
        this.f37304a = aVar;
    }
}
