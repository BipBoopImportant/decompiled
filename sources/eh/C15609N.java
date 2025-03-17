package EH;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"LEH/M;", "", "b", "(LEH/M;)Z", "a", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.N  reason: case insensitive filesystem */
public final class C15609N {
    public static final boolean a(C15608M m10) {
        C17542s.j(m10, "<this>");
        return C17542s.e(m10.d(), Constants.SCHEME) || C17542s.e(m10.d(), "wss");
    }

    public static final boolean b(C15608M m10) {
        C17542s.j(m10, "<this>");
        return C17542s.e(m10.d(), "ws") || C17542s.e(m10.d(), "wss");
    }
}
