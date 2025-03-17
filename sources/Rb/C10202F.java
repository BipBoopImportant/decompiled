package rb;

import Cb.G;
import Cb.H;
import Cb.y;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import qb.C10156a;
import qb.C10174s;
import qb.C10179x;

/* renamed from: rb.F  reason: case insensitive filesystem */
public class C10202F extends d<G> {

    /* renamed from: rb.F$a */
    class a extends m<C10156a, G> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(G g10) {
            String T10 = g10.T().T();
            return new C10201E(g10.T().S(), C10174s.a(T10).b(T10));
        }
    }

    /* renamed from: rb.F$b */
    class b extends d.a<H, G> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public G a(H h10) {
            return (G) G.V().w(h10).y(C10202F.this.k()).g();
        }

        /* renamed from: g */
        public H d(C9525h hVar) {
            return H.V(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(H h10) {
            if (h10.T().isEmpty() || !h10.U()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    C10202F() {
        super(G.class, new a(C10156a.class));
    }

    public static void m(boolean z10) {
        C10179x.l(new C10202F(), z10);
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public d.a<H, G> f() {
        return new b(H.class);
    }

    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public G h(C9525h hVar) {
        return G.W(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(G g10) {
        r.c(g10.U(), k());
    }
}
