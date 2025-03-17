package yb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: yb.l  reason: case insensitive filesystem */
public final class C10425l extends q {

    /* renamed from: a  reason: collision with root package name */
    private final int f77850a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77851b;

    /* renamed from: c  reason: collision with root package name */
    private final d f77852c;

    /* renamed from: d  reason: collision with root package name */
    private final c f77853d;

    /* renamed from: yb.l$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f77854a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f77855b;

        /* renamed from: c  reason: collision with root package name */
        private c f77856c;

        /* renamed from: d  reason: collision with root package name */
        private d f77857d;

        private static void f(int i10, c cVar) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i10)}));
            } else if (cVar == c.f77858b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(i10)}));
                }
            } else if (cVar == c.f77859c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(i10)}));
                }
            } else if (cVar == c.f77860d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(i10)}));
                }
            } else if (cVar == c.f77861e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(i10)}));
                }
            } else if (cVar != c.f77862f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            } else if (i10 > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(i10)}));
            }
        }

        public C10425l a() {
            Integer num = this.f77854a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            } else if (this.f77855b == null) {
                throw new GeneralSecurityException("tag size is not set");
            } else if (this.f77856c == null) {
                throw new GeneralSecurityException("hash type is not set");
            } else if (this.f77857d == null) {
                throw new GeneralSecurityException("variant is not set");
            } else if (num.intValue() >= 16) {
                f(this.f77855b.intValue(), this.f77856c);
                return new C10425l(this.f77854a.intValue(), this.f77855b.intValue(), this.f77857d, this.f77856c);
            } else {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f77854a}));
            }
        }

        public b b(c cVar) {
            this.f77856c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f77854a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f77855b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f77857d = dVar;
            return this;
        }

        private b() {
            this.f77854a = null;
            this.f77855b = null;
            this.f77856c = null;
            this.f77857d = d.f77867e;
        }
    }

    /* renamed from: yb.l$c */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f77858b = new c("SHA1");

        /* renamed from: c  reason: collision with root package name */
        public static final c f77859c = new c("SHA224");

        /* renamed from: d  reason: collision with root package name */
        public static final c f77860d = new c("SHA256");

        /* renamed from: e  reason: collision with root package name */
        public static final c f77861e = new c("SHA384");

        /* renamed from: f  reason: collision with root package name */
        public static final c f77862f = new c("SHA512");

        /* renamed from: a  reason: collision with root package name */
        private final String f77863a;

        private c(String str) {
            this.f77863a = str;
        }

        public String toString() {
            return this.f77863a;
        }
    }

    /* renamed from: yb.l$d */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f77864b = new d("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final d f77865c = new d("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final d f77866d = new d("LEGACY");

        /* renamed from: e  reason: collision with root package name */
        public static final d f77867e = new d("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f77868a;

        private d(String str) {
            this.f77868a = str;
        }

        public String toString() {
            return this.f77868a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f77851b;
    }

    public c c() {
        return this.f77853d;
    }

    public int d() {
        return this.f77850a;
    }

    public int e() {
        int b10;
        d dVar = this.f77852c;
        if (dVar == d.f77867e) {
            return b();
        }
        if (dVar == d.f77864b) {
            b10 = b();
        } else if (dVar == d.f77865c) {
            b10 = b();
        } else if (dVar == d.f77866d) {
            b10 = b();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return b10 + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10425l)) {
            return false;
        }
        C10425l lVar = (C10425l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f77852c;
    }

    public boolean g() {
        return this.f77852c != d.f77867e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f77850a), Integer.valueOf(this.f77851b), this.f77852c, this.f77853d});
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f77852c + ", hashType: " + this.f77853d + ", " + this.f77851b + "-byte tags, and " + this.f77850a + "-byte key)";
    }

    private C10425l(int i10, int i11, d dVar, c cVar) {
        this.f77850a = i10;
        this.f77851b = i11;
        this.f77852c = dVar;
        this.f77853d = cVar;
    }
}
