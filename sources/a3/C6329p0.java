package A3;

import A3.C6300b;
import B3.C6375y;
import G3.C6477A;
import G3.C6479C;
import G3.C6503x;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import java.io.IOException;
import java.util.List;
import jb.j;
import kb.C9922B;
import kb.C9967v;
import kb.C9968w;
import q3.C;
import q3.C5806q;
import q3.C5807s;
import q3.D;
import q3.E;
import q3.J;
import q3.M;
import q3.S;
import q3.w;
import q3.y;
import q3.z;
import s3.b;
import t3.C5950a;
import t3.C5953d;
import t3.C5962m;
import t3.N;
import t3.p;
import z3.C6279b;
import z3.C6280c;

/* renamed from: A3.p0  reason: case insensitive filesystem */
public class C6329p0 implements C6298a {

    /* renamed from: a  reason: collision with root package name */
    private final C5953d f32583a;

    /* renamed from: b  reason: collision with root package name */
    private final J.b f32584b;

    /* renamed from: c  reason: collision with root package name */
    private final J.c f32585c = new J.c();

    /* renamed from: d  reason: collision with root package name */
    private final a f32586d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<C6300b.a> f32587e;

    /* renamed from: f  reason: collision with root package name */
    private p<C6300b> f32588f;

    /* renamed from: g  reason: collision with root package name */
    private E f32589g;

    /* renamed from: h  reason: collision with root package name */
    private C5962m f32590h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32591i;

    /* renamed from: A3.p0$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final J.b f32592a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C9967v<C6479C.b> f32593b = C9967v.E();

        /* renamed from: c  reason: collision with root package name */
        private C9968w<C6479C.b, J> f32594c = C9968w.n();

        /* renamed from: d  reason: collision with root package name */
        private C6479C.b f32595d;

        /* renamed from: e  reason: collision with root package name */
        private C6479C.b f32596e;

        /* renamed from: f  reason: collision with root package name */
        private C6479C.b f32597f;

        public a(J.b bVar) {
            this.f32592a = bVar;
        }

        private void b(C9968w.a<C6479C.b, J> aVar, C6479C.b bVar, J j10) {
            if (bVar != null) {
                if (j10.b(bVar.f35620a) != -1) {
                    aVar.f(bVar, j10);
                    return;
                }
                J j11 = this.f32594c.get(bVar);
                if (j11 != null) {
                    aVar.f(bVar, j11);
                }
            }
        }

