package P3;

import t3.B;

final class c implements C6684a {

    /* renamed from: a  reason: collision with root package name */
    public final int f39339a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39340b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39341c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39342d;

    private c(int i10, int i11, int i12, int i13) {
        this.f39339a = i10;
        this.f39340b = i11;
        this.f39341c = i12;
        this.f39342d = i13;
    }

    public static c b(B b10) {
        int u10 = b10.u();
        b10.X(8);
        int u11 = b10.u();
        int u12 = b10.u();
        b10.X(4);
        int u13 = b10.u();
        b10.X(12);
        return new c(u10, u11, u12, u13);
    }

    public boolean a() {
        return (this.f39340b & 16) == 16;
    }

    public int getType() {
        return 1751742049;
    }
}
