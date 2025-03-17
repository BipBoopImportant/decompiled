package rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.v;

public final class t extends C10204b {

    /* renamed from: a  reason: collision with root package name */
    private final v f76353a;

    /* renamed from: b  reason: collision with root package name */
    private final Eb.b f76354b;

    /* renamed from: c  reason: collision with root package name */
    private final Eb.a f76355c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f76356d;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private v f76357a;

        /* renamed from: b  reason: collision with root package name */
        private Eb.b f76358b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f76359c;

        private Eb.a b() {
            if (this.f76357a.c() == v.c.f76367d) {
                return Eb.a.a(new byte[0]);
            }
            if (this.f76357a.c() == v.c.f76366c) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f76359c.intValue()).array());
            }
            if (this.f76357a.c() == v.c.f76365b) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f76359c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f76357a.c());
        }

        public t a() {
            v vVar = this.f76357a;
            if (vVar == null || this.f76358b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (vVar.b() != this.f76358b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.f76357a.d() && this.f76359c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.f76357a.d() || this.f76359c == null) {
                return new t(this.f76357a, this.f76358b, b(), this.f76359c);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }

        public b c(Integer num) {
            this.f76359c = num;
            return this;
        }

        public b d(Eb.b bVar) {
            this.f76358b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f76357a = vVar;
            return this;
        }

        private b() {
            this.f76357a = null;
            this.f76358b = null;
            this.f76359c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private t(v vVar, Eb.b bVar, Eb.a aVar, Integer num) {
        this.f76353a = vVar;
        this.f76354b = bVar;
        this.f76355c = aVar;
        this.f76356d = num;
    }
}
