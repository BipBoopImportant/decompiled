package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LAn/a;", "LAn/o;", "LAn/b;", "availabilityBannerState", "", "showAvailabilityInlineMessage", "<init>", "(LAn/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LAn/b;", "g", "()LAn/b;", "b", "Z", "h", "()Z", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    private final b f78979a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f78980b;

    /* renamed from: c  reason: collision with root package name */
    private final long f78981c = ((long) Objects.hash(new Object[]{P.b(a.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, boolean z10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(bVar, "availabilityBannerState");
        this.f78979a = bVar;
        this.f78980b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f78979a, aVar.f78979a) && this.f78980b == aVar.f78980b;
    }

    public long f() {
        return this.f78981c;
    }

    public final b g() {
        return this.f78979a;
    }

    public final boolean h() {
        return this.f78980b;
    }

    public int hashCode() {
        return (this.f78979a.hashCode() * 31) + Boolean.hashCode(this.f78980b);
    }

    public String toString() {
        b bVar = this.f78979a;
        boolean z10 = this.f78980b;
        return "AvailabilityBannerUiModel(availabilityBannerState=" + bVar + ", showAvailabilityInlineMessage=" + z10 + ")";
    }
}
