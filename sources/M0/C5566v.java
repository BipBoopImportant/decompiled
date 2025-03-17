package m0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lm0/v;", "", "", "_real", "_imaginary", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "f", "()D", "real", "e", "imaginary", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.v  reason: case insensitive filesystem */
public final class C5566v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public double f25943a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public double f25944b;

    public C5566v(double d10, double d11) {
        this.f25943a = d10;
        this.f25944b = d11;
    }

    public final double e() {
        return this.f25944b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5566v)) {
            return false;
        }
        C5566v vVar = (C5566v) obj;
        return Double.compare(this.f25943a, vVar.f25943a) == 0 && Double.compare(this.f25944b, vVar.f25944b) == 0;
    }

    public final double f() {
        return this.f25943a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f25943a) * 31) + Double.hashCode(this.f25944b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f25943a + ", _imaginary=" + this.f25944b + ')';
    }
}
