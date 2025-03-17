package rb;

import Ab.b;
import Ab.c;
import Db.f;
import com.google.crypto.tink.internal.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import qb.C10156a;
import qb.C10177v;
import qb.C10178w;
import qb.C10179x;

/* renamed from: rb.d  reason: case insensitive filesystem */
public class C10206d implements C10178w<C10156a, C10156a> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f76294a = Logger.getLogger(C10206d.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final C10206d f76295b = new C10206d();

    /* renamed from: rb.d$b */
    private static class b implements C10156a {

        /* renamed from: a  reason: collision with root package name */
        private final C10177v<C10156a> f76296a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f76297b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f76298c;

        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = f.a(this.f76296a.e().b(), this.f76296a.e().g().a(bArr, bArr2));
                this.f76297b.a(this.f76296a.e().d(), (long) bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f76297b.b();
                throw e10;
            }
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C10177v.c next : this.f76296a.f(copyOf)) {
                    try {
                        byte[] b10 = ((C10156a) next.g()).b(copyOfRange, bArr2);
                        this.f76298c.a(next.d(), (long) copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger d10 = C10206d.f76294a;
                        d10.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (C10177v.c next2 : this.f76296a.h()) {
                try {
                    byte[] b11 = ((C10156a) next2.g()).b(bArr, bArr2);
                    this.f76298c.a(next2.d(), (long) bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f76298c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        private b(C10177v<C10156a> vVar) {
            this.f76296a = vVar;
            if (vVar.i()) {
                Ab.b a10 = g.b().a();
                c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f76297b = a10.a(a11, "aead", "encrypt");
                this.f76298c = a10.a(a11, "aead", "decrypt");
                return;
            }
            b.a aVar = com.google.crypto.tink.internal.f.f67861a;
            this.f76297b = aVar;
            this.f76298c = aVar;
        }
    }

    C10206d() {
    }

    public static void e() {
        C10179x.n(f76295b);
    }

    public Class<C10156a> b() {
        return C10156a.class;
    }

    public Class<C10156a> c() {
        return C10156a.class;
    }

    /* renamed from: f */
    public C10156a a(C10177v<C10156a> vVar) {
        return new b(vVar);
    }
}
