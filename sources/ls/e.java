package Ls;

import Ps.d;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LLs/c;", "", "LIs/e;", "entities", "LPs/d;", "a", "(LLs/c;Ljava/util/List;)Ljava/util/List;", "inboxrepository-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final List<d> a(c cVar, List<Is.e> list) {
        C17542s.j(cVar, "<this>");
        C17542s.j(list, "entities");
        Iterable<Is.e> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Is.e a10 : iterable) {
            arrayList.add(cVar.a(a10));
        }
        return arrayList;
    }
}
