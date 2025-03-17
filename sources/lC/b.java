package Lc;

import Lc.d;

final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f61583b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61584c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61585d;

    /* renamed from: e  reason: collision with root package name */
    private final String f61586e;

    /* renamed from: f  reason: collision with root package name */
    private final long f61587f;

    /* renamed from: Lc.b$b  reason: collision with other inner class name */
    static final class C1023b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f61588a;

        /* renamed from: b  reason: collision with root package name */
        private String f61589b;

        /* renamed from: c  reason: collision with root package name */
        private String f61590c;

        /* renamed from: d  reason: collision with root package name */
        private String f61591d;

        /* renamed from: e  reason: collision with root package name */
        private long f61592e;

        /* renamed from: f  reason: collision with root package name */
        private byte f61593f;

        C1023b() {
        }

        public d a() {
            if (this.f61593f == 1 && this.f61588a != null && this.f61589b != null && this.f61590c != null && this.f61591d != null) {
                return new b(this.f61588a, this.f61589b, this.f61590c, this.f61591d, this.f61592e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f61588a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f61589b == null) {
                sb2.append(" variantId");
            }
            if (this.f61590c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f61591d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f61593f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public d.a b(String str) {
            if (str != null) {
                this.f61590c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public d.a c(String str) {
            if (str != null) {
                this.f61591d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public d.a d(String str) {
            if (str != null) {
                this.f61588a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public d.a e(long j10) {
            this.f61592e = j10;
            this.f61593f = (byte) (this.f61593f | 1);
            return this;
        }

        public d.a f(String str) {
            if (str != null) {
                this.f61589b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public String b() {
        return this.f61585d;
    }

    public String c() {
        return this.f61586e;
    }

    public String d() {
        return this.f61583b;
    }

    public long e() {
        return this.f61587f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f61583b.equals(dVar.d()) && this.f61584c.equals(dVar.f()) && this.f61585d.equals(dVar.b()) && this.f61586e.equals(dVar.c()) && this.f61587f == dVar.e();
    }

    public String f() {
        return this.f61584c;
    }

    public int hashCode() {
        long j10 = this.f61587f;
        return ((((((((this.f61583b.hashCode() ^ 1000003) * 1000003) ^ this.f61584c.hashCode()) * 1000003) ^ this.f61585d.hashCode()) * 1000003) ^ this.f61586e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f61583b + ", variantId=" + this.f61584c + ", parameterKey=" + this.f61585d + ", parameterValue=" + this.f61586e + ", templateVersion=" + this.f61587f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f61583b = str;
        this.f61584c = str2;
        this.f61585d = str3;
        this.f61586e = str4;
        this.f61587f = j10;
    }
}
