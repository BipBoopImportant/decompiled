package NJ;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LNJ/p;", "K", "V", "", "LNJ/a;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", "d", "()LNJ/a;", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "setNextKey$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "b", "Ljava/util/Map;", "", "I", "getIndex$kotlinx_collections_immutable", "()I", "setIndex$kotlinx_collections_immutable", "(I)V", "index", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.p  reason: case insensitive filesystem */
public class C16121p<K, V> implements Iterator<C16106a<V>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private Object f136615a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, C16106a<V>> f136616b;

    /* renamed from: c  reason: collision with root package name */
    private int f136617c;

    public C16121p(Object obj, Map<K, C16106a<V>> map) {
        C17542s.j(map, "hashMap");
        this.f136615a = obj;
        this.f136616b = map;
    }

    public final Object c() {
        return this.f136615a;
    }

    /* renamed from: d */
    public C16106a<V> next() {
        if (hasNext()) {
            C16106a<V> aVar = this.f136616b.get(this.f136615a);
            if (aVar != null) {
                C16106a<V> aVar2 = aVar;
                this.f136617c++;
                this.f136615a = aVar2.c();
                return aVar2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.f136615a + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f136617c < this.f136616b.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
