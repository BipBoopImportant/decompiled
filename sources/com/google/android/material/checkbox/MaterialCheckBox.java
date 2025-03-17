package com.google.android.material.checkbox;

import Ea.C9068b;
import Ea.C9072f;
import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import La.C9138a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.M;
import com.google.android.material.internal.v;
import j.C5443a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y2.C6260a;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f66349A;

    /* renamed from: B  reason: collision with root package name */
    private static final int[][] f66350B;
    @SuppressLint({"DiscouragedApi"})

    /* renamed from: C  reason: collision with root package name */
    private static final int f66351C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: y  reason: collision with root package name */
    private static final int f66352y = C9077k.f59616z;

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f66353z = {C9068b.f59332f0};

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet<c> f66354e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet<b> f66355f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f66356g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f66357h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f66358i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f66359j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f66360k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f66361l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f66362m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f66363n;

    /* renamed from: o  reason: collision with root package name */
    ColorStateList f66364o;

    /* renamed from: p  reason: collision with root package name */
    ColorStateList f66365p;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f66366q;

    /* renamed from: r  reason: collision with root package name */
    private int f66367r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int[] f66368s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f66369t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f66370u;

    /* renamed from: v  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f66371v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f66372w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f66373x;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f66364o;
            if (colorStateList != null) {
                C6260a.o(drawable, colorStateList);
            }
        }

        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f66364o;
            if (colorStateList != null) {
                C6260a.n(drawable, colorStateList.getColorForState(materialCheckBox.f66368s, MaterialCheckBox.this.f66364o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(MaterialCheckBox materialCheckBox, int i10);
    }

    public interface c {
        void a(MaterialCheckBox materialCheckBox, boolean z10);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f66375a;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, (a) null);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f66375a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f66375a));
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f66375a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = C9068b.f59330e0;
        f66349A = new int[]{i10};
        f66350B = new int[][]{new int[]{16842910, i10}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59333g);
    }

    private boolean c(M m10) {
        return m10.n(C9078l.f60159y4, 0) == f66351C && m10.n(C9078l.f60170z4, 0) == 0;
    }

    private void e() {
        this.f66361l = com.google.android.material.drawable.d.c(this.f66361l, this.f66364o, androidx.core.widget.c.c(this));
        this.f66362m = com.google.android.material.drawable.d.c(this.f66362m, this.f66365p, this.f66366q);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.f66361l, this.f66362m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.f66370u == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f66363n) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f66372w;
            if (cVar2 != null) {
                cVar2.f(this.f66373x);
                this.f66372w.b(this.f66373x);
            }
            Drawable drawable = this.f66361l;
            if ((drawable instanceof AnimatedStateListDrawable) && (cVar = this.f66372w) != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(C9072f.f59484b, C9072f.f59482Y, cVar, false);
                ((AnimatedStateListDrawable) this.f66361l).addTransition(C9072f.f59492j, C9072f.f59482Y, this.f66372w, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f66367r;
        return i10 == 1 ? getResources().getString(C9076j.f59568k) : i10 == 0 ? getResources().getString(C9076j.f59570m) : getResources().getString(C9076j.f59569l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f66356g == null) {
            int[][] iArr = f66350B;
            int[] iArr2 = new int[iArr.length];
            int d10 = C9138a.d(this, C9068b.f59339j);
            int d11 = C9138a.d(this, C9068b.f59343l);
            int d12 = C9138a.d(this, C9068b.f59352q);
            int d13 = C9138a.d(this, C9068b.f59345m);
            iArr2[0] = C9138a.j(d12, d11, 1.0f);
            iArr2[1] = C9138a.j(d12, d10, 1.0f);
            iArr2[2] = C9138a.j(d12, d13, 0.54f);
            iArr2[3] = C9138a.j(d12, d13, 0.38f);
            iArr2[4] = C9138a.j(d12, d13, 0.38f);
            this.f66356g = new ColorStateList(iArr, iArr2);
        }
        return this.f66356g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f66364o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f66361l;
        if (!(drawable == null || (colorStateList2 = this.f66364o) == null)) {
            C6260a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f66362m;
        if (drawable2 != null && (colorStateList = this.f66365p) != null) {
            C6260a.o(drawable2, colorStateList);
        }
    }

    private void i() {
    }

    public boolean d() {
        return this.f66359j;
    }

    public Drawable getButtonDrawable() {
        return this.f66361l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f66362m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f66365p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f66366q;
    }

    public ColorStateList getButtonTintList() {
        return this.f66364o;
    }

    public int getCheckedState() {
        return this.f66367r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f66360k;
    }

    public boolean isChecked() {
        return this.f66367r == 1;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f66357h && this.f66364o == null && this.f66365p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f66353z);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f66349A);
        }
        this.f66368s = com.google.android.material.drawable.d.e(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f66358i || !TextUtils.isEmpty(getText()) || (a10 = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (v.i(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            C6260a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f66360k);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f66375a);
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f66375a = getCheckedState();
        return dVar;
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(C5443a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f66362m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C5443a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f66365p != colorStateList) {
            this.f66365p = colorStateList;
            e();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f66366q != mode) {
            this.f66366q = mode;
            e();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f66364o != colorStateList) {
            this.f66364o = colorStateList;
            e();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f66358i = z10;
    }

    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f66367r != i10) {
            this.f66367r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (!this.f66369t) {
                this.f66369t = true;
                LinkedHashSet<b> linkedHashSet = this.f66355f;
                if (linkedHashSet != null) {
                    Iterator<b> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.f66367r);
                    }
                }
                if (!(this.f66367r == 2 || (onCheckedChangeListener = this.f66371v) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f66369t = false;
            }
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f66360k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f66359j != z10) {
            this.f66359j = z10;
            refreshDrawableState();
            Iterator<c> it = this.f66354e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f66359j);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f66371v = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f66370u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f66357h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, (ColorStateList) null);
        }
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f66352y
            android.content.Context r9 = Xa.C9359a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f66354e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f66355f = r9
            android.content.Context r9 = r8.getContext()
            int r0 = Ea.C9071e.f59452g
            androidx.vectordrawable.graphics.drawable.c r9 = androidx.vectordrawable.graphics.drawable.c.a(r9, r0)
            r8.f66372w = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.f66373x = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r8)
            r8.f66361l = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f66364o = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = Ea.C9078l.f60148x4
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.M r10 = com.google.android.material.internal.s.j(r0, r1, r2, r3, r4, r5)
            int r11 = Ea.C9078l.f59622A4
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.f66362m = r11
            android.graphics.drawable.Drawable r11 = r8.f66361l
            r0 = 1
            if (r11 == 0) goto L_0x007c
            boolean r11 = com.google.android.material.internal.s.g(r9)
            if (r11 == 0) goto L_0x007c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L_0x007c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            int r11 = Ea.C9071e.f59451f
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r9, r11)
            r8.f66361l = r11
            r8.f66363n = r0
            android.graphics.drawable.Drawable r11 = r8.f66362m
            if (r11 != 0) goto L_0x007c
            int r11 = Ea.C9071e.f59453h
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r9, r11)
            r8.f66362m = r11
        L_0x007c:
            int r11 = Ea.C9078l.f59633B4
            android.content.res.ColorStateList r9 = Ra.c.b(r9, r10, r11)
            r8.f66365p = r9
            int r9 = Ea.C9078l.f59644C4
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.v.k(r9, r11)
            r8.f66366q = r9
            int r9 = Ea.C9078l.f59699H4
            boolean r9 = r10.a(r9, r7)
            r8.f66357h = r9
            int r9 = Ea.C9078l.f59655D4
            boolean r9 = r10.a(r9, r0)
            r8.f66358i = r9
            int r9 = Ea.C9078l.f59688G4
            boolean r9 = r10.a(r9, r7)
            r8.f66359j = r9
            int r9 = Ea.C9078l.f59677F4
            java.lang.CharSequence r9 = r10.p(r9)
            r8.f66360k = r9
            int r9 = Ea.C9078l.f59666E4
            boolean r9 = r10.s(r9)
            if (r9 == 0) goto L_0x00c4
            int r9 = Ea.C9078l.f59666E4
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        L_0x00c4:
            r10.x()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f66361l = drawable;
        this.f66363n = false;
        e();
    }
}
