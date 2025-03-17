package EH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"LEH/Q;", "", "a", "(LEH/Q;)Ljava/lang/String;", "authority", "b", "encodedUserAndPassword", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.U  reason: case insensitive filesystem */
public final class C15615U {
    public static final String a(C15612Q q10) {
        C17542s.j(q10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(q10));
        if (q10.l() == 0 || q10.l() == q10.k().c()) {
            sb2.append(q10.g());
        } else {
            sb2.append(C15610O.g(q10));
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String b(C15612Q q10) {
        C17542s.j(q10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        C15610O.f(sb2, q10.f(), q10.c());
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
