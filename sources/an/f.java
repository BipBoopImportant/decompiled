package An;

import Op.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LAn/f;", "LAn/o;", "LOp/d1;", "productItemUiModel", "", "showSwipeImageNudge", "<init>", "(LOp/d1;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/d1;", "g", "()LOp/d1;", "b", "Z", "h", "()Z", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends o {

    /* renamed from: a  reason: collision with root package name */
    private final d1 f78997a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f78998b;

    /* renamed from: c  reason: collision with root package name */
    private final long f78999c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d1 d1Var, boolean z10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(d1Var, "productItemUiModel");
        this.f78997a = d1Var;
        this.f78998b = z10;
        this.f78999c = d1Var.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f78997a, fVar.f78997a) && this.f78998b == fVar.f78998b;
    }

    public long f() {
        return this.f78999c;
    }

    public final d1 g() {
        return this.f78997a;
    }

    public final boolean h() {
        return this.f78998b;
    }

    public int hashCode() {
        return (this.f78997a.hashCode() * 31) + Boolean.hashCode(this.f78998b);
    }

    public String toString() {
        d1 d1Var = this.f78997a;
        boolean z10 = this.f78998b;
        return "ComposeProductUiModel(productItemUiModel=" + d1Var + ", showSwipeImageNudge=" + z10 + ")";
    }
}
