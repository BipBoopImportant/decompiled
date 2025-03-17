package ob;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import jb.h;
import jb.l;
import pb.C10130a;
import pb.C10131b;

/* renamed from: ob.c  reason: case insensitive filesystem */
public final class C10099c extends C10100d {

    /* renamed from: ob.c$a */
    private static final class a<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future<V> f75676a;

        /* renamed from: b  reason: collision with root package name */
        final C10098b<? super V> f75677b;

        a(Future<V> future, C10098b<? super V> bVar) {
            this.f75676a = future;
            this.f75677b = bVar;
        }

        public void run() {
            Throwable a10;
            Future<V> future = this.f75676a;
            if (!(future instanceof C10130a) || (a10 = C10131b.a((C10130a) future)) == null) {
                try {
                    this.f75677b.a(C10099c.b(this.f75676a));
                } catch (ExecutionException e10) {
                    this.f75677b.b(e10.getCause());
                } catch (Throwable th2) {
                    this.f75677b.b(th2);
                }
            } else {
                this.f75677b.b(a10);
            }
        }

        public String toString() {
            return h.b(this).c(this.f75677b).toString();
        }
    }

    public static <V> void a(C10101e<V> eVar, C10098b<? super V> bVar, Executor executor) {
        l.j(bVar);
        eVar.a(new a(eVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        l.q(future.isDone(), "Future was expected to be done: %s", future);
        return g.a(future);
    }
}
