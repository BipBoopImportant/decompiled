package S5;

import WK.C16762E;
import WK.C16777l;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"LWK/l;", "LWK/E;", "file", "LXH/N;", "a", "(LWK/l;LWK/E;)V", "directory", "b", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {
    public static final void a(C16777l lVar, C16762E e10) {
        if (!lVar.o(e10)) {
            j.d(lVar.x(e10));
        }
    }

    public static final void b(C16777l lVar, C16762E e10) {
        try {
            IOException iOException = null;
            for (C16762E next : lVar.q(e10)) {
                try {
                    if (lVar.s(next).f()) {
                        b(lVar, next);
                    }
                    lVar.l(next);
                } catch (IOException e11) {
                    if (iOException == null) {
                        iOException = e11;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
