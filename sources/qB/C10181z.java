package qb;

import Cb.C;
import Cb.D;
import Cb.I;
import Cb.y;
import Cb.z;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: qb.z  reason: case insensitive filesystem */
final class C10181z {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f76016a = Charset.forName(Constants.ENCODING);

    public static D.c a(C.c cVar) {
        return (D.c) D.c.W().A(cVar.V().W()).z(cVar.Y()).y(cVar.X()).w(cVar.W()).g();
    }

    public static D b(C c10) {
        D.b y10 = D.W().y(c10.Y());
        for (C.c a10 : c10.X()) {
            y10.w(a(a10));
        }
        return (D) y10.g();
    }

    public static void c(C.c cVar) {
        if (!cVar.Z()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.W())}));
        } else if (cVar.X() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.W())}));
        } else if (cVar.Y() == z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.W())}));
        }
    }

    public static void d(C c10) {
        int Y10 = c10.Y();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C.c next : c10.X()) {
            if (next.Y() == z.ENABLED) {
                c(next);
                if (next.W() == Y10) {
                    if (!z10) {
                        z10 = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (next.V().V() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
