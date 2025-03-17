package C;

import C.G0;
import android.view.Surface;

/* renamed from: C.h  reason: case insensitive filesystem */
final class C4396h extends G0.g {

    /* renamed from: a  reason: collision with root package name */
    private final int f5348a;

    /* renamed from: b  reason: collision with root package name */
    private final Surface f5349b;

    C4396h(int i10, Surface surface) {
        this.f5348a = i10;
        if (surface != null) {
            this.f5349b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public int a() {
        return this.f5348a;
    }

    public Surface b() {
        return this.f5349b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0.g)) {
            return false;
        }
        G0.g gVar = (G0.g) obj;
        return this.f5348a == gVar.a() && this.f5349b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.f5348a ^ 1000003) * 1000003) ^ this.f5349b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f5348a + ", surface=" + this.f5349b + "}";
    }
}
