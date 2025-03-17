package q3;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import jb.j;
import q3.C5806q;
import t3.N;

public interface E {

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f27862b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        private static final String f27863c = N.A0(0);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C5806q f27864a;

        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f27865b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a  reason: collision with root package name */
            private final C5806q.b f27866a = new C5806q.b();

            public a a(int i10) {
                this.f27866a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f27866a.b(bVar.f27864a);
                return this;
            }

            public a c(int... iArr) {
                this.f27866a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f27866a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f27866a.e());
            }
        }

        public boolean b(int i10) {
            return this.f27864a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f27864a.equals(((b) obj).f27864a);
        }

        public int hashCode() {
            return this.f27864a.hashCode();
        }

        private b(C5806q qVar) {
            this.f27864a = qVar;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C5806q f27867a;

        public c(C5806q qVar) {
            this.f27867a = qVar;
        }

        public boolean a(int... iArr) {
            return this.f27867a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f27867a.equals(((c) obj).f27867a);
        }

        public int hashCode() {
            return this.f27867a.hashCode();
        }
    }

    public interface d {
        void B(int i10) {
        }

        @Deprecated
        void D(boolean z10) {
        }

        void E(y yVar) {
        }

        void F(int i10) {
        }

        void I(boolean z10) {
        }

        void N(e eVar, e eVar2, int i10) {
        }

        void O(int i10, boolean z10) {
        }

        void Q() {
        }

        void S(C c10) {
        }

        void T(b bVar) {
        }

        void V(int i10, int i11) {
        }

        void W(M m10) {
        }

        void X(J j10, int i10) {
        }

        @Deprecated
        void Y(int i10) {
        }

        void Z(boolean z10) {
        }

        void a(boolean z10) {
        }

        void a0(float f10) {
        }

        void b0(w wVar, int i10) {
        }

        void c0(N n10) {
        }

        void d0(E e10, c cVar) {
        }

        void e(S s10) {
        }

        @Deprecated
        void f0(boolean z10, int i10) {
        }

        void g0(C c10) {
        }

        void h(z zVar) {
        }

        @Deprecated
        void k(List<s3.a> list) {
        }

        void l0(boolean z10, int i10) {
        }

        void o0(boolean z10) {
        }

        void p(D d10) {
        }

        void u(int i10) {
        }

        void x(s3.b bVar) {
        }
    }

    public static final class e {

        /* renamed from: k  reason: collision with root package name */
        static final String f27868k = N.A0(0);

        /* renamed from: l  reason: collision with root package name */
        private static final String f27869l = N.A0(1);

        /* renamed from: m  reason: collision with root package name */
        static final String f27870m = N.A0(2);

        /* renamed from: n  reason: collision with root package name */
        static final String f27871n = N.A0(3);

        /* renamed from: o  reason: collision with root package name */
        static final String f27872o = N.A0(4);

        /* renamed from: p  reason: collision with root package name */
        private static final String f27873p = N.A0(5);

        /* renamed from: q  reason: collision with root package name */
        private static final String f27874q = N.A0(6);

        /* renamed from: a  reason: collision with root package name */
        public final Object f27875a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final int f27876b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27877c;

        /* renamed from: d  reason: collision with root package name */
        public final w f27878d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f27879e;

        /* renamed from: f  reason: collision with root package name */
        public final int f27880f;

        /* renamed from: g  reason: collision with root package name */
        public final long f27881g;

        /* renamed from: h  reason: collision with root package name */
        public final long f27882h;

        /* renamed from: i  reason: collision with root package name */
        public final int f27883i;

        /* renamed from: j  reason: collision with root package name */
        public final int f27884j;

        public e(Object obj, int i10, w wVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f27875a = obj;
            this.f27876b = i10;
            this.f27877c = i10;
            this.f27878d = wVar;
            this.f27879e = obj2;
            this.f27880f = i11;
            this.f27881g = j10;
            this.f27882h = j11;
            this.f27883i = i12;
            this.f27884j = i13;
        }

        public boolean a(e eVar) {
            return this.f27877c == eVar.f27877c && this.f27880f == eVar.f27880f && this.f27881g == eVar.f27881g && this.f27882h == eVar.f27882h && this.f27883i == eVar.f27883i && this.f27884j == eVar.f27884j && j.a(this.f27878d, eVar.f27878d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return a(eVar) && j.a(this.f27875a, eVar.f27875a) && j.a(this.f27879e, eVar.f27879e);
        }

        public int hashCode() {
            return j.b(this.f27875a, Integer.valueOf(this.f27877c), this.f27878d, this.f27879e, Integer.valueOf(this.f27880f), Long.valueOf(this.f27881g), Long.valueOf(this.f27882h), Integer.valueOf(this.f27883i), Integer.valueOf(this.f27884j));
        }
    }

    void A(d dVar);

    Looper B();

    M C();

    void D();

    void E(TextureView textureView);

    void F(int i10, long j10);

    b G();

    boolean H();

    void I(boolean z10);

    long J();

    long K();

    int L();

    void M(TextureView textureView);

    S N();

    void O(w wVar);

    boolean P();

    int Q();

    void R(long j10);

    long S();

    long T();

    boolean U();

    int V();

    boolean W();

    void X(M m10);

    int Y();

    void Z(int i10);

    long a();

    void a0(SurfaceView surfaceView);

    int b0();

    void c();

    boolean c0();

    void d();

    long d0();

    D e();

    void e0();

    boolean f();

    void f0();

    void g(D d10);

    y g0();

    void h(float f10);

    long h0();

    void i();

    long i0();

    void j(float f10);

    boolean j0();

    long k();

    void l();

    void m(List<w> list, boolean z10);

    void n(SurfaceView surfaceView);

    void o();

    C p();

    void q(boolean z10);

    N r();

    void release();

    boolean s();

    void stop();

    s3.b t();

    void u(d dVar);

    int v();

    boolean w(int i10);

    boolean x();

    int y();

    J z();
}
