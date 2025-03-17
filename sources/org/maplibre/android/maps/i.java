package org.maplibre.android.maps;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final float f145849a;

    /* renamed from: b  reason: collision with root package name */
    private final float f145850b;

    public float a() {
        return this.f145849a;
    }

    public float b() {
        return this.f145850b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f145849a == iVar.f145849a && this.f145850b == iVar.f145850b;
    }

    public int hashCode() {
        float f10 = this.f145849a;
        int i10 = 0;
        int floatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.f145850b;
        if (f11 != 0.0f) {
            i10 = Float.floatToIntBits(f11);
        }
        return floatToIntBits + i10;
    }

    public String toString() {
        return "[ first: " + this.f145849a + ", second: " + this.f145850b + " ]";
    }
}
