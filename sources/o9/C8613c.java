package o9;

import ic.C9835c;
import ic.C9836d;

/* renamed from: o9.c  reason: case insensitive filesystem */
public final class C8613c {

    /* renamed from: c  reason: collision with root package name */
    private static final C8613c f55307c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f55308a;

    /* renamed from: b  reason: collision with root package name */
    private final b f55309b;

    /* renamed from: o9.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f55310a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f55311b = b.REASON_UNKNOWN;

        a() {
        }

        public C8613c a() {
            return new C8613c(this.f55310a, this.f55311b);
        }

        public a b(long j10) {
            this.f55310a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f55311b = bVar;
            return this;
        }
    }

    /* renamed from: o9.c$b */
    public enum b implements C9835c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private b(int i10) {
            this.number_ = i10;
        }

        public int d() {
            return this.number_;
        }
    }

    C8613c(long j10, b bVar) {
        this.f55308a = j10;
        this.f55309b = bVar;
    }

    public static a c() {
        return new a();
    }

    @C9836d(tag = 1)
    public long a() {
        return this.f55308a;
    }

    @C9836d(tag = 3)
    public b b() {
        return this.f55309b;
    }
}
