package j7;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "(Ljava/lang/Exception;)Z", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.e  reason: case insensitive filesystem */
public final class C8411e {
    public static final boolean a(Exception exc) {
        C17542s.j(exc, "<this>");
        String message = exc.getMessage();
        return message != null && C15854t.W(message, "InputStream exceeded maximum size", false, 2, (Object) null);
    }
}
