package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import vn.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LAn/t;", "LAn/o;", "", "count", "Lvn/g;", "selectedToggle", "<init>", "(ILvn/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Lvn/g;", "h", "()Lvn/g;", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends o {

    /* renamed from: a  reason: collision with root package name */
    private final int f79034a;

    /* renamed from: b  reason: collision with root package name */
    private final g f79035b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79036c = ((long) Objects.hash(new Object[]{P.b(t.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(int i10, g gVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(gVar, "selectedToggle");
        this.f79034a = i10;
        this.f79035b = gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f79034a == tVar.f79034a && this.f79035b == tVar.f79035b;
    }

    public long f() {
        return this.f79036c;
    }

    public final int g() {
        return this.f79034a;
    }

    public final g h() {
        return this.f79035b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79034a) * 31) + this.f79035b.hashCode();
    }

    public String toString() {
        int i10 = this.f79034a;
        g gVar = this.f79035b;
        return "TotalCountAndGridToggleUiModel(count=" + i10 + ", selectedToggle=" + gVar + ")";
    }
}
