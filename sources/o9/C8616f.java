package o9;

import ic.C9836d;

/* renamed from: o9.f  reason: case insensitive filesystem */
public final class C8616f {

    /* renamed from: c  reason: collision with root package name */
    private static final C8616f f55322c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f55323a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55324b;

    /* renamed from: o9.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f55325a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f55326b = 0;

        a() {
        }

        public C8616f a() {
            return new C8616f(this.f55325a, this.f55326b);
        }

        public a b(long j10) {
            this.f55326b = j10;
            return this;
        }

        public a c(long j10) {
            this.f55325a = j10;
            return this;
        }
    }

    C8616f(long j10, long j11) {
        this.f55323a = j10;
        this.f55324b = j11;
    }

    public static a c() {
        return new a();
    }

    @C9836d(tag = 2)
    public long a() {
        return this.f55324b;
    }

    @C9836d(tag = 1)
    public long b() {
        return this.f55323a;
    }
}
