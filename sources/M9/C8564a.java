package m9;

import java.util.Arrays;
import l9.i;
import m9.f;

/* renamed from: m9.a  reason: case insensitive filesystem */
final class C8564a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i> f55028a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f55029b;

    /* renamed from: m9.a$b */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i> f55030a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f55031b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f55030a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C8564a(this.f55030a, this.f55031b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<i> iterable) {
            if (iterable != null) {
                this.f55030a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.f55031b = bArr;
            return this;
        }
    }

    public Iterable<i> b() {
        return this.f55028a;
    }

    public byte[] c() {
        return this.f55029b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f55028a.equals(fVar.b())) {
            if (Arrays.equals(this.f55029b, fVar instanceof C8564a ? ((C8564a) fVar).f55029b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f55028a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f55029b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f55028a + ", extras=" + Arrays.toString(this.f55029b) + "}";
    }

    private C8564a(Iterable<i> iterable, byte[] bArr) {
        this.f55028a = iterable;
        this.f55029b = bArr;
    }
}
