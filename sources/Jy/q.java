package Jy;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LJy/q;", "LJy/o;", "LxB/a;", "", "estimatedWaitingTime", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "", "b", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f111464a;

    /* renamed from: b  reason: collision with root package name */
    private final long f111465b = ((long) Objects.hash(new Object[]{P.b(q.class)}));

    public q(Integer num) {
        super((DefaultConstructorMarker) null);
        this.f111464a = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && C17542s.e(this.f111464a, ((q) obj).f111464a);
    }

    public long f() {
        return this.f111465b;
    }

    public final Integer g() {
        return this.f111464a;
    }

    public int hashCode() {
        Integer num = this.f111464a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.f111464a;
        return "OrderEstimatedWaitingTimeModel(estimatedWaitingTime=" + num + ")";
    }
}
