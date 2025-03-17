package v;

import v.O1;

/* renamed from: v.e  reason: case insensitive filesystem */
final class C6061e extends O1.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f30534a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30535b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30536c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30537d;

    C6061e(int i10, int i11, boolean z10, boolean z11) {
        this.f30534a = i10;
        this.f30535b = i11;
        this.f30536c = z10;
        this.f30537d = z11;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f30534a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f30535b;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f30536c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f30537d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O1.b)) {
            return false;
        }
        O1.b bVar = (O1.b) obj;
        return this.f30534a == bVar.a() && this.f30535b == bVar.b() && this.f30536c == bVar.c() && this.f30537d == bVar.d();
    }

    public int hashCode() {
        int i10 = 1237;
        int i11 = (((((this.f30534a ^ 1000003) * 1000003) ^ this.f30535b) * 1000003) ^ (this.f30536c ? 1231 : 1237)) * 1000003;
        if (this.f30537d) {
            i10 = 1231;
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f30534a + ", requiredMaxBitDepth=" + this.f30535b + ", previewStabilizationOn=" + this.f30536c + ", ultraHdrOn=" + this.f30537d + "}";
    }
}
