package jj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljj/a;", "", "", "foreground", "background", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jj.a  reason: case insensitive filesystem */
public final class C11418a {

    /* renamed from: a  reason: collision with root package name */
    private final long f98572a;

    /* renamed from: b  reason: collision with root package name */
    private final long f98573b;

    public C11418a() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public final long a() {
        return this.f98573b;
    }

    public final long b() {
        return this.f98572a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11418a)) {
            return false;
        }
        C11418a aVar = (C11418a) obj;
        return this.f98572a == aVar.f98572a && this.f98573b == aVar.f98573b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f98572a) * 31) + Long.hashCode(this.f98573b);
    }

    public String toString() {
        long j10 = this.f98572a;
        long j11 = this.f98573b;
        return "CheckoutStatusPollInterval(foreground=" + j10 + ", background=" + j11 + ")";
    }

    public C11418a(long j10, long j11) {
        this.f98572a = j10;
        this.f98573b = j11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11418a(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 2000 : j10, (i10 & 2) != 0 ? 5000 : j11);
    }
}
