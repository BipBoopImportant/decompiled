package ic;

import ic.C9836d;
import java.lang.annotation.Annotation;

/* renamed from: ic.a  reason: case insensitive filesystem */
public final class C9833a {

    /* renamed from: a  reason: collision with root package name */
    private int f74236a;

    /* renamed from: b  reason: collision with root package name */
    private C9836d.a f74237b = C9836d.a.DEFAULT;

    /* renamed from: ic.a$a  reason: collision with other inner class name */
    private static final class C1324a implements C9836d {

        /* renamed from: a  reason: collision with root package name */
        private final int f74238a;

        /* renamed from: b  reason: collision with root package name */
        private final C9836d.a f74239b;

        C1324a(int i10, C9836d.a aVar) {
            this.f74238a = i10;
            this.f74239b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return C9836d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9836d)) {
                return false;
            }
            C9836d dVar = (C9836d) obj;
            return this.f74238a == dVar.tag() && this.f74239b.equals(dVar.intEncoding());
        }

        public int hashCode() {
            return (14552422 ^ this.f74238a) + (this.f74239b.hashCode() ^ 2041407134);
        }

        public C9836d.a intEncoding() {
            return this.f74239b;
        }

        public int tag() {
            return this.f74238a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f74238a + "intEncoding=" + this.f74239b + ')';
        }
    }

    public static C9833a b() {
        return new C9833a();
    }

    public C9836d a() {
        return new C1324a(this.f74236a, this.f74237b);
    }

    public C9833a c(int i10) {
        this.f74236a = i10;
        return this;
    }
}
