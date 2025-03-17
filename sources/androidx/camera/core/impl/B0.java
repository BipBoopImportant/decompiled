package androidx.camera.core.impl;

import H2.i;
import android.os.SystemClock;
import androidx.camera.core.impl.H0;
import androidx.concurrent.futures.c;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.C10101e;

public final class B0<T> implements H0<T> {

    /* renamed from: a  reason: collision with root package name */
    final K<b<T>> f16722a = new K<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<H0.a<? super T>, a<T>> f16723b = new HashMap();

    private static final class a<T> implements L<b<T>> {

        /* renamed from: a  reason: collision with root package name */
        final AtomicBoolean f16724a = new AtomicBoolean(true);

        /* renamed from: b  reason: collision with root package name */
        final H0.a<? super T> f16725b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f16726c;

        a(Executor executor, H0.a<? super T> aVar) {
            this.f16726c = executor;
            this.f16725b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(b bVar) {
            if (this.f16724a.get()) {
                if (bVar.a()) {
                    this.f16725b.a(bVar.d());
                    return;
                }
                i.g(bVar.c());
                this.f16725b.onError(bVar.c());
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f16724a.set(false);
        }

        /* renamed from: d */
        public void onChanged(b<T> bVar) {
            this.f16726c.execute(new A0(this, bVar));
        }
    }

    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f16727a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f16728b;

        private b(T t10, Throwable th2) {
            this.f16727a = t10;
            this.f16728b = th2;
        }

        static <T> b<T> b(T t10) {
            return new b<>(t10, (Throwable) null);
        }

        public boolean a() {
            return this.f16728b == null;
        }

        public Throwable c() {
            return this.f16728b;
        }

        public T d() {
            if (a()) {
                return this.f16727a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f16727a;
            } else {
                str = "Error: " + this.f16728b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(a aVar, a aVar2) {
        if (aVar != null) {
            this.f16722a.removeObserver(aVar);
        }
        this.f16722a.observeForever(aVar2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(c.a aVar) {
        b value = this.f16722a.getValue();
        if (value == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.a()) {
            aVar.c(value.d());
        } else {
            i.g(value.c());
            aVar.f(value.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object j(c.a aVar) {
        H.a.d().execute(new C5056x0(this, aVar));
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(a aVar) {
        this.f16722a.removeObserver(aVar);
    }

    public C10101e<T> a() {
        return c.a(new C5054w0(this));
    }

    public void c(Executor executor, H0.a<? super T> aVar) {
        synchronized (this.f16723b) {
            try {
                a aVar2 = this.f16723b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                a aVar3 = new a(executor, aVar);
                this.f16723b.put(aVar, aVar3);
                H.a.d().execute(new C5058y0(this, aVar2, aVar3));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(H0.a<? super T> aVar) {
        synchronized (this.f16723b) {
            try {
                a remove = this.f16723b.remove(aVar);
                if (remove != null) {
                    remove.b();
                    H.a.d().execute(new C5060z0(this, remove));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(T t10) {
        this.f16722a.postValue(b.b(t10));
    }
}
