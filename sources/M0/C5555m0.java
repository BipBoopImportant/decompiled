package m0;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R*\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u001c\u0010\u0005R$\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u001f\u0010\u0005\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lm0/m0;", "", "", "finalPosition", "<init>", "(F)V", "LXH/N;", "c", "()V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lm0/c0;", "g", "(FFJ)J", "a", "F", "getFinalPosition", "()F", "e", "", "b", "D", "naturalFreq", "", "Z", "initialized", "d", "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", "stiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.m0  reason: case insensitive filesystem */
public final class C5555m0 {

    /* renamed from: a  reason: collision with root package name */
    private float f25849a;

    /* renamed from: b  reason: collision with root package name */
    private double f25850b = Math.sqrt(50.0d);

    /* renamed from: c  reason: collision with root package name */
    private boolean f25851c;

    /* renamed from: d  reason: collision with root package name */
    private double f25852d;

    /* renamed from: e  reason: collision with root package name */
    private double f25853e;

    /* renamed from: f  reason: collision with root package name */
    private double f25854f;

    /* renamed from: g  reason: collision with root package name */
    private float f25855g = 1.0f;

    public C5555m0(float f10) {
        this.f25849a = f10;
    }

    private final void c() {
        if (!this.f25851c) {
            if (this.f25849a != C5557n0.b()) {
                float f10 = this.f25855g;
                double d10 = ((double) f10) * ((double) f10);
                if (f10 > 1.0f) {
                    double d11 = this.f25850b;
                    double d12 = d10 - ((double) 1);
                    this.f25852d = (((double) (-f10)) * d11) + (d11 * Math.sqrt(d12));
                    double d13 = this.f25850b;
                    this.f25853e = (((double) (-this.f25855g)) * d13) - (d13 * Math.sqrt(d12));
                } else if (f10 >= 0.0f && f10 < 1.0f) {
                    this.f25854f = this.f25850b * Math.sqrt(((double) 1) - d10);
                }
                this.f25851c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public final float a() {
        return this.f25855g;
    }

    public final float b() {
        double d10 = this.f25850b;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 >= 0.0f) {
            this.f25855g = f10;
            this.f25851c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void e(float f10) {
        this.f25849a = f10;
    }

    public final void f(float f10) {
        if (b() > 0.0f) {
            this.f25850b = Math.sqrt((double) f10);
            this.f25851c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final long g(float f10, float f11, long j10) {
        double d10;
        double d11;
        float f12 = f11;
        c();
        float f13 = f10 - this.f25849a;
        double d12 = ((double) j10) / 1000.0d;
        float f14 = this.f25855g;
        if (f14 > 1.0f) {
            double d13 = (double) f13;
            double d14 = this.f25853e;
            double d15 = (double) f12;
            double d16 = this.f25852d;
            double d17 = d13 - (((d14 * d13) - d15) / (d14 - d16));
            double d18 = ((d13 * d14) - d15) / (d14 - d16);
            d11 = (Math.exp(d14 * d12) * d17) + (Math.exp(this.f25852d * d12) * d18);
            double d19 = this.f25853e;
            double exp = d17 * d19 * Math.exp(d19 * d12);
            double d20 = this.f25852d;
            d10 = exp + (d18 * d20 * Math.exp(d20 * d12));
        } else if (f14 == 1.0f) {
            double d21 = (double) f12;
            double d22 = this.f25850b;
            double d23 = (double) f13;
            double d24 = d21 + (d22 * d23);
            double d25 = d23 + (d24 * d12);
            double exp2 = Math.exp((-d22) * d12) * d25;
            double exp3 = d25 * Math.exp((-this.f25850b) * d12);
            double d26 = this.f25850b;
            d10 = (exp3 * (-d26)) + (d24 * Math.exp((-d26) * d12));
            d11 = exp2;
        } else {
            double d27 = this.f25850b;
            double d28 = (double) f13;
            double d29 = (((double) 1) / this.f25854f) * ((((double) f14) * d27 * d28) + ((double) f12));
            double exp4 = Math.exp(((double) (-f14)) * d27 * d12) * ((Math.cos(this.f25854f * d12) * d28) + (Math.sin(this.f25854f * d12) * d29));
            double d30 = this.f25850b;
            float f15 = this.f25855g;
            double d31 = (-d30) * exp4 * ((double) f15);
            double exp5 = Math.exp(((double) (-f15)) * d30 * d12);
            double d32 = this.f25854f;
            double d33 = exp4;
            double sin = (-d32) * d28 * Math.sin(d32 * d12);
            double d34 = this.f25854f;
            d10 = d31 + (exp5 * (sin + (d29 * d34 * Math.cos(d34 * d12))));
            d11 = d33;
        }
        return C5557n0.a((float) (d11 + ((double) this.f25849a)), (float) d10);
    }
}
