package k9;

import java.util.Arrays;
import k9.C8483q;

/* renamed from: k9.g  reason: case insensitive filesystem */
final class C8473g extends C8483q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f54451a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f54452b;

    /* renamed from: k9.g$b */
    static final class b extends C8483q.a {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f54453a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f54454b;

        b() {
        }

        public C8483q a() {
            return new C8473g(this.f54453a, this.f54454b);
        }

        public C8483q.a b(byte[] bArr) {
            this.f54453a = bArr;
            return this;
        }

        public C8483q.a c(byte[] bArr) {
            this.f54454b = bArr;
            return this;
        }
    }

    public byte[] b() {
        return this.f54451a;
    }

    public byte[] c() {
        return this.f54452b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8483q)) {
            return false;
        }
        C8483q qVar = (C8483q) obj;
        boolean z10 = qVar instanceof C8473g;
        if (Arrays.equals(this.f54451a, z10 ? ((C8473g) qVar).f54451a : qVar.b())) {
            if (Arrays.equals(this.f54452b, z10 ? ((C8473g) qVar).f54452b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f54451a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f54452b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f54451a) + ", encryptedBlob=" + Arrays.toString(this.f54452b) + "}";
    }

    private C8473g(byte[] bArr, byte[] bArr2) {
        this.f54451a = bArr;
        this.f54452b = bArr2;
    }
}
