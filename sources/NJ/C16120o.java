package NJ;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\bX\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LNJ/o;", "K", "V", "", "LNJ/c;", "map", "<init>", "(LNJ/c;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "LNJ/p;", "a", "LNJ/p;", "internal", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.o  reason: case insensitive filesystem */
public final class C16120o<K, V> implements Iterator<K>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C16121p<K, V> f136614a;

    public C16120o(C16108c<K, V> cVar) {
        C17542s.j(cVar, "map");
        this.f136614a = new C16121p<>(cVar.p(), cVar.q());
    }

    public boolean hasNext() {
        return this.f136614a.hasNext();
    }

    public K next() {
        K c10 = this.f136614a.c();
        this.f136614a.next();
        return c10;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
