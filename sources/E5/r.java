package E5;

import E5.o;
import S5.j;
import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LWK/E;", "file", "LWK/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "LE5/o;", "g", "(LWK/E;LWK/l;Ljava/lang/String;Ljava/io/Closeable;)LE5/o;", "LWK/g;", "source", "Landroid/content/Context;", "context", "e", "(LWK/g;Landroid/content/Context;)LE5/o;", "LE5/o$a;", "metadata", "f", "(LWK/g;Landroid/content/Context;LE5/o$a;)LE5/o;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    /* access modifiers changed from: private */
    public static final File c(Context context) {
        return j.o(context);
    }

    /* access modifiers changed from: private */
    public static final File d(Context context) {
        return j.o(context);
    }

    public static final o e(C16772g gVar, Context context) {
        return new t(gVar, new q(context), (o.a) null);
    }

    public static final o f(C16772g gVar, Context context, o.a aVar) {
        return new t(gVar, new p(context), aVar);
    }

    public static final o g(C16762E e10, C16777l lVar, String str, Closeable closeable) {
        return new n(e10, lVar, str, closeable, (o.a) null);
    }

    public static /* synthetic */ o h(C16762E e10, C16777l lVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C16777l.f139691b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return g(e10, lVar, str, closeable);
    }
}
