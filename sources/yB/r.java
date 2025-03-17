package yb;

import Ab.b;
import Ab.c;
import Cb.I;
import Db.f;
import com.google.crypto.tink.internal.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import qb.C10175t;
import qb.C10177v;
import qb.C10178w;
import qb.C10179x;

class r implements C10178w<C10175t, C10175t> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f77880a = Logger.getLogger(r.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f77881b = {0};

    /* renamed from: c  reason: collision with root package name */
    private static final r f77882c = new r();

    private static class b implements C10175t {

        /* renamed from: a  reason: collision with root package name */
        private final C10177v<C10175t> f77883a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f77884b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f77885c;

        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C10177v.c next : this.f77883a.f(copyOf)) {
                    byte[] a10 = next.f().equals(I.LEGACY) ? f.a(bArr2, r.f77881b) : bArr2;
                    try {
                        ((C10175t) next.g()).a(copyOfRange, a10);
                        this.f77885c.a(next.d(), (long) a10.length);
                        return;
                    } catch (GeneralSecurityException e10) {
                        Logger e11 = r.f77880a;
                        e11.info("tag prefix matches a key, but cannot verify: " + e10);
                    }
                }
                for (C10177v.c next2 : this.f77883a.h()) {
                    try {
                        ((C10175t) next2.g()).a(bArr, bArr2);
                        this.f77885c.a(next2.d(), (long) bArr2.length);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.f77885c.b();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.f77885c.b();
            throw new GeneralSecurityException("tag too short");
        }

        public byte[] b(byte[] bArr) {
            if (this.f77883a.e().f().equals(I.LEGACY)) {
                bArr = f.a(bArr, r.f77881b);
            }
            try {
                byte[] a10 = f.a(this.f77883a.e().b(), this.f77883a.e().g().b(bArr));
                this.f77884b.a(this.f77883a.e().d(), (long) bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f77884b.b();
                throw e10;
            }
        }

        private b(C10177v<C10175t> vVar) {
            this.f77883a = vVar;
            if (vVar.i()) {
                Ab.b a10 = g.b().a();
                c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f77884b = a10.a(a11, "mac", "compute");
                this.f77885c = a10.a(a11, "mac", "verify");
                return;
            }
            b.a aVar = com.google.crypto.tink.internal.f.f67861a;
            this.f77884b = aVar;
            this.f77885c = aVar;
        }
    }

    r() {
    }

    public static void f() {
        C10179x.n(f77882c);
    }

    private void g(C10177v<C10175t> vVar) {
        for (List<C10177v.c<C10175t>> it : vVar.c()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C10177v.c cVar = (C10177v.c) it2.next();
                    if (cVar.c() instanceof p) {
                        p pVar = (p) cVar.c();
                        Eb.a a10 = Eb.a.a(cVar.b());
                        if (!a10.equals(pVar.a())) {
                            throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a10 + ")");
                        }
                    }
                }
            }
        }
    }

    public Class<C10175t> b() {
        return C10175t.class;
    }

    public Class<C10175t> c() {
        return C10175t.class;
    }

    /* renamed from: h */
    public C10175t a(C10177v<C10175t> vVar) {
        g(vVar);
        return new b(vVar);
    }
}
