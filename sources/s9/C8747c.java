package s9;

import java.util.Set;
import s9.f;

/* renamed from: s9.c  reason: case insensitive filesystem */
final class C8747c extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f56003a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56004b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f.c> f56005c;

    /* renamed from: s9.c$b */
    static final class b extends f.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f56006a;

        /* renamed from: b  reason: collision with root package name */
        private Long f56007b;

        /* renamed from: c  reason: collision with root package name */
        private Set<f.c> f56008c;

        b() {
        }

        public f.b a() {
            String str = "";
            if (this.f56006a == null) {
                str = str + " delta";
            }
            if (this.f56007b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f56008c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C8747c(this.f56006a.longValue(), this.f56007b.longValue(), this.f56008c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.b.a b(long j10) {
            this.f56006a = Long.valueOf(j10);
            return this;
        }

        public f.b.a c(Set<f.c> set) {
            if (set != null) {
                this.f56008c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public f.b.a d(long j10) {
            this.f56007b = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f56003a;
    }

    /* access modifiers changed from: package-private */
    public Set<f.c> c() {
        return this.f56005c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f56004b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f56003a == bVar.b() && this.f56004b == bVar.d() && this.f56005c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f56003a;
        long j11 = this.f56004b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f56005c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f56003a + ", maxAllowedDelay=" + this.f56004b + ", flags=" + this.f56005c + "}";
    }

    private C8747c(long j10, long j11, Set<f.c> set) {
        this.f56003a = j10;
        this.f56004b = j11;
        this.f56005c = set;
    }
}
