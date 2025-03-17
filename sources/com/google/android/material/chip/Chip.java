package com.google.android.material.chip;

import Ea.C9068b;
import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9088h;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import Ra.d;
import Ra.f;
import Sa.C9270b;
import Ua.h;
import Ua.k;
import Ua.n;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.a;
import com.google.android.material.internal.i;
import com.google.android.material.internal.s;
import com.google.android.material.internal.v;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import java.util.List;

public class Chip extends AppCompatCheckBox implements a.C1162a, n, i<Chip> {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f66376A = {16842911};

    /* renamed from: x  reason: collision with root package name */
    private static final int f66377x = C9077k.f59615y;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final Rect f66378y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f66379z = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f66380e;

    /* renamed from: f  reason: collision with root package name */
    private InsetDrawable f66381f;

    /* renamed from: g  reason: collision with root package name */
    private RippleDrawable f66382g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f66383h;

    /* renamed from: i  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f66384i;

    /* renamed from: j  reason: collision with root package name */
    private i.a<Chip> f66385j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f66386k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f66387l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f66388m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f66389n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f66390o;

    /* renamed from: p  reason: collision with root package name */
    private int f66391p;

    /* renamed from: q  reason: collision with root package name */
    private int f66392q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f66393r;

    /* renamed from: s  reason: collision with root package name */
    private final c f66394s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f66395t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f66396u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f66397v;

    /* renamed from: w  reason: collision with root package name */
    private final f f66398w;

    class a extends f {
        a() {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f66380e.Q2() ? Chip.this.f66380e.l1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f66380e != null) {
                Chip.this.f66380e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends P2.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f10, float f11) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f66383h != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(t tVar) {
            tVar.g0(Chip.this.r());
            tVar.j0(Chip.this.isClickable());
            tVar.i0(Chip.this.getAccessibilityClassName());
            tVar.R0(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        public void N(int i10, t tVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    tVar.m0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = C9076j.f59571n;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    tVar.m0(context.getString(i11, new Object[]{charSequence}).trim());
                }
                tVar.e0(Chip.this.getCloseIconTouchBoundsInt());
                tVar.b(t.a.f8838i);
                tVar.q0(Chip.this.isEnabled());
                return;
            }
            tVar.m0(charSequence);
            tVar.e0(Chip.f66378y);
        }

