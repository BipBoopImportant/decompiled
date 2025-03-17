package Tb;

import Tb.F;

final class k extends F.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f63708a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63709b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63710c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63711d;

    /* renamed from: e  reason: collision with root package name */
    private final long f63712e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63713f;

    /* renamed from: g  reason: collision with root package name */
    private final int f63714g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63715h;

    /* renamed from: i  reason: collision with root package name */
    private final String f63716i;

    static final class b extends F.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private int f63717a;

        /* renamed from: b  reason: collision with root package name */
        private String f63718b;

        /* renamed from: c  reason: collision with root package name */
        private int f63719c;

        /* renamed from: d  reason: collision with root package name */
        private long f63720d;

        /* renamed from: e  reason: collision with root package name */
        private long f63721e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f63722f;

        /* renamed from: g  reason: collision with root package name */
        private int f63723g;

        /* renamed from: h  reason: collision with root package name */
        private String f63724h;

        /* renamed from: i  reason: collision with root package name */
        private String f63725i;

        /* renamed from: j  reason: collision with root package name */
        private byte f63726j;

        b() {
        }

        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f63726j == 63 && (str = this.f63718b) != null && (str2 = this.f63724h) != null && (str3 = this.f63725i) != null) {
                return new k(this.f63717a, str, this.f63719c, this.f63720d, this.f63721e, this.f63722f, this.f63723g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63726j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f63718b == null) {
                sb2.append(" model");
            }
            if ((this.f63726j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f63726j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f63726j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f63726j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f63726j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f63724h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f63725i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.c.a b(int i10) {
            this.f63717a = i10;
            this.f63726j = (byte) (this.f63726j | 1);
            return this;
        }

        public F.e.c.a c(int i10) {
            this.f63719c = i10;
            this.f63726j = (byte) (this.f63726j | 2);
            return this;
        }

        public F.e.c.a d(long j10) {
            this.f63721e = j10;
            this.f63726j = (byte) (this.f63726j | 8);
            return this;
        }

        public F.e.c.a e(String str) {
            if (str != null) {
                this.f63724h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        public F.e.c.a f(String str) {
            if (str != null) {
                this.f63718b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public F.e.c.a g(String str) {
            if (str != null) {
                this.f63725i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        public F.e.c.a h(long j10) {
            this.f63720d = j10;
            this.f63726j = (byte) (this.f63726j | 4);
            return this;
        }

        public F.e.c.a i(boolean z10) {
            this.f63722f = z10;
            this.f63726j = (byte) (this.f63726j | 16);
            return this;
        }

        public F.e.c.a j(int i10) {
            this.f63723g = i10;
            this.f63726j = (byte) (this.f63726j | 32);
            return this;
        }
    }

    public int b() {
        return this.f63708a;
    }

    public int c() {
        return this.f63710c;
    }

    public long d() {
        return this.f63712e;
    }

    public String e() {
        return this.f63715h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        return this.f63708a == cVar.b() && this.f63709b.equals(cVar.f()) && this.f63710c == cVar.c() && this.f63711d == cVar.h() && this.f63712e == cVar.d() && this.f63713f == cVar.j() && this.f63714g == cVar.i() && this.f63715h.equals(cVar.e()) && this.f63716i.equals(cVar.g());
    }

    public String f() {
        return this.f63709b;
    }

    public String g() {
        return this.f63716i;
    }

    public long h() {
        return this.f63711d;
    }

    public int hashCode() {
        long j10 = this.f63711d;
        long j11 = this.f63712e;
        return ((((((((((((((((this.f63708a ^ 1000003) * 1000003) ^ this.f63709b.hashCode()) * 1000003) ^ this.f63710c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f63713f ? 1231 : 1237)) * 1000003) ^ this.f63714g) * 1000003) ^ this.f63715h.hashCode()) * 1000003) ^ this.f63716i.hashCode();
    }

    public int i() {
        return this.f63714g;
    }

    public boolean j() {
        return this.f63713f;
    }

    public String toString() {
        return "Device{arch=" + this.f63708a + ", model=" + this.f63709b + ", cores=" + this.f63710c + ", ram=" + this.f63711d + ", diskSpace=" + this.f63712e + ", simulator=" + this.f63713f + ", state=" + this.f63714g + ", manufacturer=" + this.f63715h + ", modelClass=" + this.f63716i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f63708a = i10;
        this.f63709b = str;
        this.f63710c = i11;
        this.f63711d = j10;
        this.f63712e = j11;
        this.f63713f = z10;
        this.f63714g = i12;
        this.f63715h = str2;
        this.f63716i = str3;
    }
}
