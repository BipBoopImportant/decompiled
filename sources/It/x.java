package It;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pu.C11778b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LIt/x;", "", "Lpu/b;", "nearbyStore", "", "hasScanAndGoCartItems", "<init>", "(Lpu/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu/b;", "b", "()Lpu/b;", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final C11778b f82458a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f82459b;

    public x(C11778b bVar, boolean z10) {
        C17542s.j(bVar, "nearbyStore");
        this.f82458a = bVar;
        this.f82459b = z10;
    }

    public final boolean a() {
        return this.f82459b;
    }

    public final C11778b b() {
        return this.f82458a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return C17542s.e(this.f82458a, xVar.f82458a) && this.f82459b == xVar.f82459b;
    }

    public int hashCode() {
        return (this.f82458a.hashCode() * 31) + Boolean.hashCode(this.f82459b);
    }

    public String toString() {
        C11778b bVar = this.f82458a;
        boolean z10 = this.f82459b;
        return "ShowChangeToNearbyStorePrompt(nearbyStore=" + bVar + ", hasScanAndGoCartItems=" + z10 + ")";
    }
}
