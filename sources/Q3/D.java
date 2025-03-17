package q3;

import t3.C5950a;
import t3.N;

public final class D {

    /* renamed from: d  reason: collision with root package name */
    public static final D f27856d = new D(1.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final String f27857e = N.A0(0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f27858f = N.A0(1);

    /* renamed from: a  reason: collision with root package name */
    public final float f27859a;

    /* renamed from: b  reason: collision with root package name */
    public final float f27860b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27861c;

    public D(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f27861c);
    }

    public D b(float f10) {
        return new D(f10, this.f27860b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        return this.f27859a == d10.f27859a && this.f27860b == d10.f27860b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f27859a)) * 31) + Float.floatToRawIntBits(this.f27860b);
    }

    public String toString() {
        return N.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f27859a), Float.valueOf(this.f27860b));
    }

    public D(float f10, float f11) {
        boolean z10 = false;
        C5950a.a(f10 > 0.0f);
        C5950a.a(f11 > 0.0f ? true : z10);
        this.f27859a = f10;
        this.f27860b = f11;
        this.f27861c = Math.round(f10 * 1000.0f);
    }
}
