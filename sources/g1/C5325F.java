package g1;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg1/F;", "K", "V", "Lg1/D;", "", "Lg1/x;", "map", "", "", "iterator", "<init>", "(Lg1/x;Ljava/util/Iterator;)V", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.F  reason: case insensitive filesystem */
final class C5325F<K, V> extends C5323D<K, V> implements Iterator<V>, C17693a {
    public C5325F(C5355x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    public V next() {
        Map.Entry k10 = k();
        if (k10 != null) {
            f();
            return k10.getValue();
        }
        throw new IllegalStateException();
    }
}
