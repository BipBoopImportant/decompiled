package C;

import C.r;

/* renamed from: C.b  reason: case insensitive filesystem */
final class C4384b extends r {

    /* renamed from: a  reason: collision with root package name */
    private final r.b f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final r.a f5313b;

    C4384b(r.b bVar, r.a aVar) {
        if (bVar != null) {
            this.f5312a = bVar;
            this.f5313b = aVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public r.a c() {
        return this.f5313b;
    }

    public r.b d() {
        return this.f5312a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f5312a.equals(rVar.d())) {
            r.a aVar = this.f5313b;
            if (aVar == null) {
                if (rVar.c() == null) {
                    return true;
                }
            } else if (aVar.equals(rVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f5312a.hashCode() ^ 1000003) * 1000003;
        r.a aVar = this.f5313b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f5312a + ", error=" + this.f5313b + "}";
    }
}
