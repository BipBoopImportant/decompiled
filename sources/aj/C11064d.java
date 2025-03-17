package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ne.C10090b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001d\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\t¨\u0006\u001e"}, d2 = {"Laj/d;", "Lne/b;", "", "transactionId", "", "revenue", "<init>", "(Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "f", "D", "d", "()Ljava/lang/Double;", "g", "b", "debugToken", "h", "c", "releaseToken", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aj.d  reason: case insensitive filesystem */
public final class C11064d extends C10090b {

    /* renamed from: e  reason: collision with root package name */
    private final String f90279e;

    /* renamed from: f  reason: collision with root package name */
    private final double f90280f;

    /* renamed from: g  reason: collision with root package name */
    private final String f90281g = "6bgkf4";

    /* renamed from: h  reason: collision with root package name */
    private final String f90282h = "3c4x21";

    public C11064d(String str, double d10) {
        C17542s.j(str, "transactionId");
        this.f90279e = str;
        this.f90280f = d10;
    }

    public String b() {
        return this.f90281g;
    }

    public String c() {
        return this.f90282h;
    }

    public Double d() {
        return Double.valueOf(this.f90280f);
    }

    public String e() {
        return this.f90279e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11064d)) {
            return false;
        }
        C11064d dVar = (C11064d) obj;
        return C17542s.e(this.f90279e, dVar.f90279e) && Double.compare(this.f90280f, dVar.f90280f) == 0;
    }

    public int hashCode() {
        return (this.f90279e.hashCode() * 31) + Double.hashCode(this.f90280f);
    }

    public String toString() {
        String str = this.f90279e;
        double d10 = this.f90280f;
        return "ScanAndGoPurchaseAdjustTrackerEvent(transactionId=" + str + ", revenue=" + d10 + ")";
    }
}
