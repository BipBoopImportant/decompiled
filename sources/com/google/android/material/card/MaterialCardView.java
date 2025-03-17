package com.google.android.material.card;

import Ea.C9068b;
import Ea.C9077k;
import Ua.h;
import Ua.k;
import Ua.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import j.C5443a;

public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f66244n = {16842911};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f66245o = {16842912};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f66246p = {C9068b.f59328d0};

    /* renamed from: q  reason: collision with root package name */
    private static final int f66247q = C9077k.f59613w;

    /* renamed from: j  reason: collision with root package name */
    private final b f66248j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f66249k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f66250l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f66251m;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59299E);
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f66248j.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f66248j.l().getBounds());
        return rectF;
    }

    public boolean g() {
        b bVar = this.f66248j;
        return bVar != null && bVar.F();
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f66248j.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f66248j.n();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f66248j.o();
    }

    public int getCheckedIconGravity() {
        return this.f66248j.p();
    }

    public int getCheckedIconMargin() {
        return this.f66248j.q();
    }

    public int getCheckedIconSize() {
        return this.f66248j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f66248j.s();
    }

    public int getContentPaddingBottom() {
        return this.f66248j.C().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f66248j.C().left;
    }

    public int getContentPaddingRight() {
        return this.f66248j.C().right;
    }

    public int getContentPaddingTop() {
        return this.f66248j.C().top;
    }

    public float getProgress() {
        return this.f66248j.w();
    }

    public float getRadius() {
        return this.f66248j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f66248j.x();
    }

    public k getShapeAppearanceModel() {
        return this.f66248j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f66248j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f66248j.A();
    }

    public int getStrokeWidth() {
        return this.f66248j.B();
    }

    public boolean h() {
        return this.f66251m;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    public boolean isChecked() {
        return this.f66250l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f66248j.g0();
        h.f(this, this.f66248j.l());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, f66244n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f66245o);
        }
        if (h()) {
            View.mergeDrawableStates(onCreateDrawableState, f66246p);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f66248j.K(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f66249k) {
            if (!this.f66248j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f66248j.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        this.f66248j.M(ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f66248j.i0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f66248j.N(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f66248j.O(z10);
    }

    public void setChecked(boolean z10) {
        if (this.f66250l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f66248j.R(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f66248j.p() != i10) {
            this.f66248j.S(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f66248j.T(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f66248j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f66248j.R(C5443a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f66248j.U(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f66248j.U(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f66248j.V(colorStateList);
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f66248j;
        if (bVar != null) {
            bVar.g0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f66251m != z10) {
            this.f66251m = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f66248j.k0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f66248j.k0();
        this.f66248j.h0();
    }

    public void setProgress(float f10) {
        this.f66248j.X(f10);
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f66248j.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f66248j.Y(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f66248j.Y(C5443a.a(getContext(), i10));
    }

    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f66248j.Z(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f66248j.b0(i10);
        invalidate();
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f66248j.k0();
        this.f66248j.h0();
    }

    public void toggle() {
        if (g() && isEnabled()) {
            this.f66250l = !this.f66250l;
            refreshDrawableState();
            f();
            this.f66248j.Q(this.f66250l, true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f66247q
            android.content.Context r8 = Xa.C9359a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f66250l = r8
            r7.f66251m = r8
            r0 = 1
            r7.f66249k = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = Ea.C9078l.f60027m4
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.b r0 = new com.google.android.material.card.b
            r0.<init>(r7, r9, r10, r6)
            r7.f66248j = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.M(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.c0(r9, r10, r1, r2)
            r0.J(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f66248j.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f66248j.a0(colorStateList);
        invalidate();
    }
}
