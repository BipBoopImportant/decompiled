package jd;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljd/f;", "K", "V", "Ljd/c;", "", "", "delegate", "<init>", "(Ljava/util/Set;)V", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/util/Set;", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.f  reason: case insensitive filesystem */
public final class C9903f<K, V> extends C9900c<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, C17693a {

    /* renamed from: b  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f74824b;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"jd/f$a", "", "", "", "hasNext", "()Z", "c", "()Ljava/util/Map$Entry;", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: jd.f$a */
    public static final class a implements Iterator<Map.Entry<? extends K, ? extends V>>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ Iterator<Map.Entry<K, V>> f74825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Iterator<Map.Entry<K, V>> f74826b;

        a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            this.f74826b = it;
            this.f74825a = it;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            return new C9904g(this.f74826b.next());
        }

        public boolean hasNext() {
            return this.f74825a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9903f(Set<? extends Map.Entry<? extends K, ? extends V>> set) {
        super(set);
        C17542s.j(set, "delegate");
        this.f74824b = set;
    }

    public /* bridge */ boolean b(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains(entry);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(this.f74824b.iterator());
    }
}
