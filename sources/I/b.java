package I;

import H2.i;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ob.C10101e;

class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private a<? super I, ? extends O> f7069c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Boolean> f7070d = new LinkedBlockingQueue(1);

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f7071e = new CountDownLatch(1);

    /* renamed from: f  reason: collision with root package name */
    private C10101e<? extends I> f7072f;

    /* renamed from: g  reason: collision with root package name */
    volatile C10101e<? extends O> f7073g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10101e f7074a;

        a(C10101e eVar) {
            this.f7074a = eVar;
        }

        public void run() {
            try {
                b.this.c(n.m(this.f7074a));
            } catch (CancellationException unused) {
                b.this.cancel(false);
                b.this.f7073g = null;
                return;
            } catch (ExecutionException e10) {
                b.this.d(e10.getCause());
            } catch (Throwable th2) {
                b.this.f7073g = null;
                throw th2;
            }
            b.this.f7073g = null;
        }
    }

    b(a<? super I, ? extends O> aVar, C10101e<? extends I> eVar) {
        this.f7069c = (a) i.g(aVar);
        this.f7072f = (C10101e) i.g(eVar);
    }

    private void g(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    private <E> void h(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
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
    }

    private <E> E i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        h(this.f7070d, Boolean.valueOf(z10));
        g(this.f7072f, z10);
        g(this.f7073g, z10);
        return true;
    }

    public O get() {
        if (!isDone()) {
            C10101e<? extends I> eVar = this.f7072f;
            if (eVar != null) {
                eVar.get();
            }
            this.f7071e.await();
            C10101e<? extends O> eVar2 = this.f7073g;
            if (eVar2 != null) {
                eVar2.get();
            }
        }
        return super.get();
    }

    public void run() {
        try {
            try {
                C10101e<? extends O> apply = this.f7069c.apply(n.m(this.f7072f));
                this.f7073g = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) i(this.f7070d)).booleanValue());
                    this.f7073g = null;
                    this.f7069c = null;
                    this.f7072f = null;
                    this.f7071e.countDown();
                    return;
                }
                apply.a(new a(apply), H.a.a());
                this.f7069c = null;
                this.f7072f = null;
                this.f7071e.countDown();
            } catch (UndeclaredThrowableException e10) {
                d(e10.getCause());
            } catch (Exception e11) {
                d(e11);
            } catch (Error e12) {
                d(e12);
            } catch (Throwable th2) {
                this.f7069c = null;
                this.f7072f = null;
                this.f7071e.countDown();
                throw th2;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e13) {
            d(e13.getCause());
        }
    }

    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            C10101e<? extends I> eVar = this.f7072f;
            if (eVar != null) {
                long nanoTime = System.nanoTime();
                eVar.get(j10, timeUnit);
                j10 -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f7071e.await(j10, timeUnit)) {
                j10 -= Math.max(0, System.nanoTime() - nanoTime2);
                C10101e<? extends O> eVar2 = this.f7073g;
                if (eVar2 != null) {
                    eVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j10, timeUnit);
    }
}
