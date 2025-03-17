package rb;

import Cb.n;
import Cb.o;
import Cb.y;
import Db.p;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import qb.C10156a;
import qb.C10167l;
import qb.C10179x;
import tb.C10248a;

public final class u extends d<n> {

    class a extends m<C10156a, n> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(n nVar) {
            return new C10248a(nVar.T().E());
        }
    }

    class b extends d.a<o, n> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<o>> c() {
            HashMap hashMap = new HashMap();
            C10167l.b bVar = C10167l.b.TINK;
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            C10167l.b bVar2 = C10167l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public n a(o oVar) {
            return (n) n.V().w(C9525h.m(p.c(oVar.S()))).y(u.this.n()).g();
        }

        /* renamed from: g */
        public o d(C9525h hVar) {
            return o.U(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(o oVar) {
            r.a(oVar.S());
        }
    }

    u() {
        super(n.class, new a(C10156a.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static d.a.C1174a<o> m(int i10, C10167l.b bVar) {
        return new d.a.C1174a<>((o) o.T().w(i10).g(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            C10179x.l(new u(), z10);
            x.c();
        }
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public d.a<o, n> f() {
        return new b(o.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    /* renamed from: o */
    public n h(C9525h hVar) {
        return n.W(hVar, C9533p.b());
    }

    /* renamed from: q */
    public void j(n nVar) {
        r.c(nVar.U(), n());
        r.a(nVar.T().size());
    }
}
