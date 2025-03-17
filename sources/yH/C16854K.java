package YH;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LYH/K;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "containsKey", "value", "b", "(Ljava/lang/Void;)Z", "c", "(Ljava/lang/Object;)Ljava/lang/Void;", "a", "size", "", "", "d", "()Ljava/util/Set;", "entries", "f", "keys", "", "h", "()Ljava/util/Collection;", "values", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.K  reason: case insensitive filesystem */
final class C16854K implements Map, Serializable, C17693a {

    /* renamed from: a  reason: collision with root package name */
    public static final C16854K f140419a = new C16854K();

    private C16854K() {
    }

    public int a() {
        return 0;
    }

    public boolean b(Void voidR) {
        C17542s.j(voidR, "value");
        return false;
    }

    /* renamed from: c */
    public Void get(Object obj) {
        return null;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return b((Void) obj);
    }

    public Set<Map.Entry> d() {
        return C16855L.f140420a;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Set<Object> f() {
        return C16855L.f140420a;
    }

    public Collection h() {
        return C16853J.f140418a;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return f();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return h();
    }
}
