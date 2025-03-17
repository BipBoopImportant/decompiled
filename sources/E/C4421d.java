package E;

import C.U;
import E.A;
import O.B;

/* renamed from: E.d  reason: case insensitive filesystem */
final class C4421d extends A.a {

    /* renamed from: a  reason: collision with root package name */
    private final B<byte[]> f5617a;

    /* renamed from: b  reason: collision with root package name */
    private final U.g f5618b;

    C4421d(B<byte[]> b10, U.g gVar) {
        if (b10 != null) {
            this.f5617a = b10;
            if (gVar != null) {
                this.f5618b = gVar;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }

    /* access modifiers changed from: package-private */
    public U.g a() {
        return this.f5618b;
    }

    /* access modifiers changed from: package-private */
    public B<byte[]> b() {
        return this.f5617a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A.a)) {
            return false;
        }
        A.a aVar = (A.a) obj;
        return this.f5617a.equals(aVar.b()) && this.f5618b.equals(aVar.a());
    }

    public int hashCode() {
        return ((this.f5617a.hashCode() ^ 1000003) * 1000003) ^ this.f5618b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f5617a + ", outputFileOptions=" + this.f5618b + "}";
    }
}
