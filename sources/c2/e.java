package c2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lc2/e;", "Lc2/d;", "", "density", "fontScale", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getDensity", "()F", "b", "D1", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final float f23026a;

    /* renamed from: b  reason: collision with root package name */
    private final float f23027b;

    public e(float f10, float f11) {
        this.f23026a = f10;
        this.f23027b = f11;
    }

    public float D1() {
        return this.f23027b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f23026a, eVar.f23026a) == 0 && Float.compare(this.f23027b, eVar.f23027b) == 0;
    }

    public float getDensity() {
        return this.f23026a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23026a) * 31) + Float.hashCode(this.f23027b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f23026a + ", fontScale=" + this.f23027b + ')';
    }
}
