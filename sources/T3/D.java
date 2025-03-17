package t3;

public final class D {

    /* renamed from: c  reason: collision with root package name */
    public static final D f29444c = new D(-1, -1);

    /* renamed from: d  reason: collision with root package name */
    public static final D f29445d = new D(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f29446a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29447b;

    public D(int i10, int i11) {
        C5950a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f29446a = i10;
        this.f29447b = i11;
    }

    public int a() {
        return this.f29447b;
    }

    public int b() {
        return this.f29446a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f29446a == d10.f29446a && this.f29447b == d10.f29447b;
    }

    public int hashCode() {
        int i10 = this.f29447b;
        int i11 = this.f29446a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f29446a + "x" + this.f29447b;
    }
}
