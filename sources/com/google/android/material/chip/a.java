package com.google.android.material.chip;

import Ea.C9078l;
import Fa.C9088h;
import Ia.C9122a;
import La.C9138a;
import Ra.c;
import Sa.C9270b;
import Ua.C9286g;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import com.google.android.material.internal.v;
import j.C5443a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x2.C6244c;
import y2.C6260a;

public class a extends C9286g implements Drawable.Callback, q.b {

    /* renamed from: j1  reason: collision with root package name */
    private static final int[] f66413j1 = {16842910};

    /* renamed from: k1  reason: collision with root package name */
    private static final ShapeDrawable f66414k1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f66415A;

    /* renamed from: A0  reason: collision with root package name */
    private float f66416A0;

    /* renamed from: B  reason: collision with root package name */
    private float f66417B;

    /* renamed from: B0  reason: collision with root package name */
    private float f66418B0;

    /* renamed from: C  reason: collision with root package name */
    private float f66419C = -1.0f;

    /* renamed from: C0  reason: collision with root package name */
    private float f66420C0;

    /* renamed from: D  reason: collision with root package name */
    private ColorStateList f66421D;

    /* renamed from: D0  reason: collision with root package name */
    private float f66422D0;

    /* renamed from: E  reason: collision with root package name */
    private float f66423E;

    /* renamed from: E0  reason: collision with root package name */
    private float f66424E0;

    /* renamed from: F  reason: collision with root package name */
    private ColorStateList f66425F;

    /* renamed from: F0  reason: collision with root package name */
    private float f66426F0;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f66427G;

    /* renamed from: G0  reason: collision with root package name */
    private final Context f66428G0;

    /* renamed from: H  reason: collision with root package name */
    private boolean f66429H;

    /* renamed from: H0  reason: collision with root package name */
    private final Paint f66430H0 = new Paint(1);

    /* renamed from: I  reason: collision with root package name */
    private Drawable f66431I;

    /* renamed from: I0  reason: collision with root package name */
    private final Paint f66432I0;

    /* renamed from: J  reason: collision with root package name */
    private ColorStateList f66433J;

    /* renamed from: J0  reason: collision with root package name */
    private final Paint.FontMetrics f66434J0 = new Paint.FontMetrics();

    /* renamed from: K  reason: collision with root package name */
    private float f66435K;

    /* renamed from: K0  reason: collision with root package name */
    private final RectF f66436K0 = new RectF();

    /* renamed from: L  reason: collision with root package name */
    private boolean f66437L;

    /* renamed from: L0  reason: collision with root package name */
    private final PointF f66438L0 = new PointF();

    /* renamed from: M  reason: collision with root package name */
    private boolean f66439M;

    /* renamed from: M0  reason: collision with root package name */
    private final Path f66440M0 = new Path();

    /* renamed from: N  reason: collision with root package name */
    private Drawable f66441N;

    /* renamed from: N0  reason: collision with root package name */
    private final q f66442N0;

    /* renamed from: O  reason: collision with root package name */
    private Drawable f66443O;

    /* renamed from: O0  reason: collision with root package name */
    private int f66444O0;

    /* renamed from: P  reason: collision with root package name */
    private ColorStateList f66445P;

    /* renamed from: P0  reason: collision with root package name */
    private int f66446P0;

    /* renamed from: Q  reason: collision with root package name */
    private float f66447Q;

    /* renamed from: Q0  reason: collision with root package name */
    private int f66448Q0;

    /* renamed from: R  reason: collision with root package name */
    private CharSequence f66449R;

    /* renamed from: R0  reason: collision with root package name */
    private int f66450R0;

    /* renamed from: S  reason: collision with root package name */
    private boolean f66451S;

    /* renamed from: S0  reason: collision with root package name */
    private int f66452S0;

    /* renamed from: T  reason: collision with root package name */
    private boolean f66453T;

    /* renamed from: T0  reason: collision with root package name */
    private int f66454T0;

    /* renamed from: U  reason: collision with root package name */
    private Drawable f66455U;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f66456U0;

    /* renamed from: V0  reason: collision with root package name */
    private int f66457V0;

