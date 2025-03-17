package yb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: yb.d  reason: case insensitive filesystem */
public final class C10417d extends q {

    /* renamed from: a  reason: collision with root package name */
    private final int f77821a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77822b;

    /* renamed from: c  reason: collision with root package name */
    private final c f77823c;

    /* renamed from: yb.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f77824a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f77825b;

        /* renamed from: c  reason: collision with root package name */
        private c f77826c;

        public C10417d a() {
            Integer num = this.f77824a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            } else if (this.f77825b == null) {
                throw new GeneralSecurityException("tag size not set");
            } else if (this.f77826c != null) {
                return new C10417d(num.intValue(), this.f77825b.intValue(), this.f77826c);
            } else {
                throw new GeneralSecurityException("variant not set");
            }
        }

        public b b(int i10) {
            if (i10 == 16 || i10 == 32) {
                this.f77824a = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 * 8)}));
        }

        public b c(int i10) {
            if (i10 < 10 || 16 < i10) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
            }
            this.f77825b = Integer.valueOf(i10);
            return this;
        }

        public b d(c cVar) {
            this.f77826c = cVar;
            return this;
        }

        private b() {
            this.f77824a = null;
            this.f77825b = null;
            this.f77826c = c.f77830e;
        }
    }

    /* renamed from: yb.d$c */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f77827b = new c("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final c f77828c = new c("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final c f77829d = new c("LEGACY");

        /* renamed from: e  reason: collision with root package name */
        public static final c f77830e = new c("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f77831a;

        private c(String str) {
            this.f77831a = str;
        }

        public String toString() {
            return this.f77831a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f77822b;
    }

    public int c() {
        return this.f77821a;
    }

    public int d() {
        int b10;
        c cVar = this.f77823c;
        if (cVar == c.f77830e) {
            return b();
        }
        if (cVar == c.f77827b) {
            b10 = b();
        } else if (cVar == c.f77828c) {
            b10 = b();
        } else if (cVar == c.f77829d) {
            b10 = b();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return b10 + 5;
    }

    public c e() {
        return this.f77823c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10417d)) {
            return false;
        }
        C10417d dVar = (C10417d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f77823c != c.f77830e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f77821a), Integer.valueOf(this.f77822b), this.f77823c});
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f77823c + ", " + this.f77822b + "-byte tags, and " + this.f77821a + "-byte key)";
    }

    private C10417d(int i10, int i11, c cVar) {
        this.f77821a = i10;
        this.f77822b = i11;
        this.f77823c = cVar;
    }
}
