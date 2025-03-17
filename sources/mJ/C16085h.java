package MJ;

import PJ.C16211e;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\fJ#\u0010\u0015\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"LMJ/h;", "K", "V", "LMJ/a;", "", "LMJ/f;", "builder", "<init>", "(LMJ/f;)V", "element", "", "p", "(Ljava/util/Map$Entry;)Z", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "m", "i", "a", "LMJ/f;", "", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.h  reason: case insensitive filesystem */
public final class C16085h<K, V> extends C16078a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C16083f<K, V> f136436a;

    public C16085h(C16083f<K, V> fVar) {
        C17542s.j(fVar, "builder");
        this.f136436a = fVar;
    }

    public int a() {
        return this.f136436a.size();
    }

    public void clear() {
        this.f136436a.clear();
    }

    public boolean i(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "element");
        return C16211e.f137203a.a(this.f136436a, entry);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C16086i(this.f136436a);
    }

    public boolean m(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "element");
        return this.f136436a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: p */
    public boolean add(Map.Entry<K, V> entry) {
        C17542s.j(entry, "element");
        throw new UnsupportedOperationException();
    }
}
