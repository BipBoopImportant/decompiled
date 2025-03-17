package OG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mG.C17597b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"LOG/v0;", "", "LmG/b;", "selectedInstance", "", "hasVariants", "<init>", "(LmG/b;Z)V", "a", "(LmG/b;Z)LOG/v0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LmG/b;", "e", "()LmG/b;", "b", "Z", "d", "()Z", "c", "hasGoesWith", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final C17597b f136892a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f136893b;

    public v0(C17597b bVar, boolean z10) {
        C17542s.j(bVar, "selectedInstance");
        this.f136892a = bVar;
        this.f136893b = z10;
    }

    public static /* synthetic */ v0 b(v0 v0Var, C17597b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = v0Var.f136892a;
        }
        if ((i10 & 2) != 0) {
            z10 = v0Var.f136893b;
        }
        return v0Var.a(bVar, z10);
    }

    public final v0 a(C17597b bVar, boolean z10) {
        C17542s.j(bVar, "selectedInstance");
        return new v0(bVar, z10);
    }

    public final boolean c() {
        return C17542s.e(this.f136892a.e().d().getHasGoesWell(), Boolean.TRUE);
    }

    public final boolean d() {
        return this.f136893b;
    }

    public final C17597b e() {
        return this.f136892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return C17542s.e(this.f136892a, v0Var.f136892a) && this.f136893b == v0Var.f136893b;
    }

    public int hashCode() {
        return (this.f136892a.hashCode() * 31) + Boolean.hashCode(this.f136893b);
    }

    public String toString() {
        C17597b bVar = this.f136892a;
        boolean z10 = this.f136893b;
        return "SelectionUIState(selectedInstance=" + bVar + ", hasVariants=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(C17597b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? false : z10);
    }
}
