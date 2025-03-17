package pK;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"LpK/i;", "", "", "maxZoomFactor", "", "preventOverOrUnderZoom", "<init>", "(FZ)V", "a", "F", "()F", "b", "Z", "()Z", "LpK/h;", "c", "LpK/h;", "()LpK/h;", "range", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.i  reason: case insensitive filesystem */
public final class C17764i {

    /* renamed from: a  reason: collision with root package name */
    private final float f146379a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f146380b;

    /* renamed from: c  reason: collision with root package name */
    private final C17763h f146381c;

    public C17764i() {
        this(0.0f, false, 3, (DefaultConstructorMarker) null);
    }

    public final float a() {
        return this.f146379a;
    }

    public final boolean b() {
        return this.f146380b;
    }

    public final C17763h c() {
        return this.f146381c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17764i)) {
            return false;
        }
        C17764i iVar = (C17764i) obj;
        return Float.compare(this.f146379a, iVar.f146379a) == 0 && this.f146380b == iVar.f146380b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f146379a) * 31) + Boolean.hashCode(this.f146380b);
    }

    public String toString() {
        float f10 = this.f146379a;
        boolean z10 = this.f146380b;
        return "ZoomSpec(maxZoomFactor=" + f10 + ", preventOverOrUnderZoom=" + z10 + ")";
    }

    public C17764i(float f10, boolean z10) {
        this.f146379a = f10;
        this.f146380b = z10;
        this.f146381c = new C17763h(0.0f, f10, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17764i(float f10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 2.0f : f10, (i10 & 2) != 0 ? true : z10);
    }
}