    /* renamed from: W0  reason: collision with root package name */
    private int f66458W0 = 255;

    /* renamed from: X  reason: collision with root package name */
    private ColorStateList f66459X;

    /* renamed from: X0  reason: collision with root package name */
    private ColorFilter f66460X0;

    /* renamed from: Y  reason: collision with root package name */
    private C9088h f66461Y;

    /* renamed from: Y0  reason: collision with root package name */
    private PorterDuffColorFilter f66462Y0;

    /* renamed from: Z  reason: collision with root package name */
    private C9088h f66463Z;

    /* renamed from: Z0  reason: collision with root package name */
    private ColorStateList f66464Z0;

    /* renamed from: a1  reason: collision with root package name */
    private PorterDuff.Mode f66465a1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: b1  reason: collision with root package name */
    private int[] f66466b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f66467c1;

    /* renamed from: d1  reason: collision with root package name */
    private ColorStateList f66468d1;

    /* renamed from: e1  reason: collision with root package name */
    private WeakReference<C1162a> f66469e1 = new WeakReference<>((Object) null);

    /* renamed from: f1  reason: collision with root package name */
    private TextUtils.TruncateAt f66470f1;

    /* renamed from: g1  reason: collision with root package name */
    private boolean f66471g1;

    /* renamed from: h1  reason: collision with root package name */
    private int f66472h1;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f66473i1;

    /* renamed from: y0  reason: collision with root package name */
    private float f66474y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f66475z;

