package YH;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004!\"# B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"LYH/d;", "E", "LYH/b;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "d", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.d  reason: case insensitive filesystem */
public abstract class C16860d<E> extends C16858b<E> implements List<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140429a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LYH/d$a;", "", "<init>", "()V", "", "index", "size", "LXH/N;", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "oldCapacity", "minCapacity", "e", "(II)I", "", "g", "(Ljava/util/Collection;)I", "other", "", "f", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }

        public final boolean f(Collection<?> collection, Collection<?> collection2) {
            C17542s.j(collection, "c");
            C17542s.j(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object e10 : collection) {
                if (!C17542s.e(e10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> collection) {
            C17542s.j(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LYH/d$b;", "", "<init>", "(LYH/d;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "a", "I", "c", "()I", "d", "(I)V", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.d$b */
    private class b implements Iterator<E>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f140430a;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int c() {
            return this.f140430a;
        }

        /* access modifiers changed from: protected */
        public final void d(int i10) {
            this.f140430a = i10;
        }

        public boolean hasNext() {
            return this.f140430a < C16860d.this.size();
        }

        public E next() {
            if (hasNext()) {
                C16860d<E> dVar = C16860d.this;
                int i10 = this.f140430a;
                this.f140430a = i10 + 1;
                return dVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"LYH/d$c;", "LYH/d$b;", "LYH/d;", "", "", "index", "<init>", "(LYH/d;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.d$c */
    private class c extends C16860d<E>.defpackage.b implements ListIterator<E>, C17693a {
        public c(int i10) {
            super();
            C16860d.f140429a.c(i10, C16860d.this.size());
            d(i10);
        }

        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return c() > 0;
        }

        public int nextIndex() {
            return c();
        }

        public E previous() {
            if (hasPrevious()) {
                C16860d<E> dVar = C16860d.this;
                d(c() - 1);
                return dVar.get(c());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return c() - 1;
        }

        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LYH/d$d;", "E", "LYH/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "fromIndex", "toIndex", "<init>", "(LYH/d;II)V", "index", "get", "(I)Ljava/lang/Object;", "b", "LYH/d;", "c", "I", "d", "_size", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.d$d  reason: collision with other inner class name */
    private static final class C3438d<E> extends C16860d<E> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private final C16860d<E> f140433b;

        /* renamed from: c  reason: collision with root package name */
        private final int f140434c;

        /* renamed from: d  reason: collision with root package name */
        private int f140435d;

        public C3438d(C16860d<? extends E> dVar, int i10, int i11) {
            C17542s.j(dVar, "list");
            this.f140433b = dVar;
            this.f140434c = i10;
            C16860d.f140429a.d(i10, i11, dVar.size());
            this.f140435d = i11 - i10;
        }

        public int a() {
            return this.f140435d;
        }

        public E get(int i10) {
            C16860d.f140429a.b(i10, this.f140435d);
            return this.f140433b.get(this.f140434c + i10);
        }
    }

    protected C16860d() {
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f140429a.f(this, (Collection) obj);
    }

    public abstract E get(int i10);

    public int hashCode() {
        return f140429a.g(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object e11 : this) {
            if (C17542s.e(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C17542s.e(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new C3438d(this, i10, i11);
    }

    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
