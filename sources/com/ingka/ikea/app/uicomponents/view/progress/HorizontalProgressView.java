package com.ingka.ikea.app.uicomponents.view.progress;

import XH.C16807N;
import Xo.e;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import ip.i;
import ip.m;
import kl.C11515e;
import kl.f;
import kl.g;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import qI.C17785b;
import tI.C17978n;
import uI.C18064m;

@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001A\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!R+\u0010(\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0019R+\u0010,\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010\u0019R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u00105\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "desiredSize", "measureSpec", "e", "(II)I", "", "value", "offset", "d", "(FF)F", "LXH/N;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "visibility", "setVisibility", "(I)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "<set-?>", "a", "LqI/b;", "getProgressForegroundColor", "()I", "setProgressForegroundColor", "progressForegroundColor", "b", "getProgressBackgroundColor", "setProgressBackgroundColor", "progressBackgroundColor", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "foregroundPaint", "backgroundPaint", "I", "minWidth", "f", "minHeight", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "rect", "Landroid/animation/ValueAnimator;", "h", "Landroid/animation/ValueAnimator;", "animator", "i", "F", "progress", "com/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView$a", "j", "Lcom/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView$a;", "sinEvaluator", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"Recycle"})
public final class HorizontalProgressView extends View {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f92752k;

    /* renamed from: a  reason: collision with root package name */
    private final C17785b f92753a;

    /* renamed from: b  reason: collision with root package name */
    private final C17785b f92754b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f92755c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f92756d;

    /* renamed from: e  reason: collision with root package name */
    private final int f92757e;

    /* renamed from: f  reason: collision with root package name */
    private final int f92758f;

    /* renamed from: g  reason: collision with root package name */
    private final RectF f92759g;

    /* renamed from: h  reason: collision with root package name */
    private ValueAnimator f92760h;

    /* renamed from: i  reason: collision with root package name */
    private float f92761i;

    /* renamed from: j  reason: collision with root package name */
    private final a f92762j;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView$a", "Landroid/animation/FloatEvaluator;", "", "fraction", "", "startValue", "endValue", "kotlin.jvm.PlatformType", "evaluate", "(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends FloatEvaluator {
        a() {
        }

        public Float evaluate(float f10, Number number, Number number2) {
            C17542s.j(number, "startValue");
            C17542s.j(number2, "endValue");
            return super.evaluate((float) Math.sin(((double) f10) * 3.141592653589793d), number, number2);
        }
    }

    static {
        Class<HorizontalProgressView> cls = HorizontalProgressView.class;
        f92752k = new C18064m[]{P.e(new A(cls, "progressForegroundColor", "getProgressForegroundColor()I", 0)), P.e(new A(cls, "progressBackgroundColor", "getProgressBackgroundColor()I", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    private final float d(float f10, float f11) {
        return C17978n.l(f10, i.a(getPaddingStart()) - f11, (((float) getMeasuredWidth()) - i.a(getPaddingEnd())) + f11);
    }

    private final int e(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i10 : size : Math.min(i10, size);
    }

    /* access modifiers changed from: private */
    public static final void f(HorizontalProgressView horizontalProgressView, ValueAnimator valueAnimator) {
        C17542s.j(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        horizontalProgressView.f92761i = ((Float) animatedValue).floatValue();
        horizontalProgressView.invalidate();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(HorizontalProgressView horizontalProgressView, int i10) {
        horizontalProgressView.f92756d.setColor(i10);
        horizontalProgressView.invalidate();
        return C16807N.f139792a;
    }

    private final int getProgressBackgroundColor() {
        return ((Number) this.f92754b.a(this, f92752k[1])).intValue();
    }

    private final int getProgressForegroundColor() {
        return ((Number) this.f92753a.a(this, f92752k[0])).intValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(HorizontalProgressView horizontalProgressView, int i10) {
        horizontalProgressView.f92755c.setColor(i10);
        horizontalProgressView.invalidate();
        return C16807N.f139792a;
    }

    private final void setProgressBackgroundColor(int i10) {
        this.f92754b.b(this, f92752k[1], Integer.valueOf(i10));
    }

    private final void setProgressForegroundColor(int i10) {
        this.f92753a.b(this, f92752k[0], Integer.valueOf(i10));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1250);
        ofFloat.addUpdateListener(new C11515e(this));
        if (getVisibility() == 0) {
            ofFloat.start();
        }
        this.f92760h = ofFloat;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f92760h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllListeners();
            this.f92760h = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        float a10 = i.a(getMeasuredWidth());
        float a11 = i.a(getMeasuredHeight());
        float a12 = i.a(getPaddingTop());
        float paddingBottom = a11 - ((float) getPaddingBottom());
        this.f92759g.set(i.a(getPaddingStart()), a12, a10 - ((float) getPaddingEnd()), paddingBottom);
        canvas.drawRect(this.f92759g, this.f92756d);
        float paddingStart = (a10 - ((float) getPaddingStart())) - ((float) getPaddingEnd());
        float f10 = 0.16666667f * paddingStart;
        Float evaluate = this.f92762j.evaluate(this.f92761i, (Number) Float.valueOf(f10), (Number) Float.valueOf(paddingStart * 0.85f));
        float f11 = this.f92761i * (a10 + (((float) 2) * f10));
        float f12 = (paddingBottom - a12) / 2.0f;
        RectF rectF = this.f92759g;
        C17542s.g(evaluate);
        rectF.set(d((f11 - evaluate.floatValue()) - f10, f12), a12, d(f11 - f10, f12), paddingBottom);
        canvas.drawRoundRect(this.f92759g, f12, f12, this.f92755c);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(e(getPaddingStart() + getPaddingEnd() + Math.max(this.f92757e, getSuggestedMinimumWidth()), i10), e(getPaddingTop() + getPaddingBottom() + Math.max(this.f92758f, getSuggestedMinimumHeight()), i11));
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ValueAnimator valueAnimator = this.f92760h;
        if (valueAnimator == null) {
            return;
        }
        if (i10 == 0) {
            valueAnimator.start();
        } else if (i10 == 4) {
            valueAnimator.end();
        } else if (i10 == 8) {
            valueAnimator.end();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HorizontalProgressView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        this.f92753a = m.a(-16777216, new f(this));
        this.f92754b = m.a(0, new g(this));
        Paint paint = new Paint();
        paint.setColor(getProgressForegroundColor());
        this.f92755c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(getProgressBackgroundColor());
        this.f92756d = paint2;
        this.f92757e = (int) e.a(32);
        this.f92758f = (int) e.a(1);
        this.f92759g = new RectF();
        this.f92762j = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lg.g.f75302a);
            C17542s.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setProgressForegroundColor(obtainStyledAttributes.getColor(lg.g.f75304c, getProgressForegroundColor()));
            setProgressBackgroundColor(obtainStyledAttributes.getColor(lg.g.f75303b, getProgressBackgroundColor()));
            C16807N n10 = C16807N.f139792a;
            obtainStyledAttributes.recycle();
        }
    }
}
