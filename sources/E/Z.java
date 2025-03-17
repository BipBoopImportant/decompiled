package E;

import C.C4391e0;
import C.V;
import E.f0;
import G.p;
import H2.d;
import H2.i;
import I.c;
import I.n;
import android.util.Log;
import androidx.camera.core.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import ob.C10101e;

public class Z implements e.a, f0.a {

    /* renamed from: a  reason: collision with root package name */
    final Deque<f0> f5590a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    final C4440x f5591b;

    /* renamed from: c  reason: collision with root package name */
    C4441y f5592c;

    /* renamed from: d  reason: collision with root package name */
    private T f5593d;

    /* renamed from: e  reason: collision with root package name */
    private final List<T> f5594e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5595f = false;

    class a implements c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4429l f5596a;

        a(C4429l lVar) {
            this.f5596a = lVar;
        }

        public void b(Throwable th2) {
            if (!this.f5596a.b()) {
                int f10 = this.f5596a.a().get(0).f();
                if (th2 instanceof V) {
                    Z.this.f5592c.j(b.c(f10, (V) th2));
                } else {
                    Z.this.f5592c.j(b.c(f10, new V(2, "Failed to submit capture request", th2)));
                }
                Z.this.f5591b.c();
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
            Z.this.f5591b.c();
        }
    }

    static abstract class b {
        b() {
        }

        static b c(int i10, V v10) {
            return new C4424g(i10, v10);
        }

        /* access modifiers changed from: package-private */
        public abstract V a();

        /* access modifiers changed from: package-private */
        public abstract int b();
    }

    public Z(C4440x xVar) {
        p.a();
        this.f5591b = xVar;
        this.f5594e = new ArrayList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f5593d = null;
        g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(T t10) {
        this.f5594e.remove(t10);
    }

    private C10101e<Void> n(C4429l lVar) {
        p.a();
        this.f5591b.b();
        C10101e<Void> a10 = this.f5591b.a(lVar.a());
        n.j(a10, new a(lVar), H.a.d());
        return a10;
    }

    private void o(T t10) {
        i.i(!f());
        this.f5593d = t10;
        t10.p().a(new W(this), H.a.a());
        this.f5594e.add(t10);
        t10.q().a(new X(this, t10), H.a.a());
    }

    public void a(androidx.camera.core.n nVar) {
        H.a.d().execute(new Y(this));
    }

    public void b(f0 f0Var) {
        p.a();
        C4391e0.a("TakePictureManager", "Add a new request for retrying.");
        this.f5590a.addFirst(f0Var);
        g();
    }

    public void e() {
        p.a();
        V v10 = new V(3, "Camera is closed.", (Throwable) null);
        for (f0 x10 : this.f5590a) {
            x10.x(v10);
        }
        this.f5590a.clear();
        for (T m10 : new ArrayList(this.f5594e)) {
            m10.m(v10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f5593d != null;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        p.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
        } else if (this.f5595f) {
            Log.d("TakePictureManager", "The class is paused.");
        } else if (this.f5592c.h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else {
            f0 poll = this.f5590a.poll();
            if (poll == null) {
                Log.d("TakePictureManager", "No new request.");
                return;
            }
            T t10 = new T(poll, this);
            o(t10);
            d<C4429l, P> e10 = this.f5592c.e(poll, t10, t10.p());
            C4429l lVar = (C4429l) e10.f7052a;
            Objects.requireNonNull(lVar);
            P p10 = (P) e10.f7053b;
            Objects.requireNonNull(p10);
            this.f5592c.m(p10);
            t10.v(n(lVar));
        }
    }

    public void j(f0 f0Var) {
        p.a();
        this.f5590a.offer(f0Var);
        g();
    }

    public void k() {
        p.a();
        this.f5595f = true;
        T t10 = this.f5593d;
        if (t10 != null) {
            t10.n();
        }
    }

    public void l() {
        p.a();
        this.f5595f = false;
        g();
    }

    public void m(C4441y yVar) {
        p.a();
        this.f5592c = yVar;
        yVar.k(this);
    }
}
