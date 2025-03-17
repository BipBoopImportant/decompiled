package G;

import H2.i;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f6106a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static float a(float f10, float f11, float f12, float f13) {
        float f14 = (f10 * f12) + (f11 * f13);
        float f15 = (f10 * f13) - (f11 * f12);
        double sqrt = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) * Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
        return (float) Math.toDegrees(Math.atan2(((double) f15) / sqrt, ((double) f14) / sqrt));
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f6106a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i10) {
        return e(rectF, rectF2, i10, false);
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f6106a, Matrix.ScaleToFit.FILL);
        matrix.postRotate((float) i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static Size f(Rect rect, int i10) {
        return q(m(rect), i10);
    }

    public static int g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return w((int) Math.round(Math.atan2((double) fArr[3], (double) fArr[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    public static boolean j(Size size, Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean k(Size size, boolean z10, Size size2, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10) {
            f10 = ((float) size.getWidth()) / ((float) size.getHeight());
            f11 = f10;
        } else {
            f10 = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f11 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        if (z11) {
            f12 = ((float) size2.getWidth()) / ((float) size2.getHeight());
            f13 = f12;
        } else {
            float width = (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f);
            f12 = (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f);
            f13 = width;
        }
        return f10 >= f12 && f13 >= f11;
    }

    public static boolean l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String n(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", new Object[]{rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height())});
    }

    public static Size o(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static RectF p(RectF rectF, int i10) {
        boolean z10 = i10 % 90 == 0;
        i.b(z10, "Invalid rotation degrees: " + i10);
        return i(w(i10)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static Size q(Size size, int i10) {
        boolean z10 = i10 % 90 == 0;
        i.b(z10, "Invalid rotation degrees: " + i10);
        return i(w(i10)) ? o(size) : size;
    }

    public static Rect r(Size size) {
        return s(size, 0, 0);
    }

    public static Rect s(Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    public static RectF t(Size size) {
        return u(size, 0, 0);
    }

    public static RectF u(Size size, int i10, int i11) {
        return new RectF((float) i10, (float) i11, (float) (i10 + size.getWidth()), (float) (i11 + size.getHeight()));
    }

    public static Matrix v(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate((float) (-rect.left), (float) (-rect.top));
        return matrix2;
    }

    public static int w(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
