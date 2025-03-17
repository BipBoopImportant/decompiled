package OJ;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LOJ/d;", "E", "", "", "nextElement", "", "LOJ/a;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "LXH/N;", "c", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "a", "Ljava/lang/Object;", "b", "Ljava/util/Map;", "getMap$kotlinx_collections_immutable", "()Ljava/util/Map;", "", "I", "d", "()I", "f", "(I)V", "index", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: OJ.d  reason: case insensitive filesystem */
public class C16169d<E> implements Iterator<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private Object f136933a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, C16166a> f136934b;

    /* renamed from: c  reason: collision with root package name */
    private int f136935c;

    public C16169d(Object obj, Map<E, C16166a> map) {
        C17542s.j(map, "map");
        this.f136933a = obj;
        this.f136934b = map;
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f136935c;
    }

    public final void f(int i10) {
        this.f136935c = i10;
    }

    public boolean hasNext() {
        return this.f136935c < this.f136934b.size();
    }

    public E next() {
        c();
        E e10 = this.f136933a;
        this.f136935c++;
        C16166a aVar = this.f136934b.get(e10);
        if (aVar != null) {
            this.f136933a = aVar.c();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
