package com.airbnb.lottie;

import I6.d;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import w6.C8917A;
import w6.C8918B;
import w6.w;

public class p<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f46177e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    private final Set<w<T>> f46178a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<w<Throwable>> f46179b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f46180c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C8917A<T> f46181d;

    private class a extends FutureTask<C8917A<T>> {
        a(Callable<C8917A<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    p.this.k((C8917A) get());
                } catch (InterruptedException | ExecutionException e10) {
                    p.this.k(new C8917A(e10));
                }
            }
        }
    }

    public p(Callable<C8917A<T>> callable) {
        this(callable, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        C8917A<T> a10 = this.f46181d;
        if (a10 != null) {
            if (a10.b() != null) {
                h(a10.b());
            } else {
                f(a10.a());
            }
        }
    }

    private synchronized void f(Throwable th2) {
        ArrayList<w> arrayList = new ArrayList<>(this.f46179b);
        if (arrayList.isEmpty()) {
            d.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (w onResult : arrayList) {
            onResult.onResult(th2);
        }
    }

    private void g() {
        this.f46180c.post(new C8918B(this));
    }

    private synchronized void h(T t10) {
        for (w onResult : new ArrayList(this.f46178a)) {
            onResult.onResult(t10);
        }
    }

    /* access modifiers changed from: private */
    public void k(C8917A<T> a10) {
        if (this.f46181d == null) {
            this.f46181d = a10;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized p<T> c(w<Throwable> wVar) {
        try {
            C8917A<T> a10 = this.f46181d;
            if (!(a10 == null || a10.a() == null)) {
                wVar.onResult(a10.a());
            }
            this.f46179b.add(wVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this;
    }

    public synchronized p<T> d(w<T> wVar) {
        try {
            C8917A<T> a10 = this.f46181d;
            if (!(a10 == null || a10.b() == null)) {
                wVar.onResult(a10.b());
            }
            this.f46178a.add(wVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this;
    }

    public synchronized p<T> i(w<Throwable> wVar) {
        this.f46179b.remove(wVar);
        return this;
    }

    public synchronized p<T> j(w<T> wVar) {
        this.f46178a.remove(wVar);
        return this;
    }

    p(Callable<C8917A<T>> callable, boolean z10) {
        this.f46178a = new LinkedHashSet(1);
        this.f46179b = new LinkedHashSet(1);
        this.f46180c = new Handler(Looper.getMainLooper());
        this.f46181d = null;
        if (z10) {
            try {
                k(callable.call());
            } catch (Throwable th2) {
                k(new C8917A(th2));
            }
        } else {
            f46177e.execute(new a(callable));
        }
    }
}
