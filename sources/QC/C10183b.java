package qc;

import qc.f;

/* renamed from: qc.b  reason: case insensitive filesystem */
final class C10183b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f76027a;

    /* renamed from: b  reason: collision with root package name */
    private final long f76028b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f76029c;

    /* renamed from: qc.b$b  reason: collision with other inner class name */
    static final class C1397b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f76030a;

        /* renamed from: b  reason: collision with root package name */
        private Long f76031b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f76032c;

        C1397b() {
        }

        public f a() {
            String str = "";
            if (this.f76031b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C10183b(this.f76030a, this.f76031b.longValue(), this.f76032c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(f.b bVar) {
            this.f76032c = bVar;
            return this;
        }

        public f.a c(String str) {
            this.f76030a = str;
            return this;
        }

        public f.a d(long j10) {
            this.f76031b = Long.valueOf(j10);
            return this;
        }
    }

    public f.b b() {
        return this.f76029c;
    }

    public String c() {
        return this.f76027a;
    }

    public long d() {
        return this.f76028b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f76027a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f76028b == fVar.d()) {
                f.b bVar = this.f76029c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f76027a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f76028b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f76029c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f76027a + ", tokenExpirationTimestamp=" + this.f76028b + ", responseCode=" + this.f76029c + "}";
    }

    private C10183b(String str, long j10, f.b bVar) {
        this.f76027a = str;
        this.f76028b = j10;
        this.f76029c = bVar;
    }
}
