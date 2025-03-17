package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ob.C10101e;

public final class c {

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f19993a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f19994b;

        /* renamed from: c  reason: collision with root package name */
        private f<Void> f19995c = f.O();

        /* renamed from: d  reason: collision with root package name */
        private boolean f19996d;

        a() {
        }

        private void e() {
            this.f19993a = null;
            this.f19994b = null;
            this.f19995c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            f<Void> fVar = this.f19995c;
            if (fVar != null) {
                fVar.a(runnable, executor);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f19993a = null;
            this.f19994b = null;
            this.f19995c.K(null);
        }

        public boolean c(T t10) {
            boolean z10 = true;
            this.f19996d = true;
            d<T> dVar = this.f19994b;
            if (dVar == null || !dVar.c(t10)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            boolean z10 = true;
            this.f19996d = true;
            d<T> dVar = this.f19994b;
            if (dVar == null || !dVar.b(true)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th2) {
            boolean z10 = true;
            this.f19996d = true;
            d<T> dVar = this.f19994b;
            if (dVar == null || !dVar.d(th2)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            f<Void> fVar;
            d<T> dVar = this.f19994b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19993a));
            }
            if (!this.f19996d && (fVar = this.f19995c) != null) {
                fVar.K(null);
            }
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    public interface C0320c<T> {
        Object a(a<T> aVar);
    }

    private static final class d<T> implements C10101e<T> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a<T>> f19997a;

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f19998b = new a();

        class a extends a<T> {
            a() {
            }

            /* access modifiers changed from: protected */
            public String H() {
                a aVar = d.this.f19997a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f19993a + "]";
            }
        }

        d(a<T> aVar) {
            this.f19997a = new WeakReference<>(aVar);
        }

        public void a(Runnable runnable, Executor executor) {
            this.f19998b.a(runnable, executor);
        }

        /* access modifiers changed from: package-private */
        public boolean b(boolean z10) {
            return this.f19998b.cancel(z10);
        }

        /* access modifiers changed from: package-private */
        public boolean c(T t10) {
            return this.f19998b.K(t10);
        }

        public boolean cancel(boolean z10) {
            a aVar = this.f19997a.get();
            boolean cancel = this.f19998b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        /* access modifiers changed from: package-private */
        public boolean d(Throwable th2) {
            return this.f19998b.L(th2);
        }

        public T get() {
            return this.f19998b.get();
        }

        public boolean isCancelled() {
            return this.f19998b.isCancelled();
        }

        public boolean isDone() {
            return this.f19998b.isDone();
        }

        public String toString() {
            return this.f19998b.toString();
        }

        public T get(long j10, TimeUnit timeUnit) {
            return this.f19998b.get(j10, timeUnit);
        }
    }

    public static <T> C10101e<T> a(C0320c<T> cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f19994b = dVar;
        aVar.f19993a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f19993a = a10;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
