package Vi;

import Kj.a;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LVi/J;", "LxB/a;", "LKj/a$c$a;", "pickupInformation", "<init>", "(LKj/a$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKj/a$c$a;", "g", "()LKj/a$c$a;", "", "b", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class J implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final a.c.C1636a f88498a;

    /* renamed from: b  reason: collision with root package name */
    private final long f88499b = ((long) Objects.hash(new Object[]{P.b(J.class)}));

    public J(a.c.C1636a aVar) {
        C17542s.j(aVar, "pickupInformation");
        this.f88498a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && C17542s.e(this.f88498a, ((J) obj).f88498a);
    }

    public long f() {
        return this.f88499b;
    }

    public final a.c.C1636a g() {
        return this.f88498a;
    }

    public int hashCode() {
        return this.f88498a.hashCode();
    }

    public String toString() {
        a.c.C1636a aVar = this.f88498a;
        return "FullServePickupDetailsDelegateModel(pickupInformation=" + aVar + ")";
    }
}
