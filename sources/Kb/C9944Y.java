package kb;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import jb.l;
import jb.m;
import jb.n;
import kb.C9955j;

/* renamed from: kb.Y  reason: case insensitive filesystem */
public final class C9944Y {

    /* renamed from: kb.Y$a */
    class a extends f<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f74910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f74911b;

        /* renamed from: kb.Y$a$a  reason: collision with other inner class name */
        class C1357a extends C9947b<E> {

            /* renamed from: c  reason: collision with root package name */
            final Iterator<? extends E> f74912c;

            /* renamed from: d  reason: collision with root package name */
            final Iterator<? extends E> f74913d;

            C1357a() {
                this.f74912c = a.this.f74910a.iterator();
                this.f74913d = a.this.f74911b.iterator();
            }

            /* access modifiers changed from: protected */
            public E a() {
                if (this.f74912c.hasNext()) {
                    return this.f74912c.next();
                }
                while (this.f74913d.hasNext()) {
                    E next = this.f74913d.next();
                    if (!a.this.f74910a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super((a) null);
            this.f74910a = set;
            this.f74911b = set2;
        }

        /* renamed from: b */
        public e0<E> iterator() {
            return new C1357a();
        }

        public boolean contains(Object obj) {
            return this.f74910a.contains(obj) || this.f74911b.contains(obj);
        }

        public boolean isEmpty() {
            return this.f74910a.isEmpty() && this.f74911b.isEmpty();
        }

        public int size() {
            int size = this.f74910a.size();
            for (Object contains : this.f74911b) {
                if (!this.f74910a.contains(contains)) {
                    size++;
                }
            }
            return size;
        }
    }

    /* renamed from: kb.Y$b */
    class b extends f<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f74915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f74916b;

        /* renamed from: kb.Y$b$a */
        class a extends C9947b<E> {

            /* renamed from: c  reason: collision with root package name */
            final Iterator<E> f74917c;

            a() {
                this.f74917c = b.this.f74915a.iterator();
            }

            /* access modifiers changed from: protected */
            public E a() {
                while (this.f74917c.hasNext()) {
                    E next = this.f74917c.next();
                    if (b.this.f74916b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super((a) null);
            this.f74915a = set;
            this.f74916b = set2;
        }

        /* renamed from: b */
        public e0<E> iterator() {
            return new a();
        }

        public boolean contains(Object obj) {
            return this.f74915a.contains(obj) && this.f74916b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f74915a.containsAll(collection) && this.f74916b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f74916b, this.f74915a);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f74915a) {
                if (this.f74916b.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* renamed from: kb.Y$c */
    private static class c<E> extends C9955j.a<E> implements Set<E> {
        c(Set<E> set, m<? super E> mVar) {
            super(set, mVar);
        }

        public boolean equals(Object obj) {
            return C9944Y.a(this, obj);
        }

        public int hashCode() {
            return C9944Y.d(this);
        }
    }

    /* renamed from: kb.Y$d */
    private static class d<E> extends c<E> implements SortedSet<E> {
        d(SortedSet<E> sortedSet, m<? super E> mVar) {
            super(sortedSet, mVar);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f74969a).comparator();
        }

        public E first() {
            return C9923C.j(this.f74969a.iterator(), this.f74970b);
        }

        public SortedSet<E> headSet(E e10) {
            return new d(((SortedSet) this.f74969a).headSet(e10), this.f74970b);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f74969a;
            while (true) {
                E last = sortedSet.last();
                if (this.f74970b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(E e10, E e11) {
            return new d(((SortedSet) this.f74969a).subSet(e10, e11), this.f74970b);
        }

        public SortedSet<E> tailSet(E e10) {
            return new d(((SortedSet) this.f74969a).tailSet(e10), this.f74970b);
        }
    }

    /* renamed from: kb.Y$e */
    static abstract class e<E> extends AbstractSet<E> {
        e() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C9944Y.i(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) l.j(collection));
        }
    }

    /* renamed from: kb.Y$f */
    public static abstract class f<E> extends AbstractSet<E> {
        /* synthetic */ f(a aVar) {
            this();
        }

        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public abstract e0<E> b();

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private f() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, m<? super E> mVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, mVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) l.j(set), (m) l.j(mVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f74969a, n.b(cVar.f74970b, mVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, m<? super E> mVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) l.j(sortedSet), (m) l.j(mVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f74969a, n.b(cVar.f74970b, mVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> f<E> e(Set<E> set, Set<?> set2) {
        l.k(set, "set1");
        l.k(set2, "set2");
        return new b(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(C9927G.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(C9927G.f());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        l.j(collection);
        if (collection instanceof C9931K) {
            collection = ((C9931K) collection).I1();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : C9923C.p(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static <E> f<E> k(Set<? extends E> set, Set<? extends E> set2) {
        l.k(set, "set1");
        l.k(set2, "set2");
        return new a(set, set2);
    }
}
