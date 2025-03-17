package MI;

import XH.C16796C;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17072i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f136387a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<C17065b, C17065b> f136388b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<C17066c, C17066c> f136389c;

    static {
        r rVar = new r();
        f136387a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f136388b = linkedHashMap;
        C17072i iVar = C17072i.f141319a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C17065b.a aVar = C17065b.f141241d;
        rVar.c(aVar.c(new C17066c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new C17066c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C16796C.a(((C17065b) entry.getKey()).a(), ((C17065b) entry.getValue()).a()));
        }
        f136389c = X.v(arrayList);
    }

    private r() {
    }

    private final List<C17065b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String cVar : strArr) {
            arrayList.add(C17065b.f141241d.c(new C17066c(cVar)));
        }
        return arrayList;
    }

    private final void c(C17065b bVar, List<C17065b> list) {
        Map<C17065b, C17065b> map = f136388b;
        for (Object next : list) {
            C17065b bVar2 = (C17065b) next;
            map.put(next, bVar);
        }
    }

    public final C17066c b(C17066c cVar) {
        C17542s.j(cVar, "classFqName");
        return f136389c.get(cVar);
    }
}
