package Tb;

import Tb.F;

final class u extends F.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f63819a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63820b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63821c;

    /* renamed from: d  reason: collision with root package name */
    private final int f63822d;

    /* renamed from: e  reason: collision with root package name */
    private final long f63823e;

    /* renamed from: f  reason: collision with root package name */
    private final long f63824f;

    static final class b extends F.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f63825a;

        /* renamed from: b  reason: collision with root package name */
        private int f63826b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f63827c;

        /* renamed from: d  reason: collision with root package name */
        private int f63828d;

        /* renamed from: e  reason: collision with root package name */
        private long f63829e;

        /* renamed from: f  reason: collision with root package name */
        private long f63830f;

        /* renamed from: g  reason: collision with root package name */
        private byte f63831g;

        b() {
        }

        public F.e.d.c a() {
            if (this.f63831g == 31) {
                return new u(this.f63825a, this.f63826b, this.f63827c, this.f63828d, this.f63829e, this.f63830f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63831g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f63831g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f63831g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f63831g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f63831g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.c.a b(Double d10) {
            this.f63825a = d10;
            return this;
        }

        public F.e.d.c.a c(int i10) {
            this.f63826b = i10;
            this.f63831g = (byte) (this.f63831g | 1);
            return this;
        }

        public F.e.d.c.a d(long j10) {
            this.f63830f = j10;
            this.f63831g = (byte) (this.f63831g | 16);
            return this;
        }

        public F.e.d.c.a e(int i10) {
            this.f63828d = i10;
            this.f63831g = (byte) (this.f63831g | 4);
            return this;
        }

        public F.e.d.c.a f(boolean z10) {
            this.f63827c = z10;
            this.f63831g = (byte) (this.f63831g | 2);
            return this;
        }

        public F.e.d.c.a g(long j10) {
            this.f63829e = j10;
            this.f63831g = (byte) (this.f63831g | 8);
            return this;
        }
    }

    public Double b() {
        return this.f63819a;
    }

    public int c() {
        return this.f63820b;
    }

    public long d() {
        return this.f63824f;
    }

    public int e() {
        return this.f63822d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d10 = this.f63819a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f63820b == cVar.c() && this.f63821c == cVar.g() && this.f63822d == cVar.e() && this.f63823e == cVar.f() && this.f63824f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f63823e;
    }

    public boolean g() {
        return this.f63821c;
    }

    public int hashCode() {
        Double d10 = this.f63819a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f63820b) * 1000003;
        int i10 = this.f63821c ? 1231 : 1237;
        long j10 = this.f63823e;
        long j11 = this.f63824f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f63822d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f63819a + ", batteryVelocity=" + this.f63820b + ", proximityOn=" + this.f63821c + ", orientation=" + this.f63822d + ", ramUsed=" + this.f63823e + ", diskUsed=" + this.f63824f + "}";
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f63819a = d10;
        this.f63820b = i10;
        this.f63821c = z10;
        this.f63822d = i11;
        this.f63823e = j10;
        this.f63824f = j11;
    }
}
