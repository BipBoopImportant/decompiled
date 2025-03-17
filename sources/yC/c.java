package Yc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mc.C10036b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f64939a = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f64940a;

        /* renamed from: b  reason: collision with root package name */
        private final C10036b f64941b;

        public <RemoteT extends b> a(Class<RemoteT> cls, C10036b<Object> bVar) {
            this.f64940a = cls;
            this.f64941b = bVar;
        }

        /* access modifiers changed from: package-private */
        public final C10036b a() {
            return this.f64941b;
        }

        /* access modifiers changed from: package-private */
        public final Class b() {
            return this.f64940a;
        }
    }

    public c(Set<a> set) {
        for (a next : set) {
            this.f64939a.put(next.b(), next.a());
        }
    }
}
