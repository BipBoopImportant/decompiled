package NJ;

import YH.C16866j;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17698f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, d2 = {"LNJ/g;", "K", "V", "", "LYH/j;", "LNJ/d;", "builder", "<init>", "(LNJ/d;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "contains", "a", "LNJ/d;", "", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.g  reason: case insensitive filesystem */
public final class C16112g<K, V> extends C16866j<K> implements Set<K>, C17698f {

    /* renamed from: a  reason: collision with root package name */
    private final C16109d<K, V> f136601a;

    public C16112g(C16109d<K, V> dVar) {
        C17542s.j(dVar, "builder");
        this.f136601a = dVar;
    }

    public int a() {
        return this.f136601a.size();
    }

    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f136601a.clear();
    }

    public boolean contains(Object obj) {
        return this.f136601a.containsKey(obj);
    }

    public Iterator<K> iterator() {
        return new C16113h(this.f136601a);
    }

    public boolean remove(Object obj) {
        if (!this.f136601a.containsKey(obj)) {
            return false;
        }
        this.f136601a.remove(obj);
        return true;
    }
}
