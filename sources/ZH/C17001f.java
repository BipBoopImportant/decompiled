package ZH;

import YH.C16866j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17698f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"LZH/f;", "E", "", "LYH/j;", "LZH/d;", "backing", "<init>", "(LZH/d;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "LXH/N;", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "a", "LZH/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.f  reason: case insensitive filesystem */
public final class C17001f<E> extends C16866j<E> implements Set<E>, C17698f {

    /* renamed from: a  reason: collision with root package name */
    private final C16999d<E, ?> f140784a;

    public C17001f(C16999d<E, ?> dVar) {
        C17542s.j(dVar, "backing");
        this.f140784a = dVar;
    }

    public int a() {
        return this.f140784a.size();
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f140784a.clear();
    }

    public boolean contains(Object obj) {
        return this.f140784a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f140784a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f140784a.I();
    }

    public boolean remove(Object obj) {
        return this.f140784a.R(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140784a.p();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140784a.p();
        return super.retainAll(collection);
    }
}
