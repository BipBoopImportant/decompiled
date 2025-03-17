package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LMi/m;", "LMi/i;", "LMi/a;", "availableSorting", "LMi/b;", "selectedSorting", "<init>", "(LMi/a;LMi/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMi/a;", "b", "()LMi/a;", "LMi/b;", "c", "()LMi/b;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements C10774i {

    /* renamed from: a  reason: collision with root package name */
    private final C10766a f83418a;

    /* renamed from: b  reason: collision with root package name */
    private final C10767b f83419b;

    public m(C10766a aVar, C10767b bVar) {
        C17542s.j(aVar, "availableSorting");
        C17542s.j(bVar, "selectedSorting");
        this.f83418a = aVar;
        this.f83419b = bVar;
    }

    public final C10766a b() {
        return this.f83418a;
    }

    public final C10767b c() {
        return this.f83419b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f83418a, mVar.f83418a) && C17542s.e(this.f83419b, mVar.f83419b);
    }

    public int hashCode() {
        return (this.f83418a.hashCode() * 31) + this.f83419b.hashCode();
    }

    public String toString() {
        C10766a aVar = this.f83418a;
        C10767b bVar = this.f83419b;
        return "SortingItem(availableSorting=" + aVar + ", selectedSorting=" + bVar + ")";
    }
}
