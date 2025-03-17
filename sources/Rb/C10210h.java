package rb;

import Cb.C9059i;
import Cb.C9060j;
import Cb.C9061k;
import Cb.y;
import Db.p;
import Db.r;
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

/* renamed from: rb.h  reason: case insensitive filesystem */
public final class C10210h extends d<C9059i> {

    /* renamed from: rb.h$a */
    class a extends m<C10156a, C9059i> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10156a a(C9059i iVar) {
            return new Db.b(iVar.U().E(), iVar.V().T());
        }
    }

    /* renamed from: rb.h$b */
    class b extends d.a<C9060j, C9059i> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<C9060j>> c() {
            HashMap hashMap = new HashMap();
            C10167l.b bVar = C10167l.b.TINK;
            hashMap.put("AES128_EAX", C10210h.l(16, 16, bVar));
            C10167l.b bVar2 = C10167l.b.RAW;
            hashMap.put("AES128_EAX_RAW", C10210h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", C10210h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", C10210h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public C9059i a(C9060j jVar) {
            return (C9059i) C9059i.X().w(C9525h.m(p.c(jVar.T()))).y(jVar.U()).z(C10210h.this.m()).g();
        }

        /* renamed from: g */
        public C9060j d(C9525h hVar) {
            return C9060j.W(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(C9060j jVar) {
            r.a(jVar.T());
            if (jVar.U().T() != 12 && jVar.U().T() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    C10210h() {
        super(C9059i.class, new a(C10156a.class));
    }

    /* access modifiers changed from: private */
    public static d.a.C1174a<C9060j> l(int i10, int i11, C10167l.b bVar) {
        return new d.a.C1174a<>((C9060j) C9060j.V().w(i10).y((C9061k) C9061k.U().w(i11).g()).g(), bVar);
    }

    public static void o(boolean z10) {
        C10179x.l(new C10210h(), z10);
        n.c();
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public d.a<C9060j, C9059i> f() {
        return new b(C9060j.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    /* renamed from: n */
    public C9059i h(C9525h hVar) {
        return C9059i.Y(hVar, C9533p.b());
    }

    /* renamed from: p */
    public void j(C9059i iVar) {
        r.c(iVar.W(), m());
        r.a(iVar.U().size());
        if (iVar.V().T() != 12 && iVar.V().T() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
