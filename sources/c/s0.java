package C;

import H2.i;
import androidx.camera.core.impl.M;
import androidx.camera.core.impl.W0;
import androidx.camera.core.impl.i1;

public interface s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f5402a = new r0();

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f5403b = new M.b(e());

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f5404c = new M(e());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final s0 f5405a;

        /* renamed from: b  reason: collision with root package name */
        private long f5406b;

        public a(s0 s0Var) {
            this.f5405a = s0Var;
            this.f5406b = s0Var.a();
        }

        public s0 a() {
            s0 s0Var = this.f5405a;
            return s0Var instanceof W0 ? ((W0) s0Var).d(this.f5406b) : new i1(this.f5406b, this.f5405a);
        }
    }

    public interface b {
        int i();

        Throwable j();

        long k();
    }

    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f5407d = new c(false, 0);

        /* renamed from: e  reason: collision with root package name */
        public static final c f5408e = new c(true);

        /* renamed from: f  reason: collision with root package name */
        public static final c f5409f = new c(true, 100);

        /* renamed from: g  reason: collision with root package name */
        public static c f5410g = new c(false, 0, true);

        /* renamed from: a  reason: collision with root package name */
        private final long f5411a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5412b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5413c;

        private c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500;
        }

        public long b() {
            return this.f5411a;
        }

        public boolean c() {
            return this.f5413c;
        }

        public boolean d() {
            return this.f5412b;
        }

        private c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        private c(boolean z10, long j10, boolean z11) {
            this.f5412b = z10;
            this.f5411a = j10;
            if (z11) {
                i.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f5413c = z11;
        }
    }

    static long e() {
        return 6000;
    }

    long a() {
        return 0;
    }

    c c(b bVar);
}
