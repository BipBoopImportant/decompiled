package V;

import C.G0;
import V.H;

/* renamed from: V.g  reason: case insensitive filesystem */
final class C4922g extends H {

    /* renamed from: d  reason: collision with root package name */
    private final int f14426d;

    /* renamed from: e  reason: collision with root package name */
    private final H.a f14427e;

    /* renamed from: f  reason: collision with root package name */
    private final G0.h f14428f;

    C4922g(int i10, H.a aVar, G0.h hVar) {
        this.f14426d = i10;
        if (aVar != null) {
            this.f14427e = aVar;
            this.f14428f = hVar;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public int a() {
        return this.f14426d;
    }

    public G0.h b() {
        return this.f14428f;
    }

    public H.a c() {
        return this.f14427e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        if (this.f14426d == h10.a() && this.f14427e.equals(h10.c())) {
            G0.h hVar = this.f14428f;
            if (hVar == null) {
                if (h10.b() == null) {
                    return true;
                }
            } else if (hVar.equals(h10.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f14426d ^ 1000003) * 1000003) ^ this.f14427e.hashCode()) * 1000003;
        G0.h hVar = this.f14428f;
        return hashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f14426d + ", streamState=" + this.f14427e + ", inProgressTransformationInfo=" + this.f14428f + "}";
    }
}
