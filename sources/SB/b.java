package Sb;

final class b extends j {

    /* renamed from: b  reason: collision with root package name */
    private final String f63266b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63267c;

    /* renamed from: d  reason: collision with root package name */
    private final String f63268d;

    /* renamed from: e  reason: collision with root package name */
    private final String f63269e;

    /* renamed from: f  reason: collision with root package name */
    private final long f63270f;

    b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f63266b = str;
            if (str2 != null) {
                this.f63267c = str2;
                if (str3 != null) {
                    this.f63268d = str3;
                    if (str4 != null) {
                        this.f63269e = str4;
                        this.f63270f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public String c() {
        return this.f63267c;
    }

    public String d() {
        return this.f63268d;
    }

    public String e() {
        return this.f63266b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f63266b.equals(jVar.e()) && this.f63267c.equals(jVar.c()) && this.f63268d.equals(jVar.d()) && this.f63269e.equals(jVar.g()) && this.f63270f == jVar.f();
    }

    public long f() {
        return this.f63270f;
    }

    public String g() {
        return this.f63269e;
    }

    public int hashCode() {
        long j10 = this.f63270f;
        return ((((((((this.f63266b.hashCode() ^ 1000003) * 1000003) ^ this.f63267c.hashCode()) * 1000003) ^ this.f63268d.hashCode()) * 1000003) ^ this.f63269e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f63266b + ", parameterKey=" + this.f63267c + ", parameterValue=" + this.f63268d + ", variantId=" + this.f63269e + ", templateVersion=" + this.f63270f + "}";
    }
}
