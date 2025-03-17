package Lh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LLh/b;", "T", "", "", "LLh/a;", "pointsOfInterest", "selected", "<init>", "(Ljava/util/List;LLh/a;)V", "a", "(Ljava/util/List;LLh/a;)LLh/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "LLh/a;", "d", "()LLh/a;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<T>> f61690a;

    /* renamed from: b  reason: collision with root package name */
    private final a<T> f61691b;

    public b(List<a<T>> list, a<T> aVar) {
        C17542s.j(list, "pointsOfInterest");
        C17542s.j(aVar, "selected");
        this.f61690a = list;
        this.f61691b = aVar;
    }

    public static /* synthetic */ b b(b bVar, List<a<T>> list, a<T> aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = bVar.f61690a;
        }
        if ((i10 & 2) != 0) {
            aVar = bVar.f61691b;
        }
        return bVar.a(list, aVar);
    }

    public final b<T> a(List<a<T>> list, a<T> aVar) {
        C17542s.j(list, "pointsOfInterest");
        C17542s.j(aVar, "selected");
        return new b<>(list, aVar);
    }

    public final List<a<T>> c() {
        return this.f61690a;
    }

    public final a<T> d() {
        return this.f61691b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f61690a, bVar.f61690a) && C17542s.e(this.f61691b, bVar.f61691b);
    }

    public int hashCode() {
        return (this.f61690a.hashCode() * 31) + this.f61691b.hashCode();
    }

    public String toString() {
        List<a<T>> list = this.f61690a;
        a<T> aVar = this.f61691b;
        return "PointsOfInterest(pointsOfInterest=" + list + ", selected=" + aVar + ")";
    }
}
