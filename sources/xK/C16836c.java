package XK;

import WK.C16762E;
import WK.C16776k;
import WK.C16777l;
import YH.C16869m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LWK/l;", "LWK/E;", "path", "LWK/k;", "c", "(LWK/l;LWK/E;)LWK/k;", "", "b", "(LWK/l;LWK/E;)Z", "dir", "mustCreate", "LXH/N;", "a", "(LWK/l;LWK/E;Z)V", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XK.c  reason: case insensitive filesystem */
public final class C16836c {
    public static final void a(C16777l lVar, C16762E e10, boolean z10) {
        C17542s.j(lVar, "<this>");
        C17542s.j(e10, "dir");
        C16869m mVar = new C16869m();
        C16762E e11 = e10;
        while (e11 != null && !lVar.o(e11)) {
            mVar.addFirst(e11);
            e11 = e11.D();
        }
        if (!z10 || !mVar.isEmpty()) {
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                C16777l.i(lVar, (C16762E) it.next(), false, 2, (Object) null);
            }
            return;
        }
        throw new IOException(e10 + " already exists.");
    }

    public static final boolean b(C16777l lVar, C16762E e10) {
        C17542s.j(lVar, "<this>");
        C17542s.j(e10, "path");
        return lVar.t(e10) != null;
    }

    public static final C16776k c(C16777l lVar, C16762E e10) {
        C17542s.j(lVar, "<this>");
        C17542s.j(e10, "path");
        C16776k t10 = lVar.t(e10);
        if (t10 != null) {
            return t10;
        }
        throw new FileNotFoundException("no such file: " + e10);
    }
}
