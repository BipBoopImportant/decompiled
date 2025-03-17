package Qq;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"LQq/i;", "", "LQq/q;", "promotedInteraction", "", "LQq/r;", "rewardingInteractions", "<init>", "(LQq/q;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQq/q;", "()LQq/q;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86179c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final i f86180d = new i((q) null, C16877v.n());

    /* renamed from: a  reason: collision with root package name */
    private final q f86181a;

    /* renamed from: b  reason: collision with root package name */
    private final List<r> f86182b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQq/i$a;", "", "<init>", "()V", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(q qVar, List<r> list) {
        C17542s.j(list, "rewardingInteractions");
        this.f86181a = qVar;
        this.f86182b = list;
    }

    public final q a() {
        return this.f86181a;
    }

    public final List<r> b() {
        return this.f86182b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f86181a, iVar.f86181a) && C17542s.e(this.f86182b, iVar.f86182b);
    }

    public int hashCode() {
        q qVar = this.f86181a;
        return ((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f86182b.hashCode();
    }

    public String toString() {
        q qVar = this.f86181a;
        List<r> list = this.f86182b;
        return "FamilyRewardInteractions(promotedInteraction=" + qVar + ", rewardingInteractions=" + list + ")";
    }
}
