package fc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fc.c  reason: case insensitive filesystem */
public final class C9702c {

    /* renamed from: a  reason: collision with root package name */
    private final String f72966a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f72967b;

    /* renamed from: fc.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f72968a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f72969b = null;

        b(String str) {
            this.f72968a = str;
        }

        public C9702c a() {
            return new C9702c(this.f72968a, this.f72969b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f72969b)));
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f72969b == null) {
                this.f72969b = new HashMap();
            }
            this.f72969b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static C9702c d(String str) {
        return new C9702c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f72966a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (Annotation) this.f72967b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9702c)) {
            return false;
        }
        C9702c cVar = (C9702c) obj;
        return this.f72966a.equals(cVar.f72966a) && this.f72967b.equals(cVar.f72967b);
    }

    public int hashCode() {
        return (this.f72966a.hashCode() * 31) + this.f72967b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f72966a + ", properties=" + this.f72967b.values() + "}";
    }

    private C9702c(String str, Map<Class<?>, Object> map) {
        this.f72966a = str;
        this.f72967b = map;
    }
}
