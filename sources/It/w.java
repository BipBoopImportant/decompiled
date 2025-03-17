package It;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"LIt/w;", "", "", "isVisible", "isLoading", "isEnabled", "<init>", "(ZZZ)V", "a", "(ZZZ)LIt/w;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f82455a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f82456b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f82457c;

    public w() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ w b(w wVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = wVar.f82455a;
        }
        if ((i10 & 2) != 0) {
            z11 = wVar.f82456b;
        }
        if ((i10 & 4) != 0) {
            z12 = wVar.f82457c;
        }
        return wVar.a(z10, z11, z12);
    }

    public final w a(boolean z10, boolean z11, boolean z12) {
        return new w(z10, z11, z12);
    }

    public final boolean c() {
        return this.f82457c;
    }

    public final boolean d() {
        return this.f82456b;
    }

    public final boolean e() {
        return this.f82455a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f82455a == wVar.f82455a && this.f82456b == wVar.f82456b && this.f82457c == wVar.f82457c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f82455a) * 31) + Boolean.hashCode(this.f82456b)) * 31) + Boolean.hashCode(this.f82457c);
    }

    public String toString() {
        boolean z10 = this.f82455a;
        boolean z11 = this.f82456b;
        boolean z12 = this.f82457c;
        return "ScanAndGoState(isVisible=" + z10 + ", isLoading=" + z11 + ", isEnabled=" + z12 + ")";
    }

    public w(boolean z10, boolean z11, boolean z12) {
        this.f82455a = z10;
        this.f82456b = z11;
        this.f82457c = z12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }
}
