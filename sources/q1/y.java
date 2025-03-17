package q1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0004\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0005\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0006\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\b\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lq1/y;", "", "", "gamma", "a", "b", "c", "d", "e", "f", "<init>", "(DDDDDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "g", "()D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final double f27748a;

    /* renamed from: b  reason: collision with root package name */
    private final double f27749b;

    /* renamed from: c  reason: collision with root package name */
    private final double f27750c;

    /* renamed from: d  reason: collision with root package name */
    private final double f27751d;

    /* renamed from: e  reason: collision with root package name */
    private final double f27752e;

    /* renamed from: f  reason: collision with root package name */
    private final double f27753f;

    /* renamed from: g  reason: collision with root package name */
    private final double f27754g;

    public y(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f27748a = d10;
        this.f27749b = d11;
        this.f27750c = d12;
        this.f27751d = d13;
        this.f27752e = d14;
        this.f27753f = d15;
        this.f27754g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        } else if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        } else if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        } else if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        } else if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        } else if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        } else if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f27749b;
    }

    public final double b() {
        return this.f27750c;
    }

    public final double c() {
        return this.f27751d;
    }

    public final double d() {
        return this.f27752e;
    }

    public final double e() {
        return this.f27753f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Double.compare(this.f27748a, yVar.f27748a) == 0 && Double.compare(this.f27749b, yVar.f27749b) == 0 && Double.compare(this.f27750c, yVar.f27750c) == 0 && Double.compare(this.f27751d, yVar.f27751d) == 0 && Double.compare(this.f27752e, yVar.f27752e) == 0 && Double.compare(this.f27753f, yVar.f27753f) == 0 && Double.compare(this.f27754g, yVar.f27754g) == 0;
    }

    public final double f() {
        return this.f27754g;
    }

    public final double g() {
        return this.f27748a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f27748a) * 31) + Double.hashCode(this.f27749b)) * 31) + Double.hashCode(this.f27750c)) * 31) + Double.hashCode(this.f27751d)) * 31) + Double.hashCode(this.f27752e)) * 31) + Double.hashCode(this.f27753f)) * 31) + Double.hashCode(this.f27754g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f27748a + ", a=" + this.f27749b + ", b=" + this.f27750c + ", c=" + this.f27751d + ", d=" + this.f27752e + ", e=" + this.f27753f + ", f=" + this.f27754g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
