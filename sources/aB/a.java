package Ab;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f58659b = a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f58660a;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, String> f58661a = new HashMap<>();

        public a a() {
            if (this.f58661a != null) {
                a aVar = new a(Collections.unmodifiableMap(this.f58661a));
                this.f58661a = null;
                return aVar;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f58660a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f58660a.equals(((a) obj).f58660a);
    }

    public int hashCode() {
        return this.f58660a.hashCode();
    }

    public String toString() {
        return this.f58660a.toString();
    }

    private a(Map<String, String> map) {
        this.f58660a = map;
    }
}
