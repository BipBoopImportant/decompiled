package q3;

import t3.N;

public final class S {

    /* renamed from: e  reason: collision with root package name */
    public static final S f28064e = new S(0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f28065f = N.A0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f28066g = N.A0(1);

    /* renamed from: h  reason: collision with root package name */
    private static final String f28067h = N.A0(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f28068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28069b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final int f28070c;

    /* renamed from: d  reason: collision with root package name */
    public final float f28071d;

    public S(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return this.f28068a == s10.f28068a && this.f28069b == s10.f28069b && this.f28071d == s10.f28071d;
    }

    public int hashCode() {
        return ((((217 + this.f28068a) * 31) + this.f28069b) * 31) + Float.floatToRawIntBits(this.f28071d);
    }

    public S(int i10, int i11, float f10) {
        this.f28068a = i10;
        this.f28069b = i11;
        this.f28070c = 0;
        this.f28071d = f10;
    }
}
