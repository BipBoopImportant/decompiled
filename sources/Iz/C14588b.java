package iz;

import YH.C16877v;
import gz.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Liz/b;", "", "<init>", "()V", "", "Lgz/c$b;", "updaters", "Lrz/g;", "localCartItems", "", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.b  reason: case insensitive filesystem */
public final class C14588b {
    public final List<String> a(List<c.b> list, List<C15014g> list2) {
        C17542s.j(list, "updaters");
        C17542s.j(list2, "localCartItems");
        Iterable<c.b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (c.b a10 : iterable) {
            arrayList.add(a10.a());
        }
        ArrayList<C15014g> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (!arrayList.contains(((C15014g) next).a())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
        for (C15014g a11 : arrayList2) {
            arrayList3.add(a11.a());
        }
        return arrayList3;
    }
}
