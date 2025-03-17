package Nn;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"LNn/L;", "", "", "authToLeave", "wheelChair", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f83996a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f83997b;

    public L(boolean z10, boolean z11) {
        this.f83996a = z10;
        this.f83997b = z11;
    }

    public final boolean a() {
        return this.f83996a;
    }

    public final boolean b() {
        return this.f83997b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return this.f83996a == l10.f83996a && this.f83997b == l10.f83997b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f83996a) * 31) + Boolean.hashCode(this.f83997b);
    }

    public String toString() {
        boolean z10 = this.f83996a;
        boolean z11 = this.f83997b;
        return "SelectedTimeWindowCapabilitiesInput(authToLeave=" + z10 + ", wheelChair=" + z11 + ")";
    }
}
