package O0;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LO0/V0;", "", "Lc2/h;", "left", "width", "contentWidth", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "()F", "b", "c", "getContentWidth-D9Ej5fM", "right", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class V0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f10083a;

    /* renamed from: b  reason: collision with root package name */
    private final float f10084b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10085c;

    public /* synthetic */ V0(float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12);
    }

    public final float a() {
        return this.f10083a;
    }

    public final float b() {
        return h.B(this.f10083a + this.f10084b);
    }

    public final float c() {
        return this.f10084b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return h.D(this.f10083a, v02.f10083a) && h.D(this.f10084b, v02.f10084b) && h.D(this.f10085c, v02.f10085c);
    }

    public int hashCode() {
        return (((h.E(this.f10083a) * 31) + h.E(this.f10084b)) * 31) + h.E(this.f10085c);
    }

    public String toString() {
        return "TabPosition(left=" + h.F(this.f10083a) + ", right=" + h.F(b()) + ", width=" + h.F(this.f10084b) + ", contentWidth=" + h.F(this.f10085c) + ')';
    }

    private V0(float f10, float f11, float f12) {
        this.f10083a = f10;
        this.f10084b = f11;
        this.f10085c = f12;
    }
}
