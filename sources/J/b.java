package J;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final float f8743a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8744b;

    /* renamed from: c  reason: collision with root package name */
    private final float f8745c;

    /* renamed from: d  reason: collision with root package name */
    private final float f8746d;

    b(float f10, float f11, float f12, float f13) {
        this.f8743a = f10;
        this.f8744b = f11;
        this.f8745c = f12;
        this.f8746d = f13;
    }

    public float a() {
        return this.f8744b;
    }

    public float b() {
        return this.f8746d;
    }

    public float c() {
        return this.f8745c;
    }

    public float d() {
        return this.f8743a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.floatToIntBits(this.f8743a) == Float.floatToIntBits(gVar.d()) && Float.floatToIntBits(this.f8744b) == Float.floatToIntBits(gVar.a()) && Float.floatToIntBits(this.f8745c) == Float.floatToIntBits(gVar.c()) && Float.floatToIntBits(this.f8746d) == Float.floatToIntBits(gVar.b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f8743a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f8744b)) * 1000003) ^ Float.floatToIntBits(this.f8745c)) * 1000003) ^ Float.floatToIntBits(this.f8746d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f8743a + ", maxZoomRatio=" + this.f8744b + ", minZoomRatio=" + this.f8745c + ", linearZoom=" + this.f8746d + "}";
    }
}
