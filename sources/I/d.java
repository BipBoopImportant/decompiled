package I;

import H2.i;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ob.C10101e;
import q.C5759a;

public class d<V> implements C10101e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final C10101e<V> f7076a;

    /* renamed from: b  reason: collision with root package name */
    c.a<V> f7077b;

    class a implements c.C0320c<V> {
        a() {
        }

        public Object a(c.a<V> aVar) {
            i.j(d.this.f7077b == null, "The result can only set once!");
            d.this.f7077b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(C10101e<V> eVar) {
        this.f7076a = (C10101e) i.g(eVar);
    }

    public static <V> d<V> b(C10101e<V> eVar) {
        return eVar instanceof d ? (d) eVar : new d<>(eVar);
    }

    public void a(Runnable runnable, Executor executor) {
        this.f7076a.a(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public boolean c(V v10) {
        c.a<V> aVar = this.f7077b;
        if (aVar != null) {
            return aVar.c(v10);
        }
        return false;
    }

    public boolean cancel(boolean z10) {
        return this.f7076a.cancel(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Throwable th2) {
        c.a<V> aVar = this.f7077b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    public final <T> d<T> e(C5759a<? super V, T> aVar, Executor executor) {
        return (d) n.G(this, aVar, executor);
    }

    public final <T> d<T> f(a<? super V, T> aVar, Executor executor) {
        return (d) n.H(this, aVar, executor);
    }

    public V get() {
        return this.f7076a.get();
    }

    public boolean isCancelled() {
        return this.f7076a.isCancelled();
    }

    public boolean isDone() {
        return this.f7076a.isDone();
    }

    public V get(long j10, TimeUnit timeUnit) {
        return this.f7076a.get(j10, timeUnit);
    }

    d() {
        this.f7076a = c.a(new a());
    }
}
