package Ya;

/* renamed from: Ya.B  reason: case insensitive filesystem */
final class C9361B extends C9367d {

    /* renamed from: a  reason: collision with root package name */
    private final int f64832a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64833b;

    /* synthetic */ C9361B(int i10, boolean z10, C9360A a10) {
        this.f64832a = i10;
        this.f64833b = z10;
    }

    public final boolean a() {
        return this.f64833b;
    }

    public final int b() {
        return this.f64832a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9367d) {
            C9367d dVar = (C9367d) obj;
            return this.f64832a == dVar.b() && this.f64833b == dVar.a();
        }
    }

    public final int hashCode() {
        return ((this.f64832a ^ 1000003) * 1000003) ^ (true != this.f64833b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f64832a;
        boolean z10 = this.f64833b;
        return "AppUpdateOptions{appUpdateType=" + i10 + ", allowAssetPackDeletion=" + z10 + "}";
    }
}
