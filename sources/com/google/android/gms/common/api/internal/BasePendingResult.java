package com.google.android.gms.common.api.internal;

import H9.v0;
import K9.C6614l;
import K9.C6620s;
import aa.j;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends n> extends i<R> {

    /* renamed from: o  reason: collision with root package name */
    static final ThreadLocal f48016o = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f48017a;

    /* renamed from: b  reason: collision with root package name */
    protected final a f48018b;

    /* renamed from: c  reason: collision with root package name */
    protected final WeakReference f48019c;

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f48020d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f48021e;

    /* renamed from: f  reason: collision with root package name */
    private o f48022f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f48023g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n f48024h;

    /* renamed from: i  reason: collision with root package name */
    private Status f48025i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f48026j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f48027k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f48028l;

    /* renamed from: m  reason: collision with root package name */
    private C6614l f48029m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48030n;
    @KeepName
    private d resultGuardian;

    public static class a<R extends n> extends j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(o oVar, n nVar) {
            ThreadLocal threadLocal = BasePendingResult.f48016o;
            sendMessage(obtainMessage(1, new Pair((o) C6620s.l(oVar), nVar)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                o oVar = (o) pair.first;
                n nVar = (n) pair.second;
                try {
                    oVar.a(nVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.k(nVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            } else {
                ((BasePendingResult) message.obj).d(Status.f47986i);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f48017a = new Object();
        this.f48020d = new CountDownLatch(1);
        this.f48021e = new ArrayList();
        this.f48023g = new AtomicReference();
        this.f48030n = false;
        this.f48018b = new a(Looper.getMainLooper());
        this.f48019c = new WeakReference((Object) null);
    }

    private final n g() {
        n nVar;
        synchronized (this.f48017a) {
            C6620s.q(!this.f48026j, "Result has already been consumed.");
            C6620s.q(e(), "Result is not ready.");
            nVar = this.f48024h;
            this.f48024h = null;
            this.f48022f = null;
            this.f48026j = true;
        }
        if (((b) this.f48023g.getAndSet((Object) null)) == null) {
            return (n) C6620s.l(nVar);
        }
        throw null;
    }

    private final void h(n nVar) {
        this.f48024h = nVar;
        this.f48025i = nVar.i();
        this.f48029m = null;
        this.f48020d.countDown();
        if (this.f48027k) {
            this.f48022f = null;
        } else {
            o oVar = this.f48022f;
            if (oVar != null) {
                this.f48018b.removeMessages(2);
                this.f48018b.a(oVar, g());
            } else if (this.f48024h instanceof k) {
                this.resultGuardian = new d(this, (v0) null);
            }
        }
        ArrayList arrayList = this.f48021e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i.a) arrayList.get(i10)).a(this.f48025i);
        }
        this.f48021e.clear();
    }

    public static void k(n nVar) {
        if (nVar instanceof k) {
            try {
                ((k) nVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(nVar)), e10);
            }
        }
    }

    public final void a(i.a aVar) {
        C6620s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f48017a) {
            try {
                if (e()) {
                    aVar.a(this.f48025i);
                } else {
                    this.f48021e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R b(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            C6620s.k("await must not be called on the UI thread when time is greater than zero.");
        }
        C6620s.q(!this.f48026j, "Result has already been consumed.");
        C6620s.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f48020d.await(j10, timeUnit)) {
                d(Status.f47986i);
            }
        } catch (InterruptedException unused) {
            d(Status.f47984g);
        }
        C6620s.q(e(), "Result is not ready.");
        return g();
    }

    /* access modifiers changed from: protected */
    public abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f48017a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f48028l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return this.f48020d.getCount() == 0;
    }

    public final void f(R r10) {
        synchronized (this.f48017a) {
            try {
                if (this.f48028l || this.f48027k) {
                    k(r10);
                    return;
                }
                e();
                C6620s.q(!e(), "Results have already been set");
                C6620s.q(!this.f48026j, "Result has already been consumed");
                h(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        boolean z10 = true;
        if (!this.f48030n && !((Boolean) f48016o.get()).booleanValue()) {
            z10 = false;
        }
        this.f48030n = z10;
    }

    protected BasePendingResult(g gVar) {
        this.f48017a = new Object();
        this.f48020d = new CountDownLatch(1);
        this.f48021e = new ArrayList();
        this.f48023g = new AtomicReference();
        this.f48030n = false;
        this.f48018b = new a(gVar != null ? gVar.c() : Looper.getMainLooper());
        this.f48019c = new WeakReference(gVar);
    }
}
