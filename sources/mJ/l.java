package MJ;

import YH.C16863g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17694b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"LMJ/l;", "K", "V", "", "LYH/g;", "LMJ/f;", "builder", "<init>", "(LMJ/f;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "a", "LMJ/f;", "", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l<K, V> extends C16863g<V> implements Collection<V>, C17694b {

    /* renamed from: a  reason: collision with root package name */
    private final C16083f<K, V> f136439a;

    public l(C16083f<K, V> fVar) {
        C17542s.j(fVar, "builder");
        this.f136439a = fVar;
    }

    public int a() {
        return this.f136439a.size();
    }

    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f136439a.clear();
    }

    public boolean contains(Object obj) {
        return this.f136439a.containsValue(obj);
    }

    public Iterator<V> iterator() {
        return new m(this.f136439a);
    }
}
