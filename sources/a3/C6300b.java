package A3;

import B3.C6375y;
import G3.C6477A;
import G3.C6479C;
import G3.C6503x;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import jb.j;
import q3.C;
import q3.C5806q;
import q3.C5807s;
import q3.D;
import q3.E;
import q3.J;
import q3.M;
import q3.N;
import q3.S;
import q3.w;
import q3.y;
import q3.z;
import s3.b;
import t3.C5950a;
import z3.C6279b;
import z3.C6280c;

/* renamed from: A3.b  reason: case insensitive filesystem */
public interface C6300b {

    /* renamed from: A3.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f32514a;

        /* renamed from: b  reason: collision with root package name */
        public final J f32515b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32516c;

        /* renamed from: d  reason: collision with root package name */
        public final C6479C.b f32517d;

        /* renamed from: e  reason: collision with root package name */
        public final long f32518e;

        /* renamed from: f  reason: collision with root package name */
        public final J f32519f;

        /* renamed from: g  reason: collision with root package name */
        public final int f32520g;

        /* renamed from: h  reason: collision with root package name */
        public final C6479C.b f32521h;

        /* renamed from: i  reason: collision with root package name */
        public final long f32522i;

        /* renamed from: j  reason: collision with root package name */
        public final long f32523j;

        public a(long j10, J j11, int i10, C6479C.b bVar, long j12, J j13, int i11, C6479C.b bVar2, long j14, long j15) {
            this.f32514a = j10;
            this.f32515b = j11;
            this.f32516c = i10;
            this.f32517d = bVar;
            this.f32518e = j12;
            this.f32519f = j13;
            this.f32520g = i11;
            this.f32521h = bVar2;
            this.f32522i = j14;
            this.f32523j = j15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32514a == aVar.f32514a && this.f32516c == aVar.f32516c && this.f32518e == aVar.f32518e && this.f32520g == aVar.f32520g && this.f32522i == aVar.f32522i && this.f32523j == aVar.f32523j && j.a(this.f32515b, aVar.f32515b) && j.a(this.f32517d, aVar.f32517d) && j.a(this.f32519f, aVar.f32519f) && j.a(this.f32521h, aVar.f32521h);
        }

        public int hashCode() {
            return j.b(Long.valueOf(this.f32514a), this.f32515b, Integer.valueOf(this.f32516c), this.f32517d, Long.valueOf(this.f32518e), this.f32519f, Integer.valueOf(this.f32520g), this.f32521h, Long.valueOf(this.f32522i), Long.valueOf(this.f32523j));
        }
    }

    /* renamed from: A3.b$b  reason: collision with other inner class name */
    public static final class C0501b {

        /* renamed from: a  reason: collision with root package name */
        private final C5806q f32524a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f32525b;

        public C0501b(C5806q qVar, SparseArray<a> sparseArray) {
            this.f32524a = qVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(qVar.d());
            for (int i10 = 0; i10 < qVar.d(); i10++) {
                int c10 = qVar.c(i10);
                sparseArray2.append(c10, (a) C5950a.e(sparseArray.get(c10)));
            }
            this.f32525b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f32524a.a(i10);
        }

        public int b(int i10) {
            return this.f32524a.c(i10);
        }

        public a c(int i10) {
            return (a) C5950a.e(this.f32525b.get(i10));
        }

        public int d() {
            return this.f32524a.d();
        }
    }

    @Deprecated
    void A(a aVar, List<s3.a> list) {
    }

    void B(a aVar, C5807s sVar, C6280c cVar) {
    }

    void C(a aVar, long j10, int i10) {
    }

    void D(a aVar, C6279b bVar) {
    }

    void E(a aVar, E.b bVar) {
    }

    void F(a aVar, N n10) {
    }

    @Deprecated
    void G(a aVar, boolean z10, int i10) {
    }

    void H(a aVar, boolean z10, int i10) {
    }

    void I(a aVar) {
    }

    @Deprecated
    void J(a aVar, String str, long j10) {
    }

    void K(a aVar, int i10, long j10) {
    }

    @Deprecated
    void L(a aVar, int i10) {
    }

    void M(a aVar, int i10) {
    }

    void N(a aVar, int i10, int i11, boolean z10) {
    }

    void O(a aVar, C c10) {
    }

    void P(a aVar, int i10) {
    }

    void Q(a aVar, w wVar, int i10) {
    }

    void R(a aVar, M m10) {
    }

    void S(a aVar, z zVar) {
    }

    void T(E e10, C0501b bVar) {
    }

    void U(a aVar, int i10) {
    }

    void V(a aVar, boolean z10) {
    }

    void W(a aVar, C6503x xVar, C6477A a10) {
    }

    void X(a aVar, float f10) {
    }

    void Y(a aVar) {
    }

    void Z(a aVar, C6375y.a aVar2) {
    }

    void a(a aVar, C6279b bVar) {
    }

    @Deprecated
    void a0(a aVar) {
    }

    void b(a aVar, C6279b bVar) {
    }

    void b0(a aVar, D d10) {
    }

    void c(a aVar, String str, long j10, long j11) {
    }

    @Deprecated
    void c0(a aVar) {
    }

    void d(a aVar, long j10) {
    }

    void d0(a aVar, Exception exc) {
    }

    void e(a aVar, int i10, boolean z10) {
    }

    void f(a aVar, Exception exc) {
    }

    void f0(a aVar, boolean z10) {
    }

    @Deprecated
    void g(a aVar, int i10, int i11, int i12, float f10) {
    }

    void g0(a aVar, String str) {
    }

    void h(a aVar, int i10, long j10, long j11) {
    }

    void h0(a aVar, S s10) {
    }

    void i(a aVar, int i10) {
    }

    void i0(a aVar, b bVar) {
    }

    void j(a aVar, int i10, long j10, long j11) {
    }

    void j0(a aVar, int i10) {
    }

    void k(a aVar, boolean z10) {
    }

    void k0(a aVar, int i10, int i11) {
    }

    void l(a aVar, Exception exc) {
    }

    void l0(a aVar, String str) {
    }

    void m(a aVar, C6279b bVar) {
    }

    @Deprecated
    void m0(a aVar, String str, long j10) {
    }

    void n(a aVar, y yVar) {
    }

    void n0(a aVar, String str, long j10, long j11) {
    }

    void o0(a aVar, E.e eVar, E.e eVar2, int i10) {
    }

    void p(a aVar, C6477A a10) {
    }

    void p0(a aVar, Exception exc) {
    }

    void q(a aVar, Object obj, long j10) {
    }

    void q0(a aVar) {
    }

    void r(a aVar, C c10) {
    }

    @Deprecated
    void r0(a aVar, boolean z10) {
    }

    void s(a aVar, C6503x xVar, C6477A a10) {
    }

    void s0(a aVar, C6503x xVar, C6477A a10) {
    }

    void t(a aVar) {
    }

    void t0(a aVar, C5807s sVar, C6280c cVar) {
    }

    void w(a aVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
    }

    void x(a aVar, C6375y.a aVar2) {
    }

    void y(a aVar) {
    }

    void z(a aVar, boolean z10) {
    }
}
