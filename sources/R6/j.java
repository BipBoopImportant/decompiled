package r6;

import HJ.C15854t;
import WK.C16762E;
import WK.C16777l;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LWK/l;", "LWK/E;", "file", "", "mustCreate", "LXH/N;", "a", "(LWK/l;LWK/E;Z)V", "directory", "c", "(LWK/l;LWK/E;)V", "", "d", "(LWK/E;)Ljava/lang/String;", "extension", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void a(C16777l lVar, C16762E e10, boolean z10) {
        if (z10) {
            E.h(lVar.z(e10, true));
        } else if (!lVar.o(e10)) {
            E.h(lVar.x(e10));
        }
    }

    public static /* synthetic */ void b(C16777l lVar, C16762E e10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        a(lVar, e10, z10);
    }

    public static final void c(C16777l lVar, C16762E e10) {
        try {
            IOException iOException = null;
            for (C16762E next : lVar.q(e10)) {
                try {
                    if (lVar.s(next).f()) {
                        c(lVar, next);
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

    public static final String d(C16762E e10) {
        return C15854t.m1(e10.v(), '.', "");
    }
}
