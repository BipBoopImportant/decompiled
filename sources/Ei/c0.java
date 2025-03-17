package ei;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lei/c0;", "", "", "messageRes", "", "fullscreen", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f72829a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72830b;

    public c0(int i10, boolean z10) {
        this.f72829a = i10;
        this.f72830b = z10;
    }

    public final boolean a() {
        return this.f72830b;
    }

    public final int b() {
        return this.f72829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f72829a == c0Var.f72829a && this.f72830b == c0Var.f72830b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f72829a) * 31) + Boolean.hashCode(this.f72830b);
    }

    public String toString() {
        int i10 = this.f72829a;
        boolean z10 = this.f72830b;
        return "ReloadErrorDelegateModel(messageRes=" + i10 + ", fullscreen=" + z10 + ")";
    }
}
