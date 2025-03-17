package WB;

import WB.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LWB/i;", "", "LWB/j;", "storeData", "", "popularTimesEnabled", "<init>", "(LWB/j;Z)V", "a", "(LWB/j;Z)LWB/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LWB/j;", "d", "()LWB/j;", "b", "Z", "c", "()Z", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final j f117535a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f117536b;

    public i() {
        this((j) null, false, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ i b(i iVar, j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = iVar.f117535a;
        }
        if ((i10 & 2) != 0) {
            z10 = iVar.f117536b;
        }
        return iVar.a(jVar, z10);
    }

    public final i a(j jVar, boolean z10) {
        C17542s.j(jVar, "storeData");
        return new i(jVar, z10);
    }

    public final boolean c() {
        return this.f117536b;
    }

    public final j d() {
        return this.f117535a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f117535a, iVar.f117535a) && this.f117536b == iVar.f117536b;
    }

    public int hashCode() {
        return (this.f117535a.hashCode() * 31) + Boolean.hashCode(this.f117536b);
    }

    public String toString() {
        j jVar = this.f117535a;
        boolean z10 = this.f117536b;
        return "State(storeData=" + jVar + ", popularTimesEnabled=" + z10 + ")";
    }

    public i(j jVar, boolean z10) {
        C17542s.j(jVar, "storeData");
        this.f117535a = jVar;
        this.f117536b = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.c.f117544a : jVar, (i10 & 2) != 0 ? false : z10);
    }
}
