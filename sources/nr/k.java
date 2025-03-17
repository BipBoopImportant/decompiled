package nr;

import Iq.a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nr.j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0016\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lnr/k;", "", "", "balance", "LKJ/c;", "LIq/a$c;", "claimedRewards", "LIq/a$b;", "availableRewards", "LIq/a$d;", "unavailableRewards", "<init>", "(ILKJ/c;LKJ/c;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LKJ/c;", "c", "()LKJ/c;", "d", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements j.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f100062a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<a.c> f100063b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<a.b> f100064c;

    /* renamed from: d  reason: collision with root package name */
    private final C15987c<a.d> f100065d;

    public k(int i10, C15987c<? extends a.c> cVar, C15987c<a.b> cVar2, C15987c<a.d> cVar3) {
        C17542s.j(cVar, "claimedRewards");
        C17542s.j(cVar2, "availableRewards");
        C17542s.j(cVar3, "unavailableRewards");
        this.f100062a = i10;
        this.f100063b = cVar;
        this.f100064c = cVar2;
        this.f100065d = cVar3;
    }

    public final C15987c<a.b> a() {
        return this.f100064c;
    }

    public final int b() {
        return this.f100062a;
    }

    public final C15987c<a.c> c() {
        return this.f100063b;
    }

    public final C15987c<a.d> d() {
        return this.f100065d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f100062a == kVar.f100062a && C17542s.e(this.f100063b, kVar.f100063b) && C17542s.e(this.f100064c, kVar.f100064c) && C17542s.e(this.f100065d, kVar.f100065d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f100062a) * 31) + this.f100063b.hashCode()) * 31) + this.f100064c.hashCode()) * 31) + this.f100065d.hashCode();
    }

    public String toString() {
        int i10 = this.f100062a;
        C15987c<a.c> cVar = this.f100063b;
        C15987c<a.b> cVar2 = this.f100064c;
        C15987c<a.d> cVar3 = this.f100065d;
        return "Content(balance=" + i10 + ", claimedRewards=" + cVar + ", availableRewards=" + cVar2 + ", unavailableRewards=" + cVar3 + ")";
    }
}
