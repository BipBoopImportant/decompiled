package gi;

import KJ.C15987c;
import Op.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xB.C15201a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010$¨\u0006-"}, d2 = {"Lgi/P;", "LxB/a;", "Lgi/O;", "type", "", "titleResId", "LKJ/c;", "LOp/d1;", "productRecommendations", "", "isLoading", "<init>", "(Lgi/O;ILKJ/c;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/O;", "getType", "()Lgi/O;", "b", "I", "h", "c", "LKJ/c;", "g", "()LKJ/c;", "d", "Z", "i", "()Z", "", "e", "J", "f", "()J", "stableId", "j", "isRecommendations", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class P implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final O f73330a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73331b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<d1> f73332c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f73333d;

    /* renamed from: e  reason: collision with root package name */
    private final long f73334e;

    public P(O o10, int i10, C15987c<d1> cVar, boolean z10) {
        C17542s.j(o10, "type");
        C17542s.j(cVar, "productRecommendations");
        this.f73330a = o10;
        this.f73331b = i10;
        this.f73332c = cVar;
        this.f73333d = z10;
        this.f73334e = (long) o10.ordinal();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f73330a == p10.f73330a && this.f73331b == p10.f73331b && C17542s.e(this.f73332c, p10.f73332c) && this.f73333d == p10.f73333d;
    }

    public long f() {
        return this.f73334e;
    }

    public final C15987c<d1> g() {
        return this.f73332c;
    }

    public final int h() {
        return this.f73331b;
    }

    public int hashCode() {
        return (((((this.f73330a.hashCode() * 31) + Integer.hashCode(this.f73331b)) * 31) + this.f73332c.hashCode()) * 31) + Boolean.hashCode(this.f73333d);
    }

    public final boolean i() {
        return this.f73333d;
    }

    public final boolean j() {
        return this.f73330a == O.RECOMMENDATION;
    }

    public String toString() {
        O o10 = this.f73330a;
        int i10 = this.f73331b;
        C15987c<d1> cVar = this.f73332c;
        boolean z10 = this.f73333d;
        return "RecommendationsDelegateModel(type=" + o10 + ", titleResId=" + i10 + ", productRecommendations=" + cVar + ", isLoading=" + z10 + ")";
    }
}
