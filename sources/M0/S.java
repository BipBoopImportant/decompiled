package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lm0/S;", "Lm0/O;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "d", "b", "(FFF)F", "e", "(FFF)J", "a", "F", "getDampingRatio", "()F", "getStiffness", "Lm0/m0;", "Lm0/m0;", "spring", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class S implements O {

    /* renamed from: a  reason: collision with root package name */
    private final float f25617a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25618b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25619c;

    /* renamed from: d  reason: collision with root package name */
    private final C5555m0 f25620d;

    public S() {
        this(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    public float b(float f10, float f11, float f12) {
        return 0.0f;
    }

    public float c(long j10, float f10, float f11, float f12) {
        this.f25620d.e(f11);
        return C5535c0.b(this.f25620d.g(f10, f12, j10 / 1000000));
    }

    public float d(long j10, float f10, float f11, float f12) {
        this.f25620d.e(f11);
        return C5535c0.c(this.f25620d.g(f10, f12, j10 / 1000000));
    }

    public long e(float f10, float f11, float f12) {
        float b10 = this.f25620d.b();
        float a10 = this.f25620d.a();
        float f13 = f10 - f11;
        float f14 = this.f25619c;
        return C5553l0.b(b10, a10, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    public S(float f10, float f11, float f12) {
        this.f25617a = f10;
        this.f25618b = f11;
        this.f25619c = f12;
        C5555m0 m0Var = new C5555m0(1.0f);
        m0Var.d(f10);
        m0Var.f(f11);
        this.f25620d = m0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
