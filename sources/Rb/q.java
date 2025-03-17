package rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class q extends C10205c {

    /* renamed from: a  reason: collision with root package name */
    private final int f76335a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76336b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76337c;

    /* renamed from: d  reason: collision with root package name */
    private final c f76338d;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f76339a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f76340b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f76341c;

        /* renamed from: d  reason: collision with root package name */
        private c f76342d;

        public q a() {
            Integer num = this.f76339a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.f76342d == null) {
                throw new GeneralSecurityException("Variant is not set");
            } else if (this.f76340b == null) {
                throw new GeneralSecurityException("IV size is not set");
            } else if (this.f76341c != null) {
                return new q(num.intValue(), this.f76340b.intValue(), this.f76341c.intValue(), this.f76342d);
            } else {
                throw new GeneralSecurityException("Tag size is not set");
            }
        }

        public b b(int i10) {
            if (i10 > 0) {
                this.f76340b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", new Object[]{Integer.valueOf(i10)}));
        }

        public b c(int i10) {
            if (i10 == 16 || i10 == 24 || i10 == 32) {
                this.f76339a = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public b d(int i10) {
            if (i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16) {
                this.f76341c = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public b e(c cVar) {
            this.f76342d = cVar;
            return this;
        }

        private b() {
            this.f76339a = null;
            this.f76340b = null;
            this.f76341c = null;
            this.f76342d = c.f76345d;
        }
    }

    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f76343b = new c("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final c f76344c = new c("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final c f76345d = new c("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f76346a;

        private c(String str) {
            this.f76346a = str;
        }

        public String toString() {
            return this.f76346a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f76336b;
    }

    public int c() {
        return this.f76335a;
    }

    public int d() {
        return this.f76337c;
    }

    public c e() {
        return this.f76338d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f76338d != c.f76345d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f76335a), Integer.valueOf(this.f76336b), Integer.valueOf(this.f76337c), this.f76338d});
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f76338d + ", " + this.f76336b + "-byte IV, " + this.f76337c + "-byte tag, and " + this.f76335a + "-byte key)";
    }

    private q(int i10, int i11, int i12, c cVar) {
        this.f76335a = i10;
        this.f76336b = i11;
        this.f76337c = i12;
        this.f76338d = cVar;
    }
}
