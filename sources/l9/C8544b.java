package l9;

import java.util.Arrays;
import java.util.Map;
import l9.i;

/* renamed from: l9.b  reason: case insensitive filesystem */
final class C8544b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f54840a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f54841b;

    /* renamed from: c  reason: collision with root package name */
    private final h f54842c;

    /* renamed from: d  reason: collision with root package name */
    private final long f54843d;

    /* renamed from: e  reason: collision with root package name */
    private final long f54844e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f54845f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f54846g;

    /* renamed from: h  reason: collision with root package name */
    private final String f54847h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f54848i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f54849j;

    /* renamed from: l9.b$b  reason: collision with other inner class name */
    static final class C0873b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54850a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f54851b;

        /* renamed from: c  reason: collision with root package name */
        private h f54852c;

        /* renamed from: d  reason: collision with root package name */
        private Long f54853d;

        /* renamed from: e  reason: collision with root package name */
        private Long f54854e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f54855f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f54856g;

        /* renamed from: h  reason: collision with root package name */
        private String f54857h;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f54858i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f54859j;

        C0873b() {
        }

        public i d() {
            String str = "";
            if (this.f54850a == null) {
                str = str + " transportName";
            }
            if (this.f54852c == null) {
                str = str + " encodedPayload";
            }
            if (this.f54853d == null) {
                str = str + " eventMillis";
            }
            if (this.f54854e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f54855f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C8544b(this.f54850a, this.f54851b, this.f54852c, this.f54853d.longValue(), this.f54854e.longValue(), this.f54855f, this.f54856g, this.f54857h, this.f54858i, this.f54859j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f54855f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map<String, String> map) {
            if (map != null) {
                this.f54855f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public i.a g(Integer num) {
            this.f54851b = num;
            return this;
        }

        public i.a h(h hVar) {
            if (hVar != null) {
                this.f54852c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public i.a i(long j10) {
            this.f54853d = Long.valueOf(j10);
            return this;
        }

        public i.a j(byte[] bArr) {
            this.f54858i = bArr;
            return this;
        }

        public i.a k(byte[] bArr) {
            this.f54859j = bArr;
            return this;
        }

        public i.a l(Integer num) {
            this.f54856g = num;
            return this;
        }

        public i.a m(String str) {
            this.f54857h = str;
            return this;
        }

        public i.a n(String str) {
            if (str != null) {
                this.f54850a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public i.a o(long j10) {
            this.f54854e = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f54845f;
    }

    public Integer d() {
        return this.f54841b;
    }

    public h e() {
        return this.f54842c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f54840a.equals(iVar.n()) && ((num = this.f54841b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f54842c.equals(iVar.e()) && this.f54843d == iVar.f() && this.f54844e == iVar.o() && this.f54845f.equals(iVar.c()) && ((num2 = this.f54846g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f54847h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z10 = iVar instanceof C8544b;
            if (Arrays.equals(this.f54848i, z10 ? ((C8544b) iVar).f54848i : iVar.g())) {
                if (Arrays.equals(this.f54849j, z10 ? ((C8544b) iVar).f54849j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    public long f() {
        return this.f54843d;
    }

    public byte[] g() {
        return this.f54848i;
    }

    public byte[] h() {
        return this.f54849j;
    }

    public int hashCode() {
        int hashCode = (this.f54840a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f54841b;
        int i10 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f54843d;
        long j11 = this.f54844e;
        int hashCode3 = (((((((((hashCode ^ hashCode2) * 1000003) ^ this.f54842c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f54845f.hashCode()) * 1000003;
        Integer num2 = this.f54846g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f54847h;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode4 ^ i10) * 1000003) ^ Arrays.hashCode(this.f54848i)) * 1000003) ^ Arrays.hashCode(this.f54849j);
    }

    public Integer l() {
        return this.f54846g;
    }

    public String m() {
        return this.f54847h;
    }

    public String n() {
        return this.f54840a;
    }

    public long o() {
        return this.f54844e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f54840a + ", code=" + this.f54841b + ", encodedPayload=" + this.f54842c + ", eventMillis=" + this.f54843d + ", uptimeMillis=" + this.f54844e + ", autoMetadata=" + this.f54845f + ", productId=" + this.f54846g + ", pseudonymousId=" + this.f54847h + ", experimentIdsClear=" + Arrays.toString(this.f54848i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f54849j) + "}";
    }

    private C8544b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f54840a = str;
        this.f54841b = num;
        this.f54842c = hVar;
        this.f54843d = j10;
        this.f54844e = j11;
        this.f54845f = map;
        this.f54846g = num2;
        this.f54847h = str2;
        this.f54848i = bArr;
        this.f54849j = bArr2;
    }
}
