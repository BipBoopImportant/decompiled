package kb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import jb.l;
import jb.m;

/* renamed from: kb.j  reason: case insensitive filesystem */
public final class C9955j {

    /* renamed from: kb.j$a */
    static class a<E> extends AbstractCollection<E> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<E> f74969a;

        /* renamed from: b  reason: collision with root package name */
        final m<? super E> f74970b;

        a(Collection<E> collection, m<? super E> mVar) {
            this.f74969a = collection;
            this.f74970b = mVar;
        }

        public boolean add(E e10) {
            l.d(this.f74970b.apply(e10));
            return this.f74969a.add(e10);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                l.d(this.f74970b.apply(apply));
            }
            return this.f74969a.addAll(collection);
        }

        public void clear() {
            C9922B.g(this.f74969a, this.f74970b);
        }

        public boolean contains(Object obj) {
            if (C9955j.c(this.f74969a, obj)) {
                return this.f74970b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return C9955j.a(this, collection);
        }

        public boolean isEmpty() {
            return !C9922B.a(this.f74969a, this.f74970b);
        }

        public Iterator<E> iterator() {
            return C9923C.i(this.f74969a.iterator(), this.f74970b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f74969a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f74969a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f74970b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f74969a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f74970b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public int size() {
            int i10 = 0;
            for (E apply : this.f74969a) {
                if (this.f74970b.apply(apply)) {
                    i10++;
                }
            }
            return i10;
        }

        public Object[] toArray() {
            return C9925E.g(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C9925E.g(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i10) {
        C9954i.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean c(Collection<?> collection, Object obj) {
        l.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
