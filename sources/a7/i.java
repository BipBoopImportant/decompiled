package a7;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"La7/i;", "", "Ljava/time/Instant;", "timestamp", "now", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "b", "getNow", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Instant f41525a;

    /* renamed from: b  reason: collision with root package name */
    private final Instant f41526b;

    public i(Instant instant, Instant instant2) {
        C17542s.j(instant, "timestamp");
        C17542s.j(instant2, "now");
        this.f41525a = instant;
        this.f41526b = instant2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f41525a, iVar.f41525a) && C17542s.e(this.f41526b, iVar.f41526b);
    }

    public int hashCode() {
        return (this.f41525a.hashCode() * 31) + this.f41526b.hashCode();
    }

    public String toString() {
        return "SCT timestamp, " + this.f41525a + ", is in the future, current timestamp is " + this.f41526b + '.';
    }
}
