package rb;

import Cb.E;
import Cb.F;
import Cb.y;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import qb.C10156a;
import qb.C10174s;
import qb.C10179x;

/* renamed from: rb.D  reason: case insensitive filesystem */
public class C10200D extends d<E> {

    /* renamed from: rb.D$a */
    class a extends m<C10156a, E> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(E e10) {
            String S10 = e10.T().S();
            return C10174s.a(S10).b(S10);
        }
    }

    /* renamed from: rb.D$b */
    class b extends d.a<F, E> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public E a(F f10) {
            return (E) E.V().w(f10).y(C10200D.this.k()).g();
        }

        /* renamed from: g */
        public F d(C9525h hVar) {
            return F.T(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(F f10) {
        }
    }

    C10200D() {
        super(E.class, new a(C10156a.class));
    }

    public static void m(boolean z10) {
        C10179x.l(new C10200D(), z10);
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public d.a<F, E> f() {
        return new b(F.class);
    }

    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public E h(C9525h hVar) {
        return E.W(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(E e10) {
        r.c(e10.U(), k());
    }
}
