package I0;

import N0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LI0/t0;", "", "Lp1/v0;", "color", "LN0/g;", "rippleAlpha", "<init>", "(JLN0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "b", "LN0/g;", "()LN0/g;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.t0  reason: case insensitive filesystem */
public final class C4584t0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f8365a;

    /* renamed from: b  reason: collision with root package name */
    private final g f8366b;

    public /* synthetic */ C4584t0(long j10, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, gVar);
    }

    public final long a() {
        return this.f8365a;
    }

    public final g b() {
        return this.f8366b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4584t0)) {
            return false;
        }
        C4584t0 t0Var = (C4584t0) obj;
        return C5747v0.q(this.f8365a, t0Var.f8365a) && C17542s.e(this.f8366b, t0Var.f8366b);
    }

    public int hashCode() {
        int w10 = C5747v0.w(this.f8365a) * 31;
        g gVar = this.f8366b;
        return w10 + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + C5747v0.x(this.f8365a) + ", rippleAlpha=" + this.f8366b + ')';
    }

    private C4584t0(long j10, g gVar) {
        this.f8365a = j10;
        this.f8366b = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4584t0(long j10, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5747v0.f27350b.i() : j10, (i10 & 2) != 0 ? null : gVar, (DefaultConstructorMarker) null);
    }
}
