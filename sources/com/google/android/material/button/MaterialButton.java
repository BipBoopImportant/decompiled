package com.google.android.material.button;

import Ea.C9068b;
import Ea.C9077k;
import I2.C4600b0;
import Ua.h;
import Ua.k;
import Ua.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.i;
import j.C5443a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y2.C6260a;

public class MaterialButton extends AppCompatButton implements Checkable, n {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f66185o = {16842911};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f66186p = {16842912};

    /* renamed from: q  reason: collision with root package name */
    private static final int f66187q = C9077k.f59612v;

    /* renamed from: a  reason: collision with root package name */
    private final a f66188a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<a> f66189b;

    /* renamed from: c  reason: collision with root package name */
    private b f66190c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f66191d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f66192e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f66193f;

    /* renamed from: g  reason: collision with root package name */
    private String f66194g;

    /* renamed from: h  reason: collision with root package name */
    private int f66195h;

    /* renamed from: i  reason: collision with root package name */
    private int f66196i;

    /* renamed from: j  reason: collision with root package name */
    private int f66197j;

    /* renamed from: k  reason: collision with root package name */
    private int f66198k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f66199l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f66200m;

    /* renamed from: n  reason: collision with root package name */
    private int f66201n;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends O2.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f66202c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f66202c = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f66202c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59295A);
    }

    private boolean b() {
        int i10 = this.f66201n;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f66201n;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f66201n;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return C4600b0.z(this) == 1;
    }

    private boolean f() {
        a aVar = this.f66188a;
        return aVar != null && !aVar.o();
    }

    private void g() {
        if (c()) {
            i.j(this, this.f66193f, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            i.j(this, (Drawable) null, (Drawable) null, this.f66193f, (Drawable) null);
        } else if (d()) {
            i.j(this, (Drawable) null, this.f66193f, (Drawable) null, (Drawable) null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil((double) f10);
    }

    private void h(boolean z10) {
        Drawable drawable = this.f66193f;
        if (drawable != null) {
            Drawable mutate = C6260a.r(drawable).mutate();
            this.f66193f = mutate;
            C6260a.o(mutate, this.f66192e);
            PorterDuff.Mode mode = this.f66191d;
            if (mode != null) {
                C6260a.p(this.f66193f, mode);
            }
            int i10 = this.f66195h;
            if (i10 == 0) {
                i10 = this.f66193f.getIntrinsicWidth();
            }
            int i11 = this.f66195h;
            if (i11 == 0) {
                i11 = this.f66193f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f66193f;
            int i12 = this.f66196i;
            int i13 = this.f66197j;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f66193f.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = i.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((c() && drawable3 != this.f66193f) || ((b() && drawable5 != this.f66193f) || (d() && drawable4 != this.f66193f))) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f66193f != null && getLayout() != null) {
            if (c() || b()) {
                this.f66197j = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i12 = this.f66201n;
                boolean z10 = true;
                if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f66196i = 0;
                    h(false);
                    return;
                }
                int i13 = this.f66195h;
                if (i13 == 0) {
                    i13 = this.f66193f.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - C4600b0.D(this)) - i13) - this.f66198k) - C4600b0.E(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean e10 = e();
                if (this.f66201n != 4) {
                    z10 = false;
                }
                if (e10 != z10) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f66196i != textLayoutWidth) {
                    this.f66196i = textLayoutWidth;
                    h(false);
                }
            } else if (d()) {
                this.f66196i = 0;
                if (this.f66201n == 16) {
                    this.f66197j = 0;
                    h(false);
                    return;
                }
                int i14 = this.f66195h;
                if (i14 == 0) {
                    i14 = this.f66193f.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.f66198k) - getPaddingBottom()) / 2);
                if (this.f66197j != max) {
                    this.f66197j = max;
                    h(false);
                }
            }
        }
    }

    public boolean a() {
        a aVar = this.f66188a;
        return aVar != null && aVar.p();
    }

    /* access modifiers changed from: package-private */
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f66194g)) {
            return this.f66194g;
        }
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f66188a.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f66193f;
    }

    public int getIconGravity() {
        return this.f66201n;
    }

    public int getIconPadding() {
        return this.f66198k;
    }

    public int getIconSize() {
        return this.f66195h;
    }

    public ColorStateList getIconTint() {
        return this.f66192e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f66191d;
    }

    public int getInsetBottom() {
        return this.f66188a.c();
    }

    public int getInsetTop() {
        return this.f66188a.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f66188a.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f66188a.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f66188a.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f66188a.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f66188a.l() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f66188a.m() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f66199l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f66188a.f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f66185o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f66186p);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f66202c);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f66202c = this.f66199l;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.f66188a.q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f66193f != null) {
            if (this.f66193f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setA11yClassName(String str) {
        this.f66194g = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f66188a.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f66188a.t();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f66188a.u(z10);
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f66199l != z10) {
            this.f66199l = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f66199l);
            }
            if (!this.f66200m) {
                this.f66200m = true;
                Iterator<a> it = this.f66189b.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f66199l);
                }
                this.f66200m = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f66188a.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f66188a.f().a0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f66193f != drawable) {
            this.f66193f = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f66201n != i10) {
            this.f66201n = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f66198k != i10) {
            this.f66198k = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f66195h != i10) {
            this.f66195h = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f66192e != colorStateList) {
            this.f66192e = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f66191d != mode) {
            this.f66191d = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C5443a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f66188a.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f66188a.x(i10);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f66190c = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f66190c;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f66188a.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(C5443a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (f()) {
            this.f66188a.z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f66188a.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f66188a.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(C5443a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f66188a.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f66188a.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f66188a.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f66188a.F(z10);
    }

    public void toggle() {
        setChecked(!this.f66199l);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f66187q
            android.content.Context r9 = Xa.C9359a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f66189b = r9
            r9 = 0
            r8.f66199l = r9
            r8.f66200m = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = Ea.C9078l.f60081r3
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r1 = Ea.C9078l.f59665E3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f66198k = r1
            int r1 = Ea.C9078l.f59698H3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r2)
            r8.f66191d = r1
            android.content.Context r1 = r8.getContext()
            int r2 = Ea.C9078l.f59687G3
            android.content.res.ColorStateList r1 = Ra.c.a(r1, r0, r2)
            r8.f66192e = r1
            android.content.Context r1 = r8.getContext()
            int r2 = Ea.C9078l.f59643C3
            android.graphics.drawable.Drawable r1 = Ra.c.d(r1, r0, r2)
            r8.f66193f = r1
            int r1 = Ea.C9078l.f59654D3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f66201n = r1
            int r1 = Ea.C9078l.f59676F3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f66195h = r1
            Ua.k$b r10 = Ua.k.e(r7, r10, r11, r6)
            Ua.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f66188a = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.f66198k
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f66193f
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
