package C3;

import G3.C6479C;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t3.C5950a;
import t3.N;

public interface t {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33677a;

        /* renamed from: b  reason: collision with root package name */
        public final C6479C.b f33678b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0516a> f33679c;

        /* renamed from: C3.t$a$a  reason: collision with other inner class name */
        private static final class C0516a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f33680a;

            /* renamed from: b  reason: collision with root package name */
            public t f33681b;

            public C0516a(Handler handler, t tVar) {
                this.f33680a = handler;
                this.f33681b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C6479C.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(t tVar) {
            tVar.j0(this.f33677a, this.f33678b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(t tVar) {
            tVar.P(this.f33677a, this.f33678b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(t tVar) {
            tVar.m0(this.f33677a, this.f33678b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(t tVar, int i10) {
            tVar.k0(this.f33677a, this.f33678b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(t tVar, Exception exc) {
            tVar.h0(this.f33677a, this.f33678b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(t tVar) {
            tVar.i0(this.f33677a, this.f33678b);
        }

        public void g(Handler handler, t tVar) {
            C5950a.e(handler);
            C5950a.e(tVar);
            this.f33679c.add(new C0516a(handler, tVar));
        }

        public void h() {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new s(this, next.f33681b));
            }
        }

        public void i() {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new q(this, next.f33681b));
            }
        }

        public void j() {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new r(this, next.f33681b));
            }
        }

        public void k(int i10) {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new C6424o(this, next.f33681b, i10));
            }
        }

        public void l(Exception exc) {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new C6423n(this, next.f33681b, exc));
            }
        }

        public void m() {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                N.W0(next.f33680a, new C6425p(this, next.f33681b));
            }
        }

        public void t(t tVar) {
            Iterator<C0516a> it = this.f33679c.iterator();
            while (it.hasNext()) {
                C0516a next = it.next();
                if (next.f33681b == tVar) {
                    this.f33679c.remove(next);
                }
            }
        }

        public a u(int i10, C6479C.b bVar) {
            return new a(this.f33679c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0516a> copyOnWriteArrayList, int i10, C6479C.b bVar) {
            this.f33679c = copyOnWriteArrayList;
            this.f33677a = i10;
            this.f33678b = bVar;
        }
    }

    void P(int i10, C6479C.b bVar) {
    }

    void h0(int i10, C6479C.b bVar, Exception exc) {
    }

    void i0(int i10, C6479C.b bVar) {
    }

    void j0(int i10, C6479C.b bVar) {
    }

    void k0(int i10, C6479C.b bVar, int i11) {
    }

    void m0(int i10, C6479C.b bVar) {
    }
}
