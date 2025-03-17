package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import kp.m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LAn/u;", "LAn/o;", "Lkp/m;", "visualMessage", "<init>", "(Lkp/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/m;", "g", "()Lkp/m;", "", "b", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends o {

    /* renamed from: a  reason: collision with root package name */
    private final m f79037a;

    /* renamed from: b  reason: collision with root package name */
    private final long f79038b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(m mVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(mVar, "visualMessage");
        this.f79037a = mVar;
        U u10 = new U(3);
        u10.a(P.b(u.class));
        u10.a(mVar.f() + mVar.a());
        u10.b(new Object[0]);
        this.f79038b = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && C17542s.e(this.f79037a, ((u) obj).f79037a);
    }

    public long f() {
        return this.f79038b;
    }

    public final m g() {
        return this.f79037a;
    }

    public int hashCode() {
        return this.f79037a.hashCode();
    }

    public String toString() {
        m mVar = this.f79037a;
        return "VisualMessageUiModel(visualMessage=" + mVar + ")";
    }
}
