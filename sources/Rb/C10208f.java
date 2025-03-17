package rb;

import Cb.C9056f;
import Cb.C9057g;
import Cb.C9058h;
import Cb.y;
import Db.l;
import Db.p;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;

/* renamed from: rb.f  reason: case insensitive filesystem */
public class C10208f extends d<C9056f> {

    /* renamed from: rb.f$a */
    class a extends m<l, C9056f> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public l a(C9056f fVar) {
            return new Db.a(fVar.V().E(), fVar.W().T());
        }
    }

    /* renamed from: rb.f$b */
    class b extends d.a<C9057g, C9056f> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: f */
        public C9056f a(C9057g gVar) {
            return (C9056f) C9056f.Y().y(gVar.V()).w(C9525h.m(p.c(gVar.U()))).z(C10208f.this.l()).g();
        }

        /* renamed from: g */
        public C9057g d(C9525h hVar) {
            return C9057g.X(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(C9057g gVar) {
            r.a(gVar.U());
            C10208f.this.o(gVar.V());
        }
    }

    C10208f() {
        super(C9056f.class, new a(l.class));
    }

    /* access modifiers changed from: private */
    public void o(C9058h hVar) {
        if (hVar.T() < 12 || hVar.T() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public d.a<C9057g, C9056f> f() {
        return new b(C9057g.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public C9056f h(C9525h hVar) {
        return C9056f.Z(hVar, C9533p.b());
    }

    /* renamed from: n */
    public void j(C9056f fVar) {
        r.c(fVar.X(), l());
        r.a(fVar.V().size());
        o(fVar.W());
    }
}
