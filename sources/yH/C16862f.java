package YH;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\b'\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u001eB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LYH/f;", "K", "V", "", "<init>", "()V", "", "entry", "", "l", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "o", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "value", "", "containsValue", "(Ljava/lang/Object;)Z", "d", "(Ljava/util/Map$Entry;)Z", "other", "equals", "", "hashCode", "()I", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "a", "size", "", "h", "()Ljava/util/Set;", "keys", "", "i", "()Ljava/util/Collection;", "values", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.f  reason: case insensitive filesystem */
public abstract class C16862f<K, V> implements Map<K, V>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140443a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYH/f$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    protected C16862f() {
    }

    private final String k(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    private final String l(Map.Entry<? extends K, ? extends V> entry) {
        return k(entry.getKey()) + '=' + k(entry.getValue());
    }

    /* access modifiers changed from: private */
    public static final CharSequence m(C16862f fVar, Map.Entry entry) {
        C17542s.j(entry, "it");
        return fVar.l(entry);
    }

    public abstract int a();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsValue(Object obj) {
        Iterable<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C17542s.e(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C17542s.h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!C17542s.e(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        C17542s.h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return f();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterable<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return true;
        }
        for (Map.Entry d10 : entrySet) {
            if (!d(d10)) {
                return false;
            }
        }
        return true;
    }

    public abstract Set f();

    public abstract Set<K> h();

    public int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Collection<V> i();

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set<K> keySet() {
        return h();
    }

    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public String toString() {
        return C16877v.G0(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new C16861e(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
