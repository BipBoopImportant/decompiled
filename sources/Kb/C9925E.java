package kb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jb.f;
import jb.j;
import jb.l;

/* renamed from: kb.E  reason: case insensitive filesystem */
public final class C9925E {

    /* renamed from: kb.E$a */
    private static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final List<F> f74865a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super F, ? extends T> f74866b;

        /* renamed from: kb.E$a$a  reason: collision with other inner class name */
        class C1354a extends d0<F, T> {
            C1354a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: package-private */
            public T a(F f10) {
                return a.this.f74866b.apply(f10);
            }
        }

        a(List<F> list, f<? super F, ? extends T> fVar) {
            this.f74865a = (List) l.j(list);
            this.f74866b = (f) l.j(fVar);
        }

        public T get(int i10) {
            return this.f74866b.apply(this.f74865a.get(i10));
        }

        public boolean isEmpty() {
            return this.f74865a.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i10) {
            return new C1354a(this.f74865a.listIterator(i10));
        }

        public T remove(int i10) {
            return this.f74866b.apply(this.f74865a.remove(i10));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i10, int i11) {
            this.f74865a.subList(i10, i11).clear();
        }

        public int size() {
            return this.f74865a.size();
        }
    }

    /* renamed from: kb.E$b */
    private static class b<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final List<F> f74868a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super F, ? extends T> f74869b;

        /* renamed from: kb.E$b$a */
        class a extends d0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: package-private */
            public T a(F f10) {
                return b.this.f74869b.apply(f10);
            }
        }

        b(List<F> list, f<? super F, ? extends T> fVar) {
            this.f74868a = (List) l.j(list);
            this.f74869b = (f) l.j(fVar);
        }

        public boolean isEmpty() {
            return this.f74868a.isEmpty();
        }

        public ListIterator<T> listIterator(int i10) {
            return new a(this.f74868a.listIterator(i10));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i10, int i11) {
            this.f74868a.subList(i10, i11).clear();
        }

        public int size() {
            return this.f74868a.size();
        }
    }

    static boolean a(List<?> list, Object obj) {
        if (obj == l.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C9923C.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!j.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> f() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> g(Iterator<? extends E> it) {
        ArrayList<E> f10 = f();
        C9923C.a(f10, it);
        return f10;
    }

    public static <F, T> List<T> h(List<F> list, f<? super F, ? extends T> fVar) {
        return list instanceof RandomAccess ? new a(list, fVar) : new b(list, fVar);
    }
}
