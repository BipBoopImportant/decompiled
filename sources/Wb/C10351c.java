package wb;

import Ab.b;
import Ab.c;
import com.google.crypto.tink.internal.f;
import com.google.crypto.tink.internal.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import qb.C10160e;
import qb.C10177v;
import qb.C10178w;
import qb.C10179x;

/* renamed from: wb.c  reason: case insensitive filesystem */
public class C10351c implements C10178w<C10160e, C10160e> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f77584a = Logger.getLogger(C10351c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final C10351c f77585b = new C10351c();

    /* renamed from: wb.c$a */
    private static class a implements C10160e {

        /* renamed from: a  reason: collision with root package name */
        private final C10177v<C10160e> f77586a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f77587b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f77588c;

        public a(C10177v<C10160e> vVar) {
            this.f77586a = vVar;
            if (vVar.i()) {
                b a10 = g.b().a();
                c a11 = f.a(vVar);
                this.f77587b = a10.a(a11, "daead", "encrypt");
                this.f77588c = a10.a(a11, "daead", "decrypt");
                return;
            }
            b.a aVar = f.f67861a;
            this.f77587b = aVar;
            this.f77588c = aVar;
        }

        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = Db.f.a(this.f77586a.e().b(), this.f77586a.e().g().a(bArr, bArr2));
                this.f77587b.a(this.f77586a.e().d(), (long) bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f77587b.b();
                throw e10;
            }
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C10177v.c next : this.f77586a.f(copyOf)) {
                    try {
                        byte[] b10 = ((C10160e) next.g()).b(copyOfRange, bArr2);
                        this.f77588c.a(next.d(), (long) copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger d10 = C10351c.f77584a;
                        d10.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (C10177v.c next2 : this.f77586a.h()) {
                try {
                    byte[] b11 = ((C10160e) next2.g()).b(bArr, bArr2);
                    this.f77588c.a(next2.d(), (long) bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f77588c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C10351c() {
    }

    public static void e() {
        C10179x.n(f77585b);
    }

    public Class<C10160e> b() {
        return C10160e.class;
    }

    public Class<C10160e> c() {
        return C10160e.class;
    }

    /* renamed from: f */
    public C10160e a(C10177v<C10160e> vVar) {
        return new a(vVar);
    }
}
