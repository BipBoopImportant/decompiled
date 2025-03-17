package NJ;

import KJ.C15989e;
import PJ.C16211e;
import YH.C16867k;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LNJ/l;", "K", "V", "LKJ/e;", "", "LYH/k;", "LNJ/c;", "map", "<init>", "(LNJ/c;)V", "element", "", "k", "(Ljava/util/Map$Entry;)Z", "", "iterator", "()Ljava/util/Iterator;", "b", "LNJ/c;", "", "a", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.l  reason: case insensitive filesystem */
public final class C16117l<K, V> extends C16867k<Map.Entry<? extends K, ? extends V>> implements C15989e<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b  reason: collision with root package name */
    private final C16108c<K, V> f136611b;

    public C16117l(C16108c<K, V> cVar) {
        C17542s.j(cVar, "map");
        this.f136611b = cVar;
    }

    public int a() {
        return this.f136611b.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C16118m(this.f136611b);
    }

    public boolean k(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "element");
        return C16211e.f137203a.a(this.f136611b, entry);
    }
}
