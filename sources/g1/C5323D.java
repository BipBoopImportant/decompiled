package g1;

import XH.C16807N;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u0006-"}, d2 = {"Lg1/D;", "K", "V", "", "Lg1/x;", "map", "", "", "iterator", "<init>", "(Lg1/x;Ljava/util/Iterator;)V", "LXH/N;", "remove", "()V", "", "hasNext", "()Z", "f", "a", "Lg1/x;", "i", "()Lg1/x;", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "c", "I", "getModification", "()I", "setModification", "(I)V", "modification", "d", "Ljava/util/Map$Entry;", "h", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "current", "e", "k", "setNext", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.D  reason: case insensitive filesystem */
abstract class C5323D<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C5355x<K, V> f23343a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator<Map.Entry<K, V>> f23344b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f23345c;

    /* renamed from: d  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f23346d;

    /* renamed from: e  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f23347e;

    public C5323D(C5355x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f23343a = xVar;
        this.f23344b = it;
        this.f23345c = xVar.d();
        f();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.f23346d = this.f23347e;
        this.f23347e = this.f23344b.hasNext() ? this.f23344b.next() : null;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> h() {
        return this.f23346d;
    }

    public final boolean hasNext() {
        return this.f23347e != null;
    }

    public final C5355x<K, V> i() {
        return this.f23343a;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> k() {
        return this.f23347e;
    }

    public final void remove() {
        if (i().d() == this.f23345c) {
            Map.Entry<? extends K, ? extends V> entry = this.f23346d;
            if (entry != null) {
                this.f23343a.remove(entry.getKey());
                this.f23346d = null;
                C16807N n10 = C16807N.f139792a;
                this.f23345c = i().d();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
