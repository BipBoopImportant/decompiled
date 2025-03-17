package EH;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LEH/s;", "LEH/c;", "d", "(LEH/s;)LEH/c;", "LEH/r;", "c", "(LEH/r;)LEH/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "a", "(LEH/r;)Ljava/nio/charset/Charset;", "", "b", "(LEH/r;)Ljava/lang/Long;", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.t  reason: case insensitive filesystem */
public final class C15635t {
    public static final Charset a(C15633r rVar) {
        C17542s.j(rVar, "<this>");
        C15618c c10 = c(rVar);
        if (c10 != null) {
            return C15620e.a(c10);
        }
        return null;
    }

    public static final Long b(C15633r rVar) {
        C17542s.j(rVar, "<this>");
        String str = rVar.a().get(C15631p.f134088a.g());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final C15618c c(C15633r rVar) {
        C17542s.j(rVar, "<this>");
        String str = rVar.a().get(C15631p.f134088a.h());
        if (str != null) {
            return C15618c.f133986f.b(str);
        }
        return null;
    }

    public static final C15618c d(C15634s sVar) {
        C17542s.j(sVar, "<this>");
        String j10 = sVar.a().j(C15631p.f134088a.h());
        if (j10 != null) {
            return C15618c.f133986f.b(j10);
        }
        return null;
    }
}
