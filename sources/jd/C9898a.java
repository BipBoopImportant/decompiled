package jd;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0015J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010#J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00108\u0016X\u0005¢\u0006\u0006\u001a\u0004\b+\u0010'¨\u0006."}, d2 = {"Ljd/a;", "E", "", "P", "", "delegate", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "lastIndexOf", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "size", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.a  reason: case insensitive filesystem */
public final class C9898a<E, P> implements List<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final List<E> f74819a;

    public C9898a(List<? extends E> list) {
        C17542s.j(list, "delegate");
        this.f74819a = list;
    }

    public int a() {
        return this.f74819a.size();
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f74819a.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f74819a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return C17542s.e(this.f74819a, obj);
    }

    public E get(int i10) {
        return this.f74819a.get(i10);
    }

    public int hashCode() {
        return this.f74819a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f74819a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f74819a.isEmpty();
    }

    public Iterator<E> iterator() {
        return new C9901d(this.f74819a.iterator());
    }

    public int lastIndexOf(Object obj) {
        return this.f74819a.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return new C9902e(this.f74819a.listIterator());
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return this.f74819a.subList(i10, i11);
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return this.f74819a.toString();
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<E> listIterator(int i10) {
        return new C9902e(this.f74819a.listIterator(i10));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
