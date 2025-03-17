package I0;

import XH.C16814e;
import c2.d;
import e2.C5295b;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"LI0/X;", "LI0/c1;", "", "fraction", "<init>", "(F)V", "Lc2/d;", "fromValue", "toValue", "a", "(Lc2/d;FF)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class X implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f7715a;

    public X(float f10) {
        this.f7715a = f10;
    }

    public float a(d dVar, float f10, float f11) {
        return C5295b.b(f10, f11, this.f7715a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && Float.compare(this.f7715a, ((X) obj).f7715a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f7715a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f7715a + ')';
    }
}
