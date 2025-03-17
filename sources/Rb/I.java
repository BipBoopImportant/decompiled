package rb;

import java.util.Objects;

public final class I extends C10205c {

    /* renamed from: a  reason: collision with root package name */
    private final a f76272a;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f76273b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f76274c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f76275d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f76276a;

        private a(String str) {
            this.f76276a = str;
        }

        public String toString() {
            return this.f76276a;
        }
    }

    private I(a aVar) {
        this.f76272a = aVar;
    }

    public static I a(a aVar) {
        return new I(aVar);
    }

    public a b() {
        return this.f76272a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f76272a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f76272a + ")";
    }
}
