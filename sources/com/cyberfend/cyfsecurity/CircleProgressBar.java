package com.cyberfend.cyfsecurity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import f9.C7864a;

public class CircleProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f47766a = 20.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f47767b = 20.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f47768c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private int f47769d = 100;

    /* renamed from: e  reason: collision with root package name */
    private int f47770e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f47771f = 270;

    /* renamed from: g  reason: collision with root package name */
    private RectF f47772g = new RectF();

    /* renamed from: h  reason: collision with root package name */
    private Paint f47773h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f47774i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f47775j = 0;
    /* access modifiers changed from: package-private */

    /* renamed from: k  reason: collision with root package name */
    public Handler f47776k = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Runnable f47777l = new a();

    class a implements Runnable {
        a() {
        }

        public final void run() {
            if (CircleProgressBar.this.f47775j < 9) {
                CircleProgressBar.b(CircleProgressBar.this);
                CircleProgressBar.c(CircleProgressBar.this);
                CircleProgressBar.this.postInvalidate();
                CircleProgressBar.this.f47776k.postDelayed(CircleProgressBar.this.f47777l, 100);
            }
        }
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f47773h = paint;
        paint.setColor(context.getResources().getColor(C7864a.f51210a));
        Paint paint2 = this.f47773h;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f47774i = paint3;
        paint3.setColor(context.getResources().getColor(C7864a.f51211b));
        this.f47774i.setStyle(style);
        this.f47776k.postDelayed(this.f47777l, 100);
    }

    static /* synthetic */ int b(CircleProgressBar circleProgressBar) {
        int i10 = circleProgressBar.f47775j;
        circleProgressBar.f47775j = i10 + 1;
        return i10;
    }

    static /* synthetic */ float c(CircleProgressBar circleProgressBar) {
        float f10 = circleProgressBar.f47768c;
        circleProgressBar.f47768c = 1.0f + f10;
        return f10;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f47772g, this.f47773h);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f47772g, (float) this.f47771f, (this.f47768c * 360.0f) / ((float) this.f47769d), true, this.f47774i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        setMeasuredDimension(min, min);
        RectF rectF = this.f47772g;
        float f10 = this.f47767b;
        float f11 = (float) min;
        rectF.set((f10 / 2.0f) + 0.0f, (f10 / 2.0f) + 0.0f, f11 - (f10 / 2.0f), f11 - (f10 / 2.0f));
    }

    public synchronized void setProgress(float f10) {
        this.f47768c = f10 * ((float) this.f47769d);
        this.f47775j = 0;
        this.f47776k.postDelayed(this.f47777l, 100);
        postInvalidate();
    }

    public void setProgressBarColor(int i10) {
        this.f47774i.setColor(i10);
        this.f47773h.setColor(Color.argb(Math.round(((float) Color.alpha(i10)) * 0.25f), Color.red(i10), Color.green(i10), Color.blue(i10)));
    }
}
