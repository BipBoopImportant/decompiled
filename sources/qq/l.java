package Qq;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LQq/l;", "", "", "LQq/n;", "questions", "LQq/m;", "headerImage", "<init>", "(Ljava/util/List;LQq/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LQq/m;", "getHeaderImage", "()LQq/m;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final List<n> f86189a;

    /* renamed from: b  reason: collision with root package name */
    private final m f86190b;

    public l(List<n> list, m mVar) {
        C17542s.j(list, "questions");
        C17542s.j(mVar, "headerImage");
        this.f86189a = list;
        this.f86190b = mVar;
    }

    public final List<n> a() {
        return this.f86189a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f86189a, lVar.f86189a) && C17542s.e(this.f86190b, lVar.f86190b);
    }

    public int hashCode() {
        return (this.f86189a.hashCode() * 31) + this.f86190b.hashCode();
    }

    public String toString() {
        List<n> list = this.f86189a;
        m mVar = this.f86190b;
        return "FamilyRewardsFAQ(questions=" + list + ", headerImage=" + mVar + ")";
    }
}
