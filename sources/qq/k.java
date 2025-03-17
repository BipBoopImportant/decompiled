package Qq;

import Qq.g;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u001d\u0010\u001c¨\u0006#"}, d2 = {"LQq/k;", "", "", "balance", "", "LQq/g$c;", "unavailableRewards", "LQq/g$a;", "availableRewards", "LQq/g$b;", "claimedRewards", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "d", "f", "LQq/g;", "LXH/o;", "allRewards", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final int f86184a;

    /* renamed from: b  reason: collision with root package name */
    private final List<g.c> f86185b;

    /* renamed from: c  reason: collision with root package name */
    private final List<g.a> f86186c;

    /* renamed from: d  reason: collision with root package name */
    private final List<g.b> f86187d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f86188e = C16825p.b(new j(this));

    public k(int i10, List<g.c> list, List<g.a> list2, List<? extends g.b> list3) {
        C17542s.j(list, "unavailableRewards");
        C17542s.j(list2, "availableRewards");
        C17542s.j(list3, "claimedRewards");
        this.f86184a = i10;
        this.f86185b = list;
        this.f86186c = list2;
        this.f86187d = list3;
    }

    /* access modifiers changed from: private */
    public static final List b(k kVar) {
        return C16877v.A(C16877v.q(kVar.f86185b, kVar.f86186c, kVar.f86187d));
    }

    public final List<g> c() {
        return (List) this.f86188e.getValue();
    }

    public final List<g.a> d() {
        return this.f86186c;
    }

    public final int e() {
        return this.f86184a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f86184a == kVar.f86184a && C17542s.e(this.f86185b, kVar.f86185b) && C17542s.e(this.f86186c, kVar.f86186c) && C17542s.e(this.f86187d, kVar.f86187d);
    }

    public final List<g.b> f() {
        return this.f86187d;
    }

    public final List<g.c> g() {
        return this.f86185b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f86184a) * 31) + this.f86185b.hashCode()) * 31) + this.f86186c.hashCode()) * 31) + this.f86187d.hashCode();
    }

    public String toString() {
        int i10 = this.f86184a;
        List<g.c> list = this.f86185b;
        List<g.a> list2 = this.f86186c;
        List<g.b> list3 = this.f86187d;
        return "FamilyRewardsData(balance=" + i10 + ", unavailableRewards=" + list + ", availableRewards=" + list2 + ", claimedRewards=" + list3 + ")";
    }
}
