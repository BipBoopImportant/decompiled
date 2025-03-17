package yo;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyo/b;", "LxB/a;", "", "submitButtonEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "g", "()Z", "", "b", "J", "f", "()J", "stableId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107189a;

    /* renamed from: b  reason: collision with root package name */
    private final long f107190b = ((long) Objects.hash(new Object[]{P.b(b.class)}));

    public b(boolean z10) {
        this.f107189a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f107189a == ((b) obj).f107189a;
    }

    public long f() {
        return this.f107190b;
    }

    public final boolean g() {
        return this.f107189a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f107189a);
    }

    public String toString() {
        boolean z10 = this.f107189a;
        return "CheckoutButtonDelegateModel(submitButtonEnabled=" + z10 + ")";
    }
}
