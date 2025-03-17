package DJ;

import EJ.C15670k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;

/* renamed from: DJ.a  reason: case insensitive filesystem */
public final class C15580a {
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C17542s.j(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final C15670k<C17656k> b(Iterable<? extends C17656k> iterable) {
        C17542s.j(iterable, "scopes");
        C15670k<C17656k> kVar = new C15670k<>();
        for (Object next : iterable) {
            C17656k kVar2 = (C17656k) next;
            if (!(kVar2 == null || kVar2 == C17656k.b.f144864b)) {
                kVar.add(next);
            }
        }
        return kVar;
    }
}
