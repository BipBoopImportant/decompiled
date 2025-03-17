package E;

import C.C4383a0;
import C.C4391e0;
import C.V;
import E.O;
import E.Z;
import G.p;
import H2.i;
import O.C4710u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5048t0;
import androidx.camera.core.impl.C5050u0;
import androidx.camera.core.n;
import androidx.camera.core.o;
import androidx.camera.core.q;
import java.util.Objects;

/* renamed from: E.u  reason: case insensitive filesystem */
class C4437u {

    /* renamed from: a  reason: collision with root package name */
    P f5653a = null;

    /* renamed from: b  reason: collision with root package name */
    q f5654b;

    /* renamed from: c  reason: collision with root package name */
    q f5655c;

    /* renamed from: d  reason: collision with root package name */
    private O.a f5656d;

    /* renamed from: e  reason: collision with root package name */
    private c f5657e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public E f5658f = null;

    /* renamed from: E.u$a */
    class a extends C5040p {
        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            P p10 = C4437u.this.f5653a;
            if (p10 != null) {
                p10.n();
            }
        }

        public void d(int i10) {
            H.a.d().execute(new C4436t(this));
        }
    }

    /* renamed from: E.u$b */
    class b implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P f5660a;

        b(P p10) {
            this.f5660a = p10;
        }

        public void b(Throwable th2) {
            p.a();
            if (this.f5660a == C4437u.this.f5653a) {
                C4391e0.l("CaptureNode", "request aborted, id=" + C4437u.this.f5653a.e());
                if (C4437u.this.f5658f != null) {
                    C4437u.this.f5658f.i();
                }
                C4437u.this.f5653a = null;
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
        }
    }

    /* renamed from: E.u$c */
    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private C5040p f5662a = new a();

        /* renamed from: b  reason: collision with root package name */
        private C5019e0 f5663b;

        /* renamed from: c  reason: collision with root package name */
        private C5019e0 f5664c = null;

        /* renamed from: E.u$c$a */
        class a extends C5040p {
            a() {
            }
        }

        c() {
        }

        static c m(Size size, int i10, int i11, boolean z10, C4383a0 a0Var, Size size2, int i12) {
            return new C4419b(size, i10, i11, z10, a0Var, size2, i12, new C4710u(), new C4710u());
        }

        /* access modifiers changed from: package-private */
        public C5040p a() {
            return this.f5662a;
        }

        /* access modifiers changed from: package-private */
        public abstract C4710u<Z.b> b();

        /* access modifiers changed from: package-private */
        public abstract C4383a0 c();

        /* access modifiers changed from: package-private */
        public abstract int d();

        /* access modifiers changed from: package-private */
        public abstract int e();

        /* access modifiers changed from: package-private */
        public abstract int f();

        /* access modifiers changed from: package-private */
        public abstract Size g();

        /* access modifiers changed from: package-private */
        public C5019e0 h() {
            return this.f5664c;
        }

        /* access modifiers changed from: package-private */
        public abstract C4710u<P> i();

        /* access modifiers changed from: package-private */
        public abstract Size j();

        /* access modifiers changed from: package-private */
        public C5019e0 k() {
            C5019e0 e0Var = this.f5663b;
            Objects.requireNonNull(e0Var);
            return e0Var;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean l();

        /* access modifiers changed from: package-private */
        public void n(C5040p pVar) {
            this.f5662a = pVar;
        }

        /* access modifiers changed from: package-private */
        public void o(Surface surface, Size size, int i10) {
            this.f5664c = new C5050u0(surface, size, i10);
        }

        /* access modifiers changed from: package-private */
        public void p(Surface surface) {
            i.j(this.f5663b == null, "The surface is already set.");
            this.f5663b = new C5050u0(surface, j(), d());
        }
    }

    C4437u() {
    }

    private static C5048t0 g(C4383a0 a0Var, int i10, int i11, int i12) {
        return a0Var != null ? a0Var.a(i10, i11, i12, 4, 0) : o.a(i10, i11, i12, 4);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j(q qVar) {
        if (qVar != null) {
            qVar.l();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(P p10) {
        p(p10);
        this.f5658f.h(p10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(C5048t0 t0Var) {
        try {
            n b10 = t0Var.b();
            if (b10 != null) {
                o(b10);
                return;
            }
            P p10 = this.f5653a;
            if (p10 != null) {
                t(Z.b.c(p10.e(), new V(2, "Failed to acquire latest image", (Throwable) null)));
            }
        } catch (IllegalStateException e10) {
            P p11 = this.f5653a;
            if (p11 != null) {
                t(Z.b.c(p11.e(), new V(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(C5048t0 t0Var) {
        try {
            n b10 = t0Var.b();
            if (b10 != null) {
                q(b10);
            }
        } catch (IllegalStateException e10) {
            C4391e0.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    private void n(n nVar) {
        p.a();
        O.a aVar = this.f5656d;
        Objects.requireNonNull(aVar);
        aVar.a().accept(O.b.c(this.f5653a, nVar));
        P p10 = this.f5653a;
        this.f5653a = null;
        p10.q();
    }

    private void q(n nVar) {
        if (this.f5653a == null) {
            C4391e0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
            return;
        }
        O.a aVar = this.f5656d;
        Objects.requireNonNull(aVar);
        aVar.d().accept(O.b.c(this.f5653a, nVar));
    }

    private void s(c cVar, q qVar, q qVar2) {
        cVar.k().d();
        cVar.k().k().a(new r(qVar), H.a.d());
        if (cVar.h() != null) {
            cVar.h().d();
            cVar.h().k().a(new C4435s(qVar2), H.a.d());
        }
    }

    public int h() {
        p.a();
        i.j(this.f5654b != null, "The ImageReader is not initialized.");
        return this.f5654b.i();
    }

    /* access modifiers changed from: package-private */
    public void o(n nVar) {
        p.a();
        if (this.f5653a == null) {
            C4391e0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
        } else if (((Integer) nVar.F2().b().d(this.f5653a.i())) == null) {
            C4391e0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            nVar.close();
        } else {
            n(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(P p10) {
        p.a();
        boolean z10 = false;
        i.j(p10.h().size() == 1, "only one capture stage is supported.");
        if (h() > 0) {
            z10 = true;
        }
        i.j(z10, "Too many acquire images. Close image to be able to process next.");
        this.f5653a = p10;
        I.n.j(p10.a(), new b(p10), H.a.a());
    }

    public void r() {
        p.a();
        c cVar = this.f5657e;
        Objects.requireNonNull(cVar);
        q qVar = this.f5654b;
        Objects.requireNonNull(qVar);
        s(cVar, qVar, this.f5655c);
    }

    /* access modifiers changed from: package-private */
    public void t(Z.b bVar) {
        p.a();
        P p10 = this.f5653a;
        if (p10 != null && p10.e() == bVar.b()) {
            this.f5653a.l(bVar.a());
        }
    }

    public void u(e.a aVar) {
        p.a();
        i.j(this.f5654b != null, "The ImageReader is not initialized.");
        this.f5654b.m(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: E.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.camera.core.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: E.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: E.E} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E.O.a v(E.C4437u.c r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            E.u$c r2 = r8.f5657e
            if (r2 != 0) goto L_0x000c
            androidx.camera.core.q r2 = r8.f5654b
            if (r2 != 0) goto L_0x000c
            r2 = r1
            goto L_0x000d
        L_0x000c:
            r2 = r0
        L_0x000d:
            java.lang.String r3 = "CaptureNode does not support recreation yet."
            H2.i.j(r2, r3)
            r8.f5657e = r9
            android.util.Size r2 = r9.j()
            int r3 = r9.d()
            boolean r4 = r9.l()
            E.u$a r5 = new E.u$a
            r5.<init>()
            if (r4 != 0) goto L_0x0050
            C.a0 r4 = r9.c()
            if (r4 != 0) goto L_0x0050
            androidx.camera.core.p r4 = new androidx.camera.core.p
            int r6 = r2.getWidth()
            int r2 = r2.getHeight()
            r7 = 4
            r4.<init>(r6, r2, r3, r7)
            androidx.camera.core.impl.p r2 = r4.m()
            r3 = 2
            androidx.camera.core.impl.p[] r3 = new androidx.camera.core.impl.C5040p[r3]
            r3[r0] = r5
            r3[r1] = r2
            androidx.camera.core.impl.p r5 = androidx.camera.core.impl.C5042q.b(r3)
            E.m r0 = new E.m
            r0.<init>(r8)
            goto L_0x006c
        L_0x0050:
            E.E r4 = new E.E
            C.a0 r0 = r9.c()
            int r1 = r2.getWidth()
            int r2 = r2.getHeight()
            androidx.camera.core.impl.t0 r0 = g(r0, r1, r2, r3)
            r4.<init>(r0)
            r8.f5658f = r4
            E.n r0 = new E.n
            r0.<init>(r8)
        L_0x006c:
            r9.n(r5)
            android.view.Surface r1 = r4.getSurface()
            java.util.Objects.requireNonNull(r1)
            r9.p(r1)
            androidx.camera.core.q r1 = new androidx.camera.core.q
            r1.<init>(r4)
            r8.f5654b = r1
            E.o r1 = new E.o
            r1.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r2 = H.a.d()
            r4.f(r1, r2)
            android.util.Size r1 = r9.g()
            if (r1 == 0) goto L_0x00d0
            C.a0 r1 = r9.c()
            android.util.Size r2 = r9.g()
            int r2 = r2.getWidth()
            android.util.Size r3 = r9.g()
            int r3 = r3.getHeight()
            int r4 = r9.f()
            androidx.camera.core.impl.t0 r1 = g(r1, r2, r3, r4)
            E.p r2 = new E.p
            r2.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r3 = H.a.d()
            r1.f(r2, r3)
            androidx.camera.core.q r2 = new androidx.camera.core.q
            r2.<init>(r1)
            r8.f5655c = r2
            android.view.Surface r1 = r1.getSurface()
            android.util.Size r2 = r9.g()
            int r3 = r9.f()
            r9.o(r1, r2, r3)
        L_0x00d0:
            O.u r1 = r9.i()
            r1.a(r0)
            O.u r0 = r9.b()
            E.q r1 = new E.q
            r1.<init>(r8)
            r0.a(r1)
            int r0 = r9.d()
            int r9 = r9.e()
            E.O$a r9 = E.O.a.e(r0, r9)
            r8.f5656d = r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C4437u.v(E.u$c):E.O$a");
    }
}
