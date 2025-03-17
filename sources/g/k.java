package G;

final class k {

    /* renamed from: a  reason: collision with root package name */
    private final long f6102a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6103b;

    k(long j10, long j11) {
        this.f6102a = j10;
        this.f6103b = j11;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f6103b;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f6102a;
    }

    public String toString() {
        return this.f6102a + "/" + this.f6103b;
    }

    k(double d10) {
        this((long) (d10 * 10000.0d), 10000);
    }
}
