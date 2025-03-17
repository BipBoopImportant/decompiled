package jd;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljd/d;", "E", "", "delegate", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.d  reason: case insensitive filesystem */
public final class C9901d<E> implements Iterator<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Iterator<E> f74822a;

    public C9901d(Iterator<? extends E> it) {
        C17542s.j(it, "delegate");
        this.f74822a = it;
    }

    public boolean hasNext() {
        return this.f74822a.hasNext();
    }

    public E next() {
        return this.f74822a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
