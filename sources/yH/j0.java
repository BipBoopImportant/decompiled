package YH;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "", "element", "j", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "i", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "l", "k", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
class j0 extends i0 {
    public static <T> Set<T> i(Set<? extends T> set, Iterable<? extends T> iterable) {
        C17542s.j(set, "<this>");
        C17542s.j(iterable, "elements");
        Collection<? extends T> G10 = C16846C.G(iterable);
        if (G10.isEmpty()) {
            return C16877v.y1(set);
        }
        if (G10 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!((Set) G10).contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(G10);
        return linkedHashSet2;
    }

    public static <T> Set<T> j(Set<? extends T> set, T t10) {
        C17542s.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(X.e(set.size()));
        boolean z10 = false;
        for (Object next : set) {
            boolean z11 = true;
            if (!z10 && C17542s.e(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> k(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i10;
        C17542s.j(set, "<this>");
        C17542s.j(iterable, "elements");
        Integer z10 = C16880y.z(iterable);
        if (z10 != null) {
            i10 = set.size() + z10.intValue();
        } else {
            i10 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(X.e(i10));
        linkedHashSet.addAll(set);
        C16877v.E(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <T> Set<T> l(Set<? extends T> set, T t10) {
        C17542s.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(X.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
