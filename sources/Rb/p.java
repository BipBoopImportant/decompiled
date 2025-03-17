package rb;

import Cb.C9062l;
import Cb.y;
import Db.c;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qb.C10156a;
import qb.C10167l;
import qb.C10179x;
import vb.C10302b;

public final class p extends d<C9062l> {

    class a extends m<C10156a, C9062l> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(C9062l lVar) {
            return new c(lVar.T().E());
        }
    }

    class b extends d.a<Cb.m, C9062l> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<Cb.m>> c() {
            HashMap hashMap = new HashMap();
            C10167l.b bVar = C10167l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            C10167l.b bVar2 = C10167l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C9062l a(Cb.m mVar) {
            return (C9062l) C9062l.V().w(C9525h.m(Db.p.c(mVar.S()))).y(p.this.m()).g();
        }

        /* renamed from: g */
        public Cb.m d(C9525h hVar) {
            return Cb.m.U(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(Cb.m mVar) {
            r.a(mVar.S());
        }
    }

    p() {
        super(C9062l.class, new a(C10156a.class));
    }

    /* access modifiers changed from: private */
    public static d.a.C1174a<Cb.m> l(int i10, C10167l.b bVar) {
        return new d.a.C1174a<>((Cb.m) Cb.m.T().w(i10).g(), bVar);
    }

    public static void o(boolean z10) {
        C10179x.l(new p(), z10);
        s.c();
    }

    public C10302b.C1424b a() {
        return C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public d.a<Cb.m, C9062l> f() {
        return new b(Cb.m.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    /* renamed from: n */
    public C9062l h(C9525h hVar) {
        return C9062l.W(hVar, C9533p.b());
    }

    /* renamed from: p */
    public void j(C9062l lVar) {
        r.c(lVar.U(), m());
        r.a(lVar.T().size());
    }
}
