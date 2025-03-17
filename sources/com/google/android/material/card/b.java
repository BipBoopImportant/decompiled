package com.google.android.material.card;

import Ea.C9068b;
import Ea.C9072f;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9081a;
import I2.C4600b0;
import La.C9138a;
import Qa.C9242i;
import Ra.c;
import Sa.C9270b;
import Ua.C9283d;
import Ua.C9284e;
import Ua.C9286g;
import Ua.j;
import Ua.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import y2.C6260a;

class b {

    /* renamed from: A  reason: collision with root package name */
    private static final Drawable f66253A = (Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null);

    /* renamed from: z  reason: collision with root package name */
    private static final double f66254z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f66255a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f66256b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final C9286g f66257c;

    /* renamed from: d  reason: collision with root package name */
    private final C9286g f66258d;

    /* renamed from: e  reason: collision with root package name */
    private int f66259e;

    /* renamed from: f  reason: collision with root package name */
    private int f66260f;

    /* renamed from: g  reason: collision with root package name */
    private int f66261g;

    /* renamed from: h  reason: collision with root package name */
    private int f66262h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f66263i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f66264j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f66265k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f66266l;

    /* renamed from: m  reason: collision with root package name */
    private k f66267m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f66268n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f66269o;

    /* renamed from: p  reason: collision with root package name */
    private LayerDrawable f66270p;

    /* renamed from: q  reason: collision with root package name */
    private C9286g f66271q;

    /* renamed from: r  reason: collision with root package name */
    private C9286g f66272r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f66273s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f66274t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator f66275u;

    /* renamed from: v  reason: collision with root package name */
    private final TimeInterpolator f66276v;

    /* renamed from: w  reason: collision with root package name */
    private final int f66277w;

    /* renamed from: x  reason: collision with root package name */
    private final int f66278x;

    /* renamed from: y  reason: collision with root package name */
    private float f66279y = 0.0f;

