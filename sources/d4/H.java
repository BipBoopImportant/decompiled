package D4;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/n;", "previous", "LD4/x;", "loadType", "", "a", "(LD4/n;LD4/n;LD4/x;)Z", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class H {
    public static final boolean a(C6440n nVar, C6440n nVar2, C6449x xVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(nVar2, "previous");
        C17542s.j(xVar, "loadType");
        if (nVar.a() > nVar2.a()) {
            return true;
        }
        if (nVar.a() < nVar2.a()) {
            return false;
        }
        return C6442p.a(nVar.b(), nVar2.b(), xVar);
    }
}
