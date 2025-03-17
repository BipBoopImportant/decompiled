package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Lm0/m;", "a", "(F)Lm0/m;", "v2", "Lm0/n;", "b", "(FF)Lm0/n;", "v3", "Lm0/o;", "c", "(FFF)Lm0/o;", "v4", "Lm0/p;", "d", "(FFFF)Lm0/p;", "Lm0/q;", "T", "g", "(Lm0/q;)Lm0/q;", "e", "source", "LXH/N;", "f", "(Lm0/q;Lm0/q;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {
    public static final C5554m a(float f10) {
        return new C5554m(f10);
    }

    public static final C5556n b(float f10, float f11) {
        return new C5556n(f10, f11);
    }

    public static final C5558o c(float f10, float f11, float f12) {
        return new C5558o(f10, f11, f12);
    }

    public static final C5560p d(float f10, float f11, float f12, float f13) {
        return new C5560p(f10, f11, f12, f13);
    }

    public static final <T extends C5562q> T e(T t10) {
        T g10 = g(t10);
        int b10 = g10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g10.e(i10, t10.a(i10));
        }
        return g10;
    }

    public static final <T extends C5562q> void f(T t10, T t11) {
        int b10 = t10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    public static final <T extends C5562q> T g(T t10) {
        T c10 = t10.c();
        C17542s.h(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c10;
    }
}
