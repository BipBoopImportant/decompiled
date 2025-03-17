package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lm0/z;", "", "initialValue", "initialVelocity", "a", "(Lm0/z;FF)F", "T", "frictionMultiplier", "absVelocityThreshold", "b", "(FF)Lm0/z;", "Lm0/P;", "d", "(Lm0/P;)Lm0/z;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.B  reason: case insensitive filesystem */
public final class C5523B {
    public static final float a(C5570z<Float> zVar, float f10, float f11) {
        return ((C5554m) zVar.a(B0.f(C17536l.f144385a)).c(r.a(f10), r.a(f11))).f();
    }

    public static final <T> C5570z<T> b(float f10, float f11) {
        return d(new Q(f10, f11));
    }

    public static /* synthetic */ C5570z c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return b(f10, f11);
    }

    public static final <T> C5570z<T> d(P p10) {
        return new C5522A(p10);
    }
}
