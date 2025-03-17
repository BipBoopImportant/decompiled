package G;

import H2.i;
import N.d;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f6042a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f6043b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f6044c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f6045d = new Rational(9, 16);

    /* renamed from: G.a$a  reason: collision with other inner class name */
    public static final class C0050a implements Comparator<Rational> {

        /* renamed from: a  reason: collision with root package name */
        private final Rational f6046a;

        /* renamed from: b  reason: collision with root package name */
        private final RectF f6047b;

        /* renamed from: c  reason: collision with root package name */
        private final Rational f6048c;

        public C0050a(Rational rational, Rational rational2) {
            this.f6046a = rational;
            this.f6048c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f6047b = d(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF d(Rational rational) {
            return rational.floatValue() == this.f6048c.floatValue() ? new RectF(0.0f, 0.0f, (float) this.f6048c.getNumerator(), (float) this.f6048c.getDenominator()) : rational.floatValue() > this.f6048c.floatValue() ? new RectF(0.0f, 0.0f, (float) this.f6048c.getNumerator(), (((float) rational.getDenominator()) * ((float) this.f6048c.getNumerator())) / ((float) rational.getNumerator())) : new RectF(0.0f, 0.0f, (((float) rational.getNumerator()) * ((float) this.f6048c.getDenominator())) / ((float) rational.getDenominator()), (float) this.f6048c.getDenominator());
        }

        private boolean e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF d10 = d(rational);
            RectF d11 = d(rational2);
            boolean e10 = e(d10, this.f6047b);
            boolean e11 = e(d11, this.f6047b);
            if (e10 && e11) {
                return (int) Math.signum(b(d10) - b(d11));
            }
            if (e10) {
                return -1;
            }
            if (e11) {
                return 1;
            }
            return -((int) Math.signum(c(d10, this.f6047b) - c(d11, this.f6047b)));
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, d.f9159c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (d.c(size) >= d.c(size2)) {
            return c(size, rational);
        }
        return false;
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + -16), width, rational) || d(Math.max(0, width + -16), height, rational2);
        }
        if (i10 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    private static boolean d(int i10, int i11, Rational rational) {
        i.a(i11 % 16 == 0);
        double numerator = ((double) (i10 * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i11 + -16)) && numerator < ((double) (i11 + 16));
    }
}
