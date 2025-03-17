package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f46234a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n<?>> f46235b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f46236c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f46237d;

    /* renamed from: e  reason: collision with root package name */
    private final b f46238e;

    /* renamed from: f  reason: collision with root package name */
    private final h f46239f;

    /* renamed from: g  reason: collision with root package name */
    private final q f46240g;

    /* renamed from: h  reason: collision with root package name */
    private final i[] f46241h;

    /* renamed from: i  reason: collision with root package name */
    private c f46242i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f46243j;

    /* renamed from: k  reason: collision with root package name */
    private final List<a> f46244k;

    public interface a {
        void a(n<?> nVar, int i10);
    }

    @Deprecated
    public interface b<T> {
        void a(n<T> nVar);
    }

    public o(b bVar, h hVar, int i10, q qVar) {
        this.f46234a = new AtomicInteger();
        this.f46235b = new HashSet();
        this.f46236c = new PriorityBlockingQueue<>();
        this.f46237d = new PriorityBlockingQueue<>();
        this.f46243j = new ArrayList();
        this.f46244k = new ArrayList();
        this.f46238e = bVar;
        this.f46239f = hVar;
        this.f46241h = new i[i10];
        this.f46240g = qVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.setRequestQueue(this);
        synchronized (this.f46235b) {
            this.f46235b.add(nVar);
        }
        nVar.setSequence(d());
        nVar.addMarker("add-to-queue");
        e(nVar, 0);
        b(nVar);
        return nVar;
    }

    /* access modifiers changed from: package-private */
    public <T> void b(n<T> nVar) {
        if (!nVar.shouldCache()) {
            f(nVar);
        } else {
            this.f46236c.add(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void c(n<T> nVar) {
        synchronized (this.f46235b) {
            this.f46235b.remove(nVar);
        }
        synchronized (this.f46243j) {
            try {
                for (b a10 : this.f46243j) {
                    a10.a(nVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        e(nVar, 5);
    }

    public int d() {
        return this.f46234a.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public void e(n<?> nVar, int i10) {
        synchronized (this.f46244k) {
            try {
                for (a a10 : this.f46244k) {
                    a10.a(nVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void f(n<T> nVar) {
        this.f46237d.add(nVar);
    }

    public void g() {
        h();
        c cVar = new c(this.f46236c, this.f46237d, this.f46238e, this.f46240g);
        this.f46242i = cVar;
        cVar.start();
        for (int i10 = 0; i10 < this.f46241h.length; i10++) {
            i iVar = new i(this.f46237d, this.f46239f, this.f46238e, this.f46240g);
            this.f46241h[i10] = iVar;
            iVar.start();
        }
    }

    public void h() {
        c cVar = this.f46242i;
        if (cVar != null) {
            cVar.d();
        }
        for (i iVar : this.f46241h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }

    public o(b bVar, h hVar, int i10) {
        this(bVar, hVar, i10, new f(new Handler(Looper.getMainLooper())));
    }

    public o(b bVar, h hVar) {
        this(bVar, hVar, 4);
    }
}
