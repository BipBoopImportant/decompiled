package wh;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwh/p;", "", "", "authToLeave", "wheelChair", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f77678a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f77679b;

    public p(boolean z10, boolean z11) {
        this.f77678a = z10;
        this.f77679b = z11;
    }

    public final boolean a() {
        return this.f77678a;
    }

    public final boolean b() {
        return this.f77679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f77678a == pVar.f77678a && this.f77679b == pVar.f77679b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f77678a) * 31) + Boolean.hashCode(this.f77679b);
    }

    public String toString() {
        boolean z10 = this.f77678a;
        boolean z11 = this.f77679b;
        return "SelectedTimeWindowCapabilitiesInput(authToLeave=" + z10 + ", wheelChair=" + z11 + ")";
    }
}
