package NJ;

import MJ.C16079b;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\bX\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LNJ/m;", "K", "V", "", "", "LNJ/c;", "map", "<init>", "(LNJ/c;)V", "", "hasNext", "()Z", "c", "()Ljava/util/Map$Entry;", "LNJ/p;", "a", "LNJ/p;", "internal", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.m  reason: case insensitive filesystem */
public final class C16118m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C16121p<K, V> f136612a;

    public C16118m(C16108c<K, V> cVar) {
        C17542s.j(cVar, "map");
        this.f136612a = new C16121p<>(cVar.p(), cVar.q());
    }

    /* renamed from: c */
    public Map.Entry<K, V> next() {
        return new C16079b(this.f136612a.c(), this.f136612a.next().e());
    }

    public boolean hasNext() {
        return this.f136612a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
