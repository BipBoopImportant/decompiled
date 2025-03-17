package fx;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfx/f0;", "", "", "startIndex", "", "Lfx/n;", "chartDataList", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f127061a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C14471n> f127062b;

    public f0(int i10, List<C14471n> list) {
        C17542s.j(list, "chartDataList");
        this.f127061a = i10;
        this.f127062b = list;
    }

    public final List<C14471n> a() {
        return this.f127062b;
    }

    public final int b() {
        return this.f127061a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f127061a == f0Var.f127061a && C17542s.e(this.f127062b, f0Var.f127062b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f127061a) * 31) + this.f127062b.hashCode();
    }

    public String toString() {
        int i10 = this.f127061a;
        List<C14471n> list = this.f127062b;
        return "PopularTimesUiModel(startIndex=" + i10 + ", chartDataList=" + list + ")";
    }
}
