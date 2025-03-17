package rb;

import Cb.K;
import Cb.L;
import Cb.y;
import Db.p;
import Db.r;
import Db.s;
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

public class H extends d<K> {

    class a extends m<C10156a, K> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(K k10) {
            return new s(k10.T().E());
        }
    }

    class b extends d.a<L, K> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<L>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new d.a.C1174a(L.R(), C10167l.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new d.a.C1174a(L.R(), C10167l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public K a(L l10) {
            return (K) K.V().y(H.this.k()).w(C9525h.m(p.c(32))).g();
        }

        /* renamed from: g */
        public L d(C9525h hVar) {
            return L.S(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(L l10) {
        }
    }

    H() {
        super(K.class, new a(C10156a.class));
    }

    public static void m(boolean z10) {
        C10179x.l(new H(), z10);
        K.c();
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public d.a<L, K> f() {
        return new b(L.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public K h(C9525h hVar) {
        return K.W(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(K k10) {
        r.c(k10.U(), k());
        if (k10.T().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
