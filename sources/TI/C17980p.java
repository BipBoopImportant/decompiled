package tI;

import com.optimizely.ab.config.Group;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rI.C17853c;
import rI.C17854d;
import tI.C17972h;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000f\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u000e*\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\u00020\u0003*\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\u001a\u001a\u0019\u0010\"\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001d\u001a\u0019\u0010#\u001a\u00020\b*\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b#\u0010\u001f\u001a\u0019\u0010$\u001a\u00020\u0007*\u00020\u00072\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b$\u0010%\u001a5\u0010(\u001a\u00028\u0000\"\u000e\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000&*\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\b\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b*\u0010+\u001a!\u0010,\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a!\u0010.\u001a\u00020\b*\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b.\u0010/\u001a!\u00100\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b0\u00101\u001a1\u00104\u001a\u00028\u0000\"\u000e\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000&*\u00028\u00002\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0007¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00020\u0003*\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"LtI/j;", "LrI/c;", "random", "", "t", "(LtI/j;LrI/c;)I", "LtI/g;", "", "", "value", "", "r", "(LtI/g;F)Z", "to", "LtI/h;", "s", "(II)LtI/h;", "u", "(LtI/h;)LtI/h;", "step", "v", "(LtI/h;I)LtI/h;", "w", "(II)LtI/j;", "minimumValue", "e", "(II)I", "", "f", "(JJ)J", "d", "(FF)F", "maximumValue", "i", "j", "h", "g", "(DD)D", "", "T", "p", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "m", "(III)I", "o", "(JJJ)J", "l", "(FFF)F", "k", "(DDD)D", "LtI/f;", "range", "q", "(Ljava/lang/Comparable;LtI/f;)Ljava/lang/Comparable;", "n", "(ILtI/g;)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* renamed from: tI.p  reason: case insensitive filesystem */
class C17980p extends C17979o {
    public static float d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int n(int i10, C17971g<Integer> gVar) {
        C17542s.j(gVar, "range");
        if (gVar instanceof C17970f) {
            return ((Number) C17978n.q(Integer.valueOf(i10), (C17970f) gVar)).intValue();
        }
        if (!gVar.isEmpty()) {
            return i10 < gVar.i().intValue() ? gVar.i().intValue() : i10 > gVar.m().intValue() ? gVar.m().intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    public static long o(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static <T extends Comparable<? super T>> T p(T t10, T t11, T t12) {
        C17542s.j(t10, "<this>");
        if (t11 == null || t12 == null) {
            return (t11 == null || t10.compareTo(t11) >= 0) ? (t12 == null || t10.compareTo(t12) <= 0) ? t10 : t12 : t11;
        }
        if (t11.compareTo(t12) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
        } else if (t10.compareTo(t11) < 0) {
            return t11;
        } else {
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
    }

    public static <T extends Comparable<? super T>> T q(T t10, C17970f<T> fVar) {
        C17542s.j(t10, "<this>");
        C17542s.j(fVar, "range");
        if (!fVar.isEmpty()) {
            return (!fVar.k(t10, fVar.i()) || fVar.k(fVar.i(), t10)) ? (!fVar.k(fVar.m(), t10) || fVar.k(t10, fVar.m())) ? t10 : fVar.m() : fVar.i();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    public static boolean r(C17971g<Double> gVar, float f10) {
        C17542s.j(gVar, "<this>");
        return gVar.b(Double.valueOf((double) f10));
    }

    public static C17972h s(int i10, int i11) {
        return C17972h.f147327d.a(i10, i11, -1);
    }

    public static int t(C17974j jVar, C17853c cVar) {
        C17542s.j(jVar, "<this>");
        C17542s.j(cVar, Group.RANDOM_POLICY);
        try {
            return C17854d.e(cVar, jVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static C17972h u(C17972h hVar) {
        C17542s.j(hVar, "<this>");
        return C17972h.f147327d.a(hVar.q(), hVar.p(), -hVar.s());
    }

    public static C17972h v(C17972h hVar, int i10) {
        C17542s.j(hVar, "<this>");
        C17979o.a(i10 > 0, Integer.valueOf(i10));
        C17972h.a aVar = C17972h.f147327d;
        int p10 = hVar.p();
        int q10 = hVar.q();
        if (hVar.s() <= 0) {
            i10 = -i10;
        }
        return aVar.a(p10, q10, i10);
    }

    public static C17974j w(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C17974j.f147335e.a() : new C17974j(i10, i11 - 1);
    }
}
