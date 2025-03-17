package iz;

import YH.C16877v;
import gz.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liz/p;", "", "<init>", "()V", "", "Lgz/c$b;", "updaters", "", "barcodesNotToSkip", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.p  reason: case insensitive filesystem */
public final class C14602p {
    public final List<String> a(List<c.b> list, List<String> list2) {
        C17542s.j(list, "updaters");
        C17542s.j(list2, "barcodesNotToSkip");
        ArrayList<c.b> arrayList = new ArrayList<>();
        for (Object next : list) {
            c.b bVar = (c.b) next;
            if (bVar.d() < bVar.e() && !list2.contains(bVar.a())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (c.b a10 : arrayList) {
            arrayList2.add(a10.a());
        }
        return arrayList2;
    }
}
