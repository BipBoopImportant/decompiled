package o9;

import ic.C9836d;

/* renamed from: o9.e  reason: case insensitive filesystem */
public final class C8615e {

    /* renamed from: c  reason: collision with root package name */
    private static final C8615e f55317c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f55318a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55319b;

    /* renamed from: o9.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f55320a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f55321b = 0;

        a() {
        }

        public C8615e a() {
            return new C8615e(this.f55320a, this.f55321b);
        }

        public a b(long j10) {
            this.f55320a = j10;
            return this;
        }

        public a c(long j10) {
            this.f55321b = j10;
            return this;
        }
    }

    C8615e(long j10, long j11) {
        this.f55318a = j10;
        this.f55319b = j11;
    }

    public static a c() {
        return new a();
    }

    @C9836d(tag = 1)
    public long a() {
        return this.f55318a;
    }

    @C9836d(tag = 2)
    public long b() {
        return this.f55319b;
    }
}
