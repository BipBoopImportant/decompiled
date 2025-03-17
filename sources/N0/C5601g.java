package n0;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5728l0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ln0/g;", "", "Lc2/h;", "width", "Lp1/l0;", "brush", "<init>", "(FLp1/l0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "Lp1/l0;", "()Lp1/l0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.g  reason: case insensitive filesystem */
public final class C5601g {

    /* renamed from: a  reason: collision with root package name */
    private final float f26457a;

    /* renamed from: b  reason: collision with root package name */
    private final C5728l0 f26458b;

    public /* synthetic */ C5601g(float f10, C5728l0 l0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, l0Var);
    }

    public final C5728l0 a() {
        return this.f26458b;
    }

    public final float b() {
        return this.f26457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5601g)) {
            return false;
        }
        C5601g gVar = (C5601g) obj;
        return h.D(this.f26457a, gVar.f26457a) && C17542s.e(this.f26458b, gVar.f26458b);
    }

    public int hashCode() {
        return (h.E(this.f26457a) * 31) + this.f26458b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + h.F(this.f26457a) + ", brush=" + this.f26458b + ')';
    }

    private C5601g(float f10, C5728l0 l0Var) {
        this.f26457a = f10;
        this.f26458b = l0Var;
    }
}
