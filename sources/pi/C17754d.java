package pI;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0007*\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"", "x", "c", "(D)D", "", "d", "(D)I", "", "f", "(D)J", "", "e", "(F)I", "g", "(F)J", "a", "(I)I", "getSign$annotations", "(I)V", "sign", "b", "(J)I", "(J)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* renamed from: pI.d  reason: case insensitive filesystem */
class C17754d extends C17753c {
    public static int a(int i10) {
        return Integer.signum(i10);
    }

    public static int b(long j10) {
        return Long.signum(j10);
    }

    public static double c(double d10) {
        return Math.log(d10) / C17751a.f146339b;
    }

    public static int d(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
    }

    public static int e(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long g(float f10) {
        return C17752b.f((double) f10);
    }
}
