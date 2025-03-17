package Tb;

import Tb.F;

final class q extends F.e.d.a.b.C1101d {

    /* renamed from: a  reason: collision with root package name */
    private final String f63785a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63786b;

    /* renamed from: c  reason: collision with root package name */
    private final long f63787c;

    static final class b extends F.e.d.a.b.C1101d.C1102a {

        /* renamed from: a  reason: collision with root package name */
        private String f63788a;

        /* renamed from: b  reason: collision with root package name */
        private String f63789b;

        /* renamed from: c  reason: collision with root package name */
        private long f63790c;

        /* renamed from: d  reason: collision with root package name */
        private byte f63791d;

        b() {
        }

        public F.e.d.a.b.C1101d a() {
            String str;
            String str2;
            if (this.f63791d == 1 && (str = this.f63788a) != null && (str2 = this.f63789b) != null) {
                return new q(str, str2, this.f63790c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63788a == null) {
                sb2.append(" name");
            }
            if (this.f63789b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f63791d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.C1101d.C1102a b(long j10) {
            this.f63790c = j10;
            this.f63791d = (byte) (this.f63791d | 1);
            return this;
        }

        public F.e.d.a.b.C1101d.C1102a c(String str) {
            if (str != null) {
                this.f63789b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        public F.e.d.a.b.C1101d.C1102a d(String str) {
            if (str != null) {
                this.f63788a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public long b() {
        return this.f63787c;
    }

    public String c() {
        return this.f63786b;
    }

    public String d() {
        return this.f63785a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.C1101d)) {
            return false;
        }
        F.e.d.a.b.C1101d dVar = (F.e.d.a.b.C1101d) obj;
        return this.f63785a.equals(dVar.d()) && this.f63786b.equals(dVar.c()) && this.f63787c == dVar.b();
    }

    public int hashCode() {
        long j10 = this.f63787c;
        return ((((this.f63785a.hashCode() ^ 1000003) * 1000003) ^ this.f63786b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f63785a + ", code=" + this.f63786b + ", address=" + this.f63787c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f63785a = str;
        this.f63786b = str2;
        this.f63787c = j10;
    }
}
