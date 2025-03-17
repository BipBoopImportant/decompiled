package g1;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import oI.C17698f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg1/s;", "K", "V", "E", "", "Lg1/x;", "map", "<init>", "(Lg1/x;)V", "LXH/N;", "clear", "()V", "", "isEmpty", "()Z", "a", "Lg1/x;", "b", "()Lg1/x;", "", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.s  reason: case insensitive filesystem */
abstract class C5350s<K, V, E> implements Set<E>, C17698f {

    /* renamed from: a  reason: collision with root package name */
    private final C5355x<K, V> f23439a;

    public C5350s(C5355x<K, V> xVar) {
        this.f23439a = xVar;
    }

    public int a() {
        return this.f23439a.size();
    }

    public final C5355x<K, V> b() {
        return this.f23439a;
    }

    public void clear() {
        this.f23439a.clear();
    }

    public boolean isEmpty() {
        return this.f23439a.isEmpty();
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }
}
