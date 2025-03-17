package Cd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.C5747v0;
import p1.C5751x0;
import u2.C6012a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LCd/a;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "sourceImage", "b", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "", "drawableResId", "", "cornerRadius", "borderColor", "borderWidth", "padding", "a", "(Landroid/content/Context;IFIFI)Landroid/graphics/Bitmap;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58971a = new a();

    private a() {
    }

    public static /* synthetic */ Bitmap c(a aVar, Context context, int i10, float f10, int i11, float f11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f10 = 16.0f;
        }
        float f12 = f10;
        if ((i13 & 8) != 0) {
            i11 = C5751x0.k(Id.a.f61029a.a());
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            f11 = 4.0f;
        }
        float f13 = f11;
        if ((i13 & 32) != 0) {
            i12 = 24;
        }
        return aVar.a(context, i10, f12, i14, f13, i12);
    }

    public final Bitmap a(Context context, int i10, float f10, int i11, float f11, int i12) {
        C17542s.j(context, "context");
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
        C17542s.i(createBitmap, "createBitmap(...)");
        Drawable e10 = C6012a.e(context, i10);
        if (e10 == null) {
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(e10.getIntrinsicWidth(), e10.getIntrinsicHeight(), config);
        C17542s.i(createBitmap2, "createBitmap(...)");
        int i13 = (int) f11;
        Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2.getWidth() + i12 + i13, createBitmap2.getHeight() + i12 + i13, config);
        C17542s.i(createBitmap3, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap3);
        Paint paint = new Paint();
        C5747v0.a aVar = C5747v0.f27350b;
        paint.setColor(C5751x0.k(aVar.j()));
        paint.setAntiAlias(true);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawColor(C5751x0.k(aVar.j()));
        int i14 = i13 + i12;
        e10.setBounds(i14, i14, canvas2.getWidth(), canvas2.getHeight());
        e10.draw(canvas2);
        int i15 = (int) (f11 / ((float) 2));
        Rect rect = new Rect(i15, i15, createBitmap2.getWidth() + i12, createBitmap2.getHeight() + i12);
        RectF rectF = new RectF(rect);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap2, rect, rect, paint);
        paint.setXfermode((Xfermode) null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i11);
        paint.setStrokeWidth(f11);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        return createBitmap3;
    }

    public final Bitmap b(Bitmap bitmap) {
        C17542s.j(bitmap, "sourceImage");
        Bitmap createBitmap = Bitmap.createBitmap(110, 110, Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(C5751x0.k(Id.a.f61029a.a()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        canvas.drawRoundRect(new RectF(new Rect(5, 5, 105, 105)), 10.0f, 10.0f, paint);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setShader(bitmapShader);
        Rect rect = new Rect(5, 5, 105, 105);
        Path path = new Path();
        path.addRoundRect(new RectF(rect), 10.0f, 10.0f, Path.Direction.CCW);
        canvas.drawPath(path, paint2);
        return createBitmap;
    }
}
