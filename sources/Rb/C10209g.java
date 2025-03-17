package rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.C10211i;

/* renamed from: rb.g  reason: case insensitive filesystem */
public final class C10209g extends C10204b {

    /* renamed from: a  reason: collision with root package name */
    private final C10211i f76301a;

    /* renamed from: b  reason: collision with root package name */
    private final Eb.b f76302b;

    /* renamed from: c  reason: collision with root package name */
    private final Eb.a f76303c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f76304d;

    /* renamed from: rb.g$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private C10211i f76305a;

        /* renamed from: b  reason: collision with root package name */
        private Eb.b f76306b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f76307c;

        private Eb.a b() {
            if (this.f76305a.e() == C10211i.c.f76319d) {
                return Eb.a.a(new byte[0]);
            }
            if (this.f76305a.e() == C10211i.c.f76318c) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f76307c.intValue()).array());
            }
            if (this.f76305a.e() == C10211i.c.f76317b) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f76307c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f76305a.e());
        }

        public C10209g a() {
            C10211i iVar = this.f76305a;
            if (iVar == null || this.f76306b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (iVar.c() != this.f76306b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.f76305a.f() && this.f76307c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.f76305a.f() || this.f76307c == null) {
                return new C10209g(this.f76305a, this.f76306b, b(), this.f76307c);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }

        public b c(Integer num) {
            this.f76307c = num;
            return this;
        }

        public b d(Eb.b bVar) {
            this.f76306b = bVar;
            return this;
        }

        public b e(C10211i iVar) {
            this.f76305a = iVar;
            return this;
        }

        private b() {
            this.f76305a = null;
            this.f76306b = null;
            this.f76307c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private C10209g(C10211i iVar, Eb.b bVar, Eb.a aVar, Integer num) {
        this.f76301a = iVar;
        this.f76302b = bVar;
        this.f76303c = aVar;
        this.f76304d = num;
    }
}
