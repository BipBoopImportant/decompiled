package q1;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lq1/z;", "", "", "x", "y", "<init>", "(FF)V", "z", "(FFF)V", "sum", "(FFFF)V", "", "c", "()[F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final float f27755a;

    /* renamed from: b  reason: collision with root package name */
    private final float f27756b;

    public z(float f10, float f11) {
        this.f27755a = f10;
        this.f27756b = f11;
    }

    public final float a() {
        return this.f27755a;
    }

    public final float b() {
        return this.f27756b;
    }

    public final float[] c() {
        float f10 = this.f27755a;
        float f11 = this.f27756b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f27755a, zVar.f27755a) == 0 && Float.compare(this.f27756b, zVar.f27756b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f27755a) * 31) + Float.hashCode(this.f27756b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f27755a + ", y=" + this.f27756b + ')';
    }

    public z(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private z(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
