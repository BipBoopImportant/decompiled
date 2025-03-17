package yb;

import Cb.C9051a;
import Cb.C9052b;
import Cb.C9053c;
import Cb.y;
import Db.o;
import Db.p;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qb.C10167l;
import qb.C10175t;
import qb.C10179x;

/* renamed from: yb.c  reason: case insensitive filesystem */
public final class C10416c extends d<C9051a> {

    /* renamed from: d  reason: collision with root package name */
    private static final l<C10414a, C10420g> f77819d = l.b(new C10415b(), C10414a.class, C10420g.class);

    /* renamed from: yb.c$a */
    class a extends m<C10175t, C9051a> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10175t a(C9051a aVar) {
            return new o(new Db.m(aVar.U().E()), aVar.V().T());
        }
    }

    /* renamed from: yb.c$b */
    class b extends d.a<C9052b, C9051a> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<C9052b>> c() {
            HashMap hashMap = new HashMap();
            C10167l.b bVar = C10167l.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C1174a((C9052b) C9052b.V().w(32).y((C9053c) C9053c.U().w(16).g()).g(), bVar));
            hashMap.put("AES256_CMAC", new d.a.C1174a((C9052b) C9052b.V().w(32).y((C9053c) C9053c.U().w(16).g()).g(), bVar));
            hashMap.put("AES256_CMAC_RAW", new d.a.C1174a((C9052b) C9052b.V().w(32).y((C9053c) C9053c.U().w(16).g()).g(), C10167l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C9051a a(C9052b bVar) {
            return (C9051a) C9051a.X().z(0).w(C9525h.m(p.c(bVar.T()))).y(bVar.U()).g();
        }

        /* renamed from: g */
        public C9052b d(C9525h hVar) {
            return C9052b.W(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(C9052b bVar) {
            C10416c.q(bVar.U());
            C10416c.r(bVar.T());
        }
    }

    C10416c() {
        super(C9051a.class, new a(C10175t.class));
    }

    public static void o(boolean z10) {
        C10179x.l(new C10416c(), z10);
        C10419f.c();
        h.c().d(f77819d);
    }

    /* access modifiers changed from: private */
    public static void q(C9053c cVar) {
        if (cVar.T() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.T() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void r(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public d.a<C9052b, C9051a> f() {
        return new b(C9052b.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    /* renamed from: n */
    public C9051a h(C9525h hVar) {
        return C9051a.Y(hVar, C9533p.b());
    }

    /* renamed from: p */
    public void j(C9051a aVar) {
        r.c(aVar.W(), m());
        r(aVar.U().size());
        q(aVar.V());
    }
}
