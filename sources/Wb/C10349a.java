package wb;

import Cb.p;
import Cb.q;
import Cb.y;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qb.C10160e;
import qb.C10167l;
import qb.C10179x;

/* renamed from: wb.a  reason: case insensitive filesystem */
public final class C10349a extends d<p> {

    /* renamed from: wb.a$a  reason: collision with other inner class name */
    class C1432a extends m<C10160e, p> {
        C1432a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10160e a(p pVar) {
            return new Db.d(pVar.T().E());
        }
    }

    /* renamed from: wb.a$b */
    class b extends d.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<q>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new d.a.C1174a((q) q.T().w(64).g(), C10167l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C1174a((q) q.T().w(64).g(), C10167l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public p a(q qVar) {
            return (p) p.V().w(C9525h.m(Db.p.c(qVar.S()))).y(C10349a.this.k()).g();
        }

        /* renamed from: g */
        public q d(C9525h hVar) {
            return q.U(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(q qVar) {
            if (qVar.S() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.S() + ". Valid keys must have " + 64 + " bytes.");
            }
        }
    }

    C10349a() {
        super(p.class, new C1432a(C10160e.class));
    }

    public static void m(boolean z10) {
        C10179x.l(new C10349a(), z10);
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public d.a<q, p> f() {
        return new b(q.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public p h(C9525h hVar) {
        return p.W(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(p pVar) {
        r.c(pVar.U(), k());
        if (pVar.T().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + pVar.T().size() + ". Valid keys must have " + 64 + " bytes.");
        }
    }
}
