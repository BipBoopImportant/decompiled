package rb;

import Cb.C9054d;
import Cb.C9055e;
import Cb.C9057g;
import Cb.C9058h;
import Cb.u;
import Cb.w;
import Cb.x;
import Cb.y;
import Db.h;
import Db.l;
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
import qb.C10175t;
import qb.C10179x;
import vb.C10302b;
import yb.C10424k;

/* renamed from: rb.e  reason: case insensitive filesystem */
public final class C10207e extends d<C9054d> {

    /* renamed from: rb.e$a */
    class a extends m<C10156a, C9054d> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(C9054d dVar) {
            return new h((l) new C10208f().e(dVar.U(), l.class), (C10175t) new C10424k().e(dVar.V(), C10175t.class), dVar.V().W().V());
        }
    }

    /* renamed from: rb.e$b */
    class b extends d.a<C9055e, C9054d> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<C9055e>> c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            C10167l.b bVar = C10167l.b.TINK;
            u uVar2 = uVar;
            hashMap.put("AES128_CTR_HMAC_SHA256", C10207e.m(16, 16, 32, 16, uVar2, bVar));
            C10167l.b bVar2 = C10167l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C10207e.m(16, 16, 32, 16, uVar2, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C10207e.m(32, 16, 32, 32, uVar2, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C10207e.m(32, 16, 32, 32, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C9054d a(C9055e eVar) {
            return (C9054d) C9054d.X().w(new C10208f().f().a(eVar.T())).y(new C10424k().f().a(eVar.U())).z(C10207e.this.n()).g();
        }

        /* renamed from: g */
        public C9055e d(C9525h hVar) {
            return C9055e.W(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(C9055e eVar) {
            new C10208f().f().e(eVar.T());
            new C10424k().f().e(eVar.U());
            r.a(eVar.T().U());
        }
    }

    C10207e() {
        super(C9054d.class, new a(C10156a.class));
    }

    private static C9055e l(int i10, int i11, int i12, int i13, u uVar) {
        return (C9055e) C9055e.V().w((C9057g) C9057g.W().y((C9058h) C9058h.U().w(i11).g()).w(i10).g()).y((w) w.W().y((x) x.W().w(uVar).y(i13).g()).w(i12).g()).g();
    }

    /* access modifiers changed from: private */
    public static d.a.C1174a<C9055e> m(int i10, int i11, int i12, int i13, u uVar, C10167l.b bVar) {
        return new d.a.C1174a<>(l(i10, i11, i12, i13, uVar), bVar);
    }

    public static void p(boolean z10) {
        C10179x.l(new C10207e(), z10);
    }

    public C10302b.C1424b a() {
        return C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public d.a<C9055e, C9054d> f() {
        return new b(C9055e.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    /* renamed from: o */
    public C9054d h(C9525h hVar) {
        return C9054d.Y(hVar, C9533p.b());
    }

    /* renamed from: q */
    public void j(C9054d dVar) {
        r.c(dVar.W(), n());
        new C10208f().j(dVar.U());
        new C10424k().j(dVar.V());
    }
}
