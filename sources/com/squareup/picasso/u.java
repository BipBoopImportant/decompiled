package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.t;

final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    private static final Paint f122625h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f122626a;

    /* renamed from: b  reason: collision with root package name */
    private final float f122627b;

    /* renamed from: c  reason: collision with root package name */
    private final t.e f122628c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f122629d;

    /* renamed from: e  reason: collision with root package name */
    long f122630e;

    /* renamed from: f  reason: collision with root package name */
    boolean f122631f;

    /* renamed from: g  reason: collision with root package name */
    int f122632g = 255;

    u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f122626a = z11;
        this.f122627b = context.getResources().getDisplayMetrics().density;
        this.f122628c = eVar;
        if (eVar != t.e.MEMORY && !z10) {
            this.f122629d = drawable;
            this.f122631f = true;
            this.f122630e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = f122625h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f122627b * 16.0f)), paint);
        paint.setColor(this.f122628c.debugColor);
        canvas.drawPath(b(0, 0, (int) (this.f122627b * 15.0f)), paint);
    }

    private static Path b(int i10, int i11, int i12) {
        Path path = new Path();
        float f10 = (float) i10;
        float f11 = (float) i11;
        path.moveTo(f10, f11);
        path.lineTo((float) (i10 + i12), f11);
        path.lineTo(f10, (float) (i11 + i12));
        return path;
    }

    static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z10, z11));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f122631f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f122630e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f122631f = false;
                this.f122629d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f122629d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f122632g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f122632g);
            }
        }
        if (this.f122626a) {
            a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f122629d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i10) {
        this.f122632g = i10;
        Drawable drawable = this.f122629d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f122629d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
