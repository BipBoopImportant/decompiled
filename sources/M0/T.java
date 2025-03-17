package m0;

import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006 "}, d2 = {"Lm0/T;", "Lm0/O;", "", "duration", "delay", "Lm0/D;", "easing", "<init>", "(IILm0/D;)V", "", "playTimeNanos", "f", "(J)J", "", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "e", "(FFF)J", "d", "a", "I", "getDuration", "()I", "b", "getDelay", "Lm0/D;", "J", "durationNanos", "delayNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T implements O {

    /* renamed from: a  reason: collision with root package name */
    private final int f25621a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25622b;

    /* renamed from: c  reason: collision with root package name */
    private final C5525D f25623c;

    /* renamed from: d  reason: collision with root package name */
    private final long f25624d;

    /* renamed from: e  reason: collision with root package name */
    private final long f25625e;

    public T(int i10, int i11, C5525D d10) {
        this.f25621a = i10;
        this.f25622b = i11;
        this.f25623c = d10;
        this.f25624d = ((long) i10) * 1000000;
        this.f25625e = ((long) i11) * 1000000;
    }

    private final long f(long j10) {
        return C17978n.o(j10 - this.f25625e, 0, this.f25624d);
    }

    public float c(long j10, float f10, float f11, float f12) {
        float f13 = 1.0f;
        float f14 = this.f25621a == 0 ? 1.0f : ((float) f(j10)) / ((float) this.f25624d);
        C5525D d10 = this.f25623c;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 <= 1.0f) {
            f13 = f14;
        }
        return B0.k(f10, f11, d10.a(f13));
    }

    public float d(long j10, float f10, float f11, float f12) {
        long f13 = f(j10);
        int i10 = (f13 > 0 ? 1 : (f13 == 0 ? 0 : -1));
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f12;
        }
        return (c(f13, f10, f11, f12) - c(f13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    public long e(float f10, float f11, float f12) {
        return ((long) (this.f25622b + this.f25621a)) * 1000000;
    }
}
