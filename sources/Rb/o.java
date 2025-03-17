package rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.q;

public final class o extends C10204b {

    /* renamed from: a  reason: collision with root package name */
    private final q f76327a;

    /* renamed from: b  reason: collision with root package name */
    private final Eb.b f76328b;

    /* renamed from: c  reason: collision with root package name */
    private final Eb.a f76329c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f76330d;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private q f76331a;

        /* renamed from: b  reason: collision with root package name */
        private Eb.b f76332b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f76333c;

        private Eb.a b() {
            if (this.f76331a.e() == q.c.f76345d) {
                return Eb.a.a(new byte[0]);
            }
            if (this.f76331a.e() == q.c.f76344c) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f76333c.intValue()).array());
            }
            if (this.f76331a.e() == q.c.f76343b) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f76333c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f76331a.e());
        }

        public o a() {
            q qVar = this.f76331a;
            if (qVar == null || this.f76332b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (qVar.c() != this.f76332b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.f76331a.f() && this.f76333c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.f76331a.f() || this.f76333c == null) {
                return new o(this.f76331a, this.f76332b, b(), this.f76333c);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }

        public b c(Integer num) {
            this.f76333c = num;
            return this;
        }

        public b d(Eb.b bVar) {
            this.f76332b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f76331a = qVar;
            return this;
        }

        private b() {
            this.f76331a = null;
            this.f76332b = null;
            this.f76333c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private o(q qVar, Eb.b bVar, Eb.a aVar, Integer num) {
        this.f76327a = qVar;
        this.f76328b = bVar;
        this.f76329c = aVar;
        this.f76330d = num;
    }
}
