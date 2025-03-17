package Tb;

import Tb.F;
import java.util.Arrays;

/* renamed from: Tb.g  reason: case insensitive filesystem */
final class C9279g extends F.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f63664a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f63665b;

    /* renamed from: Tb.g$b */
    static final class b extends F.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f63666a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f63667b;

        b() {
        }

        public F.d.b a() {
            byte[] bArr;
            String str = this.f63666a;
            if (str != null && (bArr = this.f63667b) != null) {
                return new C9279g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63666a == null) {
                sb2.append(" filename");
            }
            if (this.f63667b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f63667b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        public F.d.b.a c(String str) {
            if (str != null) {
                this.f63666a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public byte[] b() {
        return this.f63665b;
    }

    public String c() {
        return this.f63664a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f63664a.equals(bVar.c())) {
            if (Arrays.equals(this.f63665b, bVar instanceof C9279g ? ((C9279g) bVar).f63665b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f63664a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f63665b);
    }

    public String toString() {
        return "File{filename=" + this.f63664a + ", contents=" + Arrays.toString(this.f63665b) + "}";
    }

    private C9279g(String str, byte[] bArr) {
        this.f63664a = str;
        this.f63665b = bArr;
    }
}
