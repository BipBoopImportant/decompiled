package Ya;

import Ya.C9367d;

final class z extends C9367d.a {

    /* renamed from: a  reason: collision with root package name */
    private int f64892a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64893b;

    /* renamed from: c  reason: collision with root package name */
    private byte f64894c;

    z() {
    }

    public final C9367d a() {
        if (this.f64894c == 3) {
            return new C9361B(this.f64892a, this.f64893b, (C9360A) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f64894c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f64894c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final C9367d.a b(boolean z10) {
        this.f64893b = z10;
        this.f64894c = (byte) (this.f64894c | 2);
        return this;
    }

    public final C9367d.a c(int i10) {
        this.f64892a = i10;
        this.f64894c = (byte) (this.f64894c | 1);
        return this;
    }
}
