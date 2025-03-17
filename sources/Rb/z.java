package rb;

import Cb.r;
import Cb.s;
import Cb.y;
import Db.g;
import Db.p;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qb.C10156a;
import qb.C10167l;
import qb.C10179x;

public class z extends d<r> {

    class a extends m<C10156a, r> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(r rVar) {
            return new g(rVar.T().E());
        }
    }

    class b extends d.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<s>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new d.a.C1174a(s.R(), C10167l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C1174a(s.R(), C10167l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public r a(s sVar) {
            return (r) r.V().y(z.this.k()).w(C9525h.m(p.c(32))).g();
        }

        /* renamed from: g */
        public s d(C9525h hVar) {
            return s.S(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(s sVar) {
        }
    }

    z() {
        super(r.class, new a(C10156a.class));
    }

    public static void m(boolean z10) {
        C10179x.l(new z(), z10);
        C10199C.c();
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public d.a<s, r> f() {
        return new b(s.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public r h(C9525h hVar) {
        return r.W(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(r rVar) {
        Db.r.c(rVar.U(), k());
        if (rVar.T().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
