package MJ;

import PJ.C16207a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LMJ/y;", "K", "V", "LMJ/u;", "", "LMJ/i;", "parentIterator", "<init>", "(LMJ/i;)V", "q", "()Ljava/util/Map$Entry;", "d", "LMJ/i;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final C16086i<K, V> f136452d;

    public y(C16086i<K, V> iVar) {
        C17542s.j(iVar, "parentIterator");
        this.f136452d = iVar;
    }

    /* renamed from: q */
    public Map.Entry<K, V> next() {
        C16207a.a(i());
        p(h() + 2);
        return new C16080c(this.f136452d, f()[h() - 2], f()[h() - 1]);
    }
}
