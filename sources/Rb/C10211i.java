package rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: rb.i  reason: case insensitive filesystem */
public final class C10211i extends C10205c {

    /* renamed from: a  reason: collision with root package name */
    private final int f76309a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76310b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76311c;

    /* renamed from: d  reason: collision with root package name */
    private final c f76312d;

    /* renamed from: rb.i$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f76313a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f76314b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f76315c;

        /* renamed from: d  reason: collision with root package name */
        private c f76316d;

        public C10211i a() {
            Integer num = this.f76313a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.f76314b == null) {
                throw new GeneralSecurityException("IV size is not set");
            } else if (this.f76316d == null) {
                throw new GeneralSecurityException("Variant is not set");
            } else if (this.f76315c != null) {
                return new C10211i(num.intValue(), this.f76314b.intValue(), this.f76315c.intValue(), this.f76316d);
            } else {
                throw new GeneralSecurityException("Tag size is not set");
            }
        }

        public b b(int i10) {
            if (i10 == 12 || i10 == 16) {
                this.f76314b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public b c(int i10) {
            if (i10 == 16 || i10 == 24 || i10 == 32) {
                this.f76313a = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public b d(int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", new Object[]{Integer.valueOf(i10)}));
            }
            this.f76315c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f76316d = cVar;
            return this;
        }

        private b() {
            this.f76313a = null;
            this.f76314b = null;
            this.f76315c = null;
            this.f76316d = c.f76319d;
        }
    }

    /* renamed from: rb.i$c */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f76317b = new c("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final c f76318c = new c("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final c f76319d = new c("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f76320a;

        private c(String str) {
            this.f76320a = str;
        }

        public String toString() {
            return this.f76320a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f76310b;
    }

    public int c() {
        return this.f76309a;
    }

    public int d() {
        return this.f76311c;
    }

    public c e() {
        return this.f76312d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10211i)) {
            return false;
        }
        C10211i iVar = (C10211i) obj;
        return iVar.c() == c() && iVar.b() == b() && iVar.d() == d() && iVar.e() == e();
    }

    public boolean f() {
        return this.f76312d != c.f76319d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f76309a), Integer.valueOf(this.f76310b), Integer.valueOf(this.f76311c), this.f76312d});
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f76312d + ", " + this.f76310b + "-byte IV, " + this.f76311c + "-byte tag, and " + this.f76309a + "-byte key)";
    }

    private C10211i(int i10, int i11, int i12, c cVar) {
        this.f76309a = i10;
        this.f76310b = i11;
        this.f76311c = i12;
        this.f76312d = cVar;
    }
}
