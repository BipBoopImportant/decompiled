package c2;

import d2.C5274a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t*\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lc2/g;", "Lc2/d;", "", "density", "fontScale", "Ld2/a;", "converter", "<init>", "(FFLd2/a;)V", "Lc2/h;", "Lc2/v;", "W", "(F)J", "q", "(J)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getDensity", "()F", "b", "D1", "c", "Ld2/a;", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final float f23028a;

    /* renamed from: b  reason: collision with root package name */
    private final float f23029b;

    /* renamed from: c  reason: collision with root package name */
    private final C5274a f23030c;

    public g(float f10, float f11, C5274a aVar) {
        this.f23028a = f10;
        this.f23029b = f11;
        this.f23030c = aVar;
    }

    public float D1() {
        return this.f23029b;
    }

    public long W(float f10) {
        return w.h(this.f23030c.a(f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f23028a, gVar.f23028a) == 0 && Float.compare(this.f23029b, gVar.f23029b) == 0 && C17542s.e(this.f23030c, gVar.f23030c);
    }

    public float getDensity() {
        return this.f23028a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f23028a) * 31) + Float.hashCode(this.f23029b)) * 31) + this.f23030c.hashCode();
    }

    public float q(long j10) {
        if (x.g(v.g(j10), x.f23061b.b())) {
            return h.B(this.f23030c.b(v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f23028a + ", fontScale=" + this.f23029b + ", converter=" + this.f23030c + ')';
    }
}
