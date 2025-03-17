package a0;

/* renamed from: a0.d  reason: case insensitive filesystem */
final class C4960d extends j0 {

    /* renamed from: e  reason: collision with root package name */
    private final int f15097e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15098f;

    /* renamed from: g  reason: collision with root package name */
    private final int f15099g;

    C4960d(int i10, int i11, int i12) {
        this.f15097e = i10;
        this.f15098f = i11;
        this.f15099g = i12;
    }

    public int b() {
        return this.f15099g;
    }

    public int c() {
        return this.f15097e;
    }

    public int d() {
        return this.f15098f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f15097e == j0Var.c() && this.f15098f == j0Var.d() && this.f15099g == j0Var.b();
    }

    public int hashCode() {
        return ((((this.f15097e ^ 1000003) * 1000003) ^ this.f15098f) * 1000003) ^ this.f15099g;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f15097e + ", transfer=" + this.f15098f + ", range=" + this.f15099g + "}";
    }
}
