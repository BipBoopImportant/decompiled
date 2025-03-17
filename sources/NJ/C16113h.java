package NJ;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108\bX\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LNJ/h;", "K", "V", "", "LNJ/d;", "map", "<init>", "(LNJ/d;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "LXH/N;", "remove", "()V", "LNJ/i;", "a", "LNJ/i;", "internal", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.h  reason: case insensitive filesystem */
public final class C16113h<K, V> implements Iterator<K>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C16114i<K, V> f136602a;

    public C16113h(C16109d<K, V> dVar) {
        C17542s.j(dVar, "map");
        this.f136602a = new C16114i<>(dVar.f(), dVar);
    }

    public boolean hasNext() {
        return this.f136602a.hasNext();
    }

    public K next() {
        this.f136602a.next();
        return this.f136602a.i();
    }

    public void remove() {
        this.f136602a.remove();
    }
}