        private static C6479C.b c(E e10, C9967v<C6479C.b> vVar, C6479C.b bVar, J.b bVar2) {
            J z10 = e10.z();
            int L10 = e10.L();
            Object m10 = z10.q() ? null : z10.m(L10);
            int d10 = (e10.f() || z10.q()) ? -1 : z10.f(L10, bVar2).d(N.P0(e10.h0()) - bVar2.n());
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                C6479C.b bVar3 = vVar.get(i10);
                if (i(bVar3, m10, e10.f(), e10.v(), e10.Q(), d10)) {
                    return bVar3;
                }
            }
            if (vVar.isEmpty() && bVar != null) {
                if (i(bVar, m10, e10.f(), e10.v(), e10.Q(), d10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(C6479C.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f35620a.equals(obj)) {
                return false;
            }
            return (z10 && bVar.f35621b == i10 && bVar.f35622c == i11) || (!z10 && bVar.f35621b == -1 && bVar.f35624e == i12);
        }

        private void m(J j10) {
            C9968w.a a10 = C9968w.a();
            if (this.f32593b.isEmpty()) {
                b(a10, this.f32596e, j10);
                if (!j.a(this.f32597f, this.f32596e)) {
                    b(a10, this.f32597f, j10);
                }
                if (!j.a(this.f32595d, this.f32596e) && !j.a(this.f32595d, this.f32597f)) {
                    b(a10, this.f32595d, j10);
                }
            } else {
                for (int i10 = 0; i10 < this.f32593b.size(); i10++) {
                    b(a10, this.f32593b.get(i10), j10);
                }
                if (!this.f32593b.contains(this.f32595d)) {
                    b(a10, this.f32595d, j10);
                }
            }
            this.f32594c = a10.c();
        }

        public C6479C.b d() {
            return this.f32595d;
        }

        public C6479C.b e() {
            if (this.f32593b.isEmpty()) {
                return null;
            }
            return (C6479C.b) C9922B.d(this.f32593b);
        }

        public J f(C6479C.b bVar) {
            return this.f32594c.get(bVar);
        }

        public C6479C.b g() {
            return this.f32596e;
        }

        public C6479C.b h() {
            return this.f32597f;
        }

        public void j(E e10) {
            this.f32595d = c(e10, this.f32593b, this.f32596e, this.f32592a);
        }

        public void k(List<C6479C.b> list, C6479C.b bVar, E e10) {
            this.f32593b = C9967v.A(list);
            if (!list.isEmpty()) {
                this.f32596e = list.get(0);
                this.f32597f = (C6479C.b) C5950a.e(bVar);
            }
            if (this.f32595d == null) {
                this.f32595d = c(e10, this.f32593b, this.f32596e, this.f32592a);
            }
            m(e10.z());
        }

        public void l(E e10) {
            this.f32595d = c(e10, this.f32593b, this.f32596e, this.f32592a);
            m(e10.z());
        }
    }

    public C6329p0(C5953d dVar) {
        this.f32583a = (C5953d) C5950a.e(dVar);
        this.f32588f = new p<>(N.U(), dVar, new C6337u());
        J.b bVar = new J.b();
        this.f32584b = bVar;
        this.f32586d = new a(bVar);
        this.f32587e = new SparseArray<>();
    }

    private C6300b.a C1(C6479C.b bVar) {
        C5950a.e(this.f32589g);
        J f10 = bVar == null ? null : this.f32586d.f(bVar);
        if (bVar != null && f10 != null) {
            return D1(f10, f10.h(bVar.f35620a, this.f32584b).f27904c, bVar);
        }
        int Y10 = this.f32589g.Y();
        J z10 = this.f32589g.z();
        if (Y10 >= z10.p()) {
            z10 = J.f27893a;
        }
        return D1(z10, Y10, (C6479C.b) null);
    }

    private C6300b.a E1() {
        return C1(this.f32586d.e());
    }

    private C6300b.a F1(int i10, C6479C.b bVar) {
        C5950a.e(this.f32589g);
        if (bVar != null) {
            return this.f32586d.f(bVar) != null ? C1(bVar) : D1(J.f27893a, i10, bVar);
        }
        J z10 = this.f32589g.z();
        if (i10 >= z10.p()) {
            z10 = J.f27893a;
        }
        return D1(z10, i10, (C6479C.b) null);
    }

    private C6300b.a G1() {
        return C1(this.f32586d.g());
    }

    private C6300b.a H1() {
        return C1(this.f32586d.h());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = ((androidx.media3.exoplayer.C5233j) r2).f22788o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private A3.C6300b.a I1(q3.C r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof androidx.media3.exoplayer.C5233j
            if (r0 == 0) goto L_0x000f
            androidx.media3.exoplayer.j r2 = (androidx.media3.exoplayer.C5233j) r2
            G3.C$b r2 = r2.f22788o
            if (r2 == 0) goto L_0x000f
            A3.b$a r2 = r1.C1(r2)
            return r2
        L_0x000f:
            A3.b$a r2 = r1.B1()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.C6329p0.I1(q3.C):A3.b$a");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void J1(C6300b bVar, C5806q qVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K2(C6300b.a aVar, String str, long j10, long j11, C6300b bVar) {
        bVar.m0(aVar, str, j10);
        bVar.n0(aVar, str, j11, j10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void M1(C6300b.a aVar, String str, long j10, long j11, C6300b bVar) {
        bVar.J(aVar, str, j10);
        bVar.c(aVar, str, j11, j10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q2(C6300b.a aVar, S s10, C6300b bVar) {
        bVar.h0(aVar, s10);
        bVar.g(aVar, s10.f28068a, s10.f28069b, 0, s10.f28071d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T2(E e10, C6300b bVar, C5806q qVar) {
        bVar.T(e10, new C6300b.C0501b(qVar, this.f32587e));
    }

    /* access modifiers changed from: private */
    public void U2() {
        C6300b.a B12 = B1();
        V2(B12, 1028, new N(B12));
        this.f32588f.j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f2(C6300b.a aVar, int i10, C6300b bVar) {
        bVar.c0(aVar);
        bVar.i(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j2(C6300b.a aVar, boolean z10, C6300b bVar) {
        bVar.r0(aVar, z10);
        bVar.f0(aVar, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z2(C6300b.a aVar, int i10, E.e eVar, E.e eVar2, C6300b bVar) {
        bVar.L(aVar, i10);
        bVar.o0(aVar, eVar, eVar2, i10);
    }

    public final void A(long j10, int i10) {
        C6300b.a G12 = G1();
        V2(G12, 1021, new C6339v(G12, j10, i10));
    }

    public final void B(int i10) {
        C6300b.a B12 = B1();
        V2(B12, 6, new C6322m(B12, i10));
    }

    /* access modifiers changed from: protected */
    public final C6300b.a B1() {
        return C1(this.f32586d.d());
    }

    public final void C(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1000, new O(F12, xVar, a10));
    }

    public void D(boolean z10) {
    }

    /* access modifiers changed from: protected */
    public final C6300b.a D1(J j10, int i10, C6479C.b bVar) {
        J j11 = j10;
        int i11 = i10;
        C6479C.b bVar2 = j10.q() ? null : bVar;
        long c10 = this.f32583a.c();
        boolean z10 = j11.equals(this.f32589g.z()) && i11 == this.f32589g.Y();
        long j12 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                j12 = this.f32589g.T();
            } else if (!j10.q()) {
                j12 = j11.n(i11, this.f32585c).b();
            }
        } else if (z10 && this.f32589g.v() == bVar2.f35621b && this.f32589g.Q() == bVar2.f35622c) {
            j12 = this.f32589g.h0();
        }
        return new C6300b.a(c10, j10, i10, bVar2, j12, this.f32589g.z(), this.f32589g.Y(), this.f32586d.d(), this.f32589g.h0(), this.f32589g.k());
    }

    public void E(y yVar) {
        C6300b.a B12 = B1();
        V2(B12, 14, new C6311g0(B12, yVar));
    }

    public final void F(int i10) {
        C6300b.a B12 = B1();
        V2(B12, 4, new C6347z(B12, i10));
    }

    public final void G(int i10, long j10, long j11) {
        C6300b.a E12 = E1();
        V2(E12, 1006, new Z(E12, i10, j10, j11));
    }

    public final void H() {
        if (!this.f32591i) {
            C6300b.a B12 = B1();
            this.f32591i = true;
            V2(B12, -1, new C6291B(B12));
        }
    }

    public final void I(boolean z10) {
        C6300b.a B12 = B1();
        V2(B12, 9, new Y(B12, z10));
    }

    public final void J(List<C6479C.b> list, C6479C.b bVar) {
        this.f32586d.k(list, bVar, (E) C5950a.e(this.f32589g));
    }

    public final void K(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1001, new U(F12, xVar, a10));
    }

    public final void L(int i10, C6479C.b bVar, C6477A a10) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1004, new M(F12, a10));
    }

    public void M(C6300b bVar) {
        C5950a.e(bVar);
        this.f32588f.c(bVar);
    }

    public final void N(E.e eVar, E.e eVar2, int i10) {
        if (i10 == 1) {
            this.f32591i = false;
        }
        this.f32586d.j((E) C5950a.e(this.f32589g));
        C6300b.a B12 = B1();
        V2(B12, 11, new C6293D(B12, i10, eVar, eVar2));
    }

    public void O(int i10, boolean z10) {
        C6300b.a B12 = B1();
        V2(B12, 30, new S(B12, i10, z10));
    }

    public final void P(int i10, C6479C.b bVar) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1026, new C6315i0(F12));
    }

    public void Q() {
    }

    public final void R(int i10, C6479C.b bVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, AffirmProcessorActivity.RESULT_CODE_ERROR, new Q(F12, xVar, a10, iOException, z10));
    }

    public final void S(C c10) {
        C6300b.a I12 = I1(c10);
        V2(I12, 10, new C6341w(I12, c10));
    }

    public void T(E.b bVar) {
        C6300b.a B12 = B1();
        V2(B12, 13, new C6327o0(B12, bVar));
    }

    public final void U(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, CashAppPayProcessorActivity.RESULT_ERROR, new T(F12, xVar, a10));
    }

    public final void V(int i10, int i11) {
        C6300b.a H12 = H1();
        V2(H12, 24, new L(H12, i10, i11));
    }

    /* access modifiers changed from: protected */
    public final void V2(C6300b.a aVar, int i10, p.a<C6300b> aVar2) {
        this.f32587e.put(i10, aVar);
        this.f32588f.l(i10, aVar2);
    }

    public void W(M m10) {
        C6300b.a B12 = B1();
        V2(B12, 19, new C6299a0(B12, m10));
    }

    public final void X(J j10, int i10) {
        this.f32586d.l((E) C5950a.e(this.f32589g));
        C6300b.a B12 = B1();
        V2(B12, 0, new C6304d(B12, i10));
    }

    public void Y(int i10) {
    }

    public final void Z(boolean z10) {
        C6300b.a B12 = B1();
        V2(B12, 3, new C6323m0(B12, z10));
    }

    public final void a(boolean z10) {
        C6300b.a H12 = H1();
        V2(H12, 23, new C6301b0(H12, z10));
    }

    public final void a0(float f10) {
        C6300b.a H12 = H1();
        V2(H12, 22, new C6302c(H12, f10));
    }

    public final void b(Exception exc) {
        C6300b.a H12 = H1();
        V2(H12, 1014, new K(H12, exc));
    }

    public final void b0(w wVar, int i10) {
        C6300b.a B12 = B1();
        V2(B12, 1, new C6306e(B12, wVar, i10));
    }

    public void c(C6375y.a aVar) {
        C6300b.a H12 = H1();
        V2(H12, 1032, new C6309f0(H12, aVar));
    }

    public void c0(q3.N n10) {
        C6300b.a B12 = B1();
        V2(B12, 2, new C6345y(B12, n10));
    }

    public void d(C6375y.a aVar) {
        C6300b.a H12 = H1();
        V2(H12, 1031, new C6307e0(H12, aVar));
    }

    public void d0(E e10, E.c cVar) {
    }

    public final void e(S s10) {
        C6300b.a H12 = H1();
        V2(H12, 25, new W(H12, s10));
    }

    public void e0(int i10, int i11, boolean z10) {
        C6300b.a H12 = H1();
        V2(H12, 1033, new C6333s(H12, i10, i11, z10));
    }

    public final void f(String str) {
        C6300b.a H12 = H1();
        V2(H12, 1019, new C6326o(H12, str));
    }

    public final void f0(boolean z10, int i10) {
        C6300b.a B12 = B1();
        V2(B12, -1, new C6312h(B12, z10, i10));
    }

    public final void g(String str, long j10, long j11) {
        C6300b.a H12 = H1();
        V2(H12, 1016, new I(H12, str, j11, j10));
    }

    public void g0(C c10) {
        C6300b.a I12 = I1(c10);
        V2(I12, 10, new C6330q(I12, c10));
    }

    public final void h(z zVar) {
        C6300b.a B12 = B1();
        V2(B12, 28, new C6314i(B12, zVar));
    }

    public final void h0(int i10, C6479C.b bVar, Exception exc) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1024, new C6305d0(F12, exc));
    }

    public final void i(String str) {
        C6300b.a H12 = H1();
        V2(H12, 1012, new C6325n0(H12, str));
    }

    public final void i0(int i10, C6479C.b bVar) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1027, new C6313h0(F12));
    }

    public final void j(String str, long j10, long j11) {
        C6300b.a H12 = H1();
        V2(H12, 1008, new C6320l(H12, str, j11, j10));
    }

    public final void j0(int i10, C6479C.b bVar) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1023, new C6319k0(F12));
    }

    public void k(List<s3.a> list) {
        C6300b.a B12 = B1();
        V2(B12, 27, new C6335t(B12, list));
    }

    public final void k0(int i10, C6479C.b bVar, int i11) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1022, new C6303c0(F12, i11));
    }

    public final void l(long j10) {
        C6300b.a H12 = H1();
        V2(H12, 1010, new C6316j(H12, j10));
    }

    public final void l0(boolean z10, int i10) {
        C6300b.a B12 = B1();
        V2(B12, 5, new r(B12, z10, i10));
    }

    public final void m(C6279b bVar) {
        C6300b.a G12 = G1();
        V2(G12, 1020, new J(G12, bVar));
    }

    public final void m0(int i10, C6479C.b bVar) {
        C6300b.a F12 = F1(i10, bVar);
        V2(F12, 1025, new C6317j0(F12));
    }

    public final void n(Exception exc) {
        C6300b.a H12 = H1();
        V2(H12, 1030, new C6308f(H12, exc));
    }

    public void n0(E e10, Looper looper) {
        C5950a.g(this.f32589g == null || this.f32586d.f32593b.isEmpty());
        this.f32589g = (E) C5950a.e(e10);
        this.f32590h = this.f32583a.e(looper, (Handler.Callback) null);
        this.f32588f = this.f32588f.e(looper, new C6310g(this, e10));
    }

    public final void o(C5807s sVar, C6280c cVar) {
        C6300b.a H12 = H1();
        V2(H12, 1009, new C6292C(H12, sVar, cVar));
    }

    public void o0(boolean z10) {
        C6300b.a B12 = B1();
        V2(B12, 7, new C6318k(B12, z10));
    }

    public final void p(D d10) {
        C6300b.a B12 = B1();
        V2(B12, 12, new C6324n(B12, d10));
    }

    public final void q(C5807s sVar, C6280c cVar) {
        C6300b.a H12 = H1();
        V2(H12, 1017, new C6290A(H12, sVar, cVar));
    }

    public final void r(C6279b bVar) {
        C6300b.a H12 = H1();
        V2(H12, 1007, new C6321l0(H12, bVar));
    }

    public void release() {
        ((C5962m) C5950a.i(this.f32590h)).h(new C6295F(this));
    }

    public final void s(int i10, long j10) {
        C6300b.a G12 = G1();
        V2(G12, 1018, new C6328p(G12, i10, j10));
    }

    public final void t(Object obj, long j10) {
        C6300b.a H12 = H1();
        V2(H12, 26, new X(H12, obj, j10));
    }

    public final void u(int i10) {
        C6300b.a B12 = B1();
        V2(B12, 8, new C6296G(B12, i10));
    }

    public final void v(C6279b bVar) {
        C6300b.a H12 = H1();
        V2(H12, 1015, new C6294E(H12, bVar));
    }

    public final void w(Exception exc) {
        C6300b.a H12 = H1();
        V2(H12, 1029, new C6297H(H12, exc));
    }

    public void x(b bVar) {
        C6300b.a B12 = B1();
        V2(B12, 27, new V(B12, bVar));
    }

    public final void y(int i10, long j10, long j11) {
        C6300b.a H12 = H1();
        V2(H12, 1011, new P(H12, i10, j10, j11));
    }

    public final void z(C6279b bVar) {
        C6300b.a G12 = G1();
        V2(G12, 1013, new C6343x(G12, bVar));
    }
}
