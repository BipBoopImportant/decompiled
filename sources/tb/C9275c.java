package Tb;

import Tb.F;
import java.util.List;

/* renamed from: Tb.c  reason: case insensitive filesystem */
final class C9275c extends F.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f63631a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63632b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63633c;

    /* renamed from: d  reason: collision with root package name */
    private final int f63634d;

    /* renamed from: e  reason: collision with root package name */
    private final long f63635e;

    /* renamed from: f  reason: collision with root package name */
    private final long f63636f;

    /* renamed from: g  reason: collision with root package name */
    private final long f63637g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63638h;

    /* renamed from: i  reason: collision with root package name */
    private final List<F.a.C1093a> f63639i;

    /* renamed from: Tb.c$b */
    static final class b extends F.a.b {

        /* renamed from: a  reason: collision with root package name */
        private int f63640a;

        /* renamed from: b  reason: collision with root package name */
        private String f63641b;

        /* renamed from: c  reason: collision with root package name */
        private int f63642c;

        /* renamed from: d  reason: collision with root package name */
        private int f63643d;

        /* renamed from: e  reason: collision with root package name */
        private long f63644e;

        /* renamed from: f  reason: collision with root package name */
        private long f63645f;

        /* renamed from: g  reason: collision with root package name */
        private long f63646g;

        /* renamed from: h  reason: collision with root package name */
        private String f63647h;

        /* renamed from: i  reason: collision with root package name */
        private List<F.a.C1093a> f63648i;

        /* renamed from: j  reason: collision with root package name */
        private byte f63649j;

        b() {
        }

        public F.a a() {
            String str;
            if (this.f63649j == 63 && (str = this.f63641b) != null) {
                return new C9275c(this.f63640a, str, this.f63642c, this.f63643d, this.f63644e, this.f63645f, this.f63646g, this.f63647h, this.f63648i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63649j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f63641b == null) {
                sb2.append(" processName");
            }
            if ((this.f63649j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f63649j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f63649j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f63649j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f63649j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.a.b b(List<F.a.C1093a> list) {
            this.f63648i = list;
            return this;
        }

        public F.a.b c(int i10) {
            this.f63643d = i10;
            this.f63649j = (byte) (this.f63649j | 4);
            return this;
        }

        public F.a.b d(int i10) {
            this.f63640a = i10;
            this.f63649j = (byte) (this.f63649j | 1);
            return this;
        }

        public F.a.b e(String str) {
            if (str != null) {
                this.f63641b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        public F.a.b f(long j10) {
            this.f63644e = j10;
            this.f63649j = (byte) (this.f63649j | 8);
            return this;
        }

        public F.a.b g(int i10) {
            this.f63642c = i10;
            this.f63649j = (byte) (this.f63649j | 2);
            return this;
        }

        public F.a.b h(long j10) {
            this.f63645f = j10;
            this.f63649j = (byte) (this.f63649j | 16);
            return this;
        }

        public F.a.b i(long j10) {
            this.f63646g = j10;
            this.f63649j = (byte) (this.f63649j | 32);
            return this;
        }

        public F.a.b j(String str) {
            this.f63647h = str;
            return this;
        }
    }

    public List<F.a.C1093a> b() {
        return this.f63639i;
    }

    public int c() {
        return this.f63634d;
    }

    public int d() {
        return this.f63631a;
    }

    public String e() {
        return this.f63632b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f63631a == aVar.d() && this.f63632b.equals(aVar.e()) && this.f63633c == aVar.g() && this.f63634d == aVar.c() && this.f63635e == aVar.f() && this.f63636f == aVar.h() && this.f63637g == aVar.i() && ((str = this.f63638h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<F.a.C1093a> list = this.f63639i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f63635e;
    }

    public int g() {
        return this.f63633c;
    }

    public long h() {
        return this.f63636f;
    }

    public int hashCode() {
        long j10 = this.f63635e;
        long j11 = this.f63636f;
        long j12 = this.f63637g;
        int hashCode = (((((((((((((this.f63631a ^ 1000003) * 1000003) ^ this.f63632b.hashCode()) * 1000003) ^ this.f63633c) * 1000003) ^ this.f63634d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f63638h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<F.a.C1093a> list = this.f63639i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public long i() {
        return this.f63637g;
    }

    public String j() {
        return this.f63638h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f63631a + ", processName=" + this.f63632b + ", reasonCode=" + this.f63633c + ", importance=" + this.f63634d + ", pss=" + this.f63635e + ", rss=" + this.f63636f + ", timestamp=" + this.f63637g + ", traceFile=" + this.f63638h + ", buildIdMappingForArch=" + this.f63639i + "}";
    }

    private C9275c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<F.a.C1093a> list) {
        this.f63631a = i10;
        this.f63632b = str;
        this.f63633c = i11;
        this.f63634d = i12;
        this.f63635e = j10;
        this.f63636f = j11;
        this.f63637g = j12;
        this.f63638h = str2;
        this.f63639i = list;
    }
}
