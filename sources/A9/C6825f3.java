package a9;

import D8.c;
import XH.t;
import android.os.SystemClock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.f3  reason: case insensitive filesystem */
public final class C6825f3<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final c f42554f = new c("DeferredResult");

    /* renamed from: a  reason: collision with root package name */
    public final E2 f42555a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42556b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayBlockingQueue<a<T>> f42557c = new ArrayBlockingQueue<>(1, true);

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f42558d;

    /* renamed from: e  reason: collision with root package name */
    public final Condition f42559e;

    /* renamed from: a9.f3$a */
    public static abstract class a<T> {

        /* renamed from: a9.f3$a$a  reason: collision with other inner class name */
        public static final class C0744a<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final String f42560a;

            public C0744a(String str) {
                C17542s.j(str, "message");
                this.f42560a = str;
            }
        }

        /* renamed from: a9.f3$a$b */
        public static final class b<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final T f42561a;

            public b(T t10) {
                this.f42561a = t10;
            }
        }
    }

    public C6825f3() {
        E2 e22 = new E2();
        c cVar = f42554f;
        C17542s.j(e22, "systemClockInstantiable");
        C17542s.j(cVar, "logger");
        this.f42555a = e22;
        this.f42556b = cVar;
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f42558d = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C17542s.i(newCondition, "lock.newCondition()");
        this.f42559e = newCondition;
    }

    public final Object a() {
        T t10;
        this.f42558d.lock();
        try {
            this.f42555a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime + 1000;
            while (this.f42557c.peek() == null && elapsedRealtime <= j10) {
                this.f42559e.await(j10 - elapsedRealtime, TimeUnit.MILLISECONDS);
                this.f42555a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            a peek = this.f42557c.peek();
            if (peek instanceof a.b) {
                t10 = ((a.b) peek).f42561a;
            } else {
                if (peek instanceof a.C0744a) {
                    this.f42556b.l(((a.C0744a) peek).f42560a);
                } else if (peek == null) {
                    c cVar = this.f42556b;
                    cVar.l("Operation timed out: no result has been set within " + 1000 + "ms");
                } else {
                    throw new t();
                }
                t10 = null;
            }
            this.f42558d.unlock();
            return t10;
        } catch (InterruptedException e10) {
            this.f42556b.i(e10, "await has been interrupted");
        } catch (Throwable th2) {
            this.f42558d.unlock();
            throw th2;
        }
    }

    public final void b(T t10) {
        this.f42558d.lock();
        try {
            if (this.f42557c.offer(new a.b(t10))) {
                this.f42559e.signal();
            }
        } finally {
            this.f42558d.unlock();
        }
    }

    public final void c(String str) {
        C17542s.j(str, "message");
        this.f42558d.lock();
        try {
            if (this.f42557c.offer(new a.C0744a(str))) {
                this.f42559e.signal();
            }
        } finally {
            this.f42558d.unlock();
        }
    }
}
