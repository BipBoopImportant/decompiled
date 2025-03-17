package G3;

import G3.C6479C;
import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.C5807s;
import t3.C5950a;
import t3.C5957h;
import t3.N;

public interface J {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f35643a;

        /* renamed from: b  reason: collision with root package name */
        public final C6479C.b f35644b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0572a> f35645c;

        /* renamed from: G3.J$a$a  reason: collision with other inner class name */
        private static final class C0572a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f35646a;

            /* renamed from: b  reason: collision with root package name */
            public J f35647b;

            public C0572a(Handler handler, J j10) {
                this.f35646a = handler;
                this.f35647b = j10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C6479C.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(C6477A a10, J j10) {
            j10.L(this.f35643a, this.f35644b, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(C6503x xVar, C6477A a10, J j10) {
            j10.U(this.f35643a, this.f35644b, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(C6503x xVar, C6477A a10, J j10) {
            j10.K(this.f35643a, this.f35644b, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(C6503x xVar, C6477A a10, IOException iOException, boolean z10, J j10) {
            j10.R(this.f35643a, this.f35644b, xVar, a10, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(C6503x xVar, C6477A a10, J j10) {
            j10.C(this.f35643a, this.f35644b, xVar, a10);
        }

        public void g(Handler handler, J j10) {
            C5950a.e(handler);
            C5950a.e(j10);
            this.f35645c.add(new C0572a(handler, j10));
        }

        public void h(C5957h<J> hVar) {
            Iterator<C0572a> it = this.f35645c.iterator();
            while (it.hasNext()) {
                C0572a next = it.next();
                N.W0(next.f35646a, new I(hVar, next.f35647b));
            }
        }

        public void i(int i10, C5807s sVar, int i11, Object obj, long j10) {
            j(new C6477A(1, i10, sVar, i11, obj, N.q1(j10), -9223372036854775807L));
        }

        public void j(C6477A a10) {
            h(new C6480D(this, a10));
        }

        public void q(C6503x xVar, int i10, int i11, C5807s sVar, int i12, Object obj, long j10, long j11) {
            C6477A a10 = new C6477A(i10, i11, sVar, i12, obj, N.q1(j10), N.q1(j11));
            C6503x xVar2 = xVar;
            r(xVar, a10);
        }

        public void r(C6503x xVar, C6477A a10) {
            h(new H(this, xVar, a10));
        }

        public void s(C6503x xVar, int i10, int i11, C5807s sVar, int i12, Object obj, long j10, long j11) {
            C6477A a10 = new C6477A(i10, i11, sVar, i12, obj, N.q1(j10), N.q1(j11));
            C6503x xVar2 = xVar;
            t(xVar, a10);
        }

        public void t(C6503x xVar, C6477A a10) {
            h(new F(this, xVar, a10));
        }

        public void u(C6503x xVar, int i10, int i11, C5807s sVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            C6477A a10 = new C6477A(i10, i11, sVar, i12, obj, N.q1(j10), N.q1(j11));
            C6503x xVar2 = xVar;
            v(xVar, a10, iOException, z10);
        }

        public void v(C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
            h(new G(this, xVar, a10, iOException, z10));
        }

        public void w(C6503x xVar, int i10, int i11, C5807s sVar, int i12, Object obj, long j10, long j11) {
            C6477A a10 = new C6477A(i10, i11, sVar, i12, obj, N.q1(j10), N.q1(j11));
            C6503x xVar2 = xVar;
            x(xVar, a10);
        }

        public void x(C6503x xVar, C6477A a10) {
            h(new E(this, xVar, a10));
        }

        public void y(J j10) {
            Iterator<C0572a> it = this.f35645c.iterator();
            while (it.hasNext()) {
                C0572a next = it.next();
                if (next.f35647b == j10) {
                    this.f35645c.remove(next);
                }
            }
        }

        public a z(int i10, C6479C.b bVar) {
            return new a(this.f35645c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0572a> copyOnWriteArrayList, int i10, C6479C.b bVar) {
            this.f35645c = copyOnWriteArrayList;
            this.f35643a = i10;
            this.f35644b = bVar;
        }
    }

    void C(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
    }

    void K(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
    }

    void L(int i10, C6479C.b bVar, C6477A a10) {
    }

    void R(int i10, C6479C.b bVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
    }

    void U(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
    }
}
