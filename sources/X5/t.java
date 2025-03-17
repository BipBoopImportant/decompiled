package X5;

import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import X5.s;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWK/E;", "file", "LWK/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "LX5/s$a;", "metadata", "LX5/s;", "b", "(LWK/E;LWK/l;Ljava/lang/String;Ljava/lang/AutoCloseable;LX5/s$a;)LX5/s;", "LWK/g;", "source", "a", "(LWK/g;LWK/l;LX5/s$a;)LX5/s;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    public static final s a(C16772g gVar, C16777l lVar, s.a aVar) {
        return new v(gVar, lVar, aVar);
    }

    public static final s b(C16762E e10, C16777l lVar, String str, AutoCloseable autoCloseable, s.a aVar) {
        return new r(e10, lVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ s c(C16772g gVar, C16777l lVar, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return a(gVar, lVar, aVar);
    }

    public static /* synthetic */ s d(C16762E e10, C16777l lVar, String str, AutoCloseable autoCloseable, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return b(e10, lVar, str, autoCloseable, aVar);
    }
}
