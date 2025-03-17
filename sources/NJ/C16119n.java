package NJ;

import KJ.C15989e;
import YH.C16867k;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LNJ/n;", "K", "V", "LKJ/e;", "LYH/k;", "LNJ/c;", "map", "<init>", "(LNJ/c;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "b", "LNJ/c;", "", "a", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.n  reason: case insensitive filesystem */
public final class C16119n<K, V> extends C16867k<K> implements C15989e<K> {

    /* renamed from: b  reason: collision with root package name */
    private final C16108c<K, V> f136613b;

    public C16119n(C16108c<K, V> cVar) {
        C17542s.j(cVar, "map");
        this.f136613b = cVar;
    }

    public int a() {
        return this.f136613b.size();
    }

    public boolean contains(Object obj) {
        return this.f136613b.containsKey(obj);
    }

    public Iterator<K> iterator() {
        return new C16120o(this.f136613b);
    }
}
