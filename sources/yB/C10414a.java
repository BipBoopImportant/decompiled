package yb;

import Eb.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import yb.C10417d;

/* renamed from: yb.a  reason: case insensitive filesystem */
public final class C10414a extends p {

    /* renamed from: a  reason: collision with root package name */
    private final C10417d f77812a;

    /* renamed from: b  reason: collision with root package name */
    private final Eb.b f77813b;

    /* renamed from: c  reason: collision with root package name */
    private final a f77814c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f77815d;

    /* renamed from: yb.a$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private C10417d f77816a;

        /* renamed from: b  reason: collision with root package name */
        private Eb.b f77817b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f77818c;

        private a b() {
            if (this.f77816a.e() == C10417d.c.f77830e) {
                return a.a(new byte[0]);
            }
            if (this.f77816a.e() == C10417d.c.f77829d || this.f77816a.e() == C10417d.c.f77828c) {
                return a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f77818c.intValue()).array());
            }
            if (this.f77816a.e() == C10417d.c.f77827b) {
                return a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f77818c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f77816a.e());
        }

        public C10414a a() {
            C10417d dVar = this.f77816a;
            if (dVar == null || this.f77817b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (dVar.c() != this.f77817b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.f77816a.f() && this.f77818c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.f77816a.f() || this.f77818c == null) {
                return new C10414a(this.f77816a, this.f77817b, b(), this.f77818c);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }

        public b c(Eb.b bVar) {
            this.f77817b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f77818c = num;
            return this;
        }

        public b e(C10417d dVar) {
            this.f77816a = dVar;
            return this;
        }

        private b() {
            this.f77816a = null;
            this.f77817b = null;
            this.f77818c = null;
        }
    }

    public static b c() {
        return new b();
    }

    public a a() {
        return this.f77814c;
    }

    /* renamed from: d */
    public C10417d b() {
        return this.f77812a;
    }

    private C10414a(C10417d dVar, Eb.b bVar, a aVar, Integer num) {
        this.f77812a = dVar;
        this.f77813b = bVar;
        this.f77814c = aVar;
        this.f77815d = num;
    }
}
