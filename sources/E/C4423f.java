package E;

import E.O;
import androidx.camera.core.n;

/* renamed from: E.f  reason: case insensitive filesystem */
final class C4423f extends O.b {

    /* renamed from: a  reason: collision with root package name */
    private final P f5627a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5628b;

    C4423f(P p10, n nVar) {
        if (p10 != null) {
            this.f5627a = p10;
            if (nVar != null) {
                this.f5628b = nVar;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    /* access modifiers changed from: package-private */
    public n a() {
        return this.f5628b;
    }

    /* access modifiers changed from: package-private */
    public P b() {
        return this.f5627a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.b)) {
            return false;
        }
        O.b bVar = (O.b) obj;
        return this.f5627a.equals(bVar.b()) && this.f5628b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f5627a.hashCode() ^ 1000003) * 1000003) ^ this.f5628b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f5627a + ", imageProxy=" + this.f5628b + "}";
    }
}
