package z3;

public final class H {

    /* renamed from: c  reason: collision with root package name */
    public static final H f32388c = new H(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f32389a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32390b;

    public H(int i10, boolean z10) {
        this.f32389a = i10;
        this.f32390b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h10 = (H) obj;
        return this.f32389a == h10.f32389a && this.f32390b == h10.f32390b;
    }

    public int hashCode() {
        return (this.f32389a << 1) + (this.f32390b ? 1 : 0);
    }
}
