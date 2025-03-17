package kK;

import GJ.C15765h;
import fK.C17251d;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lK.C17591w;
import lK.M;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "LkK/c;", "Ljava/io/InputStream;", "stream", "LfK/d;", "deserializer", "LkK/b;", "format", "LGJ/h;", "a", "(LkK/c;Ljava/io/InputStream;LfK/d;LkK/b;)LGJ/h;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H {
    public static final <T> C15765h<T> a(C17514c cVar, InputStream inputStream, C17251d<? extends T> dVar, C17513b bVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(inputStream, "stream");
        C17542s.j(dVar, "deserializer");
        C17542s.j(bVar, "format");
        return M.a(cVar, new C17591w(inputStream), dVar, bVar);
    }

    public static /* synthetic */ C15765h b(C17514c cVar, InputStream inputStream, C17251d dVar, C17513b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = C17513b.AUTO_DETECT;
        }
        return a(cVar, inputStream, dVar, bVar);
    }
}
