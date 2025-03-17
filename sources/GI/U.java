package gi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgi/U;", "", "", "title", "", "canDisplayOptions", "<init>", "(Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Z)Lgi/U;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "c", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final String f73343a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73344b;

    public U(String str, boolean z10) {
        C17542s.j(str, "title");
        this.f73343a = str;
        this.f73344b = z10;
    }

    public static /* synthetic */ U b(U u10, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = u10.f73343a;
        }
        if ((i10 & 2) != 0) {
            z10 = u10.f73344b;
        }
        return u10.a(str, z10);
    }

    public final U a(String str, boolean z10) {
        C17542s.j(str, "title");
        return new U(str, z10);
    }

    public final boolean c() {
        return this.f73344b;
    }

    public final String d() {
        return this.f73343a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return C17542s.e(this.f73343a, u10.f73343a) && this.f73344b == u10.f73344b;
    }

    public int hashCode() {
        return (this.f73343a.hashCode() * 31) + Boolean.hashCode(this.f73344b);
    }

    public String toString() {
        String str = this.f73343a;
        boolean z10 = this.f73344b;
        return "ToolbarData(title=" + str + ", canDisplayOptions=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}
