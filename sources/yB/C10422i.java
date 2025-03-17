package yb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import yb.C10425l;

/* renamed from: yb.i  reason: case insensitive filesystem */
public final class C10422i extends p {

    /* renamed from: a  reason: collision with root package name */
    private final C10425l f77840a;

    /* renamed from: b  reason: collision with root package name */
    private final Eb.b f77841b;

    /* renamed from: c  reason: collision with root package name */
    private final Eb.a f77842c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f77843d;

    /* renamed from: yb.i$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private C10425l f77844a;

        /* renamed from: b  reason: collision with root package name */
        private Eb.b f77845b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f77846c;

        private Eb.a b() {
            if (this.f77844a.f() == C10425l.d.f77867e) {
                return Eb.a.a(new byte[0]);
            }
            if (this.f77844a.f() == C10425l.d.f77866d || this.f77844a.f() == C10425l.d.f77865c) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f77846c.intValue()).array());
            }
            if (this.f77844a.f() == C10425l.d.f77864b) {
                return Eb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f77846c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f77844a.f());
        }

        public C10422i a() {
            C10425l lVar = this.f77844a;
            if (lVar == null || this.f77845b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (lVar.d() != this.f77845b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.f77844a.g() && this.f77846c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.f77844a.g() || this.f77846c == null) {
                return new C10422i(this.f77844a, this.f77845b, b(), this.f77846c);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }

        public b c(Integer num) {
            this.f77846c = num;
            return this;
        }

        public b d(Eb.b bVar) {
            this.f77845b = bVar;
            return this;
        }

        public b e(C10425l lVar) {
            this.f77844a = lVar;
            return this;
        }

        private b() {
            this.f77844a = null;
            this.f77845b = null;
            this.f77846c = null;
        }
    }

    public static b c() {
        return new b();
    }

    public Eb.a a() {
        return this.f77842c;
    }

    /* renamed from: d */
    public C10425l b() {
        return this.f77840a;
    }

    private C10422i(C10425l lVar, Eb.b bVar, Eb.a aVar, Integer num) {
        this.f77840a = lVar;
        this.f77841b = bVar;
        this.f77842c = aVar;
        this.f77843d = num;
    }
}
