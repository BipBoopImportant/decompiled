package com.bumptech.glide;

import E7.j;
import R7.b;
import R7.p;
import R7.q;
import R7.s;
import U7.f;
import U7.g;
import V7.d;
import V7.i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l implements ComponentCallbacks2, R7.l {

    /* renamed from: m  reason: collision with root package name */
    private static final g f46542m = ((g) g.v0(Bitmap.class).W());

    /* renamed from: n  reason: collision with root package name */
    private static final g f46543n = ((g) g.v0(P7.c.class).W());

    /* renamed from: o  reason: collision with root package name */
    private static final g f46544o = ((g) ((g) g.w0(j.f35109c).e0(g.LOW)).m0(true));

    /* renamed from: a  reason: collision with root package name */
    protected final b f46545a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f46546b;

    /* renamed from: c  reason: collision with root package name */
    final R7.j f46547c;

    /* renamed from: d  reason: collision with root package name */
    private final q f46548d;

    /* renamed from: e  reason: collision with root package name */
    private final p f46549e;

    /* renamed from: f  reason: collision with root package name */
    private final s f46550f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f46551g;

    /* renamed from: h  reason: collision with root package name */
    private final R7.b f46552h;

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList<f<Object>> f46553i;

    /* renamed from: j  reason: collision with root package name */
    private g f46554j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46555k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46556l;

    class a implements Runnable {
        a() {
        }

        public void run() {
            l lVar = l.this;
            lVar.f46547c.a(lVar);
        }
    }

    private static class b extends d<View, Object> {
        b(View view) {
            super(view);
        }

        public void j(Object obj, W7.d<? super Object> dVar) {
        }

        public void m(Drawable drawable) {
        }

        /* access modifiers changed from: protected */
        public void o(Drawable drawable) {
        }
    }

    private class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final q f46558a;

        c(q qVar) {
            this.f46558a = qVar;
        }

        public void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    this.f46558a.e();
                }
            }
        }
    }

    public l(b bVar, R7.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private void D(i<?> iVar) {
        boolean C10 = C(iVar);
        U7.d b10 = iVar.b();
        if (!C10 && !this.f46545a.p(iVar) && b10 != null) {
            iVar.i((U7.d) null);
            b10.clear();
        }
    }

    private synchronized void q() {
        try {
            for (i<?> o10 : this.f46550f.d()) {
                o(o10);
            }
            this.f46550f.a();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void A(g gVar) {
        this.f46554j = (g) ((g) gVar.clone()).b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void B(i<?> iVar, U7.d dVar) {
        this.f46550f.n(iVar);
        this.f46548d.g(dVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean C(i<?> iVar) {
        U7.d b10 = iVar.b();
        if (b10 == null) {
            return true;
        }
        if (!this.f46548d.a(b10)) {
            return false;
        }
        this.f46550f.o(iVar);
        iVar.i((U7.d) null);
        return true;
    }

    public <ResourceType> k<ResourceType> a(Class<ResourceType> cls) {
        return new k<>(this.f46545a, this, cls, this.f46546b);
    }

    public k<Bitmap> d() {
        return a(Bitmap.class).a(f46542m);
    }

    public synchronized void g() {
        try {
            this.f46550f.g();
            if (this.f46556l) {
                q();
            } else {
                y();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void k() {
        z();
        this.f46550f.k();
    }

    public synchronized void l() {
        this.f46550f.l();
        q();
        this.f46548d.b();
        this.f46547c.b(this);
        this.f46547c.b(this.f46552h);
        Y7.l.w(this.f46551g);
        this.f46545a.s(this);
    }

    public k<Drawable> n() {
        return a(Drawable.class);
    }

    public void o(i<?> iVar) {
        if (iVar != null) {
            D(iVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f46555k) {
            x();
        }
    }

    public void p(View view) {
        o(new b(view));
    }

    /* access modifiers changed from: package-private */
    public List<f<Object>> r() {
        return this.f46553i;
    }

    /* access modifiers changed from: package-private */
    public synchronized g s() {
        return this.f46554j;
    }

    /* access modifiers changed from: package-private */
    public <T> m<?, T> t(Class<T> cls) {
        return this.f46545a.i().e(cls);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f46548d + ", treeNode=" + this.f46549e + "}";
    }

    public k<Drawable> u(Integer num) {
        return n().K0(num);
    }

    public k<Drawable> v(Object obj) {
        return n().L0(obj);
    }

    public synchronized void w() {
        this.f46548d.c();
    }

    public synchronized void x() {
        w();
        for (l w10 : this.f46549e.a()) {
            w10.w();
        }
    }

    public synchronized void y() {
        this.f46548d.d();
    }

    public synchronized void z() {
        this.f46548d.f();
    }

    l(b bVar, R7.j jVar, p pVar, q qVar, R7.c cVar, Context context) {
        this.f46550f = new s();
        a aVar = new a();
        this.f46551g = aVar;
        this.f46545a = bVar;
        this.f46547c = jVar;
        this.f46549e = pVar;
        this.f46548d = qVar;
        this.f46546b = context;
        R7.b a10 = cVar.a(context.getApplicationContext(), new c(qVar));
        this.f46552h = a10;
        bVar.o(this);
        if (Y7.l.r()) {
            Y7.l.v(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(a10);
        this.f46553i = new CopyOnWriteArrayList<>(bVar.i().c());
        A(bVar.i().d());
    }
}
