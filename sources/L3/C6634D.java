package L3;

import android.os.Handler;
import android.os.SystemClock;
import q3.C5807s;
import q3.S;
import t3.C5950a;
import t3.N;
import z3.C6279b;
import z3.C6280c;

/* renamed from: L3.D  reason: case insensitive filesystem */
public interface C6634D {

    /* renamed from: L3.D$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f38057a;

        /* renamed from: b  reason: collision with root package name */
        private final C6634D f38058b;

        public a(Handler handler, C6634D d10) {
            this.f38057a = d10 != null ? (Handler) C5950a.e(handler) : null;
            this.f38058b = d10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((C6634D) N.i(this.f38058b)).g(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((C6634D) N.i(this.f38058b)).f(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(C6279b bVar) {
            bVar.c();
            ((C6634D) N.i(this.f38058b)).m(bVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((C6634D) N.i(this.f38058b)).s(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(C6279b bVar) {
            ((C6634D) N.i(this.f38058b)).v(bVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(C5807s sVar, C6280c cVar) {
            ((C6634D) N.i(this.f38058b)).q(sVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((C6634D) N.i(this.f38058b)).t(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((C6634D) N.i(this.f38058b)).A(j10, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((C6634D) N.i(this.f38058b)).n(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(S s10) {
            ((C6634D) N.i(this.f38058b)).e(s10);
        }

        public void A(Object obj) {
            if (this.f38057a != null) {
                this.f38057a.post(new w(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void B(long j10, int i10) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new x(this, j10, i10));
            }
        }

        public void C(Exception exc) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new y(this, exc));
            }
        }

        public void D(S s10) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new u(this, s10));
            }
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new t(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new C6633C(this, str));
            }
        }

        public void m(C6279b bVar) {
            bVar.c();
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new C6632B(this, bVar));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new v(this, i10, j10));
            }
        }

        public void o(C6279b bVar) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new z(this, bVar));
            }
        }

        public void p(C5807s sVar, C6280c cVar) {
            Handler handler = this.f38057a;
            if (handler != null) {
                handler.post(new C6631A(this, sVar, cVar));
            }
        }
    }

    void A(long j10, int i10) {
    }

    void e(S s10) {
    }

    void f(String str) {
    }

    void g(String str, long j10, long j11) {
    }

    void m(C6279b bVar) {
    }

    void n(Exception exc) {
    }

    void q(C5807s sVar, C6280c cVar) {
    }

    void s(int i10, long j10) {
    }

    void t(Object obj, long j10) {
    }

    void v(C6279b bVar) {
    }
}
