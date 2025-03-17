package A0;

import c2.d;
import kotlin.Metadata;
import o1.C5673m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LA0/e;", "LA0/b;", "", "", "percent", "<init>", "(F)V", "Lo1/m;", "shapeSize", "Lc2/d;", "density", "a", "(JLc2/d;)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f4303a;

    public e(float f10) {
        this.f4303a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public float a(long j10, d dVar) {
        return C5673m.k(j10) * (this.f4303a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f4303a, ((e) obj).f4303a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f4303a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f4303a + "%)";
    }
}
