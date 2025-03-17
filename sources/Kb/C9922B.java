package kb;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import jb.l;
import jb.m;

/* renamed from: kb.B  reason: case insensitive filesystem */
public final class C9922B {
    public static <T> boolean a(Iterable<T> iterable, m<? super T> mVar) {
        return C9923C.b(iterable.iterator(), mVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C9925E.g(iterable.iterator());
    }

    public static <T> T c(Iterable<? extends T> iterable, T t10) {
        return C9923C.l(iterable.iterator(), t10);
    }

    public static <T> T d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C9923C.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return e(list);
        }
        throw new NoSuchElementException();
    }

    private static <T> T e(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T f(Iterable<T> iterable) {
        return C9923C.m(iterable.iterator());
    }

    public static <T> boolean g(Iterable<T> iterable, m<? super T> mVar) {
        return (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) ? C9923C.q(iterable.iterator(), mVar) : h((List) iterable, (m) l.j(mVar));
    }

    private static <T> boolean h(List<T> list, m<? super T> mVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!mVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (UnsupportedOperationException unused) {
                        i(list, mVar, i11, i10);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        i(list, mVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static <T> void i(List<T> list, m<? super T> mVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] j(Iterable<?> iterable) {
        return b(iterable).toArray();
    }
}
