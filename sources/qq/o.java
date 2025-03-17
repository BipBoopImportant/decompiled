package Qq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LQq/o;", "", "LQq/p;", "history", "LQq/a;", "balance", "<init>", "(LQq/p;LQq/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQq/p;", "b", "()LQq/p;", "LQq/a;", "()LQq/a;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final p f86196a;

    /* renamed from: b  reason: collision with root package name */
    private final a f86197b;

    public o(p pVar, a aVar) {
        C17542s.j(pVar, "history");
        C17542s.j(aVar, "balance");
        this.f86196a = pVar;
        this.f86197b = aVar;
    }

    public final a a() {
        return this.f86197b;
    }

    public final p b() {
        return this.f86196a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f86196a, oVar.f86196a) && C17542s.e(this.f86197b, oVar.f86197b);
    }

    public int hashCode() {
        return (this.f86196a.hashCode() * 31) + this.f86197b.hashCode();
    }

    public String toString() {
        p pVar = this.f86196a;
        a aVar = this.f86197b;
        return "FamilyRewardsHistory(history=" + pVar + ", balance=" + aVar + ")";
    }
}
