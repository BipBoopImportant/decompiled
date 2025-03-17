package G3;

import A3.v1;
import C3.t;
import J3.C6569b;
import J3.C6572e;
import J3.j;
import android.os.Handler;
import k4.s;
import q3.J;
import q3.w;
import w3.C;

/* renamed from: G3.C  reason: case insensitive filesystem */
public interface C6479C {

    /* renamed from: G3.C$a */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35619a = K.f35648b;

        a b(s.a aVar) {
            return this;
        }

        a c(j jVar);

        C6479C d(w wVar);

        @Deprecated
        a e(boolean z10) {
            return this;
        }

        a f(C3.w wVar);

        a g(C6572e eVar) {
            return this;
        }
    }

    /* renamed from: G3.C$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f35620a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35621b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35622c;

        /* renamed from: d  reason: collision with root package name */
        public final long f35623d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35624e;

        public b(Object obj) {
            this(obj, -1);
        }

        public b a(Object obj) {
            if (this.f35620a.equals(obj)) {
                return this;
            }
            return new b(obj, this.f35621b, this.f35622c, this.f35623d, this.f35624e);
        }

        public boolean b() {
            return this.f35621b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f35620a.equals(bVar.f35620a) && this.f35621b == bVar.f35621b && this.f35622c == bVar.f35622c && this.f35623d == bVar.f35623d && this.f35624e == bVar.f35624e;
        }

        public int hashCode() {
            return ((((((((527 + this.f35620a.hashCode()) * 31) + this.f35621b) * 31) + this.f35622c) * 31) + ((int) this.f35623d)) * 31) + this.f35624e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f35620a = obj;
            this.f35621b = i10;
            this.f35622c = i11;
            this.f35623d = j10;
            this.f35624e = i12;
        }
    }

    /* renamed from: G3.C$c */
    public interface c {
        void a(C6479C c10, J j10);
    }

    C6478B a(b bVar, C6569b bVar2, long j10);

    void b(c cVar);

    void c(t tVar);

    void d(c cVar);

    w e();

    void f(c cVar, C c10, v1 v1Var);

    void g(Handler handler, J j10);

    void h(J j10);

    void j();

    boolean k() {
        return true;
    }

    void l(w wVar) {
    }

    J m() {
        return null;
    }

    void n(Handler handler, t tVar);

    void o(C6478B b10);

    void p(c cVar);
}
