package Rn;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"LRn/j;", "LRn/i;", "", "delayInMillis", "", "numberOfAttempts", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "I", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final long f86897a;

    /* renamed from: b  reason: collision with root package name */
    private final int f86898b;

    public j() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public int a() {
        return this.f86898b;
    }

    public long b() {
        return this.f86897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f86897a == jVar.f86897a && this.f86898b == jVar.f86898b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f86897a) * 31) + Integer.hashCode(this.f86898b);
    }

    public String toString() {
        long j10 = this.f86897a;
        int i10 = this.f86898b;
        return "PaymentStatusRetrySettingsImpl(delayInMillis=" + j10 + ", numberOfAttempts=" + i10 + ")";
    }

    public j(long j10, int i10) {
        this.f86897a = j10;
        this.f86898b = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TimeUnit.SECONDS.toMillis(2) : j10, (i11 & 2) != 0 ? 4 : i10);
    }
}
