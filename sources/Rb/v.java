package rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class v extends C10205c {

    /* renamed from: a  reason: collision with root package name */
    private final int f76361a;

    /* renamed from: b  reason: collision with root package name */
    private final c f76362b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f76363a;

        /* renamed from: b  reason: collision with root package name */
        private c f76364b;

        public v a() {
            Integer num = this.f76363a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.f76364b != null) {
                return new v(num.intValue(), this.f76364b);
            } else {
                throw new GeneralSecurityException("Variant is not set");
            }
        }

        public b b(int i10) {
            if (i10 == 16 || i10 == 32) {
                this.f76363a = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public b c(c cVar) {
            this.f76364b = cVar;
            return this;
        }

        private b() {
            this.f76363a = null;
            this.f76364b = c.f76367d;
        }
    }

    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f76365b = new c("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final c f76366c = new c("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final c f76367d = new c("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f76368a;

        private c(String str) {
            this.f76368a = str;
        }

        public String toString() {
            return this.f76368a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f76361a;
    }

    public c c() {
        return this.f76362b;
    }

    public boolean d() {
        return this.f76362b != c.f76367d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f76361a), this.f76362b});
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f76362b + ", " + this.f76361a + "-byte key)";
    }

    private v(int i10, c cVar) {
        this.f76361a = i10;
        this.f76362b = cVar;
    }
}
