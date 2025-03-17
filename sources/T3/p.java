package t3;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import q3.C5806q;

public final class p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C5953d f29525a;

    /* renamed from: b  reason: collision with root package name */
    private final C5962m f29526b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f29527c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f29528d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f29529e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f29530f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f29531g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29532h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29533i;

    public interface a<T> {
        void invoke(T t10);
    }

    public interface b<T> {
        void a(T t10, C5806q qVar);
    }

    private static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f29534a;

        /* renamed from: b  reason: collision with root package name */
        private C5806q.b f29535b = new C5806q.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f29536c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29537d;

        public c(T t10) {
            this.f29534a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (!this.f29537d) {
                if (i10 != -1) {
                    this.f29535b.a(i10);
                }
                this.f29536c = true;
                aVar.invoke(this.f29534a);
            }
        }

        public void b(b<T> bVar) {
            if (!this.f29537d && this.f29536c) {
                C5806q e10 = this.f29535b.e();
                this.f29535b = new C5806q.b();
                this.f29536c = false;
                bVar.a(this.f29534a, e10);
            }
        }

        public void c(b<T> bVar) {
            this.f29537d = true;
            if (this.f29536c) {
                this.f29536c = false;
                bVar.a(this.f29534a, this.f29535b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f29534a.equals(((c) obj).f29534a);
        }

        public int hashCode() {
            return this.f29534a.hashCode();
        }
    }

    public p(Looper looper, C5953d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar, true);
    }

    /* access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f29528d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f29527c);
            if (this.f29526b.b(1)) {
                break;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void m() {
        if (this.f29533i) {
            C5950a.g(Thread.currentThread() == this.f29526b.f().getThread());
        }
    }

    public void c(T t10) {
        C5950a.e(t10);
        synchronized (this.f29531g) {
            try {
                if (!this.f29532h) {
                    this.f29528d.add(new c(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p<T> d(Looper looper, C5953d dVar, b<T> bVar) {
        return new p(this.f29528d, looper, dVar, bVar, this.f29533i);
    }

    public p<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f29525a, bVar);
    }

    public void f() {
        m();
        if (!this.f29530f.isEmpty()) {
            if (!this.f29526b.b(1)) {
                C5962m mVar = this.f29526b;
                mVar.c(mVar.a(1));
            }
            boolean isEmpty = this.f29529e.isEmpty();
            this.f29529e.addAll(this.f29530f);
            this.f29530f.clear();
            if (isEmpty) {
                while (!this.f29529e.isEmpty()) {
                    this.f29529e.peekFirst().run();
                    this.f29529e.removeFirst();
                }
            }
        }
    }

    public void i(int i10, a<T> aVar) {
        m();
        this.f29530f.add(new C5964o(new CopyOnWriteArraySet(this.f29528d), i10, aVar));
    }

    public void j() {
        m();
        synchronized (this.f29531g) {
            this.f29532h = true;
        }
        Iterator<c<T>> it = this.f29528d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f29527c);
        }
        this.f29528d.clear();
    }

    public void k(T t10) {
        m();
        Iterator<c<T>> it = this.f29528d.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f29534a.equals(t10)) {
                next.c(this.f29527c);
                this.f29528d.remove(next);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, C5953d dVar, b<T> bVar, boolean z10) {
        this.f29525a = dVar;
        this.f29528d = copyOnWriteArraySet;
        this.f29527c = bVar;
        this.f29531g = new Object();
        this.f29529e = new ArrayDeque<>();
        this.f29530f = new ArrayDeque<>();
        this.f29526b = dVar.e(looper, new C5963n(this));
        this.f29533i = z10;
    }
}
