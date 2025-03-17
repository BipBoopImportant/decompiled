package l0;

import c2.d;
import kotlin.Metadata;
import m0.P;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll0/y;", "Lm0/P;", "Lc2/d;", "density", "<init>", "(Lc2/d;)V", "", "startVelocity", "f", "(F)F", "initialValue", "initialVelocity", "d", "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "Ll0/n;", "a", "Ll0/n;", "flingCalculator", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements P {

    /* renamed from: a  reason: collision with root package name */
    private final n f25440a;

    public y(d dVar) {
        this.f25440a = new n(z.a(), dVar);
    }

    private final float f(float f10) {
        return this.f25440a.b(f10) * Math.signum(f10);
    }

    public float a() {
        return 0.0f;
    }

    public float b(long j10, float f10, float f11) {
        return this.f25440a.d(f11).b(j10 / 1000000);
    }

    public long c(float f10, float f11) {
        return this.f25440a.c(f11) * 1000000;
    }

    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    public float e(long j10, float f10, float f11) {
        return f10 + this.f25440a.d(f11).a(j10 / 1000000);
    }
}
