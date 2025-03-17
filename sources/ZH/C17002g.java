package ZH;

import YH.C16863g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17694b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0012R!\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"LZH/g;", "V", "", "LYH/g;", "LZH/d;", "backing", "<init>", "(LZH/d;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "a", "LZH/d;", "getBacking", "()LZH/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.g  reason: case insensitive filesystem */
public final class C17002g<V> extends C16863g<V> implements Collection<V>, C17694b {

    /* renamed from: a  reason: collision with root package name */
    private final C16999d<?, V> f140785a;

    public C17002g(C16999d<?, V> dVar) {
        C17542s.j(dVar, "backing");
        this.f140785a = dVar;
    }

    public int a() {
        return this.f140785a.size();
    }

    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        C17542s.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f140785a.clear();
    }

    public boolean contains(Object obj) {
        return this.f140785a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f140785a.isEmpty();
    }

    public Iterator<V> iterator() {
        return this.f140785a.U();
    }

    public boolean remove(Object obj) {
        return this.f140785a.S(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140785a.p();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140785a.p();
        return super.retainAll(collection);
    }
}
