package com.google.android.material.button;

import Ea.C9068b;
import Ea.C9078l;
import I2.C4600b0;
import La.C9138a;
import Ra.c;
import Sa.C9269a;
import Sa.C9270b;
import Ua.C9286g;
import Ua.k;
import Ua.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.v;
import y2.C6260a;

class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f66222u = true;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f66223v = false;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f66224a;

    /* renamed from: b  reason: collision with root package name */
    private k f66225b;

    /* renamed from: c  reason: collision with root package name */
    private int f66226c;

    /* renamed from: d  reason: collision with root package name */
    private int f66227d;

    /* renamed from: e  reason: collision with root package name */
    private int f66228e;

    /* renamed from: f  reason: collision with root package name */
    private int f66229f;

    /* renamed from: g  reason: collision with root package name */
    private int f66230g;

    /* renamed from: h  reason: collision with root package name */
    private int f66231h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f66232i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f66233j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f66234k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f66235l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f66236m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f66237n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f66238o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f66239p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f66240q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f66241r = true;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f66242s;

    /* renamed from: t  reason: collision with root package name */
    private int f66243t;

    a(MaterialButton materialButton, k kVar) {
        this.f66224a = materialButton;
        this.f66225b = kVar;
    }

    private void G(int i10, int i11) {
        int E10 = C4600b0.E(this.f66224a);
        int paddingTop = this.f66224a.getPaddingTop();
        int D10 = C4600b0.D(this.f66224a);
        int paddingBottom = this.f66224a.getPaddingBottom();
        int i12 = this.f66228e;
        int i13 = this.f66229f;
        this.f66229f = i11;
        this.f66228e = i10;
        if (!this.f66238o) {
            H();
        }
        C4600b0.F0(this.f66224a, E10, (paddingTop + i10) - i12, D10, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f66224a.setInternalBackground(a());
        C9286g f10 = f();
        if (f10 != null) {
            f10.a0((float) this.f66243t);
            f10.setState(this.f66224a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (!f66223v || this.f66238o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int E10 = C4600b0.E(this.f66224a);
        int paddingTop = this.f66224a.getPaddingTop();
        int D10 = C4600b0.D(this.f66224a);
        int paddingBottom = this.f66224a.getPaddingBottom();
        H();
        C4600b0.F0(this.f66224a, E10, paddingTop, D10, paddingBottom);
    }

    private void J() {
        C9286g f10 = f();
        C9286g n10 = n();
        if (f10 != null) {
            f10.i0((float) this.f66231h, this.f66234k);
            if (n10 != null) {
                n10.h0((float) this.f66231h, this.f66237n ? C9138a.d(this.f66224a, C9068b.f59352q) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f66226c, this.f66228e, this.f66227d, this.f66229f);
    }

    private Drawable a() {
        C9286g gVar = new C9286g(this.f66225b);
        gVar.Q(this.f66224a.getContext());
        C6260a.o(gVar, this.f66233j);
        PorterDuff.Mode mode = this.f66232i;
        if (mode != null) {
            C6260a.p(gVar, mode);
        }
        gVar.i0((float) this.f66231h, this.f66234k);
        C9286g gVar2 = new C9286g(this.f66225b);
        gVar2.setTint(0);
        gVar2.h0((float) this.f66231h, this.f66237n ? C9138a.d(this.f66224a, C9068b.f59352q) : 0);
        if (f66222u) {
            C9286g gVar3 = new C9286g(this.f66225b);
            this.f66236m = gVar3;
            C6260a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C9270b.d(this.f66235l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f66236m);
            this.f66242s = rippleDrawable;
            return rippleDrawable;
        }
        C9269a aVar = new C9269a(this.f66225b);
        this.f66236m = aVar;
        C6260a.o(aVar, C9270b.d(this.f66235l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f66236m});
        this.f66242s = layerDrawable;
        return K(layerDrawable);
    }

    private C9286g g(boolean z10) {
        LayerDrawable layerDrawable = this.f66242s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f66222u ? (C9286g) ((LayerDrawable) ((InsetDrawable) this.f66242s.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0) : (C9286g) this.f66242s.getDrawable(z10 ^ true ? 1 : 0);
    }

    private C9286g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z10) {
        this.f66237n = z10;
        J();
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f66234k != colorStateList) {
            this.f66234k = colorStateList;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (this.f66231h != i10) {
            this.f66231h = i10;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f66233j != colorStateList) {
            this.f66233j = colorStateList;
            if (f() != null) {
                C6260a.o(f(), this.f66233j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f66232i != mode) {
            this.f66232i = mode;
            if (f() != null && this.f66232i != null) {
                C6260a.p(f(), this.f66232i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z10) {
        this.f66241r = z10;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f66230g;
    }

    public int c() {
        return this.f66229f;
    }

    public int d() {
        return this.f66228e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f66242s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f66242s.getNumberOfLayers() > 2 ? (n) this.f66242s.getDrawable(2) : (n) this.f66242s.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public C9286g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f66235l;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return this.f66225b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f66234k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f66231h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f66233j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f66232i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f66238o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f66240q;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f66241r;
    }

    /* access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f66226c = typedArray.getDimensionPixelOffset(C9078l.f60103t3, 0);
        this.f66227d = typedArray.getDimensionPixelOffset(C9078l.f60114u3, 0);
        this.f66228e = typedArray.getDimensionPixelOffset(C9078l.f60125v3, 0);
        this.f66229f = typedArray.getDimensionPixelOffset(C9078l.f60136w3, 0);
        if (typedArray.hasValue(C9078l.f59621A3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C9078l.f59621A3, -1);
            this.f66230g = dimensionPixelSize;
            z(this.f66225b.w((float) dimensionPixelSize));
            this.f66239p = true;
        }
        this.f66231h = typedArray.getDimensionPixelSize(C9078l.f59731K3, 0);
        this.f66232i = v.k(typedArray.getInt(C9078l.f60169z3, -1), PorterDuff.Mode.SRC_IN);
        this.f66233j = c.a(this.f66224a.getContext(), typedArray, C9078l.f60158y3);
        this.f66234k = c.a(this.f66224a.getContext(), typedArray, C9078l.f59720J3);
        this.f66235l = c.a(this.f66224a.getContext(), typedArray, C9078l.f59709I3);
        this.f66240q = typedArray.getBoolean(C9078l.f60147x3, false);
        this.f66243t = typedArray.getDimensionPixelSize(C9078l.f59632B3, 0);
        this.f66241r = typedArray.getBoolean(C9078l.f59742L3, true);
        int E10 = C4600b0.E(this.f66224a);
        int paddingTop = this.f66224a.getPaddingTop();
        int D10 = C4600b0.D(this.f66224a);
        int paddingBottom = this.f66224a.getPaddingBottom();
        if (typedArray.hasValue(C9078l.f60092s3)) {
            t();
        } else {
            H();
        }
        C4600b0.F0(this.f66224a, E10 + this.f66226c, paddingTop + this.f66228e, D10 + this.f66227d, paddingBottom + this.f66229f);
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f66238o = true;
        this.f66224a.setSupportBackgroundTintList(this.f66233j);
        this.f66224a.setSupportBackgroundTintMode(this.f66232i);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f66240q = z10;
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        if (!this.f66239p || this.f66230g != i10) {
            this.f66230g = i10;
            this.f66239p = true;
            z(this.f66225b.w((float) i10));
        }
    }

    public void w(int i10) {
        G(this.f66228e, i10);
    }

    public void x(int i10) {
        G(i10, this.f66229f);
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f66235l != colorStateList) {
            this.f66235l = colorStateList;
            boolean z10 = f66222u;
            if (z10 && (this.f66224a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f66224a.getBackground()).setColor(C9270b.d(colorStateList));
            } else if (!z10 && (this.f66224a.getBackground() instanceof C9269a)) {
                ((C9269a) this.f66224a.getBackground()).setTintList(C9270b.d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f66225b = kVar;
        I(kVar);
    }
}
