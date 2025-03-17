package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledFuture<?> f68224h;

    class a implements b<V> {
        a() {
        }

        public void a(Throwable th2) {
            boolean unused = p.this.L(th2);
        }

        public void set(V v10) {
            boolean unused = p.this.K(v10);
        }
    }

    interface b<T> {
        void a(Throwable th2);

        void set(T t10);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f68224h = cVar.a(new a());
    }

    /* renamed from: Q */
    public int compareTo(Delayed delayed) {
        return this.f68224h.compareTo(delayed);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f68224h.getDelay(timeUnit);
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f68224h.cancel(N());
    }
}
