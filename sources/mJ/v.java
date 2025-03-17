package MJ;

import PJ.C16207a;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LMJ/v;", "K", "V", "LMJ/u;", "", "<init>", "()V", "q", "()Ljava/util/Map$Entry;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    /* renamed from: q */
    public Map.Entry<K, V> next() {
        C16207a.a(i());
        p(h() + 2);
        return new C16079b(f()[h() - 2], f()[h() - 1]);
    }
}
