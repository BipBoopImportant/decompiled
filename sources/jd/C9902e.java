package jd;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Ljd/e;", "E", "", "delegate", "<init>", "(Ljava/util/ListIterator;)V", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.e  reason: case insensitive filesystem */
public final class C9902e<E> implements ListIterator<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ListIterator<E> f74823a;

    public C9902e(ListIterator<? extends E> listIterator) {
        C17542s.j(listIterator, "delegate");
        this.f74823a = listIterator;
    }

    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f74823a.hasNext();
    }

    public boolean hasPrevious() {
        return this.f74823a.hasPrevious();
    }

    public E next() {
        return this.f74823a.next();
    }

    public int nextIndex() {
        return this.f74823a.nextIndex();
    }

    public E previous() {
        return this.f74823a.previous();
    }

    public int previousIndex() {
        return this.f74823a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