        /* access modifiers changed from: protected */
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f66389n = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59337i);
    }

    private void A() {
        this.f66382g = new RippleDrawable(C9270b.d(this.f66380e.j1()), getBackgroundDrawable(), (Drawable) null);
        this.f66380e.P2(false);
        C4600b0.t0(this, this.f66382g);
        B();
    }

    private void B() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f66380e) != null) {
            int N02 = (int) (aVar.N0() + this.f66380e.n1() + this.f66380e.u0());
            int S02 = (int) (this.f66380e.S0() + this.f66380e.o1() + this.f66380e.q0());
            if (this.f66381f != null) {
                Rect rect = new Rect();
                this.f66381f.getPadding(rect);
                S02 += rect.left;
                N02 += rect.right;
            }
            C4600b0.F0(this, S02, getPaddingTop(), N02, getPaddingBottom());
        }
    }

    private void C() {
        TextPaint paint = getPaint();
        a aVar = this.f66380e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f66398w);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f66397v.setEmpty();
        if (n() && this.f66383h != null) {
            this.f66380e.c1(this.f66397v);
        }
        return this.f66397v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f66396u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f66396u;
    }

    private d getTextAppearance() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    private void j(a aVar) {
        aVar.t2(this);
    }

    private int[] k() {
        int isEnabled = isEnabled();
        if (this.f66389n) {
            isEnabled++;
        }
        if (this.f66388m) {
            isEnabled++;
        }
        if (this.f66387l) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f66389n) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f66388m) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f66387l) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f66381f && this.f66380e.getCallback() == null) {
            this.f66380e.setCallback(this.f66381f);
        }
    }

    /* access modifiers changed from: private */
    public boolean n() {
        a aVar = this.f66380e;
        return (aVar == null || aVar.V0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = s.i(context, attributeSet, C9078l.f59781P0, i10, f66377x, new int[0]);
        this.f66390o = i11.getBoolean(C9078l.f60123v1, false);
        this.f66392q = (int) Math.ceil((double) i11.getDimension(C9078l.f59991j1, (float) Math.ceil((double) v.d(getContext(), 48))));
        i11.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f66381f = new InsetDrawable(this.f66380e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f66388m != z10) {
            this.f66388m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f66387l != z10) {
            this.f66387l = z10;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z10) {
        i.a<Chip> aVar = this.f66385j;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f66384i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    private void v() {
        if (this.f66381f != null) {
            this.f66381f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(a aVar) {
        if (aVar != null) {
            aVar.t2((a.C1162a) null);
        }
    }

    private void y() {
        if (!n() || !s() || this.f66383h == null) {
            C4600b0.p0(this, (C4597a) null);
            this.f66395t = false;
            return;
        }
        C4600b0.p0(this, this.f66394s);
        this.f66395t = true;
    }

    private void z() {
        if (C9270b.f63247a) {
            A();
            return;
        }
        this.f66380e.P2(true);
        C4600b0.t0(this, getBackgroundDrawable());
        B();
        m();
    }

    public void a() {
        l(this.f66392q);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f66395t ? super.dispatchHoverEvent(motionEvent) : this.f66394s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f66395t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f66394s.w(keyEvent) || this.f66394s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f66380e;
        if ((aVar == null || !aVar.t1()) ? false : this.f66380e.p2(k())) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f66393r)) {
            return this.f66393r;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).i()) ? "android.widget.Button" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f66381f;
        return insetDrawable == null ? this.f66380e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.M0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f66380e;
    }

    public float getChipEndPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f66395t || !(this.f66394s.A() == 1 || this.f66394s.x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C9088h getHideMotionSpec() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f66380e.E();
    }

    public C9088h getShowMotionSpec() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f66380e;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f66392q = i10;
        int i11 = 0;
        if (!w()) {
            if (this.f66381f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f66380e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f66380e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i12 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i11 = max / 2;
            }
            if (this.f66381f != null) {
                Rect rect = new Rect();
                this.f66381f.getPadding(rect);
                if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                    z();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            q(i12, i11, i12, i11);
            z();
            return true;
        }
        if (this.f66381f != null) {
            v();
        } else {
            z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f66380e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f66379z);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f66376A);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f66395t) {
            this.f66394s.I(z10, i10, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            t.a1(accessibilityNodeInfo).l0(t.f.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i10) : PointerIcon.getSystemIcon(getContext(), CashAppPayProcessorActivity.RESULT_ERROR);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f66391p != i10) {
            this.f66391p = i10;
            B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0035
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f66387l
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r3)
        L_0x002a:
            r0 = r2
            goto L_0x0041
        L_0x002c:
            boolean r0 = r5.f66387l
            if (r0 == 0) goto L_0x0035
            r5.u()
            r0 = r2
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
            goto L_0x002a
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        a aVar = this.f66380e;
        return aVar != null && aVar.s1();
    }

    public boolean s() {
        a aVar = this.f66380e;
        return aVar != null && aVar.u1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f66393r = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f66382g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f66382g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.B1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setChecked(boolean z10) {
        a aVar = this.f66380e;
        if (aVar == null) {
            this.f66386k = z10;
        } else if (aVar.s1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.F1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f66380e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f66380e = aVar;
            aVar.E2(false);
            j(this.f66380e);
            l(this.f66392q);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.N1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.P1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.Z1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.b2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.g2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.h2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.i2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.k2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.l2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.n2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.a0(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f66380e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f66380e;
                if (aVar != null) {
                    aVar.u2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f66390o = z10;
        l(this.f66392q);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C9088h hVar) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.v2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.z2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.f66385j = aVar;
    }

    public void setLayoutDirection(int i10) {
        if (this.f66380e != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f66384i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f66383h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.C2(colorStateList);
        }
        if (!this.f66380e.q1()) {
            A();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.D2(i10);
            if (!this.f66380e.q1()) {
                A();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f66380e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C9088h hVar) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.F2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f66380e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.Q2() ? null : charSequence, bufferType);
            a aVar2 = this.f66380e;
            if (aVar2 != null) {
                aVar2.H2(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.I2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.K2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.M2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.N2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.O2(i10);
        }
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f66383h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f66395t) {
            this.f66394s.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f66390o;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f66377x
            android.content.Context r7 = Xa.C9359a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f66396u = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f66397v = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f66398w = r7
            android.content.Context r0 = r6.getContext()
            r6.D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.z0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = I2.C4600b0.u(r6)
            r7.a0(r1)
            int[] r2 = Ea.C9078l.f59781P0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r9 = Ea.C9078l.f59619A1
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f66394s = r8
            r6.y()
            if (r9 != 0) goto L_0x0059
            r6.p()
        L_0x0059:
            boolean r8 = r6.f66386k
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.l1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.f1()
            r6.setEllipsize(r7)
            r6.C()
            com.google.android.material.chip.a r7 = r6.f66380e
            boolean r7 = r7.Q2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.B()
            boolean r7 = r6.w()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f66392q
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = I2.C4600b0.z(r6)
            r6.f66391p = r7
            Ka.a r7 = new Ka.a
            r7.<init>(r6)
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.s2(z10);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.I1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.W1(z10);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.J2(i10);
        }
        C();
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f66380e;
        if (aVar != null) {
            aVar.J2(i10);
        }
        C();
    }
}
