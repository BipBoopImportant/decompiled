package Tb;

import Tb.F;

final class o extends F.e.d.a.b.C1097a {

    /* renamed from: a  reason: collision with root package name */
    private final long f63765a;

    /* renamed from: b  reason: collision with root package name */
    private final long f63766b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63767c;

    /* renamed from: d  reason: collision with root package name */
    private final String f63768d;

    static final class b extends F.e.d.a.b.C1097a.C1098a {

        /* renamed from: a  reason: collision with root package name */
        private long f63769a;

        /* renamed from: b  reason: collision with root package name */
        private long f63770b;

        /* renamed from: c  reason: collision with root package name */
        private String f63771c;

        /* renamed from: d  reason: collision with root package name */
        private String f63772d;

        /* renamed from: e  reason: collision with root package name */
        private byte f63773e;

        b() {
        }

        public F.e.d.a.b.C1097a a() {
            String str;
            if (this.f63773e == 3 && (str = this.f63771c) != null) {
                return new o(this.f63769a, this.f63770b, str, this.f63772d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63773e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f63773e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f63771c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.C1097a.C1098a b(long j10) {
            this.f63769a = j10;
            this.f63773e = (byte) (this.f63773e | 1);
            return this;
        }

        public F.e.d.a.b.C1097a.C1098a c(String str) {
            if (str != null) {
                this.f63771c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public F.e.d.a.b.C1097a.C1098a d(long j10) {
            this.f63770b = j10;
            this.f63773e = (byte) (this.f63773e | 2);
            return this;
        }

        public F.e.d.a.b.C1097a.C1098a e(String str) {
            this.f63772d = str;
            return this;
        }
    }

    public long b() {
        return this.f63765a;
    }

    public String c() {
        return this.f63767c;
    }

    public long d() {
        return this.f63766b;
    }

    public String e() {
        return this.f63768d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.C1097a)) {
            return false;
        }
        F.e.d.a.b.C1097a aVar = (F.e.d.a.b.C1097a) obj;
        if (this.f63765a == aVar.b() && this.f63766b == aVar.d() && this.f63767c.equals(aVar.c())) {
            String str = this.f63768d;
            if (str == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f63765a;
        long j11 = this.f63766b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f63767c.hashCode()) * 1000003;
        String str = this.f63768d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f63765a + ", size=" + this.f63766b + ", name=" + this.f63767c + ", uuid=" + this.f63768d + "}";
    }

    private o(long j10, long j11, String str, String str2) {
        this.f63765a = j10;
        this.f63766b = j11;
        this.f63767c = str;
        this.f63768d = str2;
    }
}
