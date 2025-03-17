package L3;

import java.util.Arrays;

/* renamed from: L3.b  reason: case insensitive filesystem */
final class C6637b {

    /* renamed from: a  reason: collision with root package name */
    private a f38064a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f38065b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f38066c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38067d;

    /* renamed from: e  reason: collision with root package name */
    private long f38068e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f38069f;

    /* renamed from: L3.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f38070a;

        /* renamed from: b  reason: collision with root package name */
        private long f38071b;

        /* renamed from: c  reason: collision with root package name */
        private long f38072c;

        /* renamed from: d  reason: collision with root package name */
        private long f38073d;

        /* renamed from: e  reason: collision with root package name */
        private long f38074e;

        /* renamed from: f  reason: collision with root package name */
        private long f38075f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f38076g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f38077h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f38074e;
            if (j10 == 0) {
                return 0;
            }
            return this.f38075f / j10;
        }

        public long b() {
            return this.f38075f;
        }

        public boolean d() {
            long j10 = this.f38073d;
            if (j10 == 0) {
                return false;
            }
            return this.f38076g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f38073d > 15 && this.f38077h == 0;
        }

        public void f(long j10) {
            long j11 = this.f38073d;
            if (j11 == 0) {
                this.f38070a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f38070a;
                this.f38071b = j12;
                this.f38075f = j12;
                this.f38074e = 1;
            } else {
                long j13 = j10 - this.f38072c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f38071b) <= 1000000) {
                    this.f38074e++;
                    this.f38075f += j13;
                    boolean[] zArr = this.f38076g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f38077h--;
                    }
                } else {
                    boolean[] zArr2 = this.f38076g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f38077h++;
                    }
                }
            }
            this.f38073d++;
            this.f38072c = j10;
        }

        public void g() {
            this.f38073d = 0;
            this.f38074e = 0;
            this.f38075f = 0;
            this.f38077h = 0;
            Arrays.fill(this.f38076g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f38064a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f38064a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f38069f;
    }

    public long d() {
        if (e()) {
            return this.f38064a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f38064a.e();
    }

    public void f(long j10) {
        this.f38064a.f(j10);
        int i10 = 0;
        if (this.f38064a.e() && !this.f38067d) {
            this.f38066c = false;
        } else if (this.f38068e != -9223372036854775807L) {
            if (!this.f38066c || this.f38065b.d()) {
                this.f38065b.g();
                this.f38065b.f(this.f38068e);
            }
            this.f38066c = true;
            this.f38065b.f(j10);
        }
        if (this.f38066c && this.f38065b.e()) {
            a aVar = this.f38064a;
            this.f38064a = this.f38065b;
            this.f38065b = aVar;
            this.f38066c = false;
            this.f38067d = false;
        }
        this.f38068e = j10;
        if (!this.f38064a.e()) {
            i10 = this.f38069f + 1;
        }
        this.f38069f = i10;
    }

    public void g() {
        this.f38064a.g();
        this.f38065b.g();
        this.f38066c = false;
        this.f38068e = -9223372036854775807L;
        this.f38069f = 0;
    }
}
