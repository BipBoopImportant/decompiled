package hv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lhv/d;", "", "", "averageViewingTime", "totalLikes", "totalViewers", "totalViews", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getAverageViewingTime", "b", "getTotalLikes", "c", "getTotalViewers", "d", "getTotalViews", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f98284a;

    /* renamed from: b  reason: collision with root package name */
    private final int f98285b;

    /* renamed from: c  reason: collision with root package name */
    private final int f98286c;

    /* renamed from: d  reason: collision with root package name */
    private final int f98287d;

    public d(int i10, int i11, int i12, int i13) {
        this.f98284a = i10;
        this.f98285b = i11;
        this.f98286c = i12;
        this.f98287d = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f98284a == dVar.f98284a && this.f98285b == dVar.f98285b && this.f98286c == dVar.f98286c && this.f98287d == dVar.f98287d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f98284a) * 31) + Integer.hashCode(this.f98285b)) * 31) + Integer.hashCode(this.f98286c)) * 31) + Integer.hashCode(this.f98287d);
    }

    public String toString() {
        int i10 = this.f98284a;
        int i11 = this.f98285b;
        int i12 = this.f98286c;
        int i13 = this.f98287d;
        return "Statistic(averageViewingTime=" + i10 + ", totalLikes=" + i11 + ", totalViewers=" + i12 + ", totalViews=" + i13 + ")";
    }
}
