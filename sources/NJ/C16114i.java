package NJ;

import PJ.C16209c;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import oI.C17693a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010+\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"LNJ/i;", "K", "V", "", "LNJ/a;", "", "nextKey", "LNJ/d;", "builder", "<init>", "(Ljava/lang/Object;LNJ/d;)V", "LXH/N;", "d", "()V", "f", "c", "", "hasNext", "()Z", "k", "()LNJ/a;", "remove", "a", "Ljava/lang/Object;", "b", "LNJ/d;", "h", "()LNJ/d;", "i", "()Ljava/lang/Object;", "setLastIteratedKey$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "lastIteratedKey", "Z", "nextWasInvoked", "", "e", "I", "expectedModCount", "getIndex$kotlinx_collections_immutable", "()I", "setIndex$kotlinx_collections_immutable", "(I)V", "index", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.i  reason: case insensitive filesystem */
public class C16114i<K, V> implements Iterator<C16106a<V>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private Object f136603a;

    /* renamed from: b  reason: collision with root package name */
    private final C16109d<K, V> f136604b;

    /* renamed from: c  reason: collision with root package name */
    private Object f136605c = C16209c.f137201a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f136606d;

    /* renamed from: e  reason: collision with root package name */
    private int f136607e;

    /* renamed from: f  reason: collision with root package name */
    private int f136608f;

    public C16114i(Object obj, C16109d<K, V> dVar) {
        C17542s.j(dVar, "builder");
        this.f136603a = obj;
        this.f136604b = dVar;
        this.f136607e = dVar.h().i();
    }

    private final void c() {
        if (this.f136604b.h().i() != this.f136607e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (!this.f136606d) {
            throw new IllegalStateException();
        }
    }

    public final C16109d<K, V> h() {
        return this.f136604b;
    }

    public boolean hasNext() {
        return this.f136608f < this.f136604b.size();
    }

    public final Object i() {
        return this.f136605c;
    }

    /* renamed from: k */
    public C16106a<V> next() {
        c();
        d();
        this.f136605c = this.f136603a;
        this.f136606d = true;
        this.f136608f++;
        C16106a<V> aVar = this.f136604b.h().get(this.f136603a);
        if (aVar != null) {
            C16106a<V> aVar2 = aVar;
            this.f136603a = aVar2.c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f136603a + ") has changed after it was added to the persistent map.");
    }

    public void remove() {
        f();
        W.d(this.f136604b).remove(this.f136605c);
        this.f136605c = null;
        this.f136606d = false;
        this.f136607e = this.f136604b.h().i();
        this.f136608f--;
    }
}
