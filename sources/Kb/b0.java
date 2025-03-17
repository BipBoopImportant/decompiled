package kb;

import java.util.Comparator;
import java.util.SortedSet;
import jb.l;

final class b0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? C9935O.d() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        l.j(comparator);
        l.j(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof a0)) {
            return false;
        } else {
            comparator2 = ((a0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
