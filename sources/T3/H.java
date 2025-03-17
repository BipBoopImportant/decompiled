package t3;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private long f29456a;

    /* renamed from: b  reason: collision with root package name */
    private long f29457b;

    /* renamed from: c  reason: collision with root package name */
    private long f29458c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Long> f29459d = new ThreadLocal<>();

    public H(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return N.Z0(j10, 1000000, 90000);
    }

    public static long j(long j10) {
        return N.Z0(j10, 90000, 1000000);
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j11 = this.f29456a;
                if (j11 == 9223372036854775806L) {
                    j11 = ((Long) C5950a.e(this.f29459d.get())).longValue();
                }
                this.f29457b = j11 - j10;
                notifyAll();
            }
            this.f29458c = j10;
            return j10 + this.f29457b;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f29458c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f29458c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f29456a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f29458c;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return j10 != -9223372036854775807L ? j10 + this.f29457b : d();
    }

    public synchronized long f() {
        return this.f29457b;
    }

    public synchronized boolean g() {
        return this.f29457b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f29456a = j10;
        this.f29457b = j10 == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f29458c = -9223372036854775807L;
    }
}
