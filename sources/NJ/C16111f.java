package NJ;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LNJ/f;", "K", "V", "", "", "LNJ/d;", "map", "<init>", "(LNJ/d;)V", "", "hasNext", "()Z", "c", "()Ljava/util/Map$Entry;", "LXH/N;", "remove", "()V", "LNJ/i;", "a", "LNJ/i;", "internal", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.f  reason: case insensitive filesystem */
public final class C16111f<K, V> implements Iterator<Map.Entry<K, V>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C16114i<K, V> f136600a;

    public C16111f(C16109d<K, V> dVar) {
        C17542s.j(dVar, "map");
        this.f136600a = new C16114i<>(dVar.f(), dVar);
    }

    /* renamed from: c */
    public Map.Entry<K, V> next() {
        return new C16107b(this.f136600a.h().h(), this.f136600a.i(), this.f136600a.next());
    }

    public boolean hasNext() {
        return this.f136600a.hasNext();
    }

    public void remove() {
        this.f136600a.remove();
    }
}
