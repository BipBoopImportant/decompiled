package rz;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrz/F;", "", "", "Lrz/r;", "individualDiscounts", "", "totalDiscounts", "<init>", "(Ljava/util/List;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "D", "()D", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final List<r> f130724a;

    /* renamed from: b  reason: collision with root package name */
    private final double f130725b;

    public F() {
        this((List) null, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public final List<r> a() {
        return this.f130724a;
    }

    public final double b() {
        return this.f130725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C17542s.e(this.f130724a, f10.f130724a) && Double.compare(this.f130725b, f10.f130725b) == 0;
    }

    public int hashCode() {
        return (this.f130724a.hashCode() * 31) + Double.hashCode(this.f130725b);
    }

    public String toString() {
        List<r> list = this.f130724a;
        double d10 = this.f130725b;
        return "ScanAndGoDiscounts(individualDiscounts=" + list + ", totalDiscounts=" + d10 + ")";
    }

    public F(List<r> list, double d10) {
        C17542s.j(list, "individualDiscounts");
        this.f130724a = list;
        this.f130725b = d10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(List list, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? 0.0d : d10);
    }
}
