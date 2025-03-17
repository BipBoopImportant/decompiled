package com.google.android.material.imageview;

import Ea.C9077k;
import Ua.C9286g;
import Ua.k;
import Ua.l;
import Ua.n;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import j.C5443a;

public class ShapeableImageView extends AppCompatImageView implements n {

    /* renamed from: v  reason: collision with root package name */
    private static final int f66800v = C9077k.f59588E;

    /* renamed from: d  reason: collision with root package name */
    private final l f66801d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final RectF f66802e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f66803f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f66804g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f66805h;

    /* renamed from: i  reason: collision with root package name */
    private final Path f66806i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f66807j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C9286g f66808k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public k f66809l;

    /* renamed from: m  reason: collision with root package name */
    private float f66810m;

    /* renamed from: n  reason: collision with root package name */
    private Path f66811n;

    /* renamed from: o  reason: collision with root package name */
    private int f66812o;

    /* renamed from: p  reason: collision with root package name */
    private int f66813p;

    /* renamed from: q  reason: collision with root package name */
    private int f66814q;

    /* renamed from: r  reason: collision with root package name */
    private int f66815r;

    /* renamed from: s  reason: collision with root package name */
    private int f66816s;

    /* renamed from: t  reason: collision with root package name */
    private int f66817t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f66818u;

    @TargetApi(21)
    class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f66819a = new Rect();

        a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f66809l != null) {
                if (ShapeableImageView.this.f66808k == null) {
                    C9286g unused = ShapeableImageView.this.f66808k = new C9286g(ShapeableImageView.this.f66809l);
                }
                ShapeableImageView.this.f66802e.round(this.f66819a);
                ShapeableImageView.this.f66808k.setBounds(this.f66819a);
                ShapeableImageView.this.f66808k.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(Canvas canvas) {
        if (this.f66807j != null) {
            this.f66804g.setStrokeWidth(this.f66810m);
            int colorForState = this.f66807j.getColorForState(getDrawableState(), this.f66807j.getDefaultColor());
            if (this.f66810m > 0.0f && colorForState != 0) {
                this.f66804g.setColor(colorForState);
                canvas.drawPath(this.f66806i, this.f66804g);
            }
        }
    }

    private boolean h() {
        return (this.f66816s == Integer.MIN_VALUE && this.f66817t == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(int i10, int i11) {
        this.f66802e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i10 - getPaddingRight()), (float) (i11 - getPaddingBottom()));
        this.f66801d.e(this.f66809l, 1.0f, this.f66802e, this.f66806i);
        this.f66811n.rewind();
        this.f66811n.addPath(this.f66806i);
        this.f66803f.set(0.0f, 0.0f, (float) i10, (float) i11);
        this.f66811n.addRect(this.f66803f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f66815r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f66817t;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f66812o : this.f66814q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f66817t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f66816s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f66812o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f66816s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f66817t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f66814q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f66816s;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f66814q : this.f66812o;
    }

    public int getContentPaddingTop() {
        return this.f66813p;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public k getShapeAppearanceModel() {
        return this.f66809l;
    }

    public ColorStateList getStrokeColor() {
        return this.f66807j;
    }

    public float getStrokeWidth() {
        return this.f66810m;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f66811n, this.f66805h);
        g(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f66818u && isLayoutDirectionResolved()) {
            this.f66818u = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f66809l = kVar;
        C9286g gVar = this.f66808k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f66807j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(C5443a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f66810m != f10) {
            this.f66810m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f66800v
            android.content.Context r7 = Xa.C9359a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            Ua.l r7 = Ua.l.k()
            r6.f66801d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f66806i = r7
            r7 = 0
            r6.f66818u = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f66805h = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f66802e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f66803f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f66811n = r2
            int[] r2 = Ea.C9078l.f59646C6
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = Ea.C9078l.f59734K6
            android.content.res.ColorStateList r4 = Ra.c.a(r1, r2, r4)
            r6.f66807j = r4
            int r4 = Ea.C9078l.f59745L6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f66810m = r4
            int r4 = Ea.C9078l.f59657D6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f66812o = r7
            r6.f66813p = r7
            r6.f66814q = r7
            r6.f66815r = r7
            int r4 = Ea.C9078l.f59690G6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f66812o = r4
            int r4 = Ea.C9078l.f59723J6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f66813p = r4
            int r4 = Ea.C9078l.f59701H6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f66814q = r4
            int r4 = Ea.C9078l.f59668E6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f66815r = r7
            int r7 = Ea.C9078l.f59712I6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f66816s = r7
            int r7 = Ea.C9078l.f59679F6
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f66817t = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f66804g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            Ua.k$b r7 = Ua.k.e(r1, r8, r9, r0)
            Ua.k r7 = r7.m()
            r6.f66809l = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
