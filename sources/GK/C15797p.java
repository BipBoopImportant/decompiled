package GK;

import HK.C15864d;
import LK.e;
import XH.C16807N;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a8F@FX\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8F@FX\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010!R.\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8F@FX\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u001e\u00103\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u001e\u00104\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0011\u00107\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b'\u00106¨\u00068"}, d2 = {"LGK/p;", "", "<init>", "()V", "", "host", "LLK/e$a;", "LLK/e;", "d", "(Ljava/lang/String;)LLK/e$a;", "", "h", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "LXH/N;", "e", "(Ljava/util/Deque;Ljava/lang/Object;)V", "a", "(LLK/e$a;)V", "b", "(LLK/e;)V", "f", "g", "", "i", "()I", "maxRequests", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "j", "Ljava/lang/Runnable;", "<set-?>", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.p  reason: case insensitive filesystem */
public final class C15797p {

    /* renamed from: a  reason: collision with root package name */
    private int f135079a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f135080b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f135081c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f135082d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<e.a> f135083e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<e.a> f135084f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<e> f135085g = new ArrayDeque<>();

    private final e.a d(String str) {
        Iterator<e.a> it = this.f135084f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (C17542s.e(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f135083e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (C17542s.e(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f135081c;
                C16807N n10 = C16807N.f139792a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!h() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator<e.a> it = this.f135083e.iterator();
                    C17542s.i(it, "readyAsyncCalls.iterator()");
                    while (it.hasNext()) {
                        e.a next = it.next();
                        if (this.f135084f.size() >= this.f135079a) {
                            break;
                        } else if (next.c().get() < this.f135080b) {
                            it.remove();
                            next.c().incrementAndGet();
                            C17542s.i(next, "asyncCall");
                            arrayList.add(next);
                            this.f135084f.add(next);
                        }
                    }
                    z10 = i() > 0;
                    C16807N n10 = C16807N.f139792a;
                } finally {
                }
            }
            int size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                ((e.a) arrayList.get(i10)).a(c());
            }
            return z10;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void a(e.a aVar) {
        e.a d10;
        C17542s.j(aVar, "call");
        synchronized (this) {
            try {
                this.f135083e.add(aVar);
                if (!aVar.b().p() && (d10 = d(aVar.d())) != null) {
                    aVar.e(d10);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h();
    }

    public final synchronized void b(e eVar) {
        C17542s.j(eVar, "call");
        this.f135085g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f135082d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.f135082d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, C15864d.O(C15864d.f135364i + " Dispatcher", false));
            }
            executorService = this.f135082d;
            C17542s.g(executorService);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return executorService;
    }

    public final void f(e.a aVar) {
        C17542s.j(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f135084f, aVar);
    }

    public final void g(e eVar) {
        C17542s.j(eVar, "call");
        e(this.f135085g, eVar);
    }

    public final synchronized int i() {
        return this.f135084f.size() + this.f135085g.size();
    }

    public final void j(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f135080b = i10;
                C16807N n10 = C16807N.f139792a;
            }
            h();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i10).toString());
    }
}
