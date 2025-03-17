package L7;

import F7.d;
import Y7.k;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f38359a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f38360b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f38361c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f38362d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f38363e;

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f38364a;

        a(int i10) {
            this.f38364a = i10;
        }

        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f38364a;
            canvas.drawRoundRect(rectF, (float) i10, (float) i10, paint);
        }
    }

    private interface b {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    private static final class c implements Lock {
        c() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public void unlock() {
        }

        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f38362d = hashSet;
        f38363e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f38361c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f38363e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f38359a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f38363e.unlock();
            throw th2;
        }
    }

    public static Bitmap b(d dVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap d10 = dVar.d(i10, i11, j(bitmap));
        p(bitmap, d10);
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return e(dVar, bitmap, i10, i11);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    public static Bitmap e(d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i10) / ((float) bitmap.getWidth()), ((float) i11) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d10 = dVar.d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), j(bitmap));
        p(bitmap, d10);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d10.getWidth() + "x" + d10.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d10, matrix);
        return d10;
    }

    private static Bitmap f(d dVar, Bitmap bitmap) {
        Bitmap.Config g10 = g(bitmap);
        if (g10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d10 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), g10);
        new Canvas(d10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d10;
    }

    private static Bitmap.Config g(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    public static Lock h() {
        return f38363e;
    }

    public static int i(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config j(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void k(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean l(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap m(d dVar, Bitmap bitmap, int i10) {
        if (!l(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        k(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d10 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d10.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap n(d dVar, Bitmap bitmap, int i10) {
        k.a(i10 > 0, "roundingRadius must be greater than 0.");
        return o(dVar, bitmap, new a(i10));
    }

    private static Bitmap o(d dVar, Bitmap bitmap, b bVar) {
        Bitmap.Config g10 = g(bitmap);
        Bitmap f10 = f(dVar, bitmap);
        Bitmap d10 = dVar.d(f10.getWidth(), f10.getHeight(), g10);
        d10.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(f10, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) d10.getWidth(), (float) d10.getHeight());
        Lock lock = f38363e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.a(canvas, paint, rectF);
            d(canvas);
            lock.unlock();
            if (!f10.equals(bitmap)) {
                dVar.c(f10);
            }
            return d10;
        } catch (Throwable th2) {
            f38363e.unlock();
            throw th2;
        }
    }

    public static void p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
