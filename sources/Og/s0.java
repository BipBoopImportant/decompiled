package OG;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001a"}, d2 = {"LOG/s0;", "", "", "helaWallColorFeatureEnabled", "favoritesEnabled", "gltfEnabled", "duplicateOptionEnabled", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getHelaWallColorFeatureEnabled", "()Z", "b", "c", "getGltfEnabled", "d", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f136880a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f136881b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f136882c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f136883d;

    public s0() {
        this(false, false, false, false, 15, (DefaultConstructorMarker) null);
    }

    public final boolean a() {
        return this.f136883d;
    }

    public final boolean b() {
        return this.f136881b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f136880a == s0Var.f136880a && this.f136881b == s0Var.f136881b && this.f136882c == s0Var.f136882c && this.f136883d == s0Var.f136883d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f136880a) * 31) + Boolean.hashCode(this.f136881b)) * 31) + Boolean.hashCode(this.f136882c)) * 31) + Boolean.hashCode(this.f136883d);
    }

    public String toString() {
        boolean z10 = this.f136880a;
        boolean z11 = this.f136881b;
        boolean z12 = this.f136882c;
        boolean z13 = this.f136883d;
        return "FeatureConfigState(helaWallColorFeatureEnabled=" + z10 + ", favoritesEnabled=" + z11 + ", gltfEnabled=" + z12 + ", duplicateOptionEnabled=" + z13 + ")";
    }

    public s0(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f136880a = z10;
        this.f136881b = z11;
        this.f136882c = z12;
        this.f136883d = z13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? false : z13);
    }
}
