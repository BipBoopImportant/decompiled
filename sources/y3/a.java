package y3;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f32264a;

    /* access modifiers changed from: protected */
    public final boolean B(int i10) {
        return (this.f32264a & i10) == i10;
    }

    public final boolean C() {
        return B(268435456);
    }

    public final boolean D() {
        return B(4);
    }

    public final boolean E() {
        return B(134217728);
    }

    public final boolean F() {
        return B(1);
    }

    public final boolean G() {
        return B(536870912);
    }

    public final boolean H() {
        return B(67108864);
    }

    public final void I(int i10) {
        this.f32264a = i10;
    }

    public final void n(int i10) {
        this.f32264a = i10 | this.f32264a;
    }

    public void v() {
        this.f32264a = 0;
    }
}
