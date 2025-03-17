package Z0;

import b1.C5254a;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ0/y;", "K", "V", "LZ0/u;", "", "LZ0/i;", "parentIterator", "<init>", "(LZ0/i;)V", "q", "()Ljava/util/Map$Entry;", "d", "LZ0/i;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final i<K, V> f14952d;

    public y(i<K, V> iVar) {
        this.f14952d = iVar;
    }

    /* renamed from: q */
    public Map.Entry<K, V> next() {
        C5254a.a(i());
        p(h() + 2);
        return new c(this.f14952d, f()[h() - 2], f()[h() - 1]);
    }
}