    /* renamed from: z0  reason: collision with root package name */
    private float f66476z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C1162a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Q(context);
        this.f66428G0 = context;
        q qVar = new q(this);
        this.f66442N0 = qVar;
        this.f66427G = "";
        qVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f66432I0 = null;
        int[] iArr = f66413j1;
        setState(iArr);
        p2(iArr);
        this.f66471g1 = true;
        if (C9270b.f63247a) {
            f66414k1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (R2()) {
            p0(rect, this.f66436K0);
            RectF rectF = this.f66436K0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f66455U.setBounds(0, 0, (int) this.f66436K0.width(), (int) this.f66436K0.height());
            this.f66455U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean A1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f66475z;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f66444O0) : 0);
        boolean z11 = true;
        if (this.f66444O0 != l10) {
            this.f66444O0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f66415A;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f66446P0) : 0);
        if (this.f66446P0 != l11) {
            this.f66446P0 = l11;
            onStateChange = true;
        }
        int i10 = C9138a.i(l10, l11);
        if ((this.f66448Q0 != i10) || (x() == null)) {
            this.f66448Q0 = i10;
            b0(ColorStateList.valueOf(i10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f66421D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f66450R0) : 0;
        if (this.f66450R0 != colorForState) {
            this.f66450R0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f66468d1 == null || !C9270b.e(iArr)) ? 0 : this.f66468d1.getColorForState(iArr, this.f66452S0);
        if (this.f66452S0 != colorForState2) {
            this.f66452S0 = colorForState2;
            if (this.f66467c1) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f66442N0.e() == null || this.f66442N0.e().i() == null) ? 0 : this.f66442N0.e().i().getColorForState(iArr, this.f66454T0);
        if (this.f66454T0 != colorForState3) {
            this.f66454T0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = r1(getState(), 16842912) && this.f66451S;
        if (this.f66456U0 == z12 || this.f66455U == null) {
            z10 = false;
        } else {
            float q02 = q0();
            this.f66456U0 = z12;
            if (q02 != q0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f66464Z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f66457V0) : 0;
        if (this.f66457V0 != colorForState4) {
            this.f66457V0 = colorForState4;
            this.f66462Y0 = d.l(this, this.f66464Z0, this.f66465a1);
        } else {
            z11 = onStateChange;
        }
        if (x1(this.f66431I)) {
            z11 |= this.f66431I.setState(iArr);
        }
        if (x1(this.f66455U)) {
            z11 |= this.f66455U.setState(iArr);
        }
        if (x1(this.f66441N)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.f66441N.setState(iArr3);
        }
        if (C9270b.f63247a && x1(this.f66443O)) {
            z11 |= this.f66443O.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            z1();
        }
        return z11;
    }

    private void B0(Canvas canvas, Rect rect) {
        if (!this.f66473i1) {
            this.f66430H0.setColor(this.f66446P0);
            this.f66430H0.setStyle(Paint.Style.FILL);
            this.f66430H0.setColorFilter(p1());
            this.f66436K0.set(rect);
            canvas.drawRoundRect(this.f66436K0, M0(), M0(), this.f66430H0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (S2()) {
            p0(rect, this.f66436K0);
            RectF rectF = this.f66436K0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f66431I.setBounds(0, 0, (int) this.f66436K0.width(), (int) this.f66436K0.height());
            this.f66431I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.f66423E > 0.0f && !this.f66473i1) {
            this.f66430H0.setColor(this.f66450R0);
            this.f66430H0.setStyle(Paint.Style.STROKE);
            if (!this.f66473i1) {
                this.f66430H0.setColorFilter(p1());
            }
            RectF rectF = this.f66436K0;
            float f10 = this.f66423E;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.f66419C - (this.f66423E / 2.0f);
            canvas.drawRoundRect(this.f66436K0, f11, f11, this.f66430H0);
        }
    }

    private void E0(Canvas canvas, Rect rect) {
        if (!this.f66473i1) {
            this.f66430H0.setColor(this.f66444O0);
            this.f66430H0.setStyle(Paint.Style.FILL);
            this.f66436K0.set(rect);
            canvas.drawRoundRect(this.f66436K0, M0(), M0(), this.f66430H0);
        }
    }

    private void F0(Canvas canvas, Rect rect) {
        if (T2()) {
            s0(rect, this.f66436K0);
            RectF rectF = this.f66436K0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f66441N.setBounds(0, 0, (int) this.f66436K0.width(), (int) this.f66436K0.height());
            if (C9270b.f63247a) {
                this.f66443O.setBounds(this.f66441N.getBounds());
                this.f66443O.jumpToCurrentState();
                this.f66443O.draw(canvas);
            } else {
                this.f66441N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        this.f66430H0.setColor(this.f66452S0);
        this.f66430H0.setStyle(Paint.Style.FILL);
        this.f66436K0.set(rect);
        if (!this.f66473i1) {
            canvas.drawRoundRect(this.f66436K0, M0(), M0(), this.f66430H0);
            return;
        }
        h(new RectF(rect), this.f66440M0);
        super.q(canvas, this.f66430H0, this.f66440M0, u());
    }

    private void H0(Canvas canvas, Rect rect) {
        Paint paint = this.f66432I0;
        if (paint != null) {
            paint.setColor(C6244c.p(-16777216, 127));
            canvas.drawRect(rect, this.f66432I0);
            if (S2() || R2()) {
                p0(rect, this.f66436K0);
                canvas.drawRect(this.f66436K0, this.f66432I0);
            }
            if (this.f66427G != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f66432I0);
            }
            if (T2()) {
                s0(rect, this.f66436K0);
                canvas.drawRect(this.f66436K0, this.f66432I0);
            }
            this.f66432I0.setColor(C6244c.p(-65536, 127));
            r0(rect, this.f66436K0);
            canvas.drawRect(this.f66436K0, this.f66432I0);
            this.f66432I0.setColor(C6244c.p(-16711936, 127));
            t0(rect, this.f66436K0);
            canvas.drawRect(this.f66436K0, this.f66432I0);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.f66427G != null) {
            Paint.Align x02 = x0(rect, this.f66438L0);
            v0(rect, this.f66436K0);
            if (this.f66442N0.e() != null) {
                this.f66442N0.g().drawableState = getState();
                this.f66442N0.n(this.f66428G0);
            }
            this.f66442N0.g().setTextAlign(x02);
            int i10 = 0;
            boolean z10 = Math.round(this.f66442N0.h(l1().toString())) > Math.round(this.f66436K0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f66436K0);
            }
            CharSequence charSequence = this.f66427G;
            if (z10 && this.f66470f1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f66442N0.g(), this.f66436K0.width(), this.f66470f1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f66438L0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f66442N0.g());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean R2() {
        return this.f66453T && this.f66455U != null && this.f66456U0;
    }

    private boolean S2() {
        return this.f66429H && this.f66431I != null;
    }

    private boolean T2() {
        return this.f66439M && this.f66441N != null;
    }

    private void U2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void V2() {
        this.f66468d1 = this.f66467c1 ? C9270b.d(this.f66425F) : null;
    }

    @TargetApi(21)
    private void W2() {
        this.f66443O = new RippleDrawable(C9270b.d(j1()), this.f66441N, f66414k1);
    }

    private float d1() {
        Drawable drawable = this.f66456U0 ? this.f66455U : this.f66431I;
        float f10 = this.f66435K;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil((double) v.d(this.f66428G0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f10) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float e1() {
        Drawable drawable = this.f66456U0 ? this.f66455U : this.f66431I;
        float f10 = this.f66435K;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    private void f2(ColorStateList colorStateList) {
        if (this.f66475z != colorStateList) {
            this.f66475z = colorStateList;
            onStateChange(getState());
        }
    }

    private void o0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C6260a.m(drawable, C6260a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f66441N) {
                if (drawable.isStateful()) {
                    drawable.setState(a1());
                }
                C6260a.o(drawable, this.f66445P);
                return;
            }
            Drawable drawable2 = this.f66431I;
            if (drawable == drawable2 && this.f66437L) {
                C6260a.o(drawable2, this.f66433J);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2() || R2()) {
            float f10 = this.f66474y0 + this.f66476z0;
            float e12 = e1();
            if (C6260a.f(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + e12;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - e12;
            }
            float d12 = d1();
            float exactCenterY = rect.exactCenterY() - (d12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + d12;
        }
    }

    private ColorFilter p1() {
        ColorFilter colorFilter = this.f66460X0;
        return colorFilter != null ? colorFilter : this.f66462Y0;
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (T2()) {
            float f10 = this.f66426F0 + this.f66424E0 + this.f66447Q + this.f66422D0 + this.f66420C0;
            if (C6260a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    private static boolean r1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f66426F0 + this.f66424E0;
            if (C6260a.f(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f66447Q;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f66447Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f66447Q;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f66426F0 + this.f66424E0 + this.f66447Q + this.f66422D0 + this.f66420C0;
            if (C6260a.f(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f66427G != null) {
            float q02 = this.f66474y0 + q0() + this.f66418B0;
            float u02 = this.f66426F0 + u0() + this.f66420C0;
            if (C6260a.f(this) == 0) {
                rectF.left = ((float) rect.left) + q02;
                rectF.right = ((float) rect.right) - u02;
            } else {
                rectF.left = ((float) rect.left) + u02;
                rectF.right = ((float) rect.right) - q02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean v1(Ra.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float w0() {
        this.f66442N0.g().getFontMetrics(this.f66434J0);
        Paint.FontMetrics fontMetrics = this.f66434J0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean w1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean x1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean y0() {
        return this.f66453T && this.f66455U != null && this.f66451S;
    }

    private void y1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray i12 = s.i(this.f66428G0, attributeSet, C9078l.f59781P0, i10, i11, new int[0]);
        this.f66473i1 = i12.hasValue(C9078l.f59619A1);
        f2(c.a(this.f66428G0, i12, C9078l.f60035n1));
        J1(c.a(this.f66428G0, i12, C9078l.f59892a1));
        X1(i12.getDimension(C9078l.f59980i1, 0.0f));
        if (i12.hasValue(C9078l.f59903b1)) {
            L1(i12.getDimension(C9078l.f59903b1, 0.0f));
        }
        b2(c.a(this.f66428G0, i12, C9078l.f60013l1));
        d2(i12.getDimension(C9078l.f60024m1, 0.0f));
        C2(c.a(this.f66428G0, i12, C9078l.f60167z1));
        H2(i12.getText(C9078l.f59831U0));
        Ra.d g10 = c.g(this.f66428G0, i12, C9078l.f59791Q0);
        g10.l(i12.getDimension(C9078l.f59801R0, g10.j()));
        I2(g10);
        int i13 = i12.getInt(C9078l.f59811S0, 0);
        if (i13 == 1) {
            u2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            u2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            u2(TextUtils.TruncateAt.END);
        }
        W1(i12.getBoolean(C9078l.f59969h1, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            W1(i12.getBoolean(C9078l.f59936e1, false));
        }
        P1(c.d(this.f66428G0, i12, C9078l.f59925d1));
        if (i12.hasValue(C9078l.f59958g1)) {
            T1(c.a(this.f66428G0, i12, C9078l.f59958g1));
        }
        R1(i12.getDimension(C9078l.f59947f1, -1.0f));
        s2(i12.getBoolean(C9078l.f60112u1, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            s2(i12.getBoolean(C9078l.f60057p1, false));
        }
        g2(c.d(this.f66428G0, i12, C9078l.f60046o1));
        q2(c.a(this.f66428G0, i12, C9078l.f60101t1));
        l2(i12.getDimension(C9078l.f60079r1, 0.0f));
        B1(i12.getBoolean(C9078l.f59841V0, false));
        I1(i12.getBoolean(C9078l.f59881Z0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            I1(i12.getBoolean(C9078l.f59861X0, false));
        }
        D1(c.d(this.f66428G0, i12, C9078l.f59851W0));
        if (i12.hasValue(C9078l.f59871Y0)) {
            F1(c.a(this.f66428G0, i12, C9078l.f59871Y0));
        }
        F2(C9088h.b(this.f66428G0, i12, C9078l.f59630B1));
        v2(C9088h.b(this.f66428G0, i12, C9078l.f60134w1));
        Z1(i12.getDimension(C9078l.f60002k1, 0.0f));
        z2(i12.getDimension(C9078l.f60156y1, 0.0f));
        x2(i12.getDimension(C9078l.f60145x1, 0.0f));
        N2(i12.getDimension(C9078l.f59652D1, 0.0f));
        K2(i12.getDimension(C9078l.f59641C1, 0.0f));
        n2(i12.getDimension(C9078l.f60090s1, 0.0f));
        i2(i12.getDimension(C9078l.f60068q1, 0.0f));
        N1(i12.getDimension(C9078l.f59914c1, 0.0f));
        B2(i12.getDimensionPixelSize(C9078l.f59821T0, Integer.MAX_VALUE));
        i12.recycle();
    }

    public static a z0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.y1(attributeSet, i10, i11);
        return aVar;
    }

    public void A2(int i10) {
        z2(this.f66428G0.getResources().getDimension(i10));
    }

    public void B1(boolean z10) {
        if (this.f66451S != z10) {
            this.f66451S = z10;
            float q02 = q0();
            if (!z10 && this.f66456U0) {
                this.f66456U0 = false;
            }
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void B2(int i10) {
        this.f66472h1 = i10;
    }

    public void C1(int i10) {
        B1(this.f66428G0.getResources().getBoolean(i10));
    }

    public void C2(ColorStateList colorStateList) {
        if (this.f66425F != colorStateList) {
            this.f66425F = colorStateList;
            V2();
            onStateChange(getState());
        }
    }

    public void D1(Drawable drawable) {
        if (this.f66455U != drawable) {
            float q02 = q0();
            this.f66455U = drawable;
            float q03 = q0();
            U2(this.f66455U);
            o0(this.f66455U);
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void D2(int i10) {
        C2(C5443a.a(this.f66428G0, i10));
    }

    public void E1(int i10) {
        D1(C5443a.b(this.f66428G0, i10));
    }

    /* access modifiers changed from: package-private */
    public void E2(boolean z10) {
        this.f66471g1 = z10;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.f66459X != colorStateList) {
            this.f66459X = colorStateList;
            if (y0()) {
                C6260a.o(this.f66455U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void F2(C9088h hVar) {
        this.f66461Y = hVar;
    }

    public void G1(int i10) {
        F1(C5443a.a(this.f66428G0, i10));
    }

    public void G2(int i10) {
        F2(C9088h.c(this.f66428G0, i10));
    }

    public void H1(int i10) {
        I1(this.f66428G0.getResources().getBoolean(i10));
    }

    public void H2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f66427G, charSequence)) {
            this.f66427G = charSequence;
            this.f66442N0.m(true);
            invalidateSelf();
            z1();
        }
    }

    public void I1(boolean z10) {
        if (this.f66453T != z10) {
            boolean R22 = R2();
            this.f66453T = z10;
            boolean R23 = R2();
            if (R22 != R23) {
                if (R23) {
                    o0(this.f66455U);
                } else {
                    U2(this.f66455U);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void I2(Ra.d dVar) {
        this.f66442N0.k(dVar, this.f66428G0);
    }

    public Drawable J0() {
        return this.f66455U;
    }

    public void J1(ColorStateList colorStateList) {
        if (this.f66415A != colorStateList) {
            this.f66415A = colorStateList;
            onStateChange(getState());
        }
    }

    public void J2(int i10) {
        I2(new Ra.d(this.f66428G0, i10));
    }

    public ColorStateList K0() {
        return this.f66459X;
    }

    public void K1(int i10) {
        J1(C5443a.a(this.f66428G0, i10));
    }

    public void K2(float f10) {
        if (this.f66420C0 != f10) {
            this.f66420C0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public ColorStateList L0() {
        return this.f66415A;
    }

    @Deprecated
    public void L1(float f10) {
        if (this.f66419C != f10) {
            this.f66419C = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void L2(int i10) {
        K2(this.f66428G0.getResources().getDimension(i10));
    }

    public float M0() {
        return this.f66473i1 ? J() : this.f66419C;
    }

    @Deprecated
    public void M1(int i10) {
        L1(this.f66428G0.getResources().getDimension(i10));
    }

    public void M2(float f10) {
        Ra.d m12 = m1();
        if (m12 != null) {
            m12.l(f10);
            this.f66442N0.g().setTextSize(f10);
            a();
        }
    }

    public float N0() {
        return this.f66426F0;
    }

    public void N1(float f10) {
        if (this.f66426F0 != f10) {
            this.f66426F0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public void N2(float f10) {
        if (this.f66418B0 != f10) {
            this.f66418B0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public Drawable O0() {
        Drawable drawable = this.f66431I;
        if (drawable != null) {
            return C6260a.q(drawable);
        }
        return null;
    }

    public void O1(int i10) {
        N1(this.f66428G0.getResources().getDimension(i10));
    }

    public void O2(int i10) {
        N2(this.f66428G0.getResources().getDimension(i10));
    }

    public float P0() {
        return this.f66435K;
    }

    public void P1(Drawable drawable) {
        Drawable O02 = O0();
        if (O02 != drawable) {
            float q02 = q0();
            this.f66431I = drawable != null ? C6260a.r(drawable).mutate() : null;
            float q03 = q0();
            U2(O02);
            if (S2()) {
                o0(this.f66431I);
            }
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void P2(boolean z10) {
        if (this.f66467c1 != z10) {
            this.f66467c1 = z10;
            V2();
            onStateChange(getState());
        }
    }

    public ColorStateList Q0() {
        return this.f66433J;
    }

    public void Q1(int i10) {
        P1(C5443a.b(this.f66428G0, i10));
    }

    /* access modifiers changed from: package-private */
    public boolean Q2() {
        return this.f66471g1;
    }

    public float R0() {
        return this.f66417B;
    }

    public void R1(float f10) {
        if (this.f66435K != f10) {
            float q02 = q0();
            this.f66435K = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public float S0() {
        return this.f66474y0;
    }

    public void S1(int i10) {
        R1(this.f66428G0.getResources().getDimension(i10));
    }

    public ColorStateList T0() {
        return this.f66421D;
    }

    public void T1(ColorStateList colorStateList) {
        this.f66437L = true;
        if (this.f66433J != colorStateList) {
            this.f66433J = colorStateList;
            if (S2()) {
                C6260a.o(this.f66431I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float U0() {
        return this.f66423E;
    }

    public void U1(int i10) {
        T1(C5443a.a(this.f66428G0, i10));
    }

    public Drawable V0() {
        Drawable drawable = this.f66441N;
        if (drawable != null) {
            return C6260a.q(drawable);
        }
        return null;
    }

    public void V1(int i10) {
        W1(this.f66428G0.getResources().getBoolean(i10));
    }

    public CharSequence W0() {
        return this.f66449R;
    }

    public void W1(boolean z10) {
        if (this.f66429H != z10) {
            boolean S22 = S2();
            this.f66429H = z10;
            boolean S23 = S2();
            if (S22 != S23) {
                if (S23) {
                    o0(this.f66431I);
                } else {
                    U2(this.f66431I);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public float X0() {
        return this.f66424E0;
    }

    public void X1(float f10) {
        if (this.f66417B != f10) {
            this.f66417B = f10;
            invalidateSelf();
            z1();
        }
    }

    public float Y0() {
        return this.f66447Q;
    }

    public void Y1(int i10) {
        X1(this.f66428G0.getResources().getDimension(i10));
    }

    public float Z0() {
        return this.f66422D0;
    }

    public void Z1(float f10) {
        if (this.f66474y0 != f10) {
            this.f66474y0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public void a() {
        z1();
        invalidateSelf();
    }

    public int[] a1() {
        return this.f66466b1;
    }

    public void a2(int i10) {
        Z1(this.f66428G0.getResources().getDimension(i10));
    }

    public ColorStateList b1() {
        return this.f66445P;
    }

    public void b2(ColorStateList colorStateList) {
        if (this.f66421D != colorStateList) {
            this.f66421D = colorStateList;
            if (this.f66473i1) {
                j0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void c1(RectF rectF) {
        t0(getBounds(), rectF);
    }

    public void c2(int i10) {
        b2(C5443a.a(this.f66428G0, i10));
    }

    public void d2(float f10) {
        if (this.f66423E != f10) {
            this.f66423E = f10;
            this.f66430H0.setStrokeWidth(f10);
            if (this.f66473i1) {
                super.k0(f10);
            }
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.f66458W0;
            if (i11 < 255) {
                i10 = C9122a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            E0(canvas, bounds);
            B0(canvas, bounds);
            if (this.f66473i1) {
                super.draw(canvas);
            }
            D0(canvas, bounds);
            G0(canvas, bounds);
            C0(canvas, bounds);
            A0(canvas, bounds);
            if (this.f66471g1) {
                I0(canvas, bounds);
            }
            F0(canvas, bounds);
            H0(canvas, bounds);
            if (this.f66458W0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void e2(int i10) {
        d2(this.f66428G0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt f1() {
        return this.f66470f1;
    }

    public C9088h g1() {
        return this.f66463Z;
    }

    public void g2(Drawable drawable) {
        Drawable V02 = V0();
        if (V02 != drawable) {
            float u02 = u0();
            this.f66441N = drawable != null ? C6260a.r(drawable).mutate() : null;
            if (C9270b.f63247a) {
                W2();
            }
            float u03 = u0();
            U2(V02);
            if (T2()) {
                o0(this.f66441N);
            }
            invalidateSelf();
            if (u02 != u03) {
                z1();
            }
        }
    }

    public int getAlpha() {
        return this.f66458W0;
    }

    public ColorFilter getColorFilter() {
        return this.f66460X0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f66417B;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f66474y0 + q0() + this.f66418B0 + this.f66442N0.h(l1().toString()) + this.f66420C0 + u0() + this.f66426F0), this.f66472h1);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f66473i1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f66419C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f66419C);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public float h1() {
        return this.f66416A0;
    }

    public void h2(CharSequence charSequence) {
        if (this.f66449R != charSequence) {
            this.f66449R = G2.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float i1() {
        return this.f66476z0;
    }

    public void i2(float f10) {
        if (this.f66424E0 != f10) {
            this.f66424E0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return w1(this.f66475z) || w1(this.f66415A) || w1(this.f66421D) || (this.f66467c1 && w1(this.f66468d1)) || v1(this.f66442N0.e()) || y0() || x1(this.f66431I) || x1(this.f66455U) || w1(this.f66464Z0);
    }

    public ColorStateList j1() {
        return this.f66425F;
    }

    public void j2(int i10) {
        i2(this.f66428G0.getResources().getDimension(i10));
    }

    public C9088h k1() {
        return this.f66461Y;
    }

    public void k2(int i10) {
        g2(C5443a.b(this.f66428G0, i10));
    }

    public CharSequence l1() {
        return this.f66427G;
    }

    public void l2(float f10) {
        if (this.f66447Q != f10) {
            this.f66447Q = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public Ra.d m1() {
        return this.f66442N0.e();
    }

    public void m2(int i10) {
        l2(this.f66428G0.getResources().getDimension(i10));
    }

    public float n1() {
        return this.f66420C0;
    }

    public void n2(float f10) {
        if (this.f66422D0 != f10) {
            this.f66422D0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public float o1() {
        return this.f66418B0;
    }

    public void o2(int i10) {
        n2(this.f66428G0.getResources().getDimension(i10));
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S2()) {
            onLayoutDirectionChanged |= C6260a.m(this.f66431I, i10);
        }
        if (R2()) {
            onLayoutDirectionChanged |= C6260a.m(this.f66455U, i10);
        }
        if (T2()) {
            onLayoutDirectionChanged |= C6260a.m(this.f66441N, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (S2()) {
            onLevelChange |= this.f66431I.setLevel(i10);
        }
        if (R2()) {
            onLevelChange |= this.f66455U.setLevel(i10);
        }
        if (T2()) {
            onLevelChange |= this.f66441N.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f66473i1) {
            super.onStateChange(iArr);
        }
        return A1(iArr, a1());
    }

    public boolean p2(int[] iArr) {
        if (Arrays.equals(this.f66466b1, iArr)) {
            return false;
        }
        this.f66466b1 = iArr;
        if (T2()) {
            return A1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float q0() {
        if (S2() || R2()) {
            return this.f66476z0 + e1() + this.f66416A0;
        }
        return 0.0f;
    }

    public boolean q1() {
        return this.f66467c1;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.f66445P != colorStateList) {
            this.f66445P = colorStateList;
            if (T2()) {
                C6260a.o(this.f66441N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r2(int i10) {
        q2(C5443a.a(this.f66428G0, i10));
    }

    public boolean s1() {
        return this.f66451S;
    }

    public void s2(boolean z10) {
        if (this.f66439M != z10) {
            boolean T22 = T2();
            this.f66439M = z10;
            boolean T23 = T2();
            if (T22 != T23) {
                if (T23) {
                    o0(this.f66441N);
                } else {
                    U2(this.f66441N);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.f66458W0 != i10) {
            this.f66458W0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f66460X0 != colorFilter) {
            this.f66460X0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f66464Z0 != colorStateList) {
            this.f66464Z0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f66465a1 != mode) {
            this.f66465a1 = mode;
            this.f66462Y0 = d.l(this, this.f66464Z0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S2()) {
            visible |= this.f66431I.setVisible(z10, z11);
        }
        if (R2()) {
            visible |= this.f66455U.setVisible(z10, z11);
        }
        if (T2()) {
            visible |= this.f66441N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean t1() {
        return x1(this.f66441N);
    }

    public void t2(C1162a aVar) {
        this.f66469e1 = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: package-private */
    public float u0() {
        if (T2()) {
            return this.f66422D0 + this.f66447Q + this.f66424E0;
        }
        return 0.0f;
    }

    public boolean u1() {
        return this.f66439M;
    }

    public void u2(TextUtils.TruncateAt truncateAt) {
        this.f66470f1 = truncateAt;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(C9088h hVar) {
        this.f66463Z = hVar;
    }

    public void w2(int i10) {
        v2(C9088h.c(this.f66428G0, i10));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align x0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f66427G != null) {
            float q02 = this.f66474y0 + q0() + this.f66418B0;
            if (C6260a.f(this) == 0) {
                pointF.x = ((float) rect.left) + q02;
            } else {
                pointF.x = ((float) rect.right) - q02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - w0();
        }
        return align;
    }

    public void x2(float f10) {
        if (this.f66416A0 != f10) {
            float q02 = q0();
            this.f66416A0 = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void y2(int i10) {
        x2(this.f66428G0.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public void z1() {
        C1162a aVar = this.f66469e1.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void z2(float f10) {
        if (this.f66476z0 != f10) {
            float q02 = q0();
            this.f66476z0 = f10;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }
}
