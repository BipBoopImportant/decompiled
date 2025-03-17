package N3;

import N3.J;

public final class M implements J {

    /* renamed from: a  reason: collision with root package name */
    private final long f38775a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38776b;

    public M(long j10) {
        this(j10, 0);
    }

    public J.a c(long j10) {
        return new J.a(new K(j10, this.f38776b));
    }

    public boolean f() {
        return true;
    }

    public long l() {
        return this.f38775a;
    }

    public M(long j10, long j11) {
        this.f38775a = j10;
        this.f38776b = j11;
    }
}
