package D4;

import D4.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/d0;", "previous", "LD4/x;", "loadType", "", "a", "(LD4/d0;LD4/d0;LD4/x;)Z", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.p  reason: case insensitive filesystem */
public final class C6442p {
    public static final boolean a(d0 d0Var, d0 d0Var2, C6449x xVar) {
        C17542s.j(d0Var, "<this>");
        C17542s.j(xVar, "loadType");
        if (d0Var2 == null) {
            return true;
        }
        if (!(d0Var2 instanceof d0.b) || !(d0Var instanceof d0.a)) {
            return (!(d0Var instanceof d0.b) || !(d0Var2 instanceof d0.a)) && !(d0Var.a() == d0Var2.a() && d0Var.b() == d0Var2.b() && d0Var2.e(xVar) <= d0Var.e(xVar));
        }
        return true;
    }
}