    class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f66255a = materialCardView;
        C9286g gVar = new C9286g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f66257c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.g0(-12303292);
        k.b v10 = gVar.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C9078l.f59728K0, i10, C9077k.f59591a);
        if (obtainStyledAttributes.hasValue(C9078l.f59739L0)) {
            v10.o(obtainStyledAttributes.getDimension(C9078l.f59739L0, 0.0f));
        }
        this.f66258d = new C9286g();
        Z(v10.m());
        this.f66276v = C9242i.g(materialCardView.getContext(), C9068b.f59313S, C9081a.f60371a);
        this.f66277w = C9242i.f(materialCardView.getContext(), C9068b.f59307M, 300);
        this.f66278x = C9242i.f(materialCardView.getContext(), C9068b.f59306L, 300);
        obtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int i10;
        int i11;
        if (this.f66255a.getUseCompatPadding()) {
            i10 = (int) Math.ceil((double) f());
            i11 = (int) Math.ceil((double) e());
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new a(drawable, i11, i10, i11, i10);
    }

    private boolean G() {
        return (this.f66261g & 80) == 80;
    }

    private boolean H() {
        return (this.f66261g & 8388613) == 8388613;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f66264j.setAlpha((int) (255.0f * floatValue));
        this.f66279y = floatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f66267m.q(), this.f66257c.J()), d(this.f66267m.s(), this.f66257c.K())), Math.max(d(this.f66267m.k(), this.f66257c.t()), d(this.f66267m.i(), this.f66257c.s())));
    }

    private float d(C9283d dVar, float f10) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f66254z) * ((double) f10));
        }
        if (dVar instanceof C9284e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f66255a.getPreventCornerOverlap() && !g();
    }

    private float e() {
        return this.f66255a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    private boolean e0() {
        return this.f66255a.getPreventCornerOverlap() && g() && this.f66255a.getUseCompatPadding();
    }

    private float f() {
        return (this.f66255a.getMaxCardElevation() * 1.5f) + (e0() ? c() : 0.0f);
    }

    private boolean f0() {
        if (this.f66255a.isClickable()) {
            return true;
        }
        View view = this.f66255a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private boolean g() {
        return this.f66257c.T();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C9286g j10 = j();
        this.f66271q = j10;
        j10.b0(this.f66265k);
        stateListDrawable.addState(new int[]{16842919}, this.f66271q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!C9270b.f63247a) {
            return h();
        }
        this.f66272r = j();
        return new RippleDrawable(this.f66265k, (Drawable) null, this.f66272r);
    }

    private C9286g j() {
        return new C9286g(this.f66267m);
    }

    private void j0(Drawable drawable) {
        if (this.f66255a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f66255a.getForeground()).setDrawable(drawable);
        } else {
            this.f66255a.setForeground(D(drawable));
        }
    }

    private void l0() {
        Drawable drawable;
        if (!C9270b.f63247a || (drawable = this.f66269o) == null) {
            C9286g gVar = this.f66271q;
            if (gVar != null) {
                gVar.b0(this.f66265k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f66265k);
    }

    private Drawable t() {
        if (this.f66269o == null) {
            this.f66269o = i();
        }
        if (this.f66270p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f66269o, this.f66258d, this.f66264j});
            this.f66270p = layerDrawable;
            layerDrawable.setId(2, C9072f.f59462E);
        }
        return this.f66270p;
    }

    private float v() {
        if (!this.f66255a.getPreventCornerOverlap() || !this.f66255a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f66254z) * ((double) this.f66255a.getCardViewRadius()));
    }

    /* access modifiers changed from: package-private */
    public ColorStateList A() {
        return this.f66268n;
    }

    /* access modifiers changed from: package-private */
    public int B() {
        return this.f66262h;
    }

    /* access modifiers changed from: package-private */
    public Rect C() {
        return this.f66256b;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f66273s;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f66274t;
    }

    /* access modifiers changed from: package-private */
    public void J(TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f66255a.getContext(), typedArray, C9078l.f60126v4);
        this.f66268n = a10;
        if (a10 == null) {
            this.f66268n = ColorStateList.valueOf(-1);
        }
        this.f66262h = typedArray.getDimensionPixelSize(C9078l.f60137w4, 0);
        boolean z10 = typedArray.getBoolean(C9078l.f60038n4, false);
        this.f66274t = z10;
        this.f66255a.setLongClickable(z10);
        this.f66266l = c.a(this.f66255a.getContext(), typedArray, C9078l.f60104t4);
        R(c.d(this.f66255a.getContext(), typedArray, C9078l.f60060p4));
        U(typedArray.getDimensionPixelSize(C9078l.f60093s4, 0));
        T(typedArray.getDimensionPixelSize(C9078l.f60082r4, 0));
        this.f66261g = typedArray.getInteger(C9078l.f60071q4, 8388661);
        ColorStateList a11 = c.a(this.f66255a.getContext(), typedArray, C9078l.f60115u4);
        this.f66265k = a11;
        if (a11 == null) {
            this.f66265k = ColorStateList.valueOf(C9138a.d(this.f66255a, C9068b.f59341k));
        }
        N(c.a(this.f66255a.getContext(), typedArray, C9078l.f60049o4));
        l0();
        i0();
        m0();
        this.f66255a.setBackgroundInternal(D(this.f66257c));
        Drawable t10 = f0() ? t() : this.f66258d;
        this.f66263i = t10;
        this.f66255a.setForeground(D(t10));
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f66270p != null) {
            if (this.f66255a.getUseCompatPadding()) {
                i13 = (int) Math.ceil((double) (f() * 2.0f));
                i12 = (int) Math.ceil((double) (e() * 2.0f));
            } else {
                i13 = 0;
                i12 = 0;
            }
            int i16 = H() ? ((i10 - this.f66259e) - this.f66260f) - i12 : this.f66259e;
            int i17 = G() ? this.f66259e : ((i11 - this.f66259e) - this.f66260f) - i13;
            int i18 = H() ? this.f66259e : ((i10 - this.f66259e) - this.f66260f) - i12;
            int i19 = G() ? ((i11 - this.f66259e) - this.f66260f) - i13 : this.f66259e;
            if (C4600b0.z(this.f66255a) == 1) {
                i15 = i18;
                i14 = i16;
            } else {
                i14 = i18;
                i15 = i16;
            }
            this.f66270p.setLayerInset(2, i15, i19, i14, i17);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        this.f66273s = z10;
    }

    /* access modifiers changed from: package-private */
    public void M(ColorStateList colorStateList) {
        this.f66257c.b0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void N(ColorStateList colorStateList) {
        C9286g gVar = this.f66258d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.b0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f66274t = z10;
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        Drawable drawable = this.f66264j;
        if (drawable == null) {
            return;
        }
        if (z11) {
            b(z10);
            return;
        }
        drawable.setAlpha(z10 ? 255 : 0);
        this.f66279y = z10 ? 1.0f : 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void R(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C6260a.r(drawable).mutate();
            this.f66264j = mutate;
            C6260a.o(mutate, this.f66266l);
            P(this.f66255a.isChecked());
        } else {
            this.f66264j = f66253A;
        }
        LayerDrawable layerDrawable = this.f66270p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C9072f.f59462E, this.f66264j);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i10) {
        this.f66261g = i10;
        K(this.f66255a.getMeasuredWidth(), this.f66255a.getMeasuredHeight());
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        this.f66259e = i10;
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        this.f66260f = i10;
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        this.f66266l = colorStateList;
        Drawable drawable = this.f66264j;
        if (drawable != null) {
            C6260a.o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void W(float f10) {
        Z(this.f66267m.w(f10));
        this.f66263i.invalidateSelf();
        if (e0() || d0()) {
            h0();
        }
        if (e0()) {
            k0();
        }
    }

    /* access modifiers changed from: package-private */
    public void X(float f10) {
        this.f66257c.c0(f10);
        C9286g gVar = this.f66258d;
        if (gVar != null) {
            gVar.c0(f10);
        }
        C9286g gVar2 = this.f66272r;
        if (gVar2 != null) {
            gVar2.c0(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        this.f66265k = colorStateList;
        l0();
    }

    /* access modifiers changed from: package-private */
    public void Z(k kVar) {
        this.f66267m = kVar;
        this.f66257c.setShapeAppearanceModel(kVar);
        C9286g gVar = this.f66257c;
        gVar.f0(!gVar.T());
        C9286g gVar2 = this.f66258d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C9286g gVar3 = this.f66272r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C9286g gVar4 = this.f66271q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(ColorStateList colorStateList) {
        if (this.f66268n != colorStateList) {
            this.f66268n = colorStateList;
            m0();
        }
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f66279y : this.f66279y;
        ValueAnimator valueAnimator = this.f66275u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f66275u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f66279y, f10});
        this.f66275u = ofFloat;
        ofFloat.addUpdateListener(new a(this));
        this.f66275u.setInterpolator(this.f66276v);
        this.f66275u.setDuration((long) (((float) (z10 ? this.f66277w : this.f66278x)) * f11));
        this.f66275u.start();
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        if (i10 != this.f66262h) {
            this.f66262h = i10;
            m0();
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(int i10, int i11, int i12, int i13) {
        this.f66256b.set(i10, i11, i12, i13);
        h0();
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        Drawable drawable = this.f66263i;
        Drawable t10 = f0() ? t() : this.f66258d;
        this.f66263i = t10;
        if (drawable != t10) {
            j0(t10);
        }
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        int c10 = (int) (((d0() || e0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f66255a;
        Rect rect = this.f66256b;
        materialCardView.i(rect.left + c10, rect.top + c10, rect.right + c10, rect.bottom + c10);
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        this.f66257c.a0(this.f66255a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    public void k() {
        Drawable drawable = this.f66269o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f66269o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f66269o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        if (!E()) {
            this.f66255a.setBackgroundInternal(D(this.f66257c));
        }
        this.f66255a.setForeground(D(this.f66263i));
    }

    /* access modifiers changed from: package-private */
    public C9286g l() {
        return this.f66257c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList m() {
        return this.f66257c.x();
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        this.f66258d.i0((float) this.f66262h, this.f66268n);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList n() {
        return this.f66258d.x();
    }

    /* access modifiers changed from: package-private */
    public Drawable o() {
        return this.f66264j;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f66261g;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f66259e;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f66260f;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList s() {
        return this.f66266l;
    }

    /* access modifiers changed from: package-private */
    public float u() {
        return this.f66257c.J();
    }

    /* access modifiers changed from: package-private */
    public float w() {
        return this.f66257c.y();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f66265k;
    }

    /* access modifiers changed from: package-private */
    public k y() {
        return this.f66267m;
    }

    /* access modifiers changed from: package-private */
    public int z() {
        ColorStateList colorStateList = this.f66268n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
