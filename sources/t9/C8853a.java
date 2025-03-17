package t9;

import t9.C8857e;

/* renamed from: t9.a  reason: case insensitive filesystem */
final class C8853a extends C8857e {

    /* renamed from: b  reason: collision with root package name */
    private final long f56708b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56709c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56710d;

    /* renamed from: e  reason: collision with root package name */
    private final long f56711e;

    /* renamed from: f  reason: collision with root package name */
    private final int f56712f;

    /* renamed from: t9.a$b */
    static final class b extends C8857e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f56713a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f56714b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f56715c;

        /* renamed from: d  reason: collision with root package name */
        private Long f56716d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f56717e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public C8857e a() {
            String str = "";
            if (this.f56713a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f56714b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f56715c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f56716d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f56717e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C8853a(this.f56713a.longValue(), this.f56714b.intValue(), this.f56715c.intValue(), this.f56716d.longValue(), this.f56717e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public C8857e.a b(int i10) {
            this.f56715c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8857e.a c(long j10) {
            this.f56716d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8857e.a d(int i10) {
            this.f56714b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8857e.a e(int i10) {
            this.f56717e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8857e.a f(long j10) {
            this.f56713a = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f56710d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f56711e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f56709c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f56712f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8857e)) {
            return false;
        }
        C8857e eVar = (C8857e) obj;
        return this.f56708b == eVar.f() && this.f56709c == eVar.d() && this.f56710d == eVar.b() && this.f56711e == eVar.c() && this.f56712f == eVar.e();
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f56708b;
    }

    public int hashCode() {
        long j10 = this.f56708b;
        long j11 = this.f56711e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f56709c) * 1000003) ^ this.f56710d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f56712f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f56708b + ", loadBatchSize=" + this.f56709c + ", criticalSectionEnterTimeoutMs=" + this.f56710d + ", eventCleanUpAge=" + this.f56711e + ", maxBlobByteSizePerRow=" + this.f56712f + "}";
    }

    private C8853a(long j10, int i10, int i11, long j11, int i12) {
        this.f56708b = j10;
        this.f56709c = i10;
        this.f56710d = i11;
        this.f56711e = j11;
        this.f56712f = i12;
    }
}
