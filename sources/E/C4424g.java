package E;

import C.V;
import E.Z;

/* renamed from: E.g  reason: case insensitive filesystem */
final class C4424g extends Z.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f5630a;

    /* renamed from: b  reason: collision with root package name */
    private final V f5631b;

    C4424g(int i10, V v10) {
        this.f5630a = i10;
        if (v10 != null) {
            this.f5631b = v10;
            return;
        }
        throw new NullPointerException("Null imageCaptureException");
    }

    /* access modifiers changed from: package-private */
    public V a() {
        return this.f5631b;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f5630a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.b)) {
            return false;
        }
        Z.b bVar = (Z.b) obj;
        return this.f5630a == bVar.b() && this.f5631b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f5630a ^ 1000003) * 1000003) ^ this.f5631b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f5630a + ", imageCaptureException=" + this.f5631b + "}";
    }
}
