package ZH;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ)\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J)\u0010\u001d\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J)\u0010\u001e\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$¨\u0006&"}, d2 = {"LZH/e;", "K", "V", "LZH/a;", "", "LZH/d;", "backing", "<init>", "(LZH/d;)V", "", "isEmpty", "()Z", "", "element", "i", "(Ljava/util/Map$Entry;)Z", "LXH/N;", "clear", "()V", "m", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "k", "", "iterator", "()Ljava/util/Iterator;", "containsAll", "removeAll", "retainAll", "a", "LZH/d;", "getBacking", "()LZH/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.e  reason: case insensitive filesystem */
public final class C17000e<K, V> extends C16996a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C16999d<K, V> f140783a;

    public C17000e(C16999d<K, V> dVar) {
        C17542s.j(dVar, "backing");
        this.f140783a = dVar;
    }

    public int a() {
        return this.f140783a.size();
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C17542s.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f140783a.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f140783a.s(collection);
    }

    public boolean i(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "element");
        return this.f140783a.t(entry);
    }

    public boolean isEmpty() {
        return this.f140783a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f140783a.z();
    }

    public boolean k(Map.Entry entry) {
        C17542s.j(entry, "element");
        return this.f140783a.O(entry);
    }

    /* renamed from: m */
    public boolean add(Map.Entry<K, V> entry) {
        C17542s.j(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140783a.p();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140783a.p();
        return super.retainAll(collection);
    }
}
