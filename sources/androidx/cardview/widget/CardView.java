package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import i0.C5431a;
import i0.C5432b;
import i0.C5433c;
import i0.C5434d;

public class CardView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f17249h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    private static final c f17250i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17251a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17252b;

    /* renamed from: c  reason: collision with root package name */
    int f17253c;

    /* renamed from: d  reason: collision with root package name */
    int f17254d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f17255e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f17256f;

    /* renamed from: g  reason: collision with root package name */
    private final b f17257g;

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f17258a;

        a() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f17256f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f17255e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        public void b(Drawable drawable) {
            this.f17258a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable d() {
            return this.f17258a;
        }

        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        public View f() {
            return CardView.this;
        }
    }

    static {
        a aVar = new a();
        f17250i = aVar;
        aVar.l();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5431a.f24275a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f17255e.set(i10, i11, i12, i13);
        f17250i.k(this.f17257g);
    }

    public ColorStateList getCardBackgroundColor() {
        return f17250i.e(this.f17257g);
    }

    public float getCardElevation() {
        return f17250i.i(this.f17257g);
    }

    public int getContentPaddingBottom() {
        return this.f17255e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f17255e.left;
    }

    public int getContentPaddingRight() {
        return this.f17255e.right;
    }

    public int getContentPaddingTop() {
        return this.f17255e.top;
    }

    public float getMaxCardElevation() {
        return f17250i.d(this.f17257g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f17252b;
    }

    public float getRadius() {
        return f17250i.b(this.f17257g);
    }

    public boolean getUseCompatPadding() {
        return this.f17251a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        c cVar = f17250i;
        if (!(cVar instanceof a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.m(this.f17257g)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.f(this.f17257g)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f17250i.n(this.f17257g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f17250i.c(this.f17257g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f17250i.o(this.f17257g, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f17254d = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f17253c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f17252b) {
            this.f17252b = z10;
            f17250i.g(this.f17257g);
        }
    }

    public void setRadius(float f10) {
        f17250i.a(this.f17257g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f17251a != z10) {
            this.f17251a = z10;
            f17250i.j(this.f17257g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f17255e = rect;
        this.f17256f = new Rect();
        a aVar = new a();
        this.f17257g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5434d.f24279a, i10, C5433c.f24278a);
        if (obtainStyledAttributes.hasValue(C5434d.f24282d)) {
            valueOf = obtainStyledAttributes.getColorStateList(C5434d.f24282d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f17249h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(C5432b.f24277b);
            } else {
                i11 = getResources().getColor(C5432b.f24276a);
            }
            valueOf = ColorStateList.valueOf(i11);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C5434d.f24283e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C5434d.f24284f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C5434d.f24285g, 0.0f);
        this.f17251a = obtainStyledAttributes.getBoolean(C5434d.f24287i, false);
        this.f17252b = obtainStyledAttributes.getBoolean(C5434d.f24286h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24288j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24290l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24292n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24291m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24289k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f17253c = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24280b, 0);
        this.f17254d = obtainStyledAttributes.getDimensionPixelSize(C5434d.f24281c, 0);
        obtainStyledAttributes.recycle();
        f17250i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f17250i.n(this.f17257g, colorStateList);
    }
}
