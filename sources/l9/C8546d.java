package l9;

import j9.f;
import java.util.Arrays;
import l9.p;

/* renamed from: l9.d  reason: case insensitive filesystem */
final class C8546d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f54870a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f54871b;

    /* renamed from: c  reason: collision with root package name */
    private final f f54872c;

    /* renamed from: l9.d$b */
    static final class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54873a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f54874b;

        /* renamed from: c  reason: collision with root package name */
        private f f54875c;

        b() {
        }

        public p a() {
            String str = "";
            if (this.f54873a == null) {
                str = str + " backendName";
            }
            if (this.f54875c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C8546d(this.f54873a, this.f54874b, this.f54875c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public p.a b(String str) {
            if (str != null) {
                this.f54873a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public p.a c(byte[] bArr) {
            this.f54874b = bArr;
            return this;
        }

        public p.a d(f fVar) {
            if (fVar != null) {
                this.f54875c = fVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.f54870a;
    }

    public byte[] c() {
        return this.f54871b;
    }

    public f d() {
        return this.f54872c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f54870a.equals(pVar.b())) {
            if (Arrays.equals(this.f54871b, pVar instanceof C8546d ? ((C8546d) pVar).f54871b : pVar.c()) && this.f54872c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f54870a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f54871b)) * 1000003) ^ this.f54872c.hashCode();
    }

    private C8546d(String str, byte[] bArr, f fVar) {
        this.f54870a = str;
        this.f54871b = bArr;
        this.f54872c = fVar;
    }
}
