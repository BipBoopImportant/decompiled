package l0;

import c2.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Ll0/n;", "", "", "friction", "Lc2/d;", "density", "<init>", "(FLc2/d;)V", "a", "(Lc2/d;)F", "velocity", "", "e", "(F)D", "", "c", "(F)J", "b", "(F)F", "Ll0/n$a;", "d", "(F)Ll0/n$a;", "F", "Lc2/d;", "getDensity", "()Lc2/d;", "magicPhysicalCoefficient", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final float f25427a;

    /* renamed from: b  reason: collision with root package name */
    private final d f25428b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25429c;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll0/n$a;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", "a", "(J)F", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getInitialVelocity", "()F", "getDistance", "c", "J", "getDuration", "()J", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f25430a;

        /* renamed from: b  reason: collision with root package name */
        private final float f25431b;

        /* renamed from: c  reason: collision with root package name */
        private final long f25432c;

        public a(float f10, float f11, long j10) {
            this.f25430a = f10;
            this.f25431b = f11;
            this.f25432c = j10;
        }

        public final float a(long j10) {
            long j11 = this.f25432c;
            return this.f25431b * Math.signum(this.f25430a) * C5506a.f25307a.b(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).a();
        }

        public final float b(long j10) {
            long j11 = this.f25432c;
            return (((C5506a.f25307a.b(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).b() * Math.signum(this.f25430a)) * this.f25431b) / ((float) this.f25432c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f25430a, aVar.f25430a) == 0 && Float.compare(this.f25431b, aVar.f25431b) == 0 && this.f25432c == aVar.f25432c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f25430a) * 31) + Float.hashCode(this.f25431b)) * 31) + Long.hashCode(this.f25432c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f25430a + ", distance=" + this.f25431b + ", duration=" + this.f25432c + ')';
        }
    }

    public n(float f10, d dVar) {
        this.f25427a = f10;
        this.f25428b = dVar;
        this.f25429c = a(dVar);
    }

    private final float a(d dVar) {
        return o.c(0.84f, dVar.getDensity());
    }

    private final double e(float f10) {
        return C5506a.f25307a.a(f10, this.f25427a * this.f25429c);
    }

    public final float b(float f10) {
        double e10 = e(f10);
        return (float) (((double) (this.f25427a * this.f25429c)) * Math.exp((((double) o.f25433a) / (((double) o.f25433a) - 1.0d)) * e10));
    }

    public final long c(float f10) {
        return (long) (Math.exp(e(f10) / (((double) o.f25433a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        double e10 = e(f10);
        double b10 = ((double) o.f25433a) - 1.0d;
        return new a(f10, (float) (((double) (this.f25427a * this.f25429c)) * Math.exp((((double) o.f25433a) / b10) * e10)), (long) (Math.exp(e10 / b10) * 1000.0d));
    }
}
