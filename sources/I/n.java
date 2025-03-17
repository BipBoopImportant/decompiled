package I;

import H2.i;
import I.o;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ob.C10101e;
import q.C5759a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final C5759a<?, ?> f7099a = new b();

    class a implements a<I, O> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5759a f7100a;

        a(C5759a aVar) {
            this.f7100a = aVar;
        }

        public C10101e<O> apply(I i10) {
            return n.p(this.f7100a.apply(i10));
        }
    }

    class b implements C5759a<Object, Object> {
        b() {
        }

        public Object apply(Object obj) {
            return obj;
        }
    }

    class c implements c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f7101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5759a f7102b;

        c(c.a aVar, C5759a aVar2) {
            this.f7101a = aVar;
            this.f7102b = aVar2;
        }

        public void a(I i10) {
            try {
                this.f7101a.c(this.f7102b.apply(i10));
            } catch (Throwable th2) {
                this.f7101a.f(th2);
            }
        }

        public void b(Throwable th2) {
            this.f7101a.f(th2);
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10101e f7103a;

        d(C10101e eVar) {
            this.f7103a = eVar;
        }

        public void run() {
            this.f7103a.cancel(true);
        }
    }

    private static final class e<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future<V> f7104a;

        /* renamed from: b  reason: collision with root package name */
        final c<? super V> f7105b;

        e(Future<V> future, c<? super V> cVar) {
            this.f7104a = future;
            this.f7105b = cVar;
        }

        public void run() {
            try {
                this.f7105b.a(n.l(this.f7104a));
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    this.f7105b.b(e10);
                } else {
                    this.f7105b.b(cause);
                }
            } catch (Error | RuntimeException e11) {
                this.f7105b.b(e11);
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f7105b;
        }
    }

    public static <V> C10101e<V> A(long j10, ScheduledExecutorService scheduledExecutorService, C10101e<V> eVar) {
        return androidx.concurrent.futures.c.a(new e(eVar, scheduledExecutorService, j10));
    }

    public static <V> C10101e<V> B(C10101e<V> eVar) {
        i.g(eVar);
        return eVar.isDone() ? eVar : androidx.concurrent.futures.c.a(new m(eVar));
    }

    public static <V> void C(C10101e<V> eVar, c.a<V> aVar) {
        D(eVar, f7099a, aVar, H.a.a());
    }

    public static <I, O> void D(C10101e<I> eVar, C5759a<? super I, ? extends O> aVar, c.a<O> aVar2, Executor executor) {
        E(true, eVar, aVar, aVar2, executor);
    }

    /* access modifiers changed from: private */
    public static <I, O> void E(boolean z10, C10101e<I> eVar, C5759a<? super I, ? extends O> aVar, c.a<O> aVar2, Executor executor) {
        i.g(eVar);
        i.g(aVar);
        i.g(aVar2);
        i.g(executor);
        j(eVar, new c(aVar2, aVar), executor);
        if (z10) {
            aVar2.a(new d(eVar), H.a.a());
        }
    }

    public static <V> C10101e<List<V>> F(Collection<? extends C10101e<? extends V>> collection) {
        return new p(new ArrayList(collection), false, H.a.a());
    }

    public static <I, O> C10101e<O> G(C10101e<I> eVar, C5759a<? super I, ? extends O> aVar, Executor executor) {
        i.g(aVar);
        return H(eVar, new a(aVar), executor);
    }

    public static <I, O> C10101e<O> H(C10101e<I> eVar, a<? super I, ? extends O> aVar, Executor executor) {
        b bVar = new b(aVar, eVar);
        eVar.a(bVar, executor);
        return bVar;
    }

    public static <V> C10101e<Void> I(C10101e<V> eVar) {
        return androidx.concurrent.futures.c.a(new i(eVar));
    }

    public static <V> void j(C10101e<V> eVar, c<? super V> cVar, Executor executor) {
        i.g(cVar);
        eVar.a(new e(eVar, cVar), executor);
    }

    public static <V> C10101e<List<V>> k(Collection<? extends C10101e<? extends V>> collection) {
        return new p(new ArrayList(collection), true, H.a.a());
    }

    public static <V> V l(Future<V> future) {
        boolean isDone = future.isDone();
        i.j(isDone, "Future was expected to be done, " + future);
        return m(future);
    }

    public static <V> V m(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <V> C10101e<V> n(Throwable th2) {
        return new o.a(th2);
    }

    public static <V> ScheduledFuture<V> o(Throwable th2) {
        return new o.b(th2);
    }

    public static <V> C10101e<V> p(V v10) {
        return v10 == null ? o.b() : new o.c(v10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object s(C10101e eVar, ScheduledExecutorService scheduledExecutorService, long j10, c.a aVar) {
        C(eVar, aVar);
        if (!eVar.isDone()) {
            eVar.a(new h(scheduledExecutorService.schedule(new g(aVar, eVar, j10), j10, TimeUnit.MILLISECONDS)), H.a.a());
        }
        return "TimeoutFuture[" + eVar + "]";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(c.a aVar, Object obj, boolean z10, C10101e eVar) {
        aVar.c(obj);
        if (z10) {
            eVar.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object v(C10101e eVar, ScheduledExecutorService scheduledExecutorService, Object obj, boolean z10, long j10, c.a aVar) {
        C(eVar, aVar);
        if (!eVar.isDone()) {
            eVar.a(new k(scheduledExecutorService.schedule(new j(aVar, obj, z10, eVar), j10, TimeUnit.MILLISECONDS)), H.a.a());
        }
        return "TimeoutFuture[" + eVar + "]";
    }

    public static <V> C10101e<V> z(long j10, ScheduledExecutorService scheduledExecutorService, V v10, boolean z10, C10101e<V> eVar) {
        return androidx.concurrent.futures.c.a(new f(eVar, scheduledExecutorService, v10, z10, j10));
    }
}
