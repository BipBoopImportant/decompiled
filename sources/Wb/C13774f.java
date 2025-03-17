package WB;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LWB/f;", "", "", "lat", "lng", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WB.f  reason: case insensitive filesystem */
public final class C13774f {

    /* renamed from: a  reason: collision with root package name */
    private final double f117526a;

    /* renamed from: b  reason: collision with root package name */
    private final double f117527b;

    public C13774f(double d10, double d11) {
        this.f117526a = d10;
        this.f117527b = d11;
    }

    public final double a() {
        return this.f117526a;
    }

    public final double b() {
        return this.f117527b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13774f)) {
            return false;
        }
        C13774f fVar = (C13774f) obj;
        return Double.compare(this.f117526a, fVar.f117526a) == 0 && Double.compare(this.f117527b, fVar.f117527b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f117526a) * 31) + Double.hashCode(this.f117527b);
    }

    public String toString() {
        double d10 = this.f117526a;
        double d11 = this.f117527b;
        return "LatLng(lat=" + d10 + ", lng=" + d11 + ")";
    }
}
