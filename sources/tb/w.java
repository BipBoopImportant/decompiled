package Tb;

import Tb.F;

final class w extends F.e.d.C1109e {

    /* renamed from: a  reason: collision with root package name */
    private final F.e.d.C1109e.b f63834a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63835b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63836c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63837d;

    static final class b extends F.e.d.C1109e.a {

        /* renamed from: a  reason: collision with root package name */
        private F.e.d.C1109e.b f63838a;

        /* renamed from: b  reason: collision with root package name */
        private String f63839b;

        /* renamed from: c  reason: collision with root package name */
        private String f63840c;

        /* renamed from: d  reason: collision with root package name */
        private long f63841d;

        /* renamed from: e  reason: collision with root package name */
        private byte f63842e;

        b() {
        }

        public F.e.d.C1109e a() {
            F.e.d.C1109e.b bVar;
            String str;
            String str2;
            if (this.f63842e == 1 && (bVar = this.f63838a) != null && (str = this.f63839b) != null && (str2 = this.f63840c) != null) {
                return new w(bVar, str, str2, this.f63841d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63838a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f63839b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f63840c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f63842e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.C1109e.a b(String str) {
            if (str != null) {
                this.f63839b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public F.e.d.C1109e.a c(String str) {
            if (str != null) {
                this.f63840c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public F.e.d.C1109e.a d(F.e.d.C1109e.b bVar) {
            if (bVar != null) {
                this.f63838a = bVar;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        public F.e.d.C1109e.a e(long j10) {
            this.f63841d = j10;
            this.f63842e = (byte) (this.f63842e | 1);
            return this;
        }
    }

    public String b() {
        return this.f63835b;
    }

    public String c() {
        return this.f63836c;
    }

    public F.e.d.C1109e.b d() {
        return this.f63834a;
    }

    public long e() {
        return this.f63837d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.C1109e)) {
            return false;
        }
        F.e.d.C1109e eVar = (F.e.d.C1109e) obj;
        return this.f63834a.equals(eVar.d()) && this.f63835b.equals(eVar.b()) && this.f63836c.equals(eVar.c()) && this.f63837d == eVar.e();
    }

    public int hashCode() {
        long j10 = this.f63837d;
        return ((((((this.f63834a.hashCode() ^ 1000003) * 1000003) ^ this.f63835b.hashCode()) * 1000003) ^ this.f63836c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f63834a + ", parameterKey=" + this.f63835b + ", parameterValue=" + this.f63836c + ", templateVersion=" + this.f63837d + "}";
    }

    private w(F.e.d.C1109e.b bVar, String str, String str2, long j10) {
        this.f63834a = bVar;
        this.f63835b = str;
        this.f63836c = str2;
        this.f63837d = j10;
    }
}
