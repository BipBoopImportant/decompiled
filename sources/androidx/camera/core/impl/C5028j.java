package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.j  reason: case insensitive filesystem */
final class C5028j extends L0 {

    /* renamed from: a  reason: collision with root package name */
    private final K0 f16922a;

    /* renamed from: b  reason: collision with root package name */
    private final K0 f16923b;

    /* renamed from: c  reason: collision with root package name */
    private final K0 f16924c;

    /* renamed from: d  reason: collision with root package name */
    private final K0 f16925d;

    C5028j(K0 k02, K0 k03, K0 k04, K0 k05) {
        if (k02 != null) {
            this.f16922a = k02;
            if (k03 != null) {
                this.f16923b = k03;
                this.f16924c = k04;
                this.f16925d = k05;
                return;
            }
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        throw new NullPointerException("Null previewOutputSurface");
    }

    public K0 b() {
        return this.f16924c;
    }

    public K0 c() {
        return this.f16923b;
    }

    public K0 d() {
        return this.f16925d;
    }

    public K0 e() {
        return this.f16922a;
    }

    public boolean equals(Object obj) {
        K0 k02;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (this.f16922a.equals(l02.e()) && this.f16923b.equals(l02.c()) && ((k02 = this.f16924c) != null ? k02.equals(l02.b()) : l02.b() == null)) {
            K0 k03 = this.f16925d;
            if (k03 == null) {
                if (l02.d() == null) {
                    return true;
                }
            } else if (k03.equals(l02.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f16922a.hashCode() ^ 1000003) * 1000003) ^ this.f16923b.hashCode()) * 1000003;
        K0 k02 = this.f16924c;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (k02 == null ? 0 : k02.hashCode())) * 1000003;
        K0 k03 = this.f16925d;
        if (k03 != null) {
            i10 = k03.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f16922a + ", imageCaptureOutputSurface=" + this.f16923b + ", imageAnalysisOutputSurface=" + this.f16924c + ", postviewOutputSurface=" + this.f16925d + "}";
    }
}
