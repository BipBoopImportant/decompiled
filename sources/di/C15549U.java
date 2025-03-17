package DI;

import cJ.C17066c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: DI.U  reason: case insensitive filesystem */
public final class C15549U {
    public static final void a(C15545P p10, C17066c cVar, Collection<C15544O> collection) {
        C17542s.j(p10, "<this>");
        C17542s.j(cVar, "fqName");
        C17542s.j(collection, "packageFragments");
        if (p10 instanceof C15550V) {
            ((C15550V) p10).c(cVar, collection);
        } else {
            collection.addAll(p10.b(cVar));
        }
    }

    public static final boolean b(C15545P p10, C17066c cVar) {
        C17542s.j(p10, "<this>");
        C17542s.j(cVar, "fqName");
        return p10 instanceof C15550V ? ((C15550V) p10).a(cVar) : c(p10, cVar).isEmpty();
    }

    public static final List<C15544O> c(C15545P p10, C17066c cVar) {
        C17542s.j(p10, "<this>");
        C17542s.j(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        a(p10, cVar, arrayList);
        return arrayList;
    }
}
