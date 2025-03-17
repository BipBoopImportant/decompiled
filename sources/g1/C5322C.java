package g1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;
import oI.C17697e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg1/C;", "K", "V", "Lg1/D;", "", "", "Lg1/x;", "map", "", "", "iterator", "<init>", "(Lg1/x;Ljava/util/Iterator;)V", "l", "()Ljava/util/Map$Entry;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.C  reason: case insensitive filesystem */
final class C5322C<K, V> extends C5323D<K, V> implements Iterator<Map.Entry<K, V>>, C17693a {

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"g1/C$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "b", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.C$a */
    public static final class a implements Map.Entry<K, V>, C17697e.a {

        /* renamed from: a  reason: collision with root package name */
        private final K f23340a;

        /* renamed from: b  reason: collision with root package name */
        private V f23341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5322C<K, V> f23342c;

        a(C5322C<K, V> c10) {
            this.f23342c = c10;
            Map.Entry<K, V> h10 = c10.h();
            C17542s.g(h10);
            this.f23340a = h10.getKey();
            Map.Entry<K, V> h11 = c10.h();
            C17542s.g(h11);
            this.f23341b = h11.getValue();
        }

        public void b(V v10) {
            this.f23341b = v10;
        }

        public K getKey() {
            return this.f23340a;
        }

        public V getValue() {
            return this.f23341b;
        }

        public V setValue(V v10) {
            C5322C<K, V> c10 = this.f23342c;
            if (c10.i().d() == c10.f23345c) {
                V value = getValue();
                c10.i().put(getKey(), v10);
                b(v10);
                return value;
            }
            throw new ConcurrentModificationException();
        }
    }

    public C5322C(C5355x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    /* renamed from: l */
    public Map.Entry<K, V> next() {
        f();
        if (h() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
