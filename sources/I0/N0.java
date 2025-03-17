package I0;

import XH.C16814e;
import YH.C16877v;
import c2.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5559o0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LI0/N0;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "LI0/s0;", "c", "(Ljava/util/Set;FF)LI0/s0;", "Lm0/o0;", "b", "Lm0/o0;", "a", "()Lm0/o0;", "AnimationSpec", "Lc2/h;", "F", "()F", "VelocityThreshold", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    public static final N0 f7396a = new N0();

    /* renamed from: b  reason: collision with root package name */
    private static final C5559o0<Float> f7397b = new C5559o0(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7398c = h.B((float) 125);

    private N0() {
    }

    public static /* synthetic */ C4582s0 d(N0 n02, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return n02.c(set, f10, f11);
    }

    public final C5559o0<Float> a() {
        return f7397b;
    }

    public final float b() {
        return f7398c;
    }

    public final C4582s0 c(Set<Float> set, float f10, float f11) {
        if (set.size() <= 1) {
            return null;
        }
        Iterable iterable = set;
        Float N02 = C16877v.N0(iterable);
        C17542s.g(N02);
        float floatValue = N02.floatValue();
        Float Q02 = C16877v.Q0(iterable);
        C17542s.g(Q02);
        return new C4582s0(floatValue - Q02.floatValue(), f10, f11);
    }
}
