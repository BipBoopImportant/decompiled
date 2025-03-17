package N6;

import HJ.C15854t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "LN6/d;", "", "name", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class e {
    public static final String a(List<d> list, String str) {
        Object obj;
        C17542s.j(list, "<this>");
        C17542s.j(str, "name");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C15854t.H(((d) obj).a(), str, true)) {
                break;
            }
        }
        d dVar = (d) obj;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }
}
