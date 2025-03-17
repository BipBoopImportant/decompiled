package m0;

import kotlin.Metadata;
import p1.C5710c0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0004\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lm0/x;", "Lm0/D;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "fraction", "LXH/N;", "(F)V", "(F)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "e", "min", "f", "max", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.x  reason: case insensitive filesystem */
public final class C5568x implements C5525D {

    /* renamed from: a  reason: collision with root package name */
    private final float f26022a;

    /* renamed from: b  reason: collision with root package name */
    private final float f26023b;

    /* renamed from: c  reason: collision with root package name */
    private final float f26024c;

    /* renamed from: d  reason: collision with root package name */
    private final float f26025d;

    /* renamed from: e  reason: collision with root package name */
    private final float f26026e;

    /* renamed from: f  reason: collision with root package name */
    private final float f26027f;

    public C5568x(float f10, float f11, float f12, float f13) {
        this.f26022a = f10;
        this.f26023b = f11;
        this.f26024c = f12;
        this.f26025d = f13;
        if (!(!Float.isNaN(f10) && !Float.isNaN(f11) && !Float.isNaN(f12) && !Float.isNaN(f13))) {
            C5545h0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long b10 = C5710c0.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f26026e = Float.intBitsToFloat((int) (b10 >> 32));
        this.f26027f = Float.intBitsToFloat((int) (b10 & 4294967295L));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f26022a + ", " + this.f26023b + ", " + this.f26024c + ", " + this.f26025d + ") has no solution at " + f10);
    }

    public float a(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float e10 = C5710c0.e(0.0f - f10, this.f26022a - f10, this.f26024c - f10, 1.0f - f10);
        if (Float.isNaN(e10)) {
            b(f10);
        }
        float c10 = C5710c0.c(this.f26023b, this.f26025d, e10);
        float f11 = this.f26026e;
        float f12 = this.f26027f;
        if (c10 < f11) {
            c10 = f11;
        }
        return c10 > f12 ? f12 : c10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5568x) {
            C5568x xVar = (C5568x) obj;
            return this.f26022a == xVar.f26022a && this.f26023b == xVar.f26023b && this.f26024c == xVar.f26024c && this.f26025d == xVar.f26025d;
        }
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26022a) * 31) + Float.hashCode(this.f26023b)) * 31) + Float.hashCode(this.f26024c)) * 31) + Float.hashCode(this.f26025d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f26022a + ", b=" + this.f26023b + ", c=" + this.f26024c + ", d=" + this.f26025d + ')';
    }
}
