package EH;

import QH.C16246a;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LEH/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "b", "(LEH/c;Ljava/nio/charset/Charset;)LEH/c;", "c", "LEH/j;", "a", "(LEH/j;)Ljava/nio/charset/Charset;", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.e  reason: case insensitive filesystem */
public final class C15620e {
    public static final Charset a(C15625j jVar) {
        C17542s.j(jVar, "<this>");
        String c10 = jVar.c("charset");
        if (c10 == null) {
            return null;
        }
        try {
            return Charset.forName(c10);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final C15618c b(C15618c cVar, Charset charset) {
        C17542s.j(cVar, "<this>");
        C17542s.j(charset, "charset");
        return cVar.h("charset", C16246a.i(charset));
    }

    public static final C15618c c(C15618c cVar, Charset charset) {
        C17542s.j(cVar, "<this>");
        C17542s.j(charset, "charset");
        String lowerCase = cVar.e().toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !C17542s.e(lowerCase, "text") ? cVar : cVar.h("charset", C16246a.i(charset));
    }
}
