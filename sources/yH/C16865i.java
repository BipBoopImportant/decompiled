package YH;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import oI.C17697e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYH/i;", "K", "V", "", "Ljava/util/AbstractMap;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.i  reason: case insensitive filesystem */
public abstract class C16865i<K, V> extends AbstractMap<K, V> implements Map<K, V>, C17697e {
    protected C16865i() {
    }

    public /* bridge */ int a() {
        return super.size();
    }

    public abstract Set b();

    public /* bridge */ Set<Object> c() {
        return super.keySet();
    }

    public /* bridge */ Collection<Object> d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
