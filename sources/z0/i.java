package Z0;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014R2\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LZ0/i;", "K", "V", "", "", "LZ0/f;", "builder", "<init>", "(LZ0/f;)V", "", "hasNext", "()Z", "c", "()Ljava/util/Map$Entry;", "LXH/N;", "remove", "()V", "key", "newValue", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "LZ0/g;", "a", "LZ0/g;", "base", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final g<K, V, Map.Entry<K, V>> f14934a;

    public i(f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f14934a = new g<>(fVar, uVarArr);
    }

    /* renamed from: c */
    public Map.Entry<K, V> next() {
        return this.f14934a.next();
    }

    public final void d(K k10, V v10) {
        this.f14934a.o(k10, v10);
    }

    public boolean hasNext() {
        return this.f14934a.hasNext();
    }

    public void remove() {
        this.f14934a.remove();
    }
}
