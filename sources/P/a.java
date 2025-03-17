package P;

import Q.f;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final f f11765a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11766b;

    a(f fVar, f fVar2) {
        if (fVar != null) {
            this.f11765a = fVar;
            if (fVar2 != null) {
                this.f11766b = fVar2;
                return;
            }
            throw new NullPointerException("Null secondaryOutConfig");
        }
        throw new NullPointerException("Null primaryOutConfig");
    }

    public f a() {
        return this.f11765a;
    }

    public f b() {
        return this.f11766b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11765a.equals(dVar.a()) && this.f11766b.equals(dVar.b());
    }

    public int hashCode() {
        return ((this.f11765a.hashCode() ^ 1000003) * 1000003) ^ this.f11766b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f11765a + ", secondaryOutConfig=" + this.f11766b + "}";
    }
}
