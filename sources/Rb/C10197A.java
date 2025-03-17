package rb;

import java.util.Objects;

/* renamed from: rb.A  reason: case insensitive filesystem */
public final class C10197A extends C10205c {

    /* renamed from: a  reason: collision with root package name */
    private final a f76251a;

    /* renamed from: rb.A$a */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f76252b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f76253c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f76254d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f76255a;

        private a(String str) {
            this.f76255a = str;
        }

        public String toString() {
            return this.f76255a;
        }
    }

    private C10197A(a aVar) {
        this.f76251a = aVar;
    }

    public static C10197A a(a aVar) {
        return new C10197A(aVar);
    }

    public a b() {
        return this.f76251a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10197A) && ((C10197A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f76251a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f76251a + ")";
    }
}
