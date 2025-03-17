package tI;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "that", "LtI/f;", "b", "(DD)LtI/f;", "", "c", "(FF)LtI/f;", "", "isPositive", "", "step", "LXH/N;", "a", "(ZLjava/lang/Number;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* renamed from: tI.o  reason: case insensitive filesystem */
class C17979o {
    public static final void a(boolean z10, Number number) {
        C17542s.j(number, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    public static C17970f<Double> b(double d10, double d11) {
        return new C17968d(d10, d11);
    }

    public static C17970f<Float> c(float f10, float f11) {
        return new C17969e(f10, f11);
    }
}
