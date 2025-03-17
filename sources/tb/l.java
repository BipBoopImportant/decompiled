package Tb;

import Tb.F;

final class l extends F.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f63727a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63728b;

    /* renamed from: c  reason: collision with root package name */
    private final F.e.d.a f63729c;

    /* renamed from: d  reason: collision with root package name */
    private final F.e.d.c f63730d;

    /* renamed from: e  reason: collision with root package name */
    private final F.e.d.C1108d f63731e;

    /* renamed from: f  reason: collision with root package name */
    private final F.e.d.f f63732f;

    static final class b extends F.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private long f63733a;

        /* renamed from: b  reason: collision with root package name */
        private String f63734b;

        /* renamed from: c  reason: collision with root package name */
        private F.e.d.a f63735c;

        /* renamed from: d  reason: collision with root package name */
        private F.e.d.c f63736d;

        /* renamed from: e  reason: collision with root package name */
        private F.e.d.C1108d f63737e;

        /* renamed from: f  reason: collision with root package name */
        private F.e.d.f f63738f;

        /* renamed from: g  reason: collision with root package name */
        private byte f63739g;

        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f63739g == 1 && (str = this.f63734b) != null && (aVar = this.f63735c) != null && (cVar = this.f63736d) != null) {
                return new l(this.f63733a, str, aVar, cVar, this.f63737e, this.f63738f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f63739g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f63734b == null) {
                sb2.append(" type");
            }
            if (this.f63735c == null) {
                sb2.append(" app");
            }
            if (this.f63736d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar != null) {
                this.f63735c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar != null) {
                this.f63736d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public F.e.d.b d(F.e.d.C1108d dVar) {
            this.f63737e = dVar;
            return this;
        }

        public F.e.d.b e(F.e.d.f fVar) {
            this.f63738f = fVar;
            return this;
        }

        public F.e.d.b f(long j10) {
            this.f63733a = j10;
            this.f63739g = (byte) (this.f63739g | 1);
            return this;
        }

        public F.e.d.b g(String str) {
            if (str != null) {
                this.f63734b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        b() {
        }

        private b(F.e.d dVar) {
            this.f63733a = dVar.f();
            this.f63734b = dVar.g();
            this.f63735c = dVar.b();
            this.f63736d = dVar.c();
            this.f63737e = dVar.d();
            this.f63738f = dVar.e();
            this.f63739g = 1;
        }
    }

    public F.e.d.a b() {
        return this.f63729c;
    }

    public F.e.d.c c() {
        return this.f63730d;
    }

    public F.e.d.C1108d d() {
        return this.f63731e;
    }

    public F.e.d.f e() {
        return this.f63732f;
    }

    public boolean equals(Object obj) {
        F.e.d.C1108d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar2 = (F.e.d) obj;
        if (this.f63727a == dVar2.f() && this.f63728b.equals(dVar2.g()) && this.f63729c.equals(dVar2.b()) && this.f63730d.equals(dVar2.c()) && ((dVar = this.f63731e) != null ? dVar.equals(dVar2.d()) : dVar2.d() == null)) {
            F.e.d.f fVar = this.f63732f;
            if (fVar == null) {
                if (dVar2.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar2.e())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f63727a;
    }

    public String g() {
        return this.f63728b;
    }

    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f63727a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f63728b.hashCode()) * 1000003) ^ this.f63729c.hashCode()) * 1000003) ^ this.f63730d.hashCode()) * 1000003;
        F.e.d.C1108d dVar = this.f63731e;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.e.d.f fVar = this.f63732f;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "Event{timestamp=" + this.f63727a + ", type=" + this.f63728b + ", app=" + this.f63729c + ", device=" + this.f63730d + ", log=" + this.f63731e + ", rollouts=" + this.f63732f + "}";
    }

    private l(long j10, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.C1108d dVar, F.e.d.f fVar) {
        this.f63727a = j10;
        this.f63728b = str;
        this.f63729c = aVar;
        this.f63730d = cVar;
        this.f63731e = dVar;
        this.f63732f = fVar;
    }
}
