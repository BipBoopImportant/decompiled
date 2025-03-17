package N0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"LN0/g;", "", "", "draggedAlpha", "focusedAlpha", "hoveredAlpha", "pressedAlpha", "<init>", "(FFFF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "()F", "b", "c", "d", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final float f9194a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9195b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9196c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9197d;

    public g(float f10, float f11, float f12, float f13) {
        this.f9194a = f10;
        this.f9195b = f11;
        this.f9196c = f12;
        this.f9197d = f13;
    }

    public final float a() {
        return this.f9194a;
    }

    public final float b() {
        return this.f9195b;
    }

    public final float c() {
        return this.f9196c;
    }

    public final float d() {
        return this.f9197d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9194a == gVar.f9194a && this.f9195b == gVar.f9195b && this.f9196c == gVar.f9196c && this.f9197d == gVar.f9197d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f9194a) * 31) + Float.hashCode(this.f9195b)) * 31) + Float.hashCode(this.f9196c)) * 31) + Float.hashCode(this.f9197d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f9194a + ", focusedAlpha=" + this.f9195b + ", hoveredAlpha=" + this.f9196c + ", pressedAlpha=" + this.f9197d + ')';
    }
}
