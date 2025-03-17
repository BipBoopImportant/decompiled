package B3;

import B3.C6375y;
import android.os.Handler;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import z3.C6279b;
import z3.C6280c;

/* renamed from: B3.x  reason: case insensitive filesystem */
public interface C6374x {

    /* renamed from: B3.x$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f33100a;

        /* renamed from: b  reason: collision with root package name */
        private final C6374x f33101b;

        public a(Handler handler, C6374x xVar) {
            this.f33100a = xVar != null ? (Handler) C5950a.e(handler) : null;
            this.f33101b = xVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void A(String str) {
            ((C6374x) N.i(this.f33101b)).i(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void B(C6279b bVar) {
            bVar.c();
            ((C6374x) N.i(this.f33101b)).z(bVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void C(C6279b bVar) {
            ((C6374x) N.i(this.f33101b)).r(bVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void D(C5807s sVar, C6280c cVar) {
            ((C6374x) N.i(this.f33101b)).o(sVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void E(long j10) {
            ((C6374x) N.i(this.f33101b)).l(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void F(boolean z10) {
            ((C6374x) N.i(this.f33101b)).a(z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void G(int i10, long j10, long j11) {
            ((C6374x) N.i(this.f33101b)).y(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(Exception exc) {
            ((C6374x) N.i(this.f33101b)).w(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Exception exc) {
            ((C6374x) N.i(this.f33101b)).b(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(C6375y.a aVar) {
            ((C6374x) N.i(this.f33101b)).d(aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(C6375y.a aVar) {
            ((C6374x) N.i(this.f33101b)).c(aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(String str, long j10, long j11) {
            ((C6374x) N.i(this.f33101b)).j(str, j10, j11);
        }

        public void H(long j10) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6371u(this, j10));
            }
        }

        public void I(boolean z10) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6373w(this, z10));
            }
        }

        public void J(int i10, long j10, long j11) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6372v(this, i10, j10, j11));
            }
        }

        public void m(Exception exc) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6366o(this, exc));
            }
        }

        public void n(Exception exc) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6367p(this, exc));
            }
        }

        public void o(C6375y.a aVar) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6364m(this, aVar));
            }
        }

        public void p(C6375y.a aVar) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6365n(this, aVar));
            }
        }

        public void q(String str, long j10, long j11) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new r(this, str, j10, j11));
            }
        }

        public void r(String str) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6369s(this, str));
            }
        }

        public void s(C6279b bVar) {
            bVar.c();
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6370t(this, bVar));
            }
        }

        public void t(C6279b bVar) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6363l(this, bVar));
            }
        }

        public void u(C5807s sVar, C6280c cVar) {
            Handler handler = this.f33100a;
            if (handler != null) {
                handler.post(new C6368q(this, sVar, cVar));
            }
        }
    }

    void a(boolean z10) {
    }

    void b(Exception exc) {
    }

    void c(C6375y.a aVar) {
    }

    void d(C6375y.a aVar) {
    }

    void i(String str) {
    }

    void j(String str, long j10, long j11) {
    }

    void l(long j10) {
    }

    void o(C5807s sVar, C6280c cVar) {
    }

    void r(C6279b bVar) {
    }

    void w(Exception exc) {
    }

    void y(int i10, long j10, long j11) {
    }

    void z(C6279b bVar) {
    }
}
