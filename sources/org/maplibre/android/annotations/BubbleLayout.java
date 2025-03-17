package org.maplibre.android.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import org.maplibre.android.m;

@Deprecated
public class BubbleLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f145451a;

    /* renamed from: b  reason: collision with root package name */
    private float f145452b;

    /* renamed from: c  reason: collision with root package name */
    private float f145453c;

    /* renamed from: d  reason: collision with root package name */
    private float f145454d;

    /* renamed from: e  reason: collision with root package name */
    private float f145455e;

    /* renamed from: f  reason: collision with root package name */
    private b f145456f;

    /* renamed from: g  reason: collision with root package name */
    private int f145457g;

    /* renamed from: h  reason: collision with root package name */
    private float f145458h;

    /* renamed from: i  reason: collision with root package name */
    private int f145459i;

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static float a(float f10, Context context) {
        return f10 * ((float) (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    private void b(int i10, int i11, int i12, int i13) {
        if (i11 >= i10 && i13 >= i12) {
            this.f145456f = new b(new RectF((float) i10, (float) i12, (float) i11, (float) i13), this.f145451a, this.f145452b, this.f145453c, this.f145454d, this.f145455e, this.f145457g, this.f145458h, this.f145459i);
        }
    }

    private void c() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a10 = this.f145451a.a();
        if (a10 == 0) {
            paddingLeft = (int) (((float) paddingLeft) + this.f145452b);
        } else if (a10 == 1) {
            paddingRight = (int) (((float) paddingRight) + this.f145452b);
        } else if (a10 == 2) {
            paddingTop = (int) (((float) paddingTop) + this.f145453c);
        } else if (a10 == 3) {
            paddingBottom = (int) (((float) paddingBottom) + this.f145453c);
        }
        float f10 = this.f145458h;
        if (f10 > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) + f10);
            paddingRight = (int) (((float) paddingRight) + f10);
            paddingTop = (int) (((float) paddingTop) + f10);
            paddingBottom = (int) (((float) paddingBottom) + f10);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private void d() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a10 = this.f145451a.a();
        if (a10 == 0) {
            paddingLeft = (int) (((float) paddingLeft) - this.f145452b);
        } else if (a10 == 1) {
            paddingRight = (int) (((float) paddingRight) - this.f145452b);
        } else if (a10 == 2) {
            paddingTop = (int) (((float) paddingTop) - this.f145453c);
        } else if (a10 == 3) {
            paddingBottom = (int) (((float) paddingBottom) - this.f145453c);
        }
        float f10 = this.f145458h;
        if (f10 > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) - f10);
            paddingRight = (int) (((float) paddingRight) - f10);
            paddingTop = (int) (((float) paddingTop) - f10);
            paddingBottom = (int) (((float) paddingBottom) - f10);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        b bVar = this.f145456f;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public BubbleLayout e(float f10) {
        d();
        this.f145454d = f10;
        c();
        return this;
    }

    public a getArrowDirection() {
        return this.f145451a;
    }

    public float getArrowHeight() {
        return this.f145453c;
    }

    public float getArrowPosition() {
        return this.f145454d;
    }

    public float getArrowWidth() {
        return this.f145452b;
    }

    public int getBubbleColor() {
        return this.f145457g;
    }

    public float getCornersRadius() {
        return this.f145455e;
    }

    public int getStrokeColor() {
        return this.f145459i;
    }

    public float getStrokeWidth() {
        return this.f145458h;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b(0, getWidth(), 0, getHeight());
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.f145670i);
        this.f145451a = new a(obtainStyledAttributes.getInt(m.f145672j, 0));
        this.f145452b = obtainStyledAttributes.getDimension(m.f145678m, a(8.0f, context));
        this.f145453c = obtainStyledAttributes.getDimension(m.f145674k, a(8.0f, context));
        this.f145454d = obtainStyledAttributes.getDimension(m.f145676l, a(12.0f, context));
        this.f145455e = obtainStyledAttributes.getDimension(m.f145682o, 0.0f);
        this.f145457g = obtainStyledAttributes.getColor(m.f145680n, -1);
        this.f145458h = obtainStyledAttributes.getDimension(m.f145686q, -1.0f);
        this.f145459i = obtainStyledAttributes.getColor(m.f145684p, -7829368);
        obtainStyledAttributes.recycle();
        c();
    }
}
