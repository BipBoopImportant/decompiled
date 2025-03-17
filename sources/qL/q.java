package QL;

import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15787f;
import GK.C15805x;
import WK.C16770e;
import WK.C16772g;
import WK.C16780o;
import WK.N;
import WK.y;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;

final class q<T> implements C16361d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final w f137786a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f137787b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f137788c;

    /* renamed from: d  reason: collision with root package name */
    private final C15786e.a f137789d;

    /* renamed from: e  reason: collision with root package name */
    private final h<C15777E, T> f137790e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f137791f;

    /* renamed from: g  reason: collision with root package name */
    private C15786e f137792g;

    /* renamed from: h  reason: collision with root package name */
    private Throwable f137793h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f137794i;

    class a implements C15787f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137795a;

        a(f fVar) {
            this.f137795a = fVar;
        }

        private void a(Throwable th2) {
            try {
                this.f137795a.a(q.this, th2);
            } catch (Throwable th3) {
                C16357C.t(th3);
                th3.printStackTrace();
            }
        }

        public void c(C15786e eVar, IOException iOException) {
            a(iOException);
        }

        public void e(C15786e eVar, C15776D d10) {
            try {
                try {
                    this.f137795a.b(q.this, q.this.d(d10));
                } catch (Throwable th2) {
                    C16357C.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                C16357C.t(th3);
                a(th3);
            }
        }
    }

    static final class b extends C15777E {

        /* renamed from: c  reason: collision with root package name */
        private final C15777E f137797c;

        /* renamed from: d  reason: collision with root package name */
        private final C16772g f137798d;

        /* renamed from: e  reason: collision with root package name */
        IOException f137799e;

        class a extends C16780o {
            a(N n10) {
                super(n10);
            }

            public long u0(C16770e eVar, long j10) {
                try {
                    return super.u0(eVar, j10);
                } catch (IOException e10) {
                    b.this.f137799e = e10;
                    throw e10;
                }
            }
        }

        b(C15777E e10) {
            this.f137797c = e10;
            this.f137798d = y.d(new a(e10.k3()));
        }

        public void close() {
            this.f137797c.close();
        }

        public long g() {
            return this.f137797c.g();
        }

        public C15805x h() {
            return this.f137797c.h();
        }

        public C16772g k3() {
            return this.f137798d;
        }

        /* access modifiers changed from: package-private */
        public void n() {
            IOException iOException = this.f137799e;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class c extends C15777E {

        /* renamed from: c  reason: collision with root package name */
        private final C15805x f137801c;

        /* renamed from: d  reason: collision with root package name */
        private final long f137802d;

        c(C15805x xVar, long j10) {
            this.f137801c = xVar;
            this.f137802d = j10;
        }

        public long g() {
            return this.f137802d;
        }

        public C15805x h() {
            return this.f137801c;
        }

        public C16772g k3() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    q(w wVar, Object obj, Object[] objArr, C15786e.a aVar, h<C15777E, T> hVar) {
        this.f137786a = wVar;
        this.f137787b = obj;
        this.f137788c = objArr;
        this.f137789d = aVar;
        this.f137790e = hVar;
    }

    private C15786e b() {
        C15786e b10 = this.f137789d.b(this.f137786a.a(this.f137787b, this.f137788c));
        if (b10 != null) {
            return b10;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private C15786e c() {
        C15786e eVar = this.f137792g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.f137793h;
        if (th2 == null) {
            try {
                C15786e b10 = b();
                this.f137792g = b10;
                return b10;
            } catch (IOException | Error | RuntimeException e10) {
                C16357C.t(e10);
                this.f137793h = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    public void E0(f<T> fVar) {
        C15786e eVar;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (!this.f137794i) {
                    this.f137794i = true;
                    eVar = this.f137792g;
                    th2 = this.f137793h;
                    if (eVar == null && th2 == null) {
                        C15786e b10 = b();
                        this.f137792g = b10;
                        eVar = b10;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th2 != null) {
            fVar.a(this, th2);
            return;
        }
        if (this.f137791f) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new a(fVar));
    }

    public boolean J() {
        boolean z10 = true;
        if (this.f137791f) {
            return true;
        }
        synchronized (this) {
            try {
                C15786e eVar = this.f137792g;
                if (eVar == null || !eVar.J()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* renamed from: a */
    public q<T> clone() {
        return new q(this.f137786a, this.f137787b, this.f137788c, this.f137789d, this.f137790e);
    }

    public void cancel() {
        C15786e eVar;
        this.f137791f = true;
        synchronized (this) {
            eVar = this.f137792g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public x<T> d(C15776D d10) {
        C15777E c10 = d10.c();
        C15776D c11 = d10.u().b(new c(c10.h(), c10.g())).c();
        int g10 = c11.g();
        if (g10 < 200 || g10 >= 300) {
            try {
                return x.c(C16357C.a(c10), c11);
            } finally {
                c10.close();
            }
        } else if (g10 == 204 || g10 == 205) {
            c10.close();
            return x.g(null, c11);
        } else {
            b bVar = new b(c10);
            try {
                return x.g(this.f137790e.a(bVar), c11);
            } catch (RuntimeException e10) {
                bVar.n();
                throw e10;
            }
        }
    }

    public synchronized C15774B t() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().t();
    }
}
