package cc;

import Fb.f;
import android.net.Uri;
import xa.C8971l;

@Deprecated
/* renamed from: cc.a  reason: case insensitive filesystem */
public abstract class C9450a {
    @Deprecated
    public static synchronized C9450a b() {
        C9450a c10;
        synchronized (C9450a.class) {
            c10 = c(f.l());
        }
        return c10;
    }

    @Deprecated
    public static synchronized C9450a c(f fVar) {
        C9450a aVar;
        synchronized (C9450a.class) {
            aVar = (C9450a) fVar.j(C9450a.class);
        }
        return aVar;
    }

    @Deprecated
    public abstract C8971l<C9451b> a(Uri uri);
}
