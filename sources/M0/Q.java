package m0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lm0/Q;", "Lm0/P;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JFF)F", "b", "c", "(FF)J", "d", "(FF)F", "a", "F", "()F", "friction", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q implements P {

    /* renamed from: a  reason: collision with root package name */
    private final float f25615a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25616b;

    public Q(float f10, float f11) {
        this.f25615a = Math.max(1.0E-7f, Math.abs(f11));
        this.f25616b = Math.max(1.0E-4f, f10) * -4.2f;
    }

    public float a() {
        return this.f25615a;
    }

    public float b(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp((double) ((((float) (j10 / 1000000)) / 1000.0f) * this.f25616b)));
    }

    public long c(float f10, float f11) {
        return ((long) ((((float) Math.log((double) (a() / Math.abs(f11)))) * 1000.0f) / this.f25616b)) * 1000000;
    }

    public float d(float f10, float f11) {
        if (Math.abs(f11) <= a()) {
            return f10;
        }
        double log = Math.log((double) Math.abs(a() / f11));
        float f12 = this.f25616b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((((double) f12) * ((log / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    public float e(long j10, float f10, float f11) {
        float f12 = this.f25616b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((double) ((f12 * ((float) (j10 / 1000000))) / 1000.0f))));
    }
}
