package mb;

import java.math.RoundingMode;
import jb.l;

/* renamed from: mb.a  reason: case insensitive filesystem */
public final class C10030a {

    /* renamed from: a  reason: collision with root package name */
    private static final double f75323a = Math.log(2.0d);

    /* renamed from: b  reason: collision with root package name */
    static final double[] f75324b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: mb.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C1372a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f75325a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75325a = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x0054 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f75325a     // Catch:{ NoSuchFieldError -> 0x0060 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mb.C10030a.C1372a.<clinit>():void");
        }
    }

    public static boolean a(double d10, double d11, double d12) {
        C10034e.d("tolerance", d12);
        return Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11 || (Double.isNaN(d10) && Double.isNaN(d11));
    }

    public static boolean b(double d10) {
        return C10031b.b(d10) && (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(C10031b.a(d10)) <= Math.getExponent(d10));
    }

    public static boolean c(double d10) {
        if (d10 <= 0.0d || !C10031b.b(d10)) {
            return false;
        }
        long a10 = C10031b.a(d10);
        return (a10 & (a10 - 1)) == 0;
    }

    public static int d(double d10, RoundingMode roundingMode) {
        boolean c10;
        boolean z10 = false;
        l.e(d10 > 0.0d && C10031b.b(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (!C10031b.c(d10)) {
            return d(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C1372a.f75325a[roundingMode.ordinal()]) {
            case 1:
                C10034e.f(c(d10));
                break;
            case 2:
                break;
            case 3:
                z10 = !c(d10);
                break;
            case 4:
                if (exponent < 0) {
                    z10 = true;
                }
                c10 = c(d10);
                break;
            case 5:
                if (exponent >= 0) {
                    z10 = true;
                }
                c10 = c(d10);
                break;
            case 6:
            case 7:
            case 8:
                double d11 = C10031b.d(d10);
                if (d11 * d11 > 2.0d) {
                    z10 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        z10 &= !c10;
        return z10 ? exponent + 1 : exponent;
    }

    static double e(double d10, RoundingMode roundingMode) {
        if (C10031b.b(d10)) {
            switch (C1372a.f75325a[roundingMode.ordinal()]) {
                case 1:
                    C10034e.f(b(d10));
                    return d10;
                case 2:
                    return (d10 >= 0.0d || b(d10)) ? d10 : (double) (((long) d10) - 1);
                case 3:
                    return (d10 <= 0.0d || b(d10)) ? d10 : (double) (((long) d10) + 1);
                case 4:
                    return d10;
                case 5:
                    if (b(d10)) {
                        return d10;
                    }
                    return (double) (((long) d10) + ((long) (d10 > 0.0d ? 1 : -1)));
                case 6:
                    return Math.rint(d10);
                case 7:
                    double rint = Math.rint(d10);
                    return Math.abs(d10 - rint) == 0.5d ? d10 + Math.copySign(0.5d, d10) : rint;
                case 8:
                    double rint2 = Math.rint(d10);
                    return Math.abs(d10 - rint2) == 0.5d ? d10 : rint2;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException("input is infinite or NaN");
        }
    }

    public static long f(double d10, RoundingMode roundingMode) {
        double e10 = e(d10, roundingMode);
        boolean z10 = false;
        boolean z11 = -9.223372036854776E18d - e10 < 1.0d;
        if (e10 < 9.223372036854776E18d) {
            z10 = true;
        }
        C10034e.a(z11 & z10, d10, roundingMode);
        return (long) e10;
    }
}
