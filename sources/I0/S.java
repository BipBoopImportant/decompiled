package I0;

import XH.C16814e;
import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LI0/S;", "LI0/c1;", "Lc2/h;", "offset", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "", "fromValue", "toValue", "a", "(Lc2/d;FF)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class S implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f7504a;

    public /* synthetic */ S(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    public float a(d dVar, float f10, float f11) {
        return f10 + (dVar.H1(this.f7504a) * Math.signum(f11 - f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S) && h.D(this.f7504a, ((S) obj).f7504a);
    }

    public int hashCode() {
        return h.E(this.f7504a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + h.F(this.f7504a) + ')';
    }

    private S(float f10) {
        this.f7504a = f10;
    }
}
