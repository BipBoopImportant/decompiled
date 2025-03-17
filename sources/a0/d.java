package A0;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LA0/d;", "LA0/b;", "", "Lc2/h;", "size", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lo1/m;", "shapeSize", "Lc2/d;", "density", "", "a", "(JLc2/d;)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f4302a;

    public /* synthetic */ d(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    public float a(long j10, c2.d dVar) {
        return dVar.H1(this.f4302a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.D(this.f4302a, ((d) obj).f4302a);
    }

    public int hashCode() {
        return h.E(this.f4302a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f4302a + ".dp)";
    }

    private d(float f10) {
        this.f4302a = f10;
    }
}
