package p7;

import java.security.Provider;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp7/g;", "Ljava/security/Provider;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p7.g  reason: case insensitive filesystem */
public final class C8634g extends Provider {
    public /* bridge */ Set<Map.Entry<Object, Object>> a() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection<Object> d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return a();
    }

    public final /* bridge */ Set<Object> keySet() {
        return b();
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final /* bridge */ Collection<Object> values() {
        return d();
    }
}
