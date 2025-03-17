package C3;

import C3.C6417h;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.C10006a;
import t3.C5950a;
import t3.N;
import w3.A;
import w3.g;
import w3.i;
import w3.k;
import w3.t;

public final class x {

    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(g gVar, String str, byte[] bArr, Map<String, String> map) {
        i iVar;
        A a10 = new A(gVar);
        k a11 = new k.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        k kVar = a11;
        while (true) {
            try {
                iVar = new i(a10, kVar);
                byte[] b10 = C10006a.b(iVar);
                N.m(iVar);
                return b10;
            } catch (t e10) {
                String c10 = c(e10, i10);
                if (c10 != null) {
                    i10++;
                    kVar = kVar.a().j(c10).a();
                    N.m(iVar);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new N(a11, (Uri) C5950a.e(a10.q()), a10.e(), a10.p(), e11);
            } catch (Throwable th2) {
                N.m(iVar);
                throw th2;
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return N.Y(N.Z(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (N.f29462a >= 23 && a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof O) {
            return 6001;
        }
        if (th2 instanceof C6417h.e) {
            return 6003;
        }
        if (th2 instanceof L) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(t tVar, int i10) {
        Map<String, List<String>> map;
        List list;
        int i11 = tVar.f31502d;
        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map = tVar.f31504f) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public static boolean d(Throwable th2) {
        return N.f29462a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return N.f29462a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
