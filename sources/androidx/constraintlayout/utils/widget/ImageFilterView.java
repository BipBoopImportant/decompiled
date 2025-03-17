package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.f;
import j.C5443a;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    private c f20119d = new c();

    /* renamed from: e  reason: collision with root package name */
    private boolean f20120e = true;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f20121f = null;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f20122g = null;

    /* renamed from: h  reason: collision with root package name */
    private float f20123h = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public float f20124i = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public float f20125j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private Path f20126k;

    /* renamed from: l  reason: collision with root package name */
    ViewOutlineProvider f20127l;

    /* renamed from: m  reason: collision with root package name */
    RectF f20128m;

    /* renamed from: n  reason: collision with root package name */
    Drawable[] f20129n = new Drawable[2];

    /* renamed from: o  reason: collision with root package name */
    LayerDrawable f20130o;

    /* renamed from: p  reason: collision with root package name */
    float f20131p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    float f20132q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    float f20133r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    float f20134s = Float.NaN;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f20124i) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f20125j);
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        float[] f20137a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        ColorMatrix f20138b = new ColorMatrix();

        /* renamed from: c  reason: collision with root package name */
        ColorMatrix f20139c = new ColorMatrix();

        /* renamed from: d  reason: collision with root package name */
        float f20140d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        float f20141e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        float f20142f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        float f20143g = 1.0f;

        c() {
        }

        private void a(float f10) {
            float[] fArr = this.f20137a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f20137a;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f10) {
            float f11;
            float f12;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f13 = (5000.0f / f10) / 100.0f;
            if (f13 > 66.0f) {
                double d10 = (double) (f13 - 60.0f);
                f12 = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                f11 = ((float) Math.pow(d10, 0.07551485300064087d)) * 288.12216f;
            } else {
                f11 = (((float) Math.log((double) f13)) * 99.4708f) - 161.11957f;
                f12 = 255.0f;
            }
            float log = f13 < 66.0f ? f13 > 19.0f ? (((float) Math.log((double) (f13 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f12, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f11, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f20137a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public void c(ImageView imageView) {
            boolean z10;
            this.f20138b.reset();
            float f10 = this.f20141e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f20138b.set(this.f20137a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f20142f;
            if (f11 != 1.0f) {
                this.f20139c.setScale(f11, f11, f11, 1.0f);
                this.f20138b.postConcat(this.f20139c);
                z10 = true;
            }
            float f12 = this.f20143g;
            if (f12 != 1.0f) {
                d(f12);
                this.f20139c.set(this.f20137a);
                this.f20138b.postConcat(this.f20139c);
                z10 = true;
            }
            float f13 = this.f20140d;
            if (f13 != 1.0f) {
                a(f13);
                this.f20139c.set(this.f20137a);
                this.f20138b.postConcat(this.f20139c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f20138b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20596S4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f20121f = obtainStyledAttributes.getDrawable(f.f20604T4);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20628W4) {
                    this.f20123h = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == f.f20706f5) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.f20697e5) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.f20620V4) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.f20612U4) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.f20679c5) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.f20688d5) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.f20670b5) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f20120e));
                } else if (index == f.f20636X4) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f20131p));
                } else if (index == f.f20644Y4) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f20132q));
                } else if (index == f.f20652Z4) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f20134s));
                } else if (index == f.f20661a5) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f20133r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f20122g = drawable;
            if (this.f20121f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f20122g = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f20129n;
                    Drawable mutate = drawable2.mutate();
                    this.f20122g = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f20129n;
            Drawable mutate2 = getDrawable().mutate();
            this.f20122g = mutate2;
            drawableArr2[0] = mutate2;
            this.f20129n[1] = this.f20121f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f20129n);
            this.f20130o = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f20123h * 255.0f));
            if (!this.f20120e) {
                this.f20130o.getDrawable(0).setAlpha((int) ((1.0f - this.f20123h) * 255.0f));
            }
            super.setImageDrawable(this.f20130o);
        }
    }

    private void f() {
        if (!Float.isNaN(this.f20131p) || !Float.isNaN(this.f20132q) || !Float.isNaN(this.f20133r) || !Float.isNaN(this.f20134s)) {
            float f10 = 0.0f;
            float f11 = Float.isNaN(this.f20131p) ? 0.0f : this.f20131p;
            float f12 = Float.isNaN(this.f20132q) ? 0.0f : this.f20132q;
            float f13 = Float.isNaN(this.f20133r) ? 1.0f : this.f20133r;
            if (!Float.isNaN(this.f20134s)) {
                f10 = this.f20134s;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f14 = f13 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
            matrix.postScale(f14, f14);
            float f15 = intrinsicWidth * f14;
            float f16 = f14 * intrinsicHeight;
            matrix.postTranslate((((f11 * (width - f15)) + width) - f15) * 0.5f, (((f12 * (height - f16)) + height) - f16) * 0.5f);
            matrix.postRotate(f10, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    private void g() {
        if (!Float.isNaN(this.f20131p) || !Float.isNaN(this.f20132q) || !Float.isNaN(this.f20133r) || !Float.isNaN(this.f20134s)) {
            f();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void setOverlay(boolean z10) {
        this.f20120e = z10;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f20119d.f20140d;
    }

    public float getContrast() {
        return this.f20119d.f20142f;
    }

    public float getCrossfade() {
        return this.f20123h;
    }

    public float getImagePanX() {
        return this.f20131p;
    }

    public float getImagePanY() {
        return this.f20132q;
    }

    public float getImageRotate() {
        return this.f20134s;
    }

    public float getImageZoom() {
        return this.f20133r;
    }

    public float getRound() {
        return this.f20125j;
    }

    public float getRoundPercent() {
        return this.f20124i;
    }

    public float getSaturation() {
        return this.f20119d.f20141e;
    }

    public float getWarmth() {
        return this.f20119d.f20143g;
    }

    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        f();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        this.f20121f = mutate;
        Drawable[] drawableArr = this.f20129n;
        drawableArr[0] = this.f20122g;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f20129n);
        this.f20130o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f20123h);
    }

    public void setAltImageResource(int i10) {
        Drawable b10 = C5443a.b(getContext(), i10);
        this.f20121f = b10;
        setAltImageDrawable(b10);
    }

    public void setBrightness(float f10) {
        c cVar = this.f20119d;
        cVar.f20140d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f20119d;
        cVar.f20142f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f20123h = f10;
        if (this.f20129n != null) {
            if (!this.f20120e) {
                this.f20130o.getDrawable(0).setAlpha((int) ((1.0f - this.f20123h) * 255.0f));
            }
            this.f20130o.getDrawable(1).setAlpha((int) (this.f20123h * 255.0f));
            super.setImageDrawable(this.f20130o);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f20121f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f20122g = mutate;
        Drawable[] drawableArr = this.f20129n;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f20121f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f20129n);
        this.f20130o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f20123h);
    }

    public void setImagePanX(float f10) {
        this.f20131p = f10;
        g();
    }

    public void setImagePanY(float f10) {
        this.f20132q = f10;
        g();
    }

    public void setImageResource(int i10) {
        if (this.f20121f != null) {
            Drawable mutate = C5443a.b(getContext(), i10).mutate();
            this.f20122g = mutate;
            Drawable[] drawableArr = this.f20129n;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f20121f;
            LayerDrawable layerDrawable = new LayerDrawable(this.f20129n);
            this.f20130o = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f20123h);
            return;
        }
        super.setImageResource(i10);
    }

    public void setImageRotate(float f10) {
        this.f20134s = f10;
        g();
    }

    public void setImageZoom(float f10) {
        this.f20133r = f10;
        g();
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f20125j = f10;
            float f11 = this.f20124i;
            this.f20124i = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f20125j != f10;
        this.f20125j = f10;
        if (f10 != 0.0f) {
            if (this.f20126k == null) {
                this.f20126k = new Path();
            }
            if (this.f20128m == null) {
                this.f20128m = new RectF();
            }
            if (this.f20127l == null) {
                b bVar = new b();
                this.f20127l = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f20128m.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f20126k.reset();
            Path path = this.f20126k;
            RectF rectF = this.f20128m;
            float f12 = this.f20125j;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f20124i != f10;
        this.f20124i = f10;
        if (f10 != 0.0f) {
            if (this.f20126k == null) {
                this.f20126k = new Path();
            }
            if (this.f20128m == null) {
                this.f20128m = new RectF();
            }
            if (this.f20127l == null) {
                a aVar = new a();
                this.f20127l = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f20124i) / 2.0f;
            this.f20128m.set(0.0f, 0.0f, (float) width, (float) height);
            this.f20126k.reset();
            this.f20126k.addRoundRect(this.f20128m, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f20119d;
        cVar.f20141e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f20119d;
        cVar.f20143g = f10;
        cVar.c(this);
    }
}
